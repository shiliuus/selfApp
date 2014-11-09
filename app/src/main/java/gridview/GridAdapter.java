package gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import gridview.GridItem;
import com.liushi.selfApp.R;

import java.util.ArrayList;

/**
 * Created by liushi on 11/7/14.
 */
public class GridAdapter extends BaseAdapter {
    private ArrayList<GridItem> list;
    private Context mContext;

    public GridAdapter(ArrayList<GridItem> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            gridView = new View(mContext);
            gridView = inflater.inflate(R.layout.grid_item, null);

            ImageView imageView = (ImageView) gridView.findViewById(R.id.gridItemImage);
            TextView textView = (TextView) gridView.findViewById(R.id.gridItemTitle);

            imageView.setImageResource(list.get(position).getImageResource());
            textView.setText(list.get(position).getTitle());
        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
