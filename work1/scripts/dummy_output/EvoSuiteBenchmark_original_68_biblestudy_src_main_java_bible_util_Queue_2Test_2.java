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
		
  @Test
  public void testMaxCapacityExceeded() {
    Queue queue = new Queue();
    assertEquals("The queue should not have maxCapacityExceeded.",
                 NO_MAXIMUM, queue.maxCapacityExceeded());
  }
  
}