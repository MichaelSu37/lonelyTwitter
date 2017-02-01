package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ysu3 on 1/17/17.
 */
public class BadMood extends Mood {
    private String mood;

    /**
     * Instantiates a new Bad mood.
     *
     * @param date the date
     */
    public BadMood(Date date) {
        super(date);
    }

    /**
     * Print mood string.
     *
     * @return the string
     */
    public String print_mood() {
        return "Bad Mood";
    }

    /**
     * Set mood.
     */
    public void setMood(){
        super.setMood("Bad mood");
    }
}
