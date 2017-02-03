package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */
public class Sad extends Mood {

    /**
     * Instantiates a new Sad Mood.
     */
    public Sad(){
        super();
    }

    /**
     * Instantiates a new Sad Mood.
     *
     * @param date the date
     */
    public Sad(Date date){
        super(date);
    }

    @Override
    public String format(){
        return "Sad";
    }
}
