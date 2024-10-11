// LargestSmallestIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains one unit test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	/** Tests {@link LargestSmallestIntegers#largestSmallestIntegers(List)}. */
	@Test
	void testLargestSmallestIntegers_list_of_integers() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		
		//LargestSmallestIntegers.largestSmallestIntegers(lst);
		
		assertEquals("[1]", LargestSmallestIntegers.largestSmallestIntegers(lst).toString());
		assertEquals("[3]", LargestSmallestIntegers.largestSmallestIntegers(lst, 2).toString());
		assertEquals("[5]", LargestSmallestIntegers.largestSmallestIntegers(lst, 3).toString());
		assertEquals("[7]", LargestSmallestIntegers.largestSmallestIntegers(lst, 4).toString());
		
		lst.clear();
		//LargestSmallestIntegers.largestSmallestIntegers(lst, -1, Integer.MAX_VALUE);
	}
	
	/**
     * Tests the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method with a list with no negatives.
     */
	@Test
	void testLargestSmallestIntegers_no_negatives() {
		List<Object> lst = new ArrayList<Object>();
		List<Integer> numbers = new ArrayList<Integer>();
		
		assertNotEquals("[1]", LargestSmallestIntegers.largestSmallestIntegers(lst).toString());

		assertEquals("[]", LargestSmallestIntegers.largestSmallestIntegers(lst, 0).toString());
		assertEquals("[null]", LargestSmallestIntegers.largestSmallestIntegers(lst, 1).toString());
		
		assertEquals("[1 1]", LargestSmallestIntegers.largestSmallestIntegers(lst, 2).toString());
		assertArrayEquals("[1 0]", LargestSmallestIntegers.largestSmallestIntegers(lst, 3).toString());
		
		assertEquals("[1]", LargestSmallestIntegers.largestSmallestIntegers(lst, 4).toString());
		assertTrue(LargestSmallestIntegers.largestSmallestIntegers(lst, 5).isEmpty());
		assertTrue(LargestSmallestIntegers.largestSmallestIntegers(lst, 6).isEmpty());
		
		assertTrue(LargestSmallestIntegers.largestSmallestIntegers(lst, Integer.MAX_VALUE).isEmpty());

		lst.clear();
		LargestSmallestIntegers.largestSmallestIntegers(lst, -1, Integer.MAX_VALUE);
		assertEquals("[]", LargestSmallestIntegers.largestSmallestIntegers(lst, 0).toString());
	}

}
