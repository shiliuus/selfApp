package db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by lshi on 10/15/2014
 */


public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "DatabaseHelper";

    private static final int DATABASE_VERSION = 1;

    // Databse Name
    private static final String DATABASE_NAME = "SIMEXPO";

    //Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CASEID = "caseId";
    private static final String KEY_FILTERID = "filterId";

    // Table Case
    private static final String TABLE_CASE = "CASETABLE";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DESC = "desc";
    private static final String KEY_APPTYPE = "appType";
    private static final String KEY_CLIENT = "client";
    private static final String KEY_KEYHEIGHT = "keyHeight";
    private static final String KEY_SOLUTION = "solution";
    private static final String KEY_RESULT = "result";
    private static final String KEY_STARTTIME = "startTime";
    private static final String KEY_ENDTIME = "endTime";
    private static final String KEY_ENDPOINT = "endPoint";
    private static final String[] TABLE_CASE_COLUMNS = {KEY_ID, KEY_DESC, KEY_APPTYPE,
            KEY_CLIENT, KEY_KEYHEIGHT, KEY_SOLUTION, KEY_RESULT, KEY_STARTTIME, KEY_ENDTIME, KEY_ENDPOINT};

    // Table SCREENSHOT
    private static final String TABLE_SCREENSHOT = "SCREENSHOTTABLE";
    private static final String KEY_PATH = "path";
    private static final String[] TABLE_SCREENSHOT_COLUMNS = {KEY_ID, KEY_PATH};

    // Table Filter
    private static final String TABLE_FILTER = "FILTERTABLE";
    private static final String KEY_FILTERNAME = "filterName";
    private static final String[] TABLE_FILTER_COLUMNS = {KEY_ID, KEY_FILTERNAME};

    // Table CaseFilter
    private static final String TABLE_CASEFILTER = "CASEFILTERTABLE";
    private static final String[] TABLE_CASEFILTER_COLUMNS = {KEY_ID, KEY_CASEID, KEY_FILTERID};

    // Table CaseScreenshot
    private static final String TABLE_CASESCREENSHOT = "CASESCREENSHOTTABLE";
    private static final String KEY_SCREENSHOTID = "screenshotId";
    private static final String[] TABLE_CASESCREENSHOT_COLUMNS = {KEY_ID, KEY_CASEID, KEY_SCREENSHOTID};


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("hello", "dbHelper oncreate");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_CASE + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_TITLE + " TEXT," +
                KEY_DESC + " TEXT," +
                KEY_APPTYPE + " INTEGER," +
                KEY_CLIENT + " TEXT," +
                KEY_KEYHEIGHT + " TEXT," +
                KEY_SOLUTION + " TEXT," +
                KEY_RESULT + " TEXT," +
                KEY_STARTTIME + " TEXT," +
                KEY_ENDTIME + " TEXT," +
                KEY_ENDPOINT + " TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_SCREENSHOT + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_PATH + " INTEGER)");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_FILTER + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_FILTERNAME + " TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_CASEFILTER + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_CASEID + " INTEGER," +
                KEY_FILTERID + " INTEGER)");

        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_CASESCREENSHOT + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_CASEID + " INTEGER," +
                KEY_SCREENSHOTID + " INTEGER)");

//        String sql_test = "CREATE TABLE IF NOT EXISTS " + TABLE_CASE + "(" +
//                KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
//                KEY_TITLE + " TEXT," +
//                KEY_DESC + " TEXT," +
//                KEY_APPTYPE + " INTEGER," +
//                KEY_CLIENT + " TEXT," +
//                KEY_KEYHEIGHT + " TEXT," +
//                KEY_SOLUTION + " TEXT," +
//                KEY_RESULT + " TEXT," +
//                KEY_STARTTIME + " TEXT," +
//                KEY_ENDTIME + " TEXT," +
//                KEY_ENDPOINT + " TEXT)";
//
//        db.execSQL(sql_test);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CASE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCREENSHOT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FILTER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CASEFILTER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CASESCREENSHOT);

        this.onCreate(db);
    }


    //CRUD for case table
    public void addCase(Case aCase) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, aCase.getId());
        values.put(KEY_TITLE, aCase.getTitle());
        values.put(KEY_DESC, aCase.getDesc());
        values.put(KEY_APPTYPE, aCase.getAppType());
        values.put(KEY_CLIENT, aCase.getClient());
        values.put(KEY_KEYHEIGHT, aCase.getKeyHeight());
        values.put(KEY_SOLUTION, aCase.getSolution());
        values.put(KEY_STARTTIME, aCase.getStartTime());
        values.put(KEY_ENDTIME, aCase.getEndTime());
        values.put(KEY_ENDPOINT, aCase.getendPoint());

        db.insert(TABLE_CASE, null, values);
        Log.i("hello", "addcase: "+aCase.getTitle());

        db.close();
    }

    public void deleteCase(Case aCase) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CASE, KEY_ID + "=?", new String[] {String.valueOf(aCase.getId())});

        db.close();
    }

    public int updateCase(Case aCase) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, aCase.getId());
        values.put(KEY_TITLE, aCase.getTitle());
        values.put(KEY_DESC, aCase.getDesc());
        values.put(KEY_APPTYPE, aCase.getAppType());
        values.put(KEY_CLIENT, aCase.getClient());
        values.put(KEY_KEYHEIGHT, aCase.getKeyHeight());
        values.put(KEY_SOLUTION, aCase.getSolution());
        values.put(KEY_STARTTIME, aCase.getStartTime());
        values.put(KEY_ENDTIME, aCase.getEndTime());
        values.put(KEY_ENDPOINT, aCase.getendPoint());

        int i = db.update(TABLE_CASE, values, KEY_ID + "=?", new String[] {String.valueOf(aCase.getId())});

        db.close();

        return i;
    }

    public Case getCaseById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_CASE + " WHERE " + KEY_ID + "=" + id, null);

        if (cursor != null) {
            cursor.moveToFirst();
            Case aCase = new Case();
            int idColumn = cursor.getColumnIndex(KEY_ID);
            int titleColumn = cursor.getColumnIndex(KEY_TITLE);
            int descColumn = cursor.getColumnIndex(KEY_DESC);
            int appTypeColumn = cursor.getColumnIndex(KEY_APPTYPE);
            int clientColumn = cursor.getColumnIndex(KEY_CLIENT);
            int keyHeightColumn = cursor.getColumnIndex(KEY_KEYHEIGHT);
            int solutionColumn = cursor.getColumnIndex(KEY_SOLUTION);
            int startTimeColumn = cursor.getColumnIndex(KEY_STARTTIME);
            int endTimeColumn = cursor.getColumnIndex(KEY_ENDTIME);
            int endPointColumn = cursor.getColumnIndex(KEY_ENDPOINT);

            Log.i("hello", "getCase: titleColumn="+titleColumn);
            Log.i("hello", "getCase: title="+cursor.getString(titleColumn));


            aCase.setId(cursor.getInt(idColumn));
            aCase.setTitle(cursor.getString(titleColumn));
            aCase.setDesc(cursor.getString(descColumn));
            aCase.setAppType(cursor.getInt(appTypeColumn));
            aCase.setClient(cursor.getString(clientColumn));
            aCase.setKeyHeight(cursor.getString(keyHeightColumn));
            aCase.setSolution(cursor.getString(solutionColumn));
            aCase.setStartTime(cursor.getString(startTimeColumn));
            aCase.setEndTime(cursor.getString(endTimeColumn));
            aCase.setendPoint(cursor.getString(endPointColumn));
            db.close();
            return aCase;
        }

        return null;
    }

    public ArrayList<Case> getAllCase() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Case> list = new ArrayList<Case>();

        String query = "SELECT * FROM " + TABLE_CASE;
        Cursor cursor = db.rawQuery(query, null);


        if (cursor.moveToFirst()) {
            do {
                Case aCase = new Case();
                int idColumn = cursor.getColumnIndex(KEY_ID);
                int titleColumn = cursor.getColumnIndex(KEY_TITLE);
                int descColumn = cursor.getColumnIndex(KEY_DESC);
                int appTypeColumn = cursor.getColumnIndex(KEY_APPTYPE);
                int clientColumn = cursor.getColumnIndex(KEY_CLIENT);
                int keyHeightColumn = cursor.getColumnIndex(KEY_KEYHEIGHT);
                int solutionColumn = cursor.getColumnIndex(KEY_SOLUTION);
                int startTimeColumn = cursor.getColumnIndex(KEY_STARTTIME);
                int endTimeColumn = cursor.getColumnIndex(KEY_ENDTIME);
                int endPointColumn = cursor.getColumnIndex(KEY_ENDPOINT);

                aCase.setId(cursor.getInt(idColumn));
                aCase.setTitle(cursor.getString(titleColumn));
                aCase.setDesc(cursor.getString(descColumn));
                aCase.setAppType(cursor.getInt(appTypeColumn));
                aCase.setClient(cursor.getString(clientColumn));
                aCase.setKeyHeight(cursor.getString(keyHeightColumn));
                aCase.setSolution(cursor.getString(solutionColumn));
                aCase.setStartTime(cursor.getString(startTimeColumn));
                aCase.setEndTime(cursor.getString(endTimeColumn));
                aCase.setendPoint(cursor.getString(endPointColumn));

                list.add(aCase);
            } while (cursor.moveToNext());
        }
        db.close();
        return list;
    }

    //CRUD for Sceenshop table
    public void addScreenshot(Screenshot screenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, screenshot.getId());
        values.put(KEY_PATH, screenshot.getPath());
        db.insert(TABLE_SCREENSHOT, null, values);
//        long result = db.insert(TABLE_SCREENSHOT, null, values);

        db.close();
    }

    public void deleteScreenshot(Screenshot screenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SCREENSHOT, KEY_ID + "=?", new String[] {String.valueOf(screenshot.getId())});

        db.close();
    }

    public int updateScreenshot(Screenshot screenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, screenshot.getId());
        values.put(KEY_PATH, screenshot.getPath());

        int i = db.update(TABLE_SCREENSHOT, values, KEY_ID + "=?", new String[] {String.valueOf(screenshot.getId())});

        db.close();

        return i;
    }

    public Screenshot getScreenshotById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_SCREENSHOT + " WHERE " + KEY_ID + "=" + id, null);

        if (cursor != null) {
            cursor.moveToFirst();
            Screenshot screenshot = new Screenshot();

            screenshot.setId(cursor.getInt(cursor.getColumnIndex(KEY_ID)));
            screenshot.setPath(cursor.getInt(cursor.getColumnIndex(KEY_PATH)));

            db.close();
            return screenshot;
        }

        db.close();
        return null;
    }

    public ArrayList<Screenshot> getAllScreenshotByCaseId(int caseId) {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Screenshot> list = new ArrayList<Screenshot>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_CASESCREENSHOT + " WHERE " + KEY_CASEID + "=" + caseId, null);

        if (cursor.moveToFirst()) {
            do {
                Screenshot screenshot = new Screenshot();

                screenshot.setId(cursor.getInt(cursor.getColumnIndex(KEY_ID)));
                Log.i("hello", "getScreenshot->id:" + cursor.getColumnIndex(KEY_ID));
                screenshot.setPath(cursor.getInt(cursor.getColumnIndex(KEY_PATH)));

                list.add(screenshot);
            } while (cursor.moveToNext());
        }

        db.close();
        return list;

    }


    //CRUD for Filter table
    public void addFilter(Filter filter) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_FILTERNAME, filter.getFilterName());
        db.insert(TABLE_FILTER, null, values);

        db.close();
    }

    public void deleteFilter(Filter filter) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FILTER, KEY_ID + "=?", new String[] {String.valueOf(filter.getId())});

        db.close();
    }

    public int updateFilter(Filter filter) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_FILTERNAME, filter.getFilterName());

        int i = db.update(TABLE_FILTER, values, KEY_ID + "=?", new String[] {String.valueOf(filter.getId())});

        db.close();

        return i;
    }

    public Filter getFilterById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_FILTER,
                TABLE_FILTER_COLUMNS,
                " " + KEY_ID + "=?", new String[] {String.valueOf(id)},
                null,
                null,
                null,
                null);


        if (cursor != null) {
            cursor.moveToFirst();
            Filter filter = new Filter();
            filter.setId(cursor.getInt(0));
            filter.setFilterName(cursor.getString(1));

            db.close();
            return filter;
        }
        db.close();
        return null;
    }

    public ArrayList<Filter> getAllFilter() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Filter> list = new ArrayList<Filter>();

        String query = "SELECT * FROM " + TABLE_FILTER;
        Cursor cursor = db.rawQuery(query, null);



        if (cursor.moveToFirst()) {
            do {
                Filter filter = new Filter();
                filter.setId(cursor.getInt(0));
                filter.setFilterName(cursor.getString(1));

                list.add(filter);
            } while (cursor.moveToNext());
        }
        db.close();
        return list;
    }

    //CRUD for CaseFilter table
    public void addCaseFilter(CaseFilter caseFilter) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_CASEID, caseFilter.getCaseId());
        values.put(KEY_FILTERID, caseFilter.getFilterId());
        
        db.insert(TABLE_CASEFILTER, null, values);

        db.close();
    }

    public void deleteCaseFilter(CaseFilter caseFilter) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CASEFILTER, KEY_ID + "=?", new String[] {String.valueOf(caseFilter.getId())});

        db.close();
    }

    public int updateCaseFilter(CaseFilter caseFilter) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_ID, caseFilter.getId());
        values.put(KEY_CASEID, caseFilter.getCaseId());
        values.put(KEY_FILTERID, caseFilter.getFilterId());

        int i = db.update(TABLE_CASEFILTER, values, KEY_ID + "=?", new String[] {String.valueOf(caseFilter.getId())});

        db.close();

        return i;
    }

    public CaseFilter getCaseFilterById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_CASEFILTER,
                TABLE_CASEFILTER_COLUMNS,
                " " + KEY_ID + "=?", new String[] {String.valueOf(id)},
                null,
                null,
                null,
                null);



        if (cursor != null) {
            cursor.moveToFirst();
            CaseFilter caseFilter = new CaseFilter();
            caseFilter.setId(cursor.getInt(0));
            caseFilter.setCaseId(cursor.getInt(1));
            caseFilter.setFilterId(cursor.getInt(2));
            db.close();
            return caseFilter;
        }

        db.close();
        return null;
    }

    public ArrayList<CaseFilter> getAllCaseFilter() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<CaseFilter> list = new ArrayList<CaseFilter>();

        String query = "SELECT * FROM " + TABLE_CASEFILTER;
        Cursor cursor = db.rawQuery(query, null);



        if (cursor.moveToFirst()) {
            do {
                CaseFilter caseFilter = new CaseFilter();
                caseFilter.setId(cursor.getInt(0));
                caseFilter.setCaseId(cursor.getInt(1));
                caseFilter.setFilterId(cursor.getInt(2));

                list.add(caseFilter);
            } while (cursor.moveToNext());
        }
        db.close();
        return list;
    }

    //CRUD for CaseScreenshot table
    public void addCaseScreenshot(CaseScreenshot caseScreenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_CASEID, caseScreenshot.getCaseId());
        values.put(KEY_SCREENSHOTID, caseScreenshot.getScreenshotId());

        db.insert(TABLE_CASESCREENSHOT, null, values);

        db.close();
    }

    public void deleteCaseScreenshot(CaseScreenshot caseScreenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CASESCREENSHOT, KEY_ID + "=?", new String[] {String.valueOf(caseScreenshot.getId())});

        db.close();
    }

    public int updateCaseScreenshot(CaseScreenshot caseScreenshot) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_CASEID, caseScreenshot.getCaseId());
        values.put(KEY_SCREENSHOTID, caseScreenshot.getScreenshotId());

        int i = db.update(TABLE_CASESCREENSHOT, values, KEY_ID + "=?", new String[] {String.valueOf(caseScreenshot.getId())});

        db.close();

        return i;
    }

    public CaseScreenshot getCaseScreenshotById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CASESCREENSHOT,
                TABLE_CASESCREENSHOT_COLUMNS,
                " " + KEY_ID + "=?", new String[] {String.valueOf(id)},
                null,
                null,
                null,
                null);



        if (cursor != null) {
            cursor.moveToFirst();
            CaseScreenshot caseScreenshot = new CaseScreenshot();
            caseScreenshot.setId(cursor.getInt(0));
            caseScreenshot.setCaseId(cursor.getInt(1));
            caseScreenshot.setScreenshotId(cursor.getInt(2));
            db.close();
            return caseScreenshot;
        }

        db.close();
        return null;
    }

    public ArrayList<CaseScreenshot> getAllCaseScreenshot() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<CaseScreenshot> list = new ArrayList<CaseScreenshot>();

        String query = "SELECT * FROM " + TABLE_CASESCREENSHOT;
        Cursor cursor = db.rawQuery(query, null);



        if (cursor.moveToFirst()) {
            do {
                CaseScreenshot caseScreenshot = new CaseScreenshot();
                caseScreenshot.setId(cursor.getInt(0));
                caseScreenshot.setCaseId(cursor.getInt(1));
                caseScreenshot.setScreenshotId(cursor.getInt(2));

                list.add(caseScreenshot);
            } while (cursor.moveToNext());
        }
        db.close();
        return list;
    }

}
