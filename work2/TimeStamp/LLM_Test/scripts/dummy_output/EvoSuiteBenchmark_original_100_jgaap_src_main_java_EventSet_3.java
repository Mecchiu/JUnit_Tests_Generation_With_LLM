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
		private EventSet events;
	
	@Test
    public void testSize() {
        assertEquals(events.size(), events.size(), "Incorrect size. (" + events + " == " + events.size() +")");
    }
	
	@Test
	public void size() {
        events = new EventSet();
		assertTrue(events.size() == 0, "Incorrect size. (" + events + "!= " + events.size()+")");
	}

	@Test
    public void containsEvent() {
        List<Event> temp = new Vector<Event>();
        events.containsEvent(temp);
        assertEquals(temp, events.events, "Incorrect list returned when the event is a member of this EventSet, which has a member only when the EventSet contains it.");
    }

	@Test
	public void getEvent() {
        List<Event> temp = new Vector<Event>();
        events.getEvent(temp);
        assertEquals((Object) temp, events.events, "If there are events in the event set, an Exception should be thrown");
    }

	@Test
	public void isEmpty() {
        assertEquals(events.size(), events.isEmpty(), "Incorrect state. (" + events + "!= " + events.isEmpty()+")");
    }

	@Test
	public void addEvent() {
        List<Event> temp = new Vector<Event>();
        events.addEvent(temp);

        assertEquals(events.size(), temp.size());
		assertTrue(temp.containsAll(events.events), "Incorrect state. (" + events + "!= " + temp.toString()+")");
	}

	@Test
	public void addEventAndExpectedNum() {
        List<Event> temp = new Vector<Event>();
        for (int index = 0; index < 10; index++) {
            events.addEvent(temp);
        }

        assertEquals(events.size()+10, temp.size());
		assertEquals(events.size(), events.size()+10, "Incorrect state. (" + temp + "!= " + events.toString()+")");
	}

	@Test
	public void addEventAndEmptyEventList() {
        events.addEventAndEmptyEventList();

        assertEquals("Incorrect state of list. " + events.toString()+", ("+events+"), isNotEmpty ", events.isEmpty(), "Incorrect state. ("+events+")!="+events.toString()+")");
	}

        @Test(expected = UnsupportedOperationException.class)
        public void addEventAndNotEmptyEventList() {
        	events.addEventAndNotEmptyEventList();
        }
}