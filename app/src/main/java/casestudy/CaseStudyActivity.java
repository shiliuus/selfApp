package casestudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.liushi.selfApp.R;

import java.util.ArrayList;

import gridview.GridAdapter;
import gridview.GridItem;


public class CaseStudyActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{
    private static final String TAG = "CaseStudyActivity";
    private static ArrayList<GridItem> gridItemList;
    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casestudy);
        mGridView = (GridView) findViewById(R.id.gridview_casestudy);
        GridAdapter gridAdapter = new GridAdapter(gridItemList, this.getApplicationContext());
        mGridView.setAdapter(gridAdapter);
        mGridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(CaseStudyActivity.this, CaseActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);

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

    static {
        gridItemList = new ArrayList<GridItem>();
        gridItemList.add(new GridItem("Drive", R.drawable.drive));
        gridItemList.add(new GridItem("Map", R.drawable.map));
        gridItemList.add(new GridItem("Crawler", R.drawable.crawler));
        gridItemList.add(new GridItem("Case Study", R.drawable.casestudy));

    }
}
