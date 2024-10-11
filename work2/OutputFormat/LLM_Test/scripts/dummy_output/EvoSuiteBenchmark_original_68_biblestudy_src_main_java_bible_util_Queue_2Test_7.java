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
		 * Test for queue max capacity.
		 */
		@Test
        void testMaxCapacityExceeded() {
            Queue queue = new Queue();
            // we expect to get an infinite result
            assertEquals(queue.maxCapacityExceeded(), NO_MAXIMUM);
            // but one result has been gotten which means the queue
            // is full  (and its cap is not)
            assertEquals(queue.maxCapacityExceeded(), NO_MAXIMUM);
            // but one result has been gotten which means the queue is full
            queue.refreshElement(null);
            assertEquals(queue.maxCapacityExceeded(), 0);
            queue.maxCapacityExceeded();
            // and one more element should have been added
            assertEquals(queue.maxCapacityExceeded(), 1);
		}
}