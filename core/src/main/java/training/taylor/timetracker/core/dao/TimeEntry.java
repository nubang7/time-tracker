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
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */
    public final String getDescription() {
        return description;
    }
    
    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */
    public final void setDescription(final String value) {
        this.description = value;
    }
    
    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */
    public final float getRate() {
        return rate;
    }
    
    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */
    public final void setRate(float value) {
        this.rate = value;
    }

    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */   
    public final int getTime() {
        return time;
    }

    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */   
    public final void setTime(int value) {
        this.time = value;
    }

    /**
    * The HelloWorld program implements an application that
    * simply displays "Hello World!" to the standard output.
    *
    * @author  Zara Ali
    * @version 1.0
    * @since   2014-03-31 
    */
    @Override
    public final String toString() {
        return "TimeEntry" ;
    }
}
