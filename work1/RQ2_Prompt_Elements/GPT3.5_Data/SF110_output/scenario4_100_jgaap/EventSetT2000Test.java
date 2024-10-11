// Here's an example implementation of the EventSet class and its test class:

// EventSet.java
import java.util.ArrayList;
import java.util.List;

public class EventSet {

    private List<Event> events = new ArrayList<>();
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public EventSet() {
    }

    public EventSet(List<Event> evts) {
        events.addAll(evts);
    }

    public EventSet subset(int start, int length) {
        List<Event> subList = events.subList(start, Math.min(start + length, events.size()));
        return new EventSet(subList);
    }

    public Event eventAt(int index) {
        return events.get(index);
    }

    public int size() {
        return events.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Event event : events) {
            sb.append(event.toString()).append(",");
        }
        return sb.toString().replaceAll(",$", "");
    }
}

// EventSetTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EventSetTest {

    @Test
    void testSizeEmpty() {
        EventSet eventSet = new EventSet();
        assertEquals(0, eventSet.size());
    }

    @Test
    void testSizeNonEmpty() {
        List<Event> events = new ArrayList<>();
        events.add(new Event("Event 1"));
        events.add(new Event("Event 2"));
        EventSet eventSet = new EventSet(events);
        assertEquals(2, eventSet.size());
    }

    @Test
    void testSubset() {
        List<Event> events = new ArrayList<>();
        events.add(new Event("Event 1"));
        events.add(new Event("Event 2"));
        events.add(new Event("Event 3"));
        events.add(new Event("Event 4"));
        EventSet eventSet = new EventSet(events);
        EventSet subset = eventSet.subset(1, 2);
        assertEquals(2, subset.size());
        assertEquals("Event 2", subset.eventAt(0).getName());
        assertEquals("Event 3", subset.eventAt(1).getName());
    }

    // Add more test cases for other methods
}

class Event {
    private String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}