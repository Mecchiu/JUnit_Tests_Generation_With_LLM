// QueueTest.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#maxCapacityExceeded()} method.
*/
class QueueTest {

	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityExceeded() {
		Queue queue = new Queue();
		queue.numItems = 10;
		queue.maxCapacity = 5;
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded() {
		Queue queue = new Queue();
		queue.numItems = 5;
		queue.maxCapacity = 10;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded2() {
		Queue queue = new Queue();
		queue.numItems = 5;
		queue.maxCapacity = 5;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded3() {
		Queue queue = new Queue();
		queue.numItems = 0;
		queue.maxCapacity = 5;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded4() {
		Queue queue = new Queue();
		queue.numItems = 5;
		queue.maxCapacity = 0;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded5() {
		Queue queue = new Queue();
		queue.numItems = 0;
		queue.maxCapacity = 0;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded6() {
		Queue queue = new Queue();
		queue.numItems = -5;
		queue.maxCapacity = 5;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded7() {
		Queue queue = new Queue();
		queue.numItems = 5;
		queue.maxCapacity = -5;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded8() {
		Queue queue = new Queue();
		queue.numItems = -5;
		queue.maxCapacity = -5;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded9() {
		Queue queue = new Queue();
		queue.numItems = -5;
		queue.maxCapacity = 0;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_whenMaxCapacityNotExceeded10() {
		Queue queue = new Queue();
		queue.numItems = 0;
		queue.maxCapacity = -5;
		assertFalse(queue.maxCapacityExceeded());
	}
}