// SortEvenTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains one unit test case for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

	/**
	* This test case is to sort even.
	* It initializes empty List<Integer> list. It checks if the List<Integer> 
	* is equal to empty and is empty. 
	*/
	@Test
		public void testCases1() {
		
		assertEquals(false, SortEven.sortEven(Collections.EMPTY_LIST).size());
		assertEquals(false, SortEven.sortEven(Collections.<Integer>emptyList()).size());
		
		assertEquals(false, SortEven.sortEven(new ArrayList()).size());
		assertEquals(true, SortEven.sortEven(new ArrayList<>(Collections.emptyList()))
                   .size() == 0);
		
		List<Integer> testList = new ArrayList<>();
		testList.add(1);
		testList.add(1);
		testList.add(1); // the order matters with the previous tests
		List<Integer> list = SortEven.sortEven(testList);
		assertEquals(false, list.size() == 0);
		assertEquals(true, list.size() == testList.size());
	}
		
	
	/**
	* This test case is to sort even.
	* It tests the result of sorting even in which the entries are unique.
	* It fails with an assertion if anything is unequal.
	*/
	@Test
		public void testCases() {
		
		List<Integer> list = SortEven.sortEven(100);
		int size = list.size();
		assertEquals(100, size); // we expect a sorted list of 100
		assertEquals(true, list.contains(1));
	}
}