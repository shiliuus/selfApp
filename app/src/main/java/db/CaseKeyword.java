package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class CaseKeyword {

    private int id;
    private int caseId;
    private int keywordId;

    public CaseKeyword() {
    }

    public CaseKeyword(int caseId, int keywordId) {
        this.caseId = caseId;
        this.keywordId = keywordId;
    }

    public CaseKeyword(int id, int caseId, int keywordId) {
        this.id = id;
        this.caseId = caseId;
        this.keywordId = keywordId;
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

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }
}
