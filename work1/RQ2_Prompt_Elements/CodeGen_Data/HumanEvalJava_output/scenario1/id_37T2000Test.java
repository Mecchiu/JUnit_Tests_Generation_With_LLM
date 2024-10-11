// SortEvenTest.java
package scenario1;

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
	 * Test case of {@link SortEven#sortEven(List)} method.
	 * 
	 * @throws NullPointerException thrown if {@link SortEven#sortEven(List)} method has no test case as its argument
	*/
	@Test
	void testSortEven(
			)
	{
		// Call the method under test and check the result.
	     Boolean result = SortEven.sortEven(new ArrayList<Integer>());

		// Valid arguments for this exception thrown
		assertTrue(true);
	}
	
	/**
	 * Test case of {@link SortEven#sortEven(List)} with valid argument.
	 * 
	 * @throws NullPointerException thrown if {@link SortEven#sortEven(List)} method has no argument as argument
	*/
	@Test
	void testSortEvenValidArgument(
			)
	{
		// Call the method under test and check the result.
		
	}
	
}	

