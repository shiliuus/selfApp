package gridview;

/**
 * Created by liushi on 11/7/14.
 */
public class GridItem {
    private String title;
    private Integer imageResource;

    public GridItem(String title, Integer imageResource) {
        this.title = title;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public Integer getImageResource() {
        return imageResource;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageResource(Integer imageResource) {
        this.imageResource = imageResource;
    }
}
