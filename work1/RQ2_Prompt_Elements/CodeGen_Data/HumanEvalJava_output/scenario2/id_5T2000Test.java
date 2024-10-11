// IntersperseTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains one unit test case for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {
@Test
		public void test() {
			List<Object> numbers = new ArrayList<Object>();
			Object one = numbers.get(1);
			
			// Test case 1.
			assertFalse(numbers.contains(ONE));
			
			// Test case 2.
			listToArray(1, numbers);
			assertTrue(listToArray(0, numbers)==numbers);			
			listToArray(1, numbers);
			assertFalse(listToArray(0, numbers)==numbers);
			
			// Test case 3.
			listToArray(1, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			
			// Test case 4.
			listToArray(1, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			
			// Test case 5.
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			
			// Test case 6.
			listToArray(1, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			
			// Test case 7.
			listToArray(1, numbers);
			listToArray(2, numbers);
			listToArray(2, numbers);
			listToArray(3, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(4, numbers);
			listToArray(0, numbers);
			listToArray(1, numbers);
			listToArray(4, numbers);
		}
		
		private static void listToArray(int n, ArrayList<Object> numbers) {
			for (int i = 0; i < n; i++) {
				numbers.add(i, new Object());
			}
		}			
}
