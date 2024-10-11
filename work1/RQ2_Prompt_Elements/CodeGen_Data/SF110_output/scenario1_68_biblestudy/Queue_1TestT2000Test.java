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
// Queue.java
package bible.util;

import java.util.*;

/**
 * Queue is a storage class to link together <b>Node</b> objects which are
 * stored in a first in first out storage system.
 *
 * @see Node
 * @version 1.0
 * @author LaMoine Zielieke, James Stauffer
 */
public class Queue {

    public boolean maxCapacityExceeded() {
        return (numItems > (maxCapacity - 1)) && (maxCapacity!= NO_MAXIMUM);
    }
}

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
		
    static Queue queue;
    @Test
    public void test()  {											
        final int[] a = {1};
        queue = new Queue(a);
        assertEquals(NO_MAXIMUM, queue.maxCapacityExceeded());
        queue.put(1);											
        int c = queue.get();		
        queue.remove();
        assertEquals(NO_MAXIMUM, queue.maxCapacityExceeded());
        queue.put(1);				
        queue.add(1);
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();
        assertEquals(1, queue.get());
        queue.remove();	      
        queue.remove();
        assertEquals(NO_MAXIMUM, queue.maxCapacityExceeded());
        queue.enQueue(2, NO_REQUIRED_LEVEL);
        queue.enQueue(2, REQUIRED_LEVEL);
        queue.add(2);
        queue.enQueue(3, NO_REQUIRED_LEVEL);	  
    }
        
}