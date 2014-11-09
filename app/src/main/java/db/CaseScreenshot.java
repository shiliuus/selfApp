package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class CaseScreenshot {
    private int id;
    private int caseId;
    private int screenshotId;

    public CaseScreenshot() {
    }

    public CaseScreenshot(int caseId, int screenshotId) {
        this.caseId = caseId;
        this.screenshotId = screenshotId;
    }

    public CaseScreenshot(int id, int caseId, int screenshotId) {
        this.id = id;
        this.caseId = caseId;
        this.screenshotId = screenshotId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getScreenshotId() {
        return screenshotId;
    }

    public void setScreenshotId(int screenshotId) {
        this.screenshotId = screenshotId;
    }
}
