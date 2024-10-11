// Queue_2Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_2Test {
		/**
		  *  Test method for {@link Queue#maxCapacityExceeded()}.
		  *  Tests if the queue is set up properly.
		  */
		@Test
		public void testMaxCapacityExceeded() {
			// Set up Queue
            Queue queue = new Queue(2000);
            Node l;
            Node h;
			// insert a value to the queue and the following tests the expected outcome
            // The node inserted value is always the last one in the queue, but if the
            //  queue is not set up properly then its value is the first value and
            //  we should not get a null node in some situation,
            assertTrue("The queue was not set up properly.", queue.isEmpty());
            queue.add(10);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.add(5);
}
}