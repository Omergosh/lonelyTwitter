package ca.ualberta.cs.lonelytwitter;

/**
 * Created by omer1 on 1/17/17.
 * Class contents copied (with permission) from https://github.com/bfleyshe/lonelyTwitter as a result of missing that part of the lab session
 * 2017-01-24 18:19
 */
public class TweetTooLongException extends Exception {
    /**
     * Instantiates a new Tweet too long exception.
     */
    public TweetTooLongException(){

    }

    /**
     * Instantiates a new Tweet too long exception.
     *
     * @param detailMessage the detail message
     */
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
