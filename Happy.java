package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */

public class Happy extends Mood {

    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }

    @Override
    public String format(){
        return "Happy";
    }
}
