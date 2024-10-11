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
	 * Test constructor of this class.
	 * It contains only one test case for the dequeue method.
	*/
	@Test
	public void test_dequeue() {
		Queue q = new Queue();
		assertNull("Queue is null", q.dequeue());
		//dequeue();
		q.dequeue();
		assertTrue("size = 0", q.numItems==0);
	}
}
