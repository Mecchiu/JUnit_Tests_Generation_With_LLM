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
		
	private final static String TEST_FILE_QUEUE = "C:/Users/LaMoine/Desktop/Bible/unittestdata/Queue.java";
	private final static String TEST_FILE_QUEUE_2 = "C:/Users/LaMoine/Desktop/Bible/unittestdata/Queue_2.java";
	
	@Test
	void maxCapacityExceeded_NoChange(){
		assertEquals(true, Queue_.maxCapacityExceeded());
	}
	
	@Test
	void maxCapacityExceeded_Replace(){
		Queue_.maxCapacityExceeded();
		Queue_.maxCapacityExceeded();
	}
	
	@Test
	void maxCapacityExceeded_WithChange(){
		try {
			Queue_.maxCapacityExceeded();
		} catch (Exception ex) {}
	}
	
	@Test
	void maxCapacityExceededNoChange(){
		Queue_.maxCapacityExceeded();
}
}