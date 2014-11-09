package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class Screenshot {
    private int id;
    private int path;

    public Screenshot() {
    }

    public Screenshot(int path) {
        this.path = path;
    }

    public Screenshot(int id, int path) {
        this.id = id;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}
