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
* Constructor of {@link Queue} created by unit test.
*/
public Queue_0Test() {
}	

	/**
	 * This method tests the method {@link Queue#decrementCapacity()} used
     * to decrease the max capacity.
	*/
	@Test
	public void testDecrementCapacity(){
		Queue queue = new Queue();
		assertEquals(0, queue.decrementCapacity());
		assertTrue(queue.isEmpty());

		queue.enqueue(new Number(4));
		assertEquals(1, queue.decrementCapacity());
		assertTrue(queue.isEmpty());
		assertEquals(2, queue.decrementCapacity());
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testResetDequeue() {
		Queue queue = new Queue();
		assertEquals(0, queue.decrementCapacity());
		assertTrue(queue.isEmpty());
		queue.enqueue(new Number(4));
		queue.enqueue(new Number(4));
		assertEquals(3, queue.decrementCapacity());

		assertEquals(4, queue.decrementCapacity());
		assertTrue(queue.isEmpty());
		assertEquals(5, queue.decrementCapacity());
		assertFalse(queue.isEmpty());
	}
}