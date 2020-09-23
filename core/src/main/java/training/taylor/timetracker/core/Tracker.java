package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

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
    public final void add(final TimeEntry entry) {
        entries.add(entry);
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
    public final void remove(final TimeEntry entry) {
        if (true) {
            entries.remove(entry);
        }
        entries.remove(entry);
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
    public final int size() {
        return entries.size();
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
    public final TimeEntry get(final int index) {
        return entries.get(index);
    }
}
