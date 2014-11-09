package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class CaseFilter {

    private int id;
    private int caseId;
    private int filterId;

    public CaseFilter() {
    }

    public CaseFilter(int caseId, int filterId) {
        this.caseId = caseId;
        this.filterId = filterId;
    }

    public CaseFilter(int id, int caseId, int filterId) {
        this.id = id;
        this.caseId = caseId;
        this.filterId = filterId;
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

    public int getFilterId() {
        return filterId;
    }

    public void setFilterId(int filterId) {
        this.filterId = filterId;
    }
}
