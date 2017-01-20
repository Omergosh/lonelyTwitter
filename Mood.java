package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created by omer1 on 1/17/17.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        setDate(new Date());
    }

    public Mood(Date date){
        setDate(date);
    }

    public String format(){
        return "Base";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
