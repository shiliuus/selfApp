package crawler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.liushi.selfApp.R;

import java.util.ArrayList;

/**
 * Created by liu on 2014/11/16.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<ListItem> list;

    public ListViewAdapter(Context mContext, ArrayList<ListItem> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ListItem getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View listView;

        if (convertView == null) {
            listView = new View(mContext);
            listView = inflater.inflate(R.layout.list_item, null);

            ImageView imgView = (ImageView) listView.findViewById(R.id.listitem_img);
            TextView titleView = (TextView) listView.findViewById(R.id.listitem_title);
            TextView descView = (TextView) listView.findViewById(R.id.listitem_desc);

            imgView.setImageBitmap(list.get(position).getImg());
            titleView.setText(list.get(position).getTitle());
            descView.setText(list.get(position).getDesc());
        } else {
            listView = (View) convertView;
        }

        return listView;
    }
}
