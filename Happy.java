package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */
public class Happy extends Mood {

    /**
     * Instantiates a new Happy Mood.
     */
    public Happy(){
        super();
    }

    /**
     * Instantiates a new Happy Mood.
     *
     * @param date the date
     */
    public Happy(Date date){
        super(date);
    }

    @Override
    public String format(){
        return "Happy";
    }
}
