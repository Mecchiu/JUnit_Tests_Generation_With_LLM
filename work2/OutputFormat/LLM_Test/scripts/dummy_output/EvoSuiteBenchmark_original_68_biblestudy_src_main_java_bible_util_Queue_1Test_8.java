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
		 * Method to test the {@link Queue#maxCapacityExceeded()} method.
		 */
		@Test
        public void maxCapacityExceeded() {
// This method tests the function of maxCapacityExceeded.
// 1) Inserting 3 different objects in the queue
// 2) The first 2 nodes of the queue.
// 3) The next element of queue.
// 4) Removing the last node from our head.
            Queue queue = new Queue();
            queue.enqueue(new Object());
            queue.enqueue(new Object());
            queue.enqueue(new Object());
            queue.enqueue(new Object());
            int numItemsInQueue = 0;
            
            
            
            
            assertFalse(queue.isEmpty());
            assertEquals(queue.getNumberItems(), 3);
            
            // 1) Insert element 5 in queue
            queue.enqueue(new Double(5.0));
            assertEquals(queue.getNumberItems(), 4);

            /**
             * If max capacity was exeeded it is returning false.
             * 2) A third time the function of maxCapacityExceeded is executed.
             * 3) The head of the queue is checked.
             */
            assertFalse(queue.maxCapacityExceeded());
            assertEquals(numItemsInQueue, 2);
            
            // 2) Check that the second time it is executed the size increases by 2.
            numItemsInQueue = 0;
            assertEquals(queue.getNumberItems(), 3);
            queue = new Queue();
            queue.enqueue(new Object());
            queue.enqueue(new Object());
            queue.enqueue(new Object());
            assertEquals(queue.getNumberItems(), 4);

            queue = new Queue();
            queue.enqueue(new Double(5.0));
            assertEquals(queue.getNumberItems(), 6);

            // 2) Check that there is a third time the function of maxCapacityExceeded is executed
            // 3) The head of the queue is checked because the second time it is  executed
            // the size increases by 6.
            assertFalse(queue.maxCapacityExceeded());
            assertEquals(numItemsInQueue, 3);
            
            // Add the last node to the head and check the size increases by 5.
            queue.enqueue(new Number(6.0));
            assertEquals(queue.getNumberItems(), 7);
            
            
//            Queue q = new Queue();
//            q.enqueue(new Double(5.0));
//            int sizeInQueue = 1;
//            System.out.println(q);
//            sizeInQueue = 0;
//            q.enqueue(new Number(6.0));
//            sizeInQueue = 6;
//            System.out.println(q);
	
			
// This test is used to ensure the function getNumberItems() is properly working.
//      Queue q = new Queue();
            queue = new Queue();
            int numItemsInQueue = 0;
            List list = new ArrayList();

        
		}
		
}


// DataBase_1Test.java