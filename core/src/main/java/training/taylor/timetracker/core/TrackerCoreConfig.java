package training.taylor.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Configuration
@ComponentScan("training.taylor.timetracker.core")
public class TrackerCoreConfig {

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
    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
