// RemoveDuplicatesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains one unit test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {
/**
		* Test method for {@link RemoveDuplicates#removeDuplicates(List)}.
		*/
		@Test
		@org.junit.jupiter.api.Test
		public void testRemoveDuplicates() {
			List<Integer> numbers = new ArrayList<Integer>();
			
			// We remove the first and only element in the list.
			numbers.add(1);
			List<Integer> expectedList = new ArrayList<Integer>();
			expectedList.add(1);
			

			// Removing twice should not change the element at position 1
			int index = 0;
			List<Integer> actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
			index++;
			
			// We should get an equivalent list
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
			
			// We remove the only element, and get nothing back in the list
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
			
			// We try to remove the first and only element, but we get exception when try to add
			try {
				RemoveDuplicates.removeDuplicates(numbers);
				fail("Exception can not be thrown as expected: " + "RemoveDuplicates.removeDuplicates(numbers)");
			} catch (Exception e) {}
			
			
			// We should get an identical list
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
			
			// We remove the last element and get an exception
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
			
			
	        // We remove first and only element
			numbers = new ArrayList<Integer>();
			numbers.add(1);
			
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
	        
			
			// We try to remove the first and only element, and get nothing back in the list
			actualList = RemoveDuplicates.removeDuplicates(numbers);
			assertEquals(expectedList, actualList);
		}
}