package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ysu3 on 1/17/17.
 */


/**
 * This class is a TweetTooLongException object. This exception is thrown when text is too long for a tweet object
 */
public class TweetTooLongException extends Exception {
    public TweetTooLongException() {
    }

    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
