package casestudy;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.liushi.selfApp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

import gridview.GridAdapter;
import gridview.GridItem;

/**
 * Created by lshi on 10/27/2014.
 */
public class ScreenshotFragment extends Fragment {
    private GridView mGridView;
    private static ArrayList<GridItem> list;
//    private DatabaseHelper dbHelper;
    private GridAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_case_screenshot, container, false);

        mGridView = (GridView) rootView.findViewById(R.id.screenshot_gridview);

        final Activity thisActivity = this.getActivity();
        int index = thisActivity.getIntent().getIntExtra("position", 0);
//        dbHelper = new DatabaseHelper(thisActivity.getApplicationContext());
//
//        ArrayList<Screenshot> list = dbHelper.getAllScreenshotByCaseId(index);
//
//        ArrayList<Integer> gridViewList = new ArrayList<Integer>();
//
//        for (int i=0; i<list.size(); i++) {
//            int path = list.get(i).getPath();
//            gridViewList.add(path);
//        }

//        for (int i=0; i<gridViewList.size(); i++) {
//            BitmapHelper.getDecodedImageFromResource(thisActivity.getResources(), gridViewList.get(i), 800, 480);
//        }


        adapter = new GridAdapter(list, thisActivity.getApplicationContext());

        mGridView.setAdapter(adapter);


        return rootView;
    }

    static {
        list = new ArrayList<GridItem>();
        list.add(new GridItem("Drive", R.drawable.drive));
        list.add(new GridItem("Map", R.drawable.map));
        list.add(new GridItem("Crawler", R.drawable.crawler));
        list.add(new GridItem("Case Study", R.drawable.casestudy));
    }


}
