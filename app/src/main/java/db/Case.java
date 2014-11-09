package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class Case {
    private int id;
    private String title;
    private String desc;
    private int appType;
    private String client;
    private String keyHeight;
    private String solution;
    private String result;
    private String startTime;
    private String endTime;
    private String endPoint;

    public Case() {
    }

    public Case(String title, String desc, int appType, String client, String keyHeight, String solution, String result, String startTime, String endTime, String endPoint) {
        this.title = title;
        this.desc = desc;
        this.appType = appType;
        this.client = client;
        this.keyHeight = keyHeight;
        this.solution = solution;
        this.result = result;
        this.startTime = startTime;
        this.endTime = endTime;
        this.endPoint = endPoint;
    }

    public Case(int id, String title, String desc, int appType, String client, String keyHeight, String solution, String result, String startTime, String endTime, String endPoint) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.appType = appType;
        this.client = client;
        this.keyHeight = keyHeight;
        this.solution = solution;
        this.result = result;
        this.startTime = startTime;
        this.endTime = endTime;
        this.endPoint = endPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAppType() {
        return appType;
    }

    public void setAppType(int appType) {
        this.appType = appType;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getKeyHeight() {
        return keyHeight;
    }

    public void setKeyHeight(String keyHeight) {
        this.keyHeight = keyHeight;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getendPoint() {
        return endPoint;
    }

    public void setendPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
