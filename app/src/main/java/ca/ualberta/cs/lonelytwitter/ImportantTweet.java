package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import static java.lang.Boolean.TRUE;

/**
 * Created by ysu3 on 1/17/17.
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date of tweet
     * @param Message the message of tweet
     * @throws TweetTooLongException the tweet too long exception
     */
    public ImportantTweet(Date date, String Message) throws TweetTooLongException {
        super(date, Message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param Message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public ImportantTweet(String Message) throws TweetTooLongException {
        super(Message);
    }

    public boolean isImportant(){
        return Boolean.TRUE;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " ";
    }
}
