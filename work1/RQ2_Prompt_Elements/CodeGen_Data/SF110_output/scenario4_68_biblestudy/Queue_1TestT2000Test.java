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
     * Test method for <code>maxCapacityExceeded()</code>
     */
    @Test
    public void test1() {
        Queue queue = new Queue(300);
        int i = (int)(Math.random()*6);
        queue.enqueue(String.valueOf(i));
        /*
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));

               queue.enqueue(String.valueOf(i));
               queue.enqueue(String.valueOf(i));
        */
        assertEquals("Queue is Exceeded", true, queue.maxCapacityExceeded());
    }

}// class Queue_1Test
