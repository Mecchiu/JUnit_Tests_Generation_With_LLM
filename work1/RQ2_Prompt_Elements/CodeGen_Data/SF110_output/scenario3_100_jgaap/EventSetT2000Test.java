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
     * Test method for {@link EventSet#size()}.
     */
    @Test
    public void testSize() {
        EventSet es = new EventSet();
        es.add(ev1);
        assertEquals(1, es.size());
    }
	
	/**
	 * The test case for {@link EventSet#add(Object)}.<br> 
	 * All tests use the {@link Event1} object as a first event for the tests, <br> 
	 * then add the two events into the {@link EventSet} and check the
	 * expected result.
	 */
    @Test
    public void testAddEvent() {
	    EventSet es = new EventSet();
	    // add the first event to the set
	    es.add(ev1);
		
	    List<Event1> events = es.getEvents();
	    assertNotNull(events);
		
	    assertEquals(1, events.size());
		
	    assertEquals(ev1, events.get(0));
	}

	/**
	 * Getter method for {@link EventSet#nextEvent()}.
	 */
	public Object getNextEventMethod() /* return first event */ {
	    return ev1;
	}
	/**
	 * The test case for {@link EventSet#nextEvent()}.<br> 
	 * All tests use the {@link Event1} object as a first event for the tests, <br> 
	 * then get the first event from the {@link EventSet} and check the
	 * expected result.
	 */
	@Test
    public void testGetEventFromSet() {
	    EventSet es = new EventSet();
	    TestEvent1 et1 = new TestEvent1();
	    es.add(et1);
	    assertNotNull(es.nextEvent());
		
	    List<Event1> events = es.getEvents();
	    assertNotNull(events);
		
	    assertEquals(1, events.size());
		
	    // get the first event of list
	    assertTrue (events.get(0) instanceof TestEvent1);
		
	    // check events after event 1 is added
		System.out.println(events);
		assertEquals(ev1,events.get(0));

	}

	/**
	 *  The test case for {@link EventSet#getEvents()}.<br> 
	 * All tests use the {@link EventSet} object as a source for the
	 * tests, <br> 
	 * then get the events in the list from the {@link EventSet} and
	 * check the expected result.
	 */
	public void testGetEvents() {
	    EventSet es = new EventSet();
	    TestEvent1 et1 = new TestEvent1();
	    TestEvent2 et2 = new TestEvent2();
	    es.add(et1);
	    es.add(et2);
		
	    Iterator<Object> iter = es.iterator();
	    Object result = null;
	    while (iter.hasNext()) {
	        try {
	            result = iter.next();
	            break;
	        } catch (NoSuchElementException e) {
        		// ignore
	        }
    	    }
	    System.out.println(result);
		
	    assertTrue( result instanceof List<?> );
		
	    List<Event1> events = (List<Event1>)result;
	    assertEquals(1, events.size());
		
	    assertEquals(et1, events.get(0));
		
	    assertEquals(et2, events.get(1));
	}
    }

