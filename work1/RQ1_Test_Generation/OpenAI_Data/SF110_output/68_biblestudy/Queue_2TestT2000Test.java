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
		Queue queue = new Queue(Queue.NO_MAXIMUM);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_2() {
		Queue queue = new Queue(0);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_3() {
		Queue queue = new Queue(1);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_4() {
		Queue queue = new Queue(2);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_5() {
		Queue queue = new Queue(3);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_6() {
		Queue queue = new Queue(4);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_7() {
		Queue queue = new Queue(5);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_8() {
		Queue queue = new Queue(6);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_9() {
		Queue queue = new Queue(7);
		assertFalse(queue.maxCapacityExceeded());
	}
	
	/**
	* Test case for {@link Queue#maxCapacityExceeded()}.
	* The test case is successful if the method returns <code>false</code>.
	*/
	@Test
	void testMaxCapacityExceeded_10() {
		Queue queue = new Queue(8);
		assertFalse(queue.maxCapacityExceeded());
	}
}