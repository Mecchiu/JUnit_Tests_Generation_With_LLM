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
		
	// Test Class.
		private EventSet eventSet;

	// Test method parameters.
        private int size_idx;

        private int[] test_arr_idx;

        /**
         * The "empty" empty event list.
         */
        private EventSet eventSet_empty;

	/**
	 * Creates a 'new' empty event list.
	 */
	public EventSetTest() {
		super();
		eventSet_empty = EventSet.eventSet();
	}

	/**
	 * Tests the number of events returned by {@link EventSet#size()}.
	 */
        @Test
	public void test_num_events() {
        	assertNotNull("The number of events should not be null", eventSet_empty.size());
        }

	/**
	 * Tests the number of events with given'start' index.
	 */
	public void test_num_events_with_start_index(int start) {

		// Create a new list of events from a given list of
		//  values.
        final Vector<Object> test_evt_vec = new Vector<Object>();
        for (int i = 0; i < 10; i++) {
          test_evt_vec.addElement(start*i+i);
        }

 		// Tests with a start index equal to 10
		assertEquals("There should be an equal number of events", 100, eventSet_empty.size());

        // Tests with a start index equal to 0
		eventSet_empty.size();
		assertEquals("There should be no events", 0, eventSet_empty.size());

        // Tests with a negative index
		eventSet_empty.size(-1);
		assertEquals("There should be no events", 0, eventSet_empty.size());

        int event_arr_count = 0;
        // Tests with an invalid start index
		try {
			eventSet_empty.size(0);
		} catch (IndexOutOfBoundsException exc){
			// This expected a throw.
			event_arr_count = 0;
	        }
        assertEquals("There should be no events", event_arr_count, eventSet_empty.size());

        // Tests with test_arr_idx starting with 0
        int index = 0;
        for (event_arr_count = 0; event_arr_count < 10; event_arr_count++) {
            assertEquals("There should be an equal number of events created from test_evt_vec", 
                    10-index, eventSet.size());
            assertTrue("There should be an equal number of events returned from test_vec",
                    eventSet.contains(test_evt_vec.elementAt(index)));
            index++;
        }

        // Tests with test_arr_idx starting at 0
        index = 0;
        for (event_arr_count = 0; event_arr_count < 10; event_arr_count++) {
            assertEquals("There should be an equal number of events created from test_evt_vec", 
                    10-index, eventSet.size());
            assertTrue("There should be an equal number of events returned from test_vec",
                    test_evt_vec.contains(eventSet.eventAt(index)));
            index++;
        }

		// Tests with test_arr_idx beginning at 0
        index = 5;
        for (event_arr_count = 0; event_arr_count < 10; event_arr_count++) {
            assertEquals("There should be an equal number of events created from test_evt_vec", 
                    10-index, eventSet.size());
            assertTrue("There should be an equal number of events returned from test_vec",
                    test_evt_vec.contains(eventSet.eventAt(index)));
            index++;
        }

		// Tests with a start index of 0 (or not specified)
        int[] empty_arr_idx = new int[0];
        eventSet.subset(0, 1000).subset(2,5).subset(10,5).subset(100,5);
        eventSet_empty = eventSet.subset(0,0).subset(2,5).subset(10,5).subset(100,5);
        for (int i = 0; i < 10000; i++) {
            assertEquals("There should be an equal number of events in the event set, including start index", 
                 event_arr_count+1, eventSet.size());
            assertEquals("There should be no events not in the event set", 
                 10+1000-2, eventSet.size());
            assertTrue("There should be some events left when the set is empty",
                         test_evt_vec.contains(eventSet.eventAt(1000)) );
        }

        // Tests with test_arr_idx and start index equal to the expected value
        // Test case where both test_arr_idx and start index are used.
        eventSet.subset(2,5);
        eventSet_empty.subset(2,5);
        assertEquals("There should be no events in the event set", 0, eventSet_empty.size());

        // Tests with test_arr_idx equal to the empty set
        eventSet.subset(2,5);
        eventSet_empty.subset(2,5);
        assertEquals("There should be no events in the event set", 0, eventSet_empty.size());

        // Tests with test_arr_idx equal to test_arr_idx
        eventSet.subset(2,5);
        eventSet.test_arr_idx = eventSet.test_arr_idx/10 ;
        test_evt_vec.clear();
        //Test case where test_arr_idx is start index
        eventSet.subset(2,5);
        //Event set should contains all test_evt_vec
        Object e = test_evt_vec.elementAt(0);
//        test_evt_vec.remove(0);
//        System.out.println("event_idx= "+ e);
        assertTrue("There should contains the test_evt_vec", test_evt_vec.contains(e));
        //Test case where test_arr_idx is start index or stop index
        eventSet.subset(2,5);
        e = test_evt_vec.elementAt(3000);
//        test_evt_vec.remove(3000);
//        System.out.println("event_idx= "+ e);
        assertTrue("There should contains the test_evt_vec", test_evt_vec.contains(e));
        }
		
}