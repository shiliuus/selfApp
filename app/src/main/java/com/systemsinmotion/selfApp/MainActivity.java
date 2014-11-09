package com.systemsinmotion.selfApp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import casestudy.CaseStudyActivity;
import crawler.CrawlerActivity;
import db.Data;
import db.DatabaseHelper;
import drive.DriveActivity;
import map.MapActivity;
import utils.GlobalValues;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    private GridView mGridView;

    SharedPreferences mPrefs;
    SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPrefs = this.getSharedPreferences(GlobalValues.SHARED_PREFERENCES, Context.MODE_PRIVATE);
        boolean isFirstRun = mPrefs.getBoolean(GlobalValues.ISFIRSTRUN, true);
        if (isFirstRun) {
            Log.i(TAG, "this is the first time running this app");
            mEditor.putBoolean(GlobalValues.ISFIRSTRUN, false).commit();
            DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
            Data.loadData(dbHelper);
        }

        setContentView(R.layout.activity_main);
        mGridView = (GridView) findViewById(R.id.gridview_main);

        mGridView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case 0:
                intent = new Intent(MainActivity.this, DriveActivity.class);
                startActivity(intent);
            case 1:
                intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            case 2:
                intent = new Intent(MainActivity.this, CrawlerActivity.class);
                startActivity(intent);
            case 3:
                intent = new Intent(MainActivity.this, CaseStudyActivity.class);
                startActivity(intent);
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
