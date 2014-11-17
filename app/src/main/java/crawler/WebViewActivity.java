package crawler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.liushi.selfApp.R;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by liushi on 11/7/14.
 */
public class WebViewActivity extends Activity {
    private ProgressBar mProgressBar;
    private WebView mWebView;
    private String urlStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        mProgressBar = (ProgressBar) findViewById(R.id.progreaa_bar);
        mWebView = (WebView) findViewById(R.id.webview);
        final Context mContext = this.getApplicationContext();
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(mContext, "error: " + description, Toast.LENGTH_LONG).show();
            }
        });
//        mWebView.setWebChromeClient(new WebChromeClient() {
//            @Override
//            public void onProgressChanged(WebView view, int newProgress) {
//                if(newProgress < 100) {
//                    mProgressBar.setVisibility(View.VISIBLE);
//                } else {
//                    mProgressBar.setVisibility(View.GONE);
//                }
//            }
//        });
        Intent intent = getIntent();
        urlStr = intent.getStringExtra("link");
        mWebView.loadUrl(urlStr);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}
