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
	* Test method for {@link EventSet#size()}.
	*  This test case will fail as a {@link Vector} is expected to contain the
	*  entire size of the event set.  In the test cases it also test a case
	*  to create a list of events and then assert that it still contains the
	*  entire size of the list.  Use {@link #constructAndCreateEvents()} to
	*  construct an event set and then test the case to ensure that that event
	*  set contains the total number of events.
	*/
	@Test
	void test( ) {
		//Construct an event set and test if the size of the event set is
		// not zero
		assertFalse(events.size() >= 0);
		events = new Vector<Event>();
		//Create a new instance of one of two event sets.
		EventSet eset1 = constructAndCreateEvents();
		//Call the size method on the event set.  The
		//  {@link #assertEquals} method must have been called before the
		//  call to the size method
		assertEquals(events.size(), eset1.size());
		//Return the event set
		return;
		//TODO: assertEquals with a condition of the Vector of all the
		//  the events equal to the expected list
		//TODO: assertEquals with a condition of the Vector of all the events
		//  equal to expected list
	}

	/**
	* Tests the {@link #subset(int, int)} method of
	*   {@link EventSet#subset(int, int)}
	*/
	@Test
	void testSubset( ) {
		//Create a new instance of one of two event sets.
		EventSet eset1 = constructAndCreateEvents();
		//Create a new instance of one of two event sets.
		EventSet eset2 = constructAndCreateEvents();
		//If there are no events then return
		if (eset1.size() == 0) return;
		List<Event> list = eset1.subset(0, eset2.size() - 1).getEvents();
		//Create a new instance of List of events
		List<Event> list2 = eset1.subset(0, eset2.size()).getEvents();
		//Test if the events contained in both sets is equal to the
		//  same list.
		List<Event> list3 = eset1.subset(0, eset2.size())
		.getEvents();
		//If both sets were made from the same list then
		if (list2.size() == list3.size()){
			assertEquals(list.size(), list2.size());
			assertEquals(list.get(0), list3.get(0));
			//If there are no events then they are equal
			if (list.size() == 0) return;
		}
		else {
			//If the sizes of the lists are different then they are not equal.
			assertNotEquals(list.size(), list3.size());
		}
	}

	/**
	* Tests the {@link #getEvents()} method of
	*   {@link EventSet#getEvents()} and
	*   {@link EventSet#subset(int, int)}
	*/
	@Test
	void testEvents( ) {
		//Create a new instance of one of two event sets.
		EventSet eset1 = constructAndCreateEvents();
		//Create a new instance of one of two event set.
		EventSet eset2 = constructAndCreateEvents();
		//If there are no events then return
		if (eset1.size() == 0) return;
		//Get all the events from the event set
		List<Event> eventList = eset1.getEvents();
		assertTrue(eventList.size() == eset1.size());
		//Get all the events from the event set
		List<Event> eventList2 = eset2.getEvents();
		assertTrue(eventList2.size() == eset2.size());
		for (int i = 0; i < eventList2.size(); i++) {
			System.out.println("Events " + i + " " + eventList2.elementAt(i));
		}
	}

	private EventSet constructAndCreateEvents( ) {
		//Return a new instance of the set and create its events
		return new EventSet(events);
	}

}