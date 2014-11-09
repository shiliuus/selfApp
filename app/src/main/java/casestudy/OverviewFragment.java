package casestudy;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.liushi.selfApp.R;

/**
 * Created by lshi on 10/20/2014.
 */
public class OverviewFragment extends Fragment{
//    private DatabaseHelper dbHelper;
    private ImageView mImageViewScreenshot;
    private Button mButton;
    private ImageView mImageViewCaseLogo;
    private TextView mTextViewCaseTitle;
    private TextView mTextViewCaseContent;
    private int index;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_case_overview, container, false);



        mImageViewScreenshot = (ImageView) rootView.findViewById(R.id.case_overview_img);
        mButton = (Button) rootView.findViewById(R.id.case_overview_btn);
        mImageViewCaseLogo = (ImageView) rootView.findViewById(R.id.case_overview_logo);
        mTextViewCaseTitle = (TextView) rootView.findViewById(R.id.case_overview_title);
        mTextViewCaseContent = (TextView) rootView.findViewById(R.id.case_overview_content);
        final Activity thisActivity = this.getActivity();
        index = thisActivity.getIntent().getIntExtra("position", 0);
        Log.i("hello", "index=" + index);

        mImageViewScreenshot.setImageResource(R.drawable.casestudy);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(thisActivity.getApplicationContext(), "Button clicked!!", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(Intent.ACTION_MAIN);
                if (index == 1) {
                    intent.setComponent(new ComponentName("com.bestbuy.fms", "com.bestbuy.fms.login.SplashActivity"));
                } else if (index == 2) {
                    intent = thisActivity.getPackageManager().getLaunchIntentForPackage("com.example.android.effectivenavigation");
                } else if (index == 3) {
                    intent.setComponent(new ComponentName("com.bby.compshop", "com.bby.compshop.BBSearchActivity"));
                } else if (index == 4) {
                    intent.setClass(thisActivity, WebViewActivity.class);
                }

                startActivity(intent);
            }
        });

        mImageViewCaseLogo.setImageResource(R.drawable.logo);
        mTextViewCaseTitle.setText("Title Test");
        mTextViewCaseTitle.getPaint().setFakeBoldText(true);
        mTextViewCaseContent.setText("Content Test");

        return rootView;

    }
}
