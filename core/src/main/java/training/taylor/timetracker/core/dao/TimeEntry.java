package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description;
    private float rate;
    private int time;

    /**
     * Created by Jason on 6/19/2015.
     */
    public final String getDescription() {
        return description;
    }
    
    /**
     * Created by Jason on 6/19/2015.
     */
    public final void setDescription(final String value) {
        this.description = value;
    }
    
    /**
     * Created by Jason on 6/19/2015.
     */
    public final float getRate() {
        return rate;
    }
    
    /**
     * Created by Jason on 6/19/2015.
     */
    public final void setRate(float value) {
        this.rate = value;
    }

    /**
     * Created by Jason on 6/19/2015.
     */    
    public final int getTime() {
        return time;
    }

    /**
     * Created by Jason on 6/19/2015.
     */    
    public final void setTime(int value) {
        this.time = value;
    }

    /**
     * Created by Jason on 6/19/2015.
     */
    @Override
    public final String toString() {
        return "TimeEntry" ;
    }
}
