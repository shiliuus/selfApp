package db;

/**
 * Created by lshi on 10/15/2014.
 */
public class Keyword {
    private int id;
    private String word;

    public Keyword() {
    }

    public Keyword(String word) {
        this.word = word;
    }

    public Keyword(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
