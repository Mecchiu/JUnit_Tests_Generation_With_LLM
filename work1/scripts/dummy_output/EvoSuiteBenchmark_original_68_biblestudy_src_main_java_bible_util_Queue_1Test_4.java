// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {
		/**
		 * Test method <b>int</b>(String s).
		 */
		@Test
		public void testMaxCapacityExceeded() {
			Queue<String> queue = new Queue<String>(5);
			queue.add(new String("3"));
			queue.add(new String("2"));
			queue.add(new String("1"));
			//checkMaxCapacityExceeded(); // Not implemented.
		}


		/**
		 * Checks whether the given integer is the max capacity.
		 * @see Queue#maxCapacityExceeded(int)
		 * @see #testMaxCapacityExceeded
		 */
		@Test
		public void testMaxCapacity() {
			Queue<String> queue = new Queue<String>(5);
			queue.add(new String("3"));
			queue.add(new String("2"));
			queue.add(new String("1"));

			int maxCapacity = queue.maxCapacity();
			assertEquals("The queue is not configured with the max capacity",
					new Integer(5), new Integer(maxCapacity));

		}

}