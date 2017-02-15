package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ysu3 on 2/14/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        if (this.tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet (Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public int getCount(){
        return this.tweets.size();
    }

    public ArrayList<Tweet> getTweets(){

        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet, Tweet tweet2) {
                return tweet.getDate().compareTo(tweet2.getDate());
            }
        });


        return this.tweets;
    }
}
