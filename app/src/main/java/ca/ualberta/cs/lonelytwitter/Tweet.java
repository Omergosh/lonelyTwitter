package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public abstract class Tweet implements Comparable<Tweet>{
    protected String message;
    private Date date;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public boolean isImportant();

    //Taken from http://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    public int compareTo(Tweet o){
        return getDate().compareTo(o.getDate());
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
