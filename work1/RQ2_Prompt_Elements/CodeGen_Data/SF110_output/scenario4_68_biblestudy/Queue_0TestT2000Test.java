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
    public void dequeue() {
        Queue queue = new Queue();
        System.out.println("After the Queue");
        queue.dequeue();
        System.out.println("Dequeued from the Queue");
    }


    @Test
    public void maxCapacityExceeded() {
        Queue queue = new Queue(1024);
        System.out.println("Max Capacity Exceeded");
        queue.maxCapacityExceeded();
        System.out.println("Max capacity Exceeded called");
    }
}
// Queue_1Test.java