// RemoveDuplicatesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains one unit test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {
List<Object> numbers;

        /**
     * Get the {@link RemoveDuplicatesTest#numbers} field or return null if the
     * field does not exist.
     */
        public List<Object> getNumbers() {
                return numbers;
        }
		
		@Test
		public void testRemoveDuplicates() {
			assertNotNull(numbers);
			
			int n = numbers.size();
			for (int i = 0; i < n; i++) {
				// Make sure that we iterate over every element
				assertEquals(values[i], numbers.get(i));
				objects[i].add(numbers.get(i));
				if (objects[i].size() == 1) {
					assertEquals(numbers.get(i), objects[i].get(0));
				}
			}
		}
	private Object[] values;
		private Object[] objects;
		private Object first;
		private Object second;
}
