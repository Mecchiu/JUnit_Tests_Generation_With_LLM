// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {
		/**
		 *
		 * @throws Exception exception has been ase caught.
		 */
	@Test
	public void testMaxCapacityExceeded() throws Exception {
		Queue q = new Queue();
		q.maxCapacityExceeded();
	}
}