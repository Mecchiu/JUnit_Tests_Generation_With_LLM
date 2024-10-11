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
	 * Tests if size() returns a non negative number
	 */
	@Test
	public void testSize() {
		assertTrue(size() >= 0);
	}
		
	/**
	 * Tests if a EventSet with all events can be created.
	 */
	@Test
	public void testConstructor() {
		EventSet rnd;
		
		// set a random set of participants
		rnd = new EventSet(new ArrayList(getNumberOfEvents()));
		
		// test if there are no participants
		assertEquals("There are no participants in the set", 0, rnd.size());

		// add a participant
		rnd.add(new Event ("R2", "A2","-","B2","1"));
		
		// add another participant
		rnd.add(new Event ("R3", "A3","-","B3","2"));

		// assign the set
		evts = rnd.getEvents();

		// test if both participants are added
		assertEquals("There are two participants", 2, evts.size());

		// test if the participant has the correct number of
		/*
			The size() method returns a non-negative number.
			If the argument is not greater than zero 
			then the returned value is non negative number.
			The following assumptions are made:
			1) a participant must not be added
			2) there should be at least two participants
   				
		 */
	}
	
	/**
	 * Tests the create method
	 */
	@Test
	public void testCreate() {
		EventSet testSet;

		// create the test set using the constructor
		testSet = new EventSet(getNumberOfEvents());

		// make sure the create method returns a set of events not null
		assertNotNull("Test set is null", testSet.getEvents());

		// make sure the returned set is not null
		assertNotNull("The set's events array is null", testSet.getEvents());

		// test if the events in the test set are a subset of the original set
		assertTrue("The test set has more than one participant",
				testSet.equals(new EventSet(getNumberOfEvents())))
			   : "Invalid test set";
	}

	/**
	 * Tests the add method
	 */
	@Test
	public void testAdd() {
		// use the create method to instantiate an EventSet object
		// and add a new participant
		EventSet testSet = new EventSet(getNumberOfEvents());
		
		// make sure the test set is not null
		assertNotNull("The test set is null", testSet.getEvents());

		// get the size()
		int eventSize = testSet.size();
		assertTrue("There is a size() call", testSet.getEvents().size() == eventSize);

		// get the first item from the events that are added
		Event[] eventArray = testSet.getEvents();
		Vector<Event> eventVector = new Vector<Event>();
		String temp = ((String) eventArray[0] instanceof Event) 
				? ((Event) eventArray[0]).getSubject() + " +" +
				(((Event) eventArray[0]).getAgent() + " +" +
				(((Event) eventArray[0]).getSubject() + " +" +
				(((Event) eventArray[0]).getAgent() + " +")
				)
				)
				: "";
		for (int i = 1; i < eventArray.length; i++) {
			eventVector.add(new Event(eventArray[i].getCategory(), 
					temp + (i + 1 + "").substring(0,1), eventArray[i].getCategory(), 
					eventArray[i].getAgent(), eventArray[i].getRelation()));
		}
		// compare the events vector with the test set
		assertEquals("The test set contains less events",
				testSet.size(),
				eventVector.size());

		// add one more participant
		testSet.add(new Event ("R1", "A1", "-", "B1", -1));
		// get the size()
		eventSize = testSet.size();
		testSet.add(new Event ("R2", "A2", "-", "B2", -1));
		// get the item for testing
		eventArray = testSet.getEvents();
		eventVector = new Vector<Event>();
		Integer temp = ((Integer) eventArray[eventArray.length - 2]).intValue();
		for (int j = 1; j < eventArray.length; j++) {
			eventVector.add(new Event("EVT",temp + ((j + 1 + ". " + temp + ((j + 1 + ". "
					+ ((Integer) eventArray[j]).intValue()) == (j + 1 + ")"
					+ temp + ((j + 1 + "." + temp + ((Integer) eventArray[j]).intValue()))).toString())
					.substring(0,1))));
		}
		// compare the events vector with the test set
		assertEquals("The test set contains more events",
				eventVector.size(),
				testSet.size());

		// check test method for adding the test set twice once, with and with a new set, 
		// and with one more set
		testSet = new EventSet(getNumberOfEvents());
		testSet.add(new Event ("R2", "A2", "-", "B2", -1));
		testSet.add(new Event ("R3", "A3", "-", "B3", -1));
		
		assertEquals("The test set contains both participants as expected",
				eventVector.size(),
				testSet.size());
	}
	 
	/**
	 * tests the toString method
	 */
	@Test
	public void testToString() {
		assertEquals("size()", getNumberOfEvents(), new EventSet().size());
		String out = new EventSet().toString();
		System.out.println("toString(): " + out);
	}
}