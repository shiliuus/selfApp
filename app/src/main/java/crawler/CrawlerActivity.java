package crawler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.liushi.selfApp.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu on 2014/11/16.
 */
public class CrawlerActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private Button mBtn;
    private ListView mLv;
    private ProgressBar mProgressBar;
    private CrawlerTask mTask;
    private String keyword;
    private final static String link = "http://www.meetqun.com/forum-36-1.html";
    private final static String link2 = "http://www.meetqun.com/";
    private URL url;
    private ArrayList<ListItem> list;
    private ListViewAdapter mListViewAdapter;
    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crawler);

        mBtn = (Button) findViewById(R.id.crawler_btn);
        mProgressBar = (ProgressBar) findViewById(R.id.crawler_progress_bar);
        mLv = (ListView) findViewById(R.id.crawler_listview);
        mContext = this.getApplicationContext();

        mBtn.setOnClickListener(this);
        mLv.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.crawler_btn:
                try {
                    url = new URL(link);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                mTask = new CrawlerTask();
                mTask.execute(url);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent();
        intent.putExtra("link", link2 + list.get(i).getDesc());
        intent.setClass(CrawlerActivity.this, WebViewActivity.class);
        startActivity(intent);
    }

    private class CrawlerTask extends AsyncTask<URL, Integer, ArrayList<ListItem>> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected ArrayList<ListItem> doInBackground(URL... urls) {
            String pageContent = CrawlerHelper.getPageContent(urls[0]);
            list = CrawlerHelper.getList(pageContent);
            return list;
        }

        @Override
        protected void onProgressUpdate(Integer... progresses) {
            super.onProgressUpdate(progresses);
            int progress = progresses[0];
            mProgressBar.setProgress(progress);
        }

        @Override
        protected void onPostExecute(ArrayList<ListItem> listItems) {
            super.onPostExecute(listItems);
            mListViewAdapter = new ListViewAdapter(mContext, list);
            mProgressBar.setVisibility(View.GONE);
            mLv.setAdapter(mListViewAdapter);
        }
    }


}
