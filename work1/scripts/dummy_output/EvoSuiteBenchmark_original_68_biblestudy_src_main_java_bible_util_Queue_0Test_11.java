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
         * Create a new instance of this class
         */
		Queue_0Dummy(){
			this.maxCapacity = 5;
			this.numItems = 0;
			this.maxNumItems = NO_MAXIMUM;
		}
}


// Queue_0Test_2.java
package bible.util;



/**
 * Suite of {@link Object} Test cases for Queue.
 *
 * @version 1.0
 * @authorLaMoine Zielieke
 */
class Object_Test
{
	/**
	 * Iterate through all test cases
	 * and test the methods of {@link Queue }.
	 */
	@Test public void test() throws CloneNotSupportedException {
		Object[][] objects = new Object[][] {
				// 1. test remove()
				new Object[] { new Node(true), "one" },
				new Object[] { new Node(false), "two" },
				new Object[] { new Node(true), "three" },
				new Object[] { new Node(false), "four" },
				new Object[] { null, null },
				new Object[] { new Node(false), null },
				new Object[] { new Node(true), null },
				new Object[] { new Node(false), null },
				// 2. test remove(Object)
				// This removes only the <b>Object</b> with value "three".
				new Object[] { "three", new Node(false) },
				new Object[] { "four", new Node(true) },
				new Object[] { new Node(false), "three" },
				new Object[] { new Node(true), "two" },
				new Object[] { new Node(false), "four" },
				new Object[] { null, null },
				new Object[] { new Node(false), null },
				new Object[] { new Node(true), null },
			};

		Queue queue = new Queue((int) objects[0][2].length());
        for (Object nextNext: objects) {
			queue.remove(((Node)nextNext).value);
        }

		boolean result = true;
		for (Object nextNext: objects)
			result = result && (queue.remove(((Node)nextNext).value));

		assertTrue( result );
	}
}

class Queue_0Dummy implements Queue