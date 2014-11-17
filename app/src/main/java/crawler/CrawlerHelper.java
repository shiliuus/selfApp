package crawler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.liushi.selfApp.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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
            String iconLink = element.getElementsByClass("icon").select("img").attr("src");
            String title = element.getElementsByAttributeValue("class", "s xst").text();
            String desc = element.getElementsByAttributeValue("class", "s xst").attr("href");

            Bitmap img = null;
            try {
                title = new String(title.getBytes(), "GB2312");
//                title = new String(title.getBytes("UTF-8"), "ISO-8859-1");
//                title = new String(title.getBytes("ISO-8859-1"), "UTF-8");
                img = BitmapFactory.decodeStream((InputStream) new URL(iconLink).getContent());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }

            item.setImg(img);
            item.setTitle(title);
            item.setDesc(desc);

            list.add(item);
        }

        return list;
    }
}
