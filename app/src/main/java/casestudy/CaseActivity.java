package casestudy;

import android.support.v4.app.FragmentActivity;


import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.liushi.selfApp.R;

import utils.SectionPagerAdapter;


/**
 * Created by lshi on 10/17/2014.
 */
public class CaseActivity extends FragmentActivity implements ActionBar.TabListener {
    private ViewPager mViewPager;
    private SectionPagerAdapter sectionPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_case);

        ActionBar actionBar = getActionBar();

        sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) this.findViewById(R.id.case_pager);

        mViewPager.setAdapter(sectionPagerAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                getActionBar().setSelectedNavigationItem(position);
            }
        });

        for (int i=0; i<sectionPagerAdapter.getCount(); i++) {
            actionBar.addTab(actionBar.newTab().setText(sectionPagerAdapter.getPageTitle(i)).setTabListener(this));
        }

    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        mViewPager.setCurrentItem(tab.getPosition());
        Log.i("hello", "click position " + tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_case, menu);

        MenuItem searchItem = menu.findItem(R.id.case_actionbar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //TODO Configure the search info and add event listeners

        MenuItem shareItem = menu.findItem(R.id.action_bar_share);
//        mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
//        mShareActionProvider.setShareIntent(getDefaultIntent());

        return super.onCreateOptionsMenu(menu);

    }

    /** Defines a default (dummy) share intent to initialize the action provider.
     * However, as soon as the actual content to be used in the intent
     * is known or changes, you must update the share intent by again calling
     * mShareActionProvider.setShareIntent()
     */
    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("image/*");
        return intent;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.case_actionbar_search :
                //TODO
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
