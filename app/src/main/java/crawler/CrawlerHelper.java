package crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by liu on 2014/11/16.
 */
public class CrawlerHelper {

    private final static String link1 = "http://www.google.com/cse?cx=partner-pub-2645088012817067%3A9812473835&ie=UTF-8&q=";
    private final static String link2 = "&sa=Search&siteurl=www.google.com%2Fcse%2Fhome%3Fcx%3Dpartner-pub-2645088012817067%3A9812473835&ref=www.google.com%2Fcse%3Fcx%3Dpartner-pub-2645088012817067%253A9812473835%26ie%3DUTF-8%26q%3Dgoogle&ss=806j110990j7#gsc.tab=0&gsc.q=";
    private	final static String link3 = "&gsc.page=1";

    public static URL getURL(String keyword) {
        URL url = null;
        keyword = keyword.replace(" ", "%20");
        String urlStr = link1 + keyword + link2 + keyword + link3;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }


    public static String getPageContent(URL url) {
        String pageContent = "";
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-agent", "  Mozilla/5.0 (Windows NT 6.1; WOW64; rv:33.0) Gecko/20100101 Firefox/33.0");
            connection.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                sb.append(line + "\n");
                line = reader.readLine();
            }
            pageContent = sb.toString().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pageContent;
    }

    public static ArrayList<ListItem> getList(String pageContent) {
        ArrayList<ListItem> list = new ArrayList<ListItem>();
        if (pageContent == null || pageContent.equals("")) {
            return list;
        }
        Document doc = Jsoup.parse(pageContent);
//        Elements elements = doc.getElementsByAttributeValue("class", "s xst");
        Elements elements = doc.getElementsByAttributeValueStarting("id", "normalthread_");
        for (Element element : elements) {
            ListItem item = new ListItem();
//            String iconLink = element.getElementsByClass("icon").select("img").attr("src");
            String title = element.getElementsByAttributeValue("class", "s xst").text();
            String desc = element.getElementsByAttributeValue("class", "s xst").attr("href");

            try {
                title = new String(title.getBytes("UTF-8"), "ISO-8859-1");
                title = new String(title.getBytes("ISO-8859-1"), "UTF-8");
                desc = new String(desc.getBytes("UTF-8"), "ISO-8859-1");
                desc = new String(desc.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            item.setTitle(title);
            item.setDesc(desc);

            list.add(item);
        }

        return list;
    }
}
