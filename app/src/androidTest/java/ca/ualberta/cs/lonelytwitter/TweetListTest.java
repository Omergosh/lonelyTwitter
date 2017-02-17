package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by watts1 on 1/28/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Test Tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testAddTweetDuplicateError(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);

        try {
            tweets.add(tweet);
            //Should throw an error adding the same Tweet twice - if not, test has failed
            Assert.fail();
        }catch(IllegalArgumentException e){
            //Successful test!
        }
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");
        NormalTweet tweet2 = new NormalTweet("Another Test Tweet");
        tweet.setDate(new Date(5));
        tweet2.setDate(new Date(2));

        tweets.add(tweet);
        tweets.add(tweet2);
        ArrayList<NormalTweet> returnedTweets = tweets.getTweets();
        assertEquals(returnedTweets.get(0), tweet2);
        assertEquals(returnedTweets.get(1), tweet);
    }

    public void testHasTweetEqual(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");
        NormalTweet tweet2 = new NormalTweet("Yet another Test Tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweetEqual(tweet));
        assertFalse(tweets.hasTweetEqual(tweet2));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Another Test Tweet");
        NormalTweet tweet2 = new NormalTweet("Yet another Test Tweet");

        assertEquals(tweets.getCount(), 0);
        tweets.add(tweet);
        assertEquals(tweets.getCount(), 1);
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 2);
    }


}
