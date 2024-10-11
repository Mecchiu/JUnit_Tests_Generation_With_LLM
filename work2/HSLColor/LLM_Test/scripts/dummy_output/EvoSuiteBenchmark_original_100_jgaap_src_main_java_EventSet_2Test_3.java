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
		 * Initializes the test case
		 */
		public EventSet_2Test() {
		}

         /**
         * Sets of methods implemented by this test class
         */
        @Test
		public void testSize() {
            assertEquals(size(), EventSet.size());
         };

          /**
          * Adds an event to the event queue*
          */
		@Test
		public void testAddEvent() {
            assertEquals(evtAdded(), 0);
        };

   }