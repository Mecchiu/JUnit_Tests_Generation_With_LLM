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
		* Test method for {@link Queue#maxCapacityExceeded()}
		*/
	@Test
    public void test1(){
		System.out.println("test1");
		Queue c = new Queue(10);
		c.maxCapacityExceeded();
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        c.addAll(l);
		assertTrue("test1 - maxCapacityExceeded returned true", c.isEmpty());
    }
}