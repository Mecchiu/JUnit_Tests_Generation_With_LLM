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
		Queue_2Test() {
		}

    @Test
    void maxCapacityExceeded() {
        // This test is a no-op because queue is inited to maxCapacity of NO_MAXIMUM
        assertTrue(Queue_2Test.maxCapacityExceeded() == false);
    }

	@Test
	void put() {
		// empty queue
		Queue<String> queue = new Queue<String>();
		assertEquals("queue.numItems", 0, queue.getNumberItems());

		// store random items in queue
		int i;             // index value
		Object obj;          // object from random collection collection
		Random generator = new Random();
		i = 0;
		while (i < 100) {
			obj = generator.nextElement();
			queue.add(obj.toString());
			i++;
		}
		// assert queue.numItems == i:
	    assertEquals("queue.numItems", i, queue.getNumberItems());
	}

}