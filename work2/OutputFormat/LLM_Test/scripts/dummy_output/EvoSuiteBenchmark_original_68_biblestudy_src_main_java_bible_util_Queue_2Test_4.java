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
		* Create an instance of {@link Queue}
		*/
		public Queue_2Test() {
    }

    /**
     * Run unit test case for {@link Queue#maxCapacityExceeded()} method.
     */
    @Test
    public void maxCapacity_setTest() {
        Queue q = new Queue();
        q.maxCapacityExceeded();
        assertTrue("returned null value should not be null", q.maxCapacityExceeded()!= null);
    }

    /**
     * Run unit test case for {@link Queue#maxCapacityExceeded()} method.
     */
    @Test
    public void maxCapacity_addObject_returnedObject() {
        Queue q = new Queue();
        Assert.assertTrue("first node was not added correctly", q.maxCapacityExceeded().equals(q.getObjects()));
    }

}