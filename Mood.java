package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */
public abstract class Mood {
    private Date date;

    /**
     * Instantiates a new Mood.
     */
    public Mood(){
        setDate(new Date());
    }

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    public Mood(Date date){
        setDate(date);
    }

    /**
     * Format string.
     *
     * @return the string associated with the corresponding Mood
     */
    public String format(){
        return "Base";
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
