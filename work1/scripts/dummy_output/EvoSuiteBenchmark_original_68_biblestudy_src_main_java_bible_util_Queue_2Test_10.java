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
		
	@Test
	void testMaxCapacityExceeded() {
		System.out.println("\n\n*** Test maxCapacityExceeded() ***\n\n");
		Queue_2 queue = new Queue(1000000);
		queue.refreshElement((new Integer(1000000)));
		if (!queue.maxCapacityExceeded()) {
			fail("Test maxCapacityExceeded failed");
		}
	}
}