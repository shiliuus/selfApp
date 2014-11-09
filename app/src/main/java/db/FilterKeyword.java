package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class FilterKeyword {
    private int id;
    private int filterId;
    private int keywordId;

    public FilterKeyword() {
    }

    public FilterKeyword(int filterId, int keywordId) {
        this.filterId = filterId;
        this.keywordId = keywordId;
    }

    public FilterKeyword(int id, int filterId, int keywordId) {
        this.id = id;
        this.filterId = filterId;
        this.keywordId = keywordId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
    }

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }
}
