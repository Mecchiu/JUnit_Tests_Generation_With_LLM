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
		public static final String testCase = "TestQueue";
		/**
		 * Test maximum capacity was reached during the test.
		 */
		@Test
		public void testMaxCapacityExceeded() {
			Queue queue = new Queue(5);
			String msg = "Max capacity exceeded, queue " + testCase + ". getObjects() = " + queue.getObjects();
			assertTrue(queue.maxCapacityExceeded());
			msg = "Queue is not empty, queue " + testCase + ". maxCapacity was  0 ";
			assertEquals(0, queue.getNumberItems());
		}
}