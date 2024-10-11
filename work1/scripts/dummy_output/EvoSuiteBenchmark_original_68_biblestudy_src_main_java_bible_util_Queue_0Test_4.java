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
		* see que test1
		*/
		@Test
		public final void test1() {
			Queue queue = new Queue();
			queue.putObject(new MyObject(1));
			queue.putObject(new MyObject(2));
			queue.putObject(new MyObject(3));
			Object[] objects = queue.getObjects();
			int number = 0;
			for (Object object: objects) {
				assertNotNull("Null value should not happen.", object);
				number++;
				if (number == 4) {
					assertEquals(Number.class, object.getClass());
				}
			}
		}
	
		public Queue getQueue();
}

/**
* Unit test for {@link #getQueue()} method.
*/
class Queue_1Test {
		/**
		* see que test1
		*/
		@Test
		public final void test1() {
			Queue queue = new Queue();
			queue.putObject(new MyObject(1));
			queue.putObject(new MyObject(2));
			queue.putObject(new MyObject(3));
			Object[] objects = queue.getObjects();
			int number = 0;
			for (Object object: objects) {
				assertNotNull("Null value should not happen.", object);
				number++;
				if (number == 4) {
					assertEquals(Number.class, object.getClass());
				}
			}
		}

		public Queue getQueue();
}