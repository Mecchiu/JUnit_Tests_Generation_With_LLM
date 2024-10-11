// NextSmallestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
			/**
			* Test case for the {@link NextSmallest#nextSmallest(List)} method.
			* It tests the method with a list of integers.
			*/
			@Test
			void testNextSmallest() {
				// Test case 1: nextSmallest([1, 2, 3, 4, 5]) == 2
				List<Object> lst1 = List.of(1, 2, 3, 4, 5);
				assertEquals(2, NextSmallest.nextSmallest(lst1));
				
				// Test case 2: nextSmallest([5, 1, 4, 3, 2]) == 2
				List<Object> lst2 = List.of(5, 1, 4, 3, 2);
				assertEquals(2, NextSmallest.nextSmallest(lst2));
				
				// Test case 3: nextSmallest([]) == None
				List<Object> lst3 = List.of();
				assertNull(NextSmallest.nextSmallest(lst3));
				
				// Test case 4: nextSmallest([1, 1]) == None
				List<Object> lst4 = List.of(1, 1);
				assertNull(NextSmallest.nextSmallest(lst4));
				
				// Test case 5: nextSmallest([1, 1, 1, 1, 0]) == 1
				List<Object> lst5 = List.of(1, 1, 1, 1, 0);
				assertEquals(1, NextSmallest.nextSmallest(lst5));
				
				// Test case 6: nextSmallest([1, 1]) == None
				List<Object> lst6 = List.of(1, 1);
				assertNull(NextSmallest.nextSmallest(lst6));
				
				// Test case 7: nextSmallest([-35, 34, 12, -45]) == -35
				List<Object> lst7 = List.of(-35, 34, 12, -45);
				assertEquals(-35, NextSmallest.nextSmallest(lst7));
				
				// Test case 8: nextSmallest([1, 2, 3, 4, 5]) == 2
				List<Object> lst8 = List.of(1, 2, 3, 4, 5);
				assertEquals(2, NextSmallest.nextSmallest(lst8));
				
				// Test case 9: nextSmallest([5, 1, 4, 3, 2]) == 2
				List<Object> lst9 = List.of(5, 1, 4, 3, 2);
				assertEquals(2, NextSmallest.nextSmallest(lst9));
				
				// Test case 10: nextSmallest([]) == None
				List<Object> lst10 = List.of();
				assertNull(NextSmallest.nextSmallest(lst10));
			}
}