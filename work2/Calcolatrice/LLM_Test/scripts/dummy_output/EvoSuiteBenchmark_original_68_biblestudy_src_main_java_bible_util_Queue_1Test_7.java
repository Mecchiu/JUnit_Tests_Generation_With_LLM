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
		static final int MAX_ITEMS = 20;

    /**
     * Tests the maxCapacityExceeded() function.
     */
    @Test
    void maxCapacityExceeded() {
		Node[] nArray = new Node[MAX_ITEMS];
		Queue queue = new Queue();
		Queue copy = new Queue(queue);
		
		Object ob[] = new Object[MAX_ITEMS];
		copy = new Queue(new Integer(MAX_ITEMS));
		ArrayAssert(copy.getSize() > MAX_ITEMS, "Invalid return value (should be MAX_ITEMS)");
		for (int i = 0; i < MAX_ITEMS; i++) {
			nArray[i] = new Node(ob[i]);
		}

		int next = MAX_ITEMS;
		boolean res = queue.maxCapacityExceeded();

		for (int i = MAX_ITEMS-1; i>=0; i--) { // we should use the iterator
			if (nArray[i].next != null) {
				// the Node can be in a linked queue
				assertEquals(nArray[i].next.value, nArray[next].value);
				next--;
			}
			else {
				// the Node can be a real queue
				assertTrue(nArray[i].next == null);
				nArray[i] = nArray[next];
				next++;
			}
		}

		// we are not done! if more items is expected...
		assertTrue(res);
		assertArrayEquals(ob, (Object[]) (nArray).clone());
	}
}