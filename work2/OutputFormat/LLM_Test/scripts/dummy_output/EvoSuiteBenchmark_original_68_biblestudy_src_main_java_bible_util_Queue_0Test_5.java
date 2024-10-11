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
		@Test
	    void dequeue() throws Exception, NoSuchMethodException {

    Queue queue = new Queue();

    // queue.empty();
       	queue.add(new Object());

			// get next element
         assertNotNull(queue.dequeue());

			// get next element
        assertEquals(new Object(), queue.dequeue());

    }
}