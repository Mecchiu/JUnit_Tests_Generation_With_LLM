// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {

	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 10 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_1() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 11 elements.
	* The method should return true.
	*/
	@Test
	void testMaxCapacityExceeded_2() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 11; i++) {
			queue.enqueue(i);
		}
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 9 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_3() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 9; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 10 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_4() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 11 elements.
	* The method should return true.
	*/
	@Test
	void testMaxCapacityExceeded_5() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 11; i++) {
			queue.enqueue(i);
		}
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 9 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_6() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 9; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 10 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_7() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 11 elements.
	* The method should return true.
	*/
	@Test
	void testMaxCapacityExceeded_8() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 11; i++) {
			queue.enqueue(i);
		}
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 9 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_9() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 9; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 10 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_10() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
}

// Queue_2Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_2Test {
		
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 10 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_1() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 11 elements.
	* The method should return true.
	*/
	@Test
	void testMaxCapacityExceeded_2() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 11; i++) {
			queue.enqueue(i);
		}
		assertTrue(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case tests the method with a queue with a maximum capacity of 10.
	* The queue is filled with 9 elements.
	* The method should return false.
	*/
	@Test
	void testMaxCapacityExceeded_3() {
		Queue queue = new Queue(10);
		for (int i = 0; i < 9; i++) {
			queue.enqueue(i);
		}