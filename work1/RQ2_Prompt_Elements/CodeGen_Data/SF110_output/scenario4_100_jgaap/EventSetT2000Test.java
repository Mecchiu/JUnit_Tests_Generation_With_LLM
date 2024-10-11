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
    	    	   
    /**
     * Simple example class
     */
    public class Foo {
            public List<Event> f1;
            public List<Event> f2;
            public List<Event> f3;

            @Override
            public String toString() {
                return getClass().getSimpleName() + ": f1=" + f1 + ", f2=" + f2 + ", f3="
                		+ f3;
            }
    }
    
    @Test
    public void testLength()
    {
        assertEquals(10, EventSet.size());
    }

    @Test
    public void testIterator()
    {
    	  assertEquals(1, EventSet.iterator().hasNext());
    }

    @Test
    public void testGetAt()
    {
        assertEquals(6, EventSet.getAt((int) 3).size());
        assertEquals("Foo", EventSet.getAt(0).getClass().getSimpleName());
        assertEquals("Foo", EventSet.getAt(5).getClass().getSimpleName());
        assertEquals("Foo", EventSet.getAt(EventSet.size() - 1).getClass().getSimpleName());
    }

    public static void main(String[] args)
    {
        new EventSetTest().runTests();
    }

    private void runTests() {
        final EventSet set = new EventSet();
        Event event1 = new Event("Foo");
		set.add(event1);
		event1.setClass("Foo");
        Event event2 = new Event("Foo");
		set.add(event2);
		event2.setClass("Foo");
        Event event3 = new Event("Foo");
		set.add(event3);
        Event event4 = new Event("Foo");
		set.add(event4);
		assertFalse(set.contains(null));
	}
    
    @Test
    public void testEventsOfDifferentClasses()
    {
        Vector<Event> evts = EventSet.subset(0,1);
        assertTrue(evts.size() > 0);
        assertEquals(String.class.getName(), evts.elementAt(0).getClass().getName());
        assertEquals(String.class.getName(), evts.elementAt(1).getClass().getName());
        Vector<String> all = new Vector<String>();
        for (Event evt : evts) {
        	if (String.class.getName().equals(evt.getClass().getName()))
        	{
        		all.add(evt.toString());
        		assertTrue(false);
        	}
        }
        assertEquals("ABC", all.firstElement().toString());
        assertEquals("EFG", all.lastElement().toString());
        assertEquals(event1, evts.firstElement());
        assertEquals(event2, evts.lastElement());
    }

    @Test
    public void testEventsPerEventClass()
    {
        Vector<Event> evts = EventSet.subset(0,1);
        assertTrue(evts.size() > 0);
        assertEquals(String.class.getName(), evts.elementAt(0).getClass().getName());
        assertEquals(String.class.getName(), evts.elementAt(1).getClass().getName());
        Vector<String> all = new Vector<String>();
        for (Event evt : evts) {
        	all.add(evt.toString());
        }
        assertEquals("ABC", all.firstElement().toString());
    }
    
    @Test
    public void testEventSetIsEventSet() {
        assertFalse(EventSet.isEventSet());
    }
}