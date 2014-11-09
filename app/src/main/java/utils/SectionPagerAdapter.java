package utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import casestudy.KeyHighlightsFragment;
import casestudy.OverviewFragment;
import casestudy.ScreenshotFragment;
import casestudy.SolutionFragment;

/**
 * Created by lshi on 10/20/2014.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
      public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OverviewFragment();
            case 1:
                return new SolutionFragment();
            case 2:
                return new KeyHighlightsFragment();
            case 3:
                return new ScreenshotFragment();
            default:
                Fragment fragment = new Fragment();
                return fragment;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "OverView";
            case 1:
                return "Solution";
            case 2:
                return "Key Highlights";
            case 3:
                return "ScreenShot";
            default:
                return "";
        }
    }
}
