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
		
	/*
	 * private variables
	 */
	private static final int NUM_ITEMS = 3;
	private static final int MAX_CAPACITY = 8;

	private static final String TAG = "Queue_2Test";

	/*
	 * public test cases
	 */
	@Test
	public void testMaxCapacityExceeded() throws Exception {
		Queue queue = new Queue(MAX_CAPACITY);
		queue.refreshElement(new Long(3L));
		System.out.println("maxCapacityExceeded");
		assertTrue(queue.maxCapacityExceeded());
	}

	@Test
	public void testEmpty() throws Exception {
	}

	@Test
	public void testAddAndGet() throws Exception {}
}