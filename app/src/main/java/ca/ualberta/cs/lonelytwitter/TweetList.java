package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by watts1 on 1/28/16.
 */
public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet){
        if(tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(NormalTweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<NormalTweet> getTweets(){
        Collections.sort(tweets);
        return tweets;
    }

    public boolean hasTweetEqual(NormalTweet tweet){
        //Returns true if given tweet causes equal() to return true with any tweet in the list
        for (int i = 0; i < tweets.size(); i++) {
            if(tweets.get(i).equals(tweet)){
                return true;
            }
        }
        return false;
    }

    public int getCount(){
        return tweets.size();
    }


}
