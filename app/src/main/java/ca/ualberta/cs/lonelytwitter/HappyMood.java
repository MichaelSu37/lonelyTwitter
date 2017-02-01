package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ysu3 on 1/17/17.
 */
public class HappyMood extends Mood {

    /**
     * Instantiates a new Happy mood.
     *
     * @param date the date
     */
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Print mood string.
     *
     * @return the string
     */
    public String print_mood() {
        return "Good mood";
    }

    /**
     * Set mood.
     */
    public void setMood(){
        super.setMood("Good mood");
    }
}
