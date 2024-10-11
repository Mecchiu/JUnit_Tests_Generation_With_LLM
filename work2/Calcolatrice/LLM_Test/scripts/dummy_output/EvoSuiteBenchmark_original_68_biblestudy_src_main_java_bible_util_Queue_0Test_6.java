// Queue_0Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#dequeue()} method.
*/
class Queue_0Test {
		/**
	     * Test method
	     * @version
	     * @author    LaMoine Zielieke
	     * @see      Queue
	     */
	@Test
	public void testRemove() {
		Queue queue = new Queue(0);
		queue.enqueue(1);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(2);
		//
		// Remove first
		assertTrue(queue.remove(2));
		//
		// Now queue is empty
		assertTrue(queue.isEmpty());
	 }
}