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
		/**
		 * No unit tests on this class.
		 */
    @Test
    public void maxCapacityExceeded() {
        assertEquals(NO_MAXIMUM, Queue.maxCapacityExceeded());
    }
}
// Queue_2Test.java