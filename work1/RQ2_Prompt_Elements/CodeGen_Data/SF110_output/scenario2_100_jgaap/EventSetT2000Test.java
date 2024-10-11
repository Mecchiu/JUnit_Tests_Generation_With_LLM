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
		* {@link EventSet} contains one event.
		*/
		public static final String EVENT_NAME = "EVENT_NAME"; 
	
		int eventCounter = 0;
		
		@Test
		public void create() {
			
			EventSet EventSet = new EventSet();
			
			assertEquals(0, EventSet.size());
			assertNotNull(EventSet);
			EventList Events = EventSet.getEvents();
			assertNotNull(Events);
			assertEquals(0, Events.size());
			
		}

		@Test
		public void getEventByName() {
			
			EventList Events = new EventList();
			List<String> EventsList = new Vector<String>();
			EventsList.add(EVENT_NAME);
			
			assertNotNull(EventsList);
			assertEquals(EVENT_NAME, Events.get(0));
			
			Events = null;
		
			try {
				Events = new EventList();
			}
			catch (Exception e) {
				
			}
			assertNotNull(Events);
		
			assertTrue(!EventsList.contains(EVENT_NAME));
			
			Events = null;
		
		}
		
		@Test
		public void containsEvent() {
			
			
			List<String> EventsList = new Vector<String>();
	
			EventSet EventSet = new EventSet();
			EventEvent Event = new EventEvent();
		
			EventList Events = EventSet.getEvents();
			
			assertTrue(!EventsList.contains(EVENT_NAME));
			EventsList.add(EVENT_NAME);
			assertTrue(!EventsList.contains(Event_NameOfEventName));
			
			EventsList.add(EVENT_NameOfEventName);
			assertTrue(!EventsList.contains(Event_NameOfEventName));
			
			assertTrue(EventsList.contains(EV_NameOfEventName));
			
			assertFalse(EventsList.contains(Event_NameOfEventName));
			
			
			
		}

		@Test
		public void containsEventWhenNonContainedEvent() {
			
			EventSet EventSet = new EventSet();
			
			assertTrue(EventSet.contains(Event_NameOfEventName));
			
		}

		
		@Test
		public void notContainsEvent() {
			
			EventSet EventSet = new EventSet();
			
			assertTrue(!EventSet.notContains(EVENT_NAME));
			
		}

		@Test
		public void containsEventWhenMoreContainedEvent() {
			
			EventSet EventSet = new EventSet();
	
			List<String> EventsList = new Vector<String>();
			EventList Events = EventSet.getEvents();
			
			EventsList.add(EVENT_NAME);
			EventsList.add(EV_NameOfEventName);
			
			EventsList.add(EVENT_NameOfEventName);
			EventsList.add(EV_NameOfEventName);
			
			assertTrue(!(EventSet.contains(Events.get(0)))
					&&!(EventSet.contains(Events.get(5)))
					&&!(EventSet.contains(Events.get(3))));
			
		}

	
	}