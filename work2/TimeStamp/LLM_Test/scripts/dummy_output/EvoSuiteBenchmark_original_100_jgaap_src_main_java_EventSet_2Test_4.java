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
		private EventSet testee;
		
		private void setUp() {
			testee = new EventSet();
        }
		
        /**
        * Test that the size method works.
        *  It returns the correct value.
        */
    @Test
    public void basicTest() {
        assertEquals(0, testee.size());
    }
		/**
		* Test that the isEmpty method works.
		*  It returns false when the size is zero.
		*/
    @Test
    public void clearTest() {
        assertFalse(testee.isEmpty());
    }
		/**
		* Test of inserting a new element.
		*/
    @Test
    public void addElementTest() {
        testee.addElement(new Event("newElem"));
        assertTrue(testee.size() >= 1);
    }
		/**
		* Test of remove a specific element from the
		*  set.
		*/
    @Test
    public void removeTest() {
        testee.removeElementAt(2);
    }
		/**
		* Test of contains a specific element.
		*/
    @Test
    public void containsTest() {
        testee.removeElementAt(2);
        assertFalse(testee.containsElement(new Event("newElem")));
    }
		/**
		* Test of contains a specific element.
		*/
    @Test
    public void containsAllTest() {
        testee.addElement(new Event("newElem"));
        assertTrue(testee.containsElement(new Event("newElem")));
    }
		/**
		* Test of adding two events.
		*/
    @Test
    public void addAndSubtractElementTest() {
        testee.addElement(new Event("newElem"));
        testee.addElement(new Event("newElem"));
        assertTrue("Size of EventSet is not correctly updated.", testee.size() == 4);
    }
		/**
		* Test of copying an entire set of events.
		*/
    @Test
    public void copyTest() {
        testee.addElement(new Event("newElem"));
        testee.addElement(new Event("newElem"));
        testee.addElement(new Event("newElem"));
        testee.addElement(new Event("newElem"));
        testee.removeElementAt(2);
        assertEquals(4L, testee.size());
    }
		/**
		* Test of copying multiple events.
		*/
    @Test
    public void copyEventTest() {
        testee.addEvent(new Event("newElem1"));
        testee.addEvent(new Event("newElem2"));
        testee.addEvent(new Event("newElem2"));
        testee.addElement(new Event("newElem1"));
        testee.addElement(new Event("newElem1"));
        testee.addElement(new Event("newElem2"));
        testee.addElement(new Event("newElem2"));
        testee.addElement(new Event("newElem1"));
        testee.addElement(new Event("newElem1"));
        testee.removeElementAt(3);
        assertEquals(4L, testee.size());
    }
	/**
	* Test of getting a specific element from set and not accessing it afterwards.
	*/
    @Test
    public void getTest() {
        testee.removeElementAt(4);
        testee.removeElementAt(4);
        testee.addElementAt(new Event("newElem"));
        assertEquals("Missing event found.", testee.getCurrentElement(), new Event("newElem"));
    }
}