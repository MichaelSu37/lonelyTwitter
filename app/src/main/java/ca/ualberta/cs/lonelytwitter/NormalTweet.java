package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ysu3 on 1/17/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date of tweet
     * @param Message the message of tweet
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String Message) throws TweetTooLongException {
        super(date, Message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param Message the message
     */
    public NormalTweet(String Message) {
        super(Message);
    }

    public boolean isImportant() {
        return Boolean.FALSE;
    }


}
