// NextSmallestTest.java
package scenario3;

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
			* It verifies that the method returns the 2nd smallest element of the list.
			*/
			@Test
			void testNextSmallest() {
							// Test case 1
							List<Object> lst1 = List.of(1, 2, 3, 4, 5);
							Integer expected1 = 2;
							Integer actual1 = NextSmallest.nextSmallest(lst1);
							assertEquals(expected1, actual1);
							
							// Test case 2
							List<Object> lst2 = List.of(5, 1, 4, 3, 2);
							Integer expected2 = 2;
							Integer actual2 = NextSmallest.nextSmallest(lst2);
							assertEquals(expected2, actual2);
							
							// Test case 3
							List<Object> lst3 = List.of();
							Integer expected3 = null;
							Integer actual3 = NextSmallest.nextSmallest(lst3);
							assertEquals(expected3, actual3);
							
							// Test case 4
							List<Object> lst4 = List.of(1, 1);
							Integer expected4 = null;
							Integer actual4 = NextSmallest.nextSmallest(lst4);
							assertEquals(expected4, actual4);
							
							// Test case 5
							List<Object> lst5 = List.of(1, 1, 1, 1, 0);
							Integer expected5 = 1;
							Integer actual5 = NextSmallest.nextSmallest(lst5);
							assertEquals(expected5, actual5);
							
							// Test case 6
							List<Object> lst6 = List.of(1, 1);
							Integer expected6 = null;
							Integer actual6 = NextSmallest.nextSmallest(lst6);
							assertEquals(expected6, actual6);
							
							// Test case 7
							List<Object> lst7 = List.of(-35, 34, 12, -45);
							Integer expected7 = -35;
							Integer actual7 = NextSmallest.nextSmallest(lst7);
							assertEquals(expected7, actual7);
							
							// Test case 8
							List<Object> lst8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
							Integer expected8 = 2;
							Integer actual8 = NextSmallest.nextSmallest(lst8);
							assertEquals(expected8, actual8);
							
							// Test case 9
							List<Object> lst9 = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
							Integer expected9 = 2;
							Integer actual9 = NextSmallest.nextSmallest(lst9);
							assertEquals(expected9, actual9);
							
							// Test case 10
							List<Object> lst10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0);
							Integer expected10 = 1;
							Integer actual10 = NextSmallest.nextSmallest(lst10);
							assertEquals(expected10, actual10);
			}
}