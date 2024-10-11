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
	void testMaxCapacityExceeded_MaxCapacityExceeded() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = 11;
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = 9;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded2() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = 10;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded3() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = 0;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded4() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -1;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded5() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -10;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded6() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -11;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded7() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -100;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded8() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -1000;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded9() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -10000;
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()} method.
	* It tests the case when the maximum capacity is not exceeded.
	*/
	@Test
	void testMaxCapacityExceeded_MaxCapacityNotExceeded10() {
		Queue queue = new Queue();
		queue.maxCapacity = 10;
		queue.numItems = -100000;
		assertFalse(queue.maxCapacityExceeded());
	}
}