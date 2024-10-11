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
		/**
		* Tests size() method of an empty Event Set.
		*/
		@Test
		void testSize() {
			assertEquals((int)0, events.size());
		}
		/**
		* Tests size() method of an single event given the index*
		*/
		@Test
		public void testSizeSingleEvent() {
			Event event = new Event();
			assertEquals((int)1, events.size());
			events.get(0).reset(event);
			assertEquals((int)1, events.size());
		}
		/**
		* Tests the index of a given event*
		*/
		@Test
		public void testIndexOfEvent() {
			assertEquals((int)1, events.indexOf(events.elementAt(0)));
		}
		/**
		* Tests for last event*
		*/
		@Test
		public void testLastEvent() {
			assertEquals((int)1, events.lastIndexOf(events.elementAt(events.size()-2)));
		}
		/**
		* Tests for first event*
		*/
		@Test
		public void testFirstEvent() {
			assertEquals((int)1, events.firstIndexOf(events.elementAt(0)));
		}
		/**
		* Tests index of a given event*
		*/
		@Test
		public void testIndexOfEventSequence() {
			List<Event> seq = new Vector<Event>();
			for (int i = 0; i < 3; i++)
				seq.add(events.elementAt(i));
			assertEquals((int)1, events.indexOf(seq.get(2)));
			assertEquals((int)3, events.indexOf(seq.get(2)));
			for (int i = 2; i < 3; i++)
				assertEquals((int)i, events.indexOf(seq.get(i)));
		}
		/**
		* Tests the isGreater* method of the EventSet.
		*/
		@Test
		public void testCompareLessEqual() {
			assertTrue(events.isGreaterOrEqual(0, 0));
			assertFalse(events.isLessThan(0, 0));
			assertTrue(events.isLessThan(0, 1));
			assertTrue(events.isLessThan(0, 2));
			assertTrue(events.isLessThan(0, 3));
			assertFalse(events.isGreaterThan(0, 0));
			assertFalse(events.isGreaterThan(0, 2));
		}
		/**
		* Tests the isGreater* method of the EventSet.
		*/
		@Test
		public void testCompareGreaterEqual() {
			assertTrue(events.isGreaterOrEqual(0, 1));
			assertTrue(events.isGreaterOrEqual(0, 2));
			assertTrue(events.isGreaterOrEqual(2, 1));
			assertTrue(events.isGreaterOrEqual(2, 2));
			assertFalse(events.isGreaterOrEqual(0, 3));
		}
		/**
		* Tests index of a given event*
		*/
		@Test
		public void testIndexOfEventSequenceSequence() {
			List<Event> seq = new Vector<Event>();
			for (int i = 0; i < 3; i++)
				seq.add(events.elementAt(i));
			int index = events.indexOfSequence(seq.get(2), seq.get(2));
			assertEquals((int)2, index);
			index = events.indexOfSequence(seq.get(2), seq.get(2));
			assertEquals((int)1, index);
			index = events.indexOfSequence(seq.get(2), seq.get(3));
			assertEquals((int)3, index);
		}
}