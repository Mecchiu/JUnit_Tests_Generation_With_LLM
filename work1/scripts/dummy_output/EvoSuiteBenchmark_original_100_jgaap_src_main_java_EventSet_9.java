// EventSetTest.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains one unit test case for the {@link EventSet#size()} method.
*/
class EventSetTest {
		
    @Test
    public void testSize() {
        EventSet all = new EventSet();
        assertEquals(0, all.size());
        
        List<Event> events = new Vector<Event>();
        events.add(new Event("eventString1"));
        events.add(new Event("eventString2"));
        all.subset(0, events.size());
        assertEquals(2, all.size());
        
        List<Event> nonRepeated = new Vector<Event>();
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        assertEquals(10, all.size());
        all.subset(1, nonRepeated.size());
        assertEquals(0, all.size());
    }

    @Test
    public void testAdd() {
        EventSet all = new EventSet();
        assertEquals(0, all.size());
        
        List<Event> events = new Vector<Event>();
        events.add(new Event("event1"));
        events.add(new Event("event2"));
        all.add(events);
        assertEquals(2, 
                events.size());
        
        List<Event> nonRepeated = new Vector<Event>();
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        all.subset(1, nonRepeated.size());
        assertEquals(2, 
                events.size());
        
        all.subset(1, 1);
        assertEquals(0, all.size());
    }

    @Test
    public void testSubset() {
        EventSet all = new EventSet();
        assertEquals(0, all.size());
        
        List<Event> events = new Vector<Event>();
        events.add(new Event("event3"));
        events.add(new Event("event4"));
        all.subset(0, 4);
        assertEquals(5, all.size());
        
        List<Event> nonRepeated = new Vector<Event>();
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        all.subset(1, nonRepeated.size());
        assertEquals(4, all.size());
        
        all.subset(1, 1);
        assertEquals(0, all.size());
    }
    
    @Test
    public void testSubsetSameOrder() {
        EventSet all = new EventSet();
        assertEquals(0, all.size());

        List<Event> events = new Vector<Event>();
        events.add(new Event("event1"));
        events.add(new Event("event3"));
        events.add(new Event("event4"));
        events.add(new Event("event2"));
        all.subset(0, 3);
        assertEquals(3, all.size());
        
        List<Event> nonRepeated = new Vector<Event>();
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        all.subset(1, 3);
        assertEquals(3, all.size());
        
        all.subset(1, 2);
        assertEquals(2, all.size());
    }

    @Test
    public void testAddAll() {
        EventSet all = new EventSet();
        assertEquals(0, all.size());
        
        List<Event> events = new Vector<Event>();
        events.add(new Event("event1"));
        events.add(new Event("event2"));
        events.add(new Event("event3"));
        events.add(new Event("event4"));
        events.add(new Event("event5"));
        events.add(new Event("testString"));
        all.addAll(events);
        assertEquals(6, all.size());
        
        List<Event> nonRepeated = new Vector<Event>();
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        nonRepeated.add(new Event("testString"));
        all.subset(4, 6);
        assertTrue(all.containsAll(nonRepeated));
        
        List<Event> repeated = new Vector<Event>();
        repeated.add(new Event("testString"));
        repeated.add(new Event("testString"));
        repeated.add(new Event("testString"));
        all.subset(1, 4);
        assertTrue(all.containsAll(repeated));
    }

    @Test
    public void testToVector() {
        EventSet set = new EventSet();

        set.add(new Event("eventString1"));
        set.add(new Event("eventString2"));
        set.add(new Event("eventString3"));
        set.add(new Event("eventString4"));
        set.add(new Event("eventString5"));
        set.add(new Event("eventString6"));

        assertEquals(
                set
           .toVector()
           .get(0)
           .toString()
            + ","
            + set
           .toVector()
           .get(1)
           .toString()
            + ","
            + set
           .toVector()
           .get(2)
           .toString()
            + ","
            + set
           .toVector()
           .get(3)
           .toString()
            + ","
            + set
           .toVector()
           .get(4)
           .toString()
            + ","
            + set
           .toVector()
           .get(5)
           .toString()
           , set.size());
    }

    @Test
    public void testAddAllSubset() {
        EventSet set = new EventSet();

        set.add(new Event("eventString1"));
        set.add(new Event("eventString2"));
        set.add(new Event("eventString3"));
        set.add(new Event("eventString4"));
}
}