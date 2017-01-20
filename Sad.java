package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */

public class Sad extends Mood {

    public Sad(){
        super();
    }

    public Sad(Date date){
        super(date);
    }

    @Override
    public String format(){
        return "Sad";
    }
}
