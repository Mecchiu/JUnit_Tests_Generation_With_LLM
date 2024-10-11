// EventSet_2Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains one unit test case for the {@link EventSet#size()} method.
*/
class EventSet_2Test {
		private List<Event> events4 = null;

		/**
		 * {@link List} that holds the events in <code>event</code>
		 */	
		private List<Event> events = null;

    public EventSet_2Test() {
			events4 = new Vector<Event>();
    }

		@Test
		public void testSize() {
			EventSet set = new EventSet();
			set.size();
			assertTrue("List of events not initialized", set.events.size()!= 0);
		}

		@Test
		public void testContains() {
			EventSet set = new EventSet();
			Event e = new Event();
			set.events.add(e);
			assertTrue("EventSet not contains "+e, set.contains(e));
			try {
				set.contains(null);
				fail("EventSet did not contain any event");
			} catch(NullPointerException e6) {}
		}

		@Test
		public void testRemove() {
			EventSet set = new EventSet();
			Event e0 = new Event();
			e0.setAuthor("John Doe");
			e0.setText("john");
			e0.addLink("http://www.google.com");
			set.events.add(e0);
			assertTrue("EventSet not contains "+e0, set.events.contains(e0));
			EventSet set2 = new EventSet();
			set2.addEvent(e0);
		    assertTrue("EventSet not contains "+e0, set.events.contains(e0));
			Event e = new Event();
			e.setAuthor("John Doe");
			e.setText("john");
			List<Event> events = new Vector<Event>();
			events.add(e);
			set2.events.add(events);
			assertTrue("EventSet not contains "+e, set.events.contains(e0));
			set2.events.remove(events);
			List<Event> events2 = new Vector<Event>();
			events.addAll(events2);
			assertTrue("EventSet not contains "+e0, set.events.contains(e0));
			set2.events.removeAll(events2);
			assertTrue("EventSet did not contain "+e0, set.events.contains(e0));
			set = new EventSet();
			set.addEvent(e0);
			set.events.addAll(events);
			assertTrue("EventSet does contain + added events", set2.events.containsAll(events));
			assertTrue("EventSet did not contain "+e0, set.events.contains(e0));
			set.events.addAll(events);
			assertTrue("EventSet did not contain "+e0, set.events.contains(e0));
			set2 = new EventSet();
			set2.addEvent(e0);
			events = new Vector<Event>();
			set.events.addAll(events);
			events.add(e);
			assertTrue("EventSet did not contain added events", set2.events.containsAll(events));
		}

		@Test
		public void testAddingListOfEvents() {
			EventSet set = new EventSet();
			Event e0 = new Event();
			e0.setAuthor("John Doe");
			e0.setText("john");
			e0.addLink("http://www.google.com");
			set.getAuthor();
			List<Event> events = new Vector<Event>();
			events.add(e0);
			set.getAuthor();
			set = new EventSet();
			events.addAll(events);
	    assertTrue("EventSet did contain "+e0, set.contains(e0));
			set.getAuthor();
			events.addAll(events);
	    assertTrue("EventSet did contain "+e0, set.contains(e0));
	    set.getAuthor();
	    events.addAll(events);
	    events.remove(0);
	    events.removeAll(events);
	    List<Event> events2 = new Vector<Event>();
	    events2.addAll(events);
	    assertTrue("EventSet did not contain "+e0, set.contains(e0));
	    events.remove(0);
		addEvents(events, 6);
	    assertTrue("List of events not cleaned up properly", set.events.contains(e0));
	    events.remove(0);
	}

		private void addEvents(Vector<Event> events, int toAdd) {
			events.addAll(toAdd);
		}

	}