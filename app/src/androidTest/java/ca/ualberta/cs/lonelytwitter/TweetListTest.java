package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ysu3 on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("test tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try {
            tweets.addTweet(tweet);
            assertTrue(false);
        }
        catch (IllegalArgumentException e){
            assertTrue(true);
        }

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another test tweet");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");
        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));

    }





    // unit tests
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test hasTweet");
        tweets.addTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("First Tweet");
        tweets.addTweet(tweet);

        Tweet tweet2 = new NormalTweet("Second Tweet");
        tweets.addTweet(tweet2);

        assertEquals(tweets.getCount(), 2);
    }


    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("First Tweet");
        tweet.setDate(new Date());
        tweets.addTweet(tweet);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Tweet tweet2 = new NormalTweet("Second Tweet");
        tweet2.setDate(new Date());
        tweets.addTweet(tweet2);

        ArrayList<Tweet> test = tweets.getTweets();
        int i;
        for (i = 0; i < tweets.getCount() - 1; i++){
            assertTrue(test.get(i).getDate().before( test.get(i+1).getDate() ));
        }

    }

}
