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
		* Test method of {@link Queue#dequeue()}
		*/
		@Test
		void testDequeue(){
			Queue instance = new Queue();
			Object o = instance.dequeue();
			assertTrue(!o.equals(instance.dequeue()));
		}
}

/**
* Test class of {@link Queue} class.
* It contains 1 unit test case for the {@link Queue#size()} method.
*/
class Queue_1Test {

    /**
	 * Test method of size
	 */
	@Test
	void testSize(){
		Queue q = new Queue();
		q.add(1, new Node(1));
		Object o = q.size();
		System.out.println("size "+ o);
		Object o1 = new Node(2);
		Node[] l = q.toArray(o1);
		for (int i = 0; i < l.length; i++) {
			assertEquals("wrong o", o1, l[i]);

		}

	}
}