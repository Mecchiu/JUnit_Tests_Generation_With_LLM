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
		
	@Test
	void contains() {
		EventSet set = new EventSet();
		assertEquals("Should be empty", 0, EventSet.size(set));
		set.add(new Event(null, 1, 2));
		assertEquals("Should be a non-empty", 1, EventSet.size(set));
		
		set = new EventSet();
		set.add(new Event(null, 42, 5));
		set.add(new Event(null, 8, 7));
		set.add(new Event(null, 21, 2));
		assertEquals("Should contain one more event", 3, EventSet.size(set));
		set.add(new Event(null, 21, 4));
		assertEquals("Should have been three more events", 6, EventSet.size(set));
		
		set = new EventSet();
		set.remove(null);
		assertEquals("Should not contain removeevent", 1, EventSet.size(set));
		set.remove(new Event(null, 20, 2));
		assertEquals("Should only contain two more events", 1, EventSet.size(set));
		
		set = new EventSet();
		set.remove(new Event(null, null));
		assertEquals("Should contain remove event", 1, EventSet.size(set));
		set.remove(new Event(null, 42));
		assertEquals("Should still contain two more events", 2, EventSet.size(set));
		
    }

	@Test
	void contains_by_order() {
		EventSet set1 = new EventSet();
		EventSet set2 = new EventSet();
		set1.add(new Event(null, 1, 2));
		assertEquals("Should contain only set1 first (order)", 1, EventSet.size(set1));
		set1.add(new Event(null, 1, 2));
		set1.add(new Event(null, 1, 1));
		set1.add(new Event(null, 1, 2));
		set1.add(new Event(null, 1, 1));
		set1.add(new Event(null, 1, 2));
		
		set2.add(new Event(null, 1, 2));
		set2.add(new Event(null, 1, 1));
		set2.add(new Event(null, 1, 2));
		set2.add(new Event(null, 1, 1));
		set2.add(new Event(null, 1, 2));
		
		EventSet set3 = new EventSet(new Vector<Event>(set2));
		EventSet set4 = new EventSet(new Vector<Event>(set1));
		
		assertEquals("Should contain multiple elements from set1", 2, EventSet.size(set1));
		assertEquals("Should contain multiple elements from set2", 1, EventSet.size(set2));
		assertEquals("Should contain multiple elements from set3", 3, EventSet.size(set3));
		assertEquals("Should contain multiple elements from set4", 1, EventSet.size(set4));
	}

	@Test
	void add_addSame() {
		EventSet set1 = new EventSet();
		set1.add(new Event(null, 1, 1));
		set1.add(new Event(null, 1, 2));
		assertEquals("Should contain single event after adding", 1, EventSet.size(set1));
		set1.add(new Event(null, 1, 1));
		assertEquals("Should contain two more events after adding", 2, EventSet.size(set1));
		
		EventSet set2 = new EventSet(new Vector<Event>(set1));
		set2.add(new Event(null, 2, 1));
		set2.remove(new Event(null, 2, 2));
		assertEquals("Should replace the first event with the second element", 1, EventSet.size(set2));
	}

	@Test
	void remove_removesEvent() {
		EventSet set = new EventSet();
		set.add(new Event(null, 0, 1));
		set.add(new Event(null, 0, 2));
		set.add(new Event(null, 0, 3));
		
		assertEquals("Should be a non-empty", 1, EventSet.size(set));
		set.add(new Event(null, 0, 5));
		set.add(new Event(null, 0, 4));
		
		set.remove(new Event(null, 3, 2));
		assertEquals("Should be all the remaining events", 0, EventSet.size(set));
		
		set.remove(new Event(null, 2, 2));
		assertEquals("Should contain all deleted elements", 0, EventSet.size(set));	
		
	}

	@Test
	void addToStart() {
		EventSet set = new EventSet();
		set.add(new Event(null, 1, 5));
		assertEquals("Should contain start and stop elements of added events", 1, EventSet.size(set));
		set.add(new Event(null, 1, 7));
		assertEquals("Should contain two more elements of added events", 2, EventSet.size(set));
		vector = set.retain(5);
		assertEquals("Should contain only 5 events with changed start/stop positions", 5, vector.size());
		assertEquals("Should not contain additional events", 5, EventSet.size(set));
	}

	@Test
	void retainWithNulls() {
		EventSet set2 = new EventSet(new Vector<Event>(set1));
		vector = (EventSet) set2.retain(5);
        assertEquals("Should be non-empty", 1, EventSet.size(set2));
	}

	@Test
	void removeAll() {
		EventSet set = new EventSet();
		set.add(new Event(null, 1, 2));
		assertEquals("Should remove elements of removed list", 2, EventSet.size(set));
		
		set.removeAll(set);
		assertEquals("Should no events with changed start/stop positions", 1, EventSet.size(set));
}
}