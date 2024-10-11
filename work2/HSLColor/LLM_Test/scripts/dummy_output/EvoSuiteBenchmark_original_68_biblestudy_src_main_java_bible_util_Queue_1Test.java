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
		
	  void test() {
	    Queue queue = new Queue(Queue.NO_MAXIMUM);
	    queue.enqueue(new Node(1111));
	    queue.enqueue(new Node(2222));
	    
	    Integer expected = null;
	    Integer obtained = null;
	    
	    // test if Queue max capacity has been exceeded
	    assertEquals(new Integer("1"), queue.maxCapacityExceeded());
	    
	    // test if a Node in the queue is replaced completely
	    queue.enqueue(new Node(2222));
	    obtained = queue.getNumberItems();
	    assertEquals(new Integer("2222"), obtained);
	    assertEquals(new Integer("1"), queue.getPeakNumberItems());
		}
		
	  @Test
		public void test() {
		 test();
		 }
}