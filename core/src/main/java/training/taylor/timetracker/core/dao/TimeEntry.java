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
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public String getDescription() {
        return description;
    }

    /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public void setDescription(String value) {
        this.description = value;
    }

     /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public float getRate() {
        return rate;
    }
    
     /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public void setRate(float value) {
        this.rate = value;
    }

    /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public int getTime() {
        return time;
    }

     /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Converts an array to a Collection.
     *
     * <p>First, creates a new Collection of the requested target type.
     * Then adds each array element to the target collection.
     * Will perform an element conversion from the source component type
     * to the collection's parameterized type if necessary.
     *
     * @author Keith Donald
     * @author Juergen Hoeller
     * @since 3.0
     */
    @Override
    public String toString() {
        return "TimeEntry{" +
                "description='" + description + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
