package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class Filter {
    private int id;
    private String filterName;

    public Filter() {
    }

    public Filter (String filterName) {
        this.filterName = filterName;
    }

    public Filter(int id, String filterName) {
        this.id = id;
        this.filterName = filterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
}
