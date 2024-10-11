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
		* Tests the size of EventSet.
		*/
		@Test
		public void testEventSetSize() {
			assertEquals("size must be zero", 0, EventSet.size());
		}
		/**
		* Tests the size of EventSet.
		*/
		@Test
		public void testEventSetSize2() {
			assertEquals("size must be zero", 0, EventSet.size());
		}
		/**
		* Tests the size of EventSet.
		*/
		@Test
		public void testEventSetRemoveAll() {
			Event evt = EventSet.eventAt(0);
			assertEquals("size must be zero", 0, EventSet.size());
			EventSet.removeAll(evt);
			assertEquals("size must be zero", 0, EventSet.size());
		}
		/**
		* Tests the removeAll method as an empty event set
		*/
		@Test
		public void testEventSetRemoveAt() {
			Event evt = EventSet.eventAt(0);
			EventSet.remove(evt);
			assertEquals("size must be zero", 0, EventSet.size());
		}

		/**
		* Tests the add method
		*/
		@Test
		public void testEventSetAdd() {
			for (int i = 0; i < 100; i++) {
				Event evt = EventSet.eventAt(i);
				EventSet.add(evt);
				assertTrue("add should not fail", EventSet.size() == (i + 1));
			}
			fail("not expecting a failure");
		}

		/**
		* Tests the add to the end of an empty EventSet
		*/
		@Test
		public void testEventSetAddToEnd() {
			EventSet.add(EventSet.eventAt(100));
			EventSet.add(EventSet.eventAt(101));
			EventSet.add(EventSet.eventAt(102));
			assertTrue("add should not fail", EventSet.size() == (200));
		}

		/**
		* Tests the add method from an EventSet
		*/
		@Test
		public void testEventSetAddAll() {
			List<Event> testEvents = new Vector<Event>();
			for (int i = 0; i < 100; i++) {
				Event evt = EventSet.eventAt(i);
				testEvents.add(evt);
			}
			for (Event evt: testEvents) {
				EventSet.add(evt);
			}
			assertTrue("add should not fail", EventSet.size() == (100));
		}

		/**
		* Tests the get method
		*/
		@Test
		public void testEventSetGet() {
			for (int i = 0; i < 100; i++) {
				Event evt = EventSet.eventAt(i);
				EventSet.add(evt);
				assertTrue("get should not fail", EventSet.size() == (i + 1));
				assertTrue("get returns wrong event", EventSet.get(i) == evt);
			}
			fail("not expecting a failure");
		}

		/**
		* Tests the event is present in EventSet.get method
		*/
		@Test
		public void testEventSetGetSet_get() {
			for (int i = 0; i < 100; i++) {
				Event evt = EventSet.eventAt(i);
				assertTrue("get should not fail", EventSet.get(i).equals(evt));
			}
		}
}