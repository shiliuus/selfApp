package crawler;

import android.graphics.Bitmap;

import java.net.URL;

/**
 * Created by liu on 2014/11/16.
 */
public class ListItem {
    private Bitmap img;
    private String title;
    private String desc;

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
