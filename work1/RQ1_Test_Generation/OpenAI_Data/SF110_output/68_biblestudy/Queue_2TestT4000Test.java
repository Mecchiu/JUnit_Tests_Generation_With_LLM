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
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_1() {
		Queue queue = new Queue(10);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_2() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_3() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_4() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_5() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_6() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_7() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_8() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_9() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>true</code>.
	*/
	@Test
	void testMaxCapacityExceeded_10() {
		Queue queue = new Queue(10);
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertTrue(queue.maxCapacityExceeded());
	}
}