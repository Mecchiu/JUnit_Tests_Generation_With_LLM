// LargestSmallestIntegersTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains one unit test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	/**
	* Test case for method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
	* to be invoked with the default null list.
	*/
	@Test
	public final void testLargestSmallestIntegers_defaultNullList() {
		final List<Object> result = new ArrayList<Object>();
		assertEquals(result, LargestSmallestIntegers.largestSmallestIntegers(null));
	}

	/**
	* Test case for method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
	* using the list parameter as argument.
	*/
	@Test
	public final void testLargestSmallestIntegers_list1() {
		final List<Object> result = new ArrayList<Object>();
		for (int i = 0; i < 10; i++) {
			result.add(new Integer(i));
		}
		assertArrayEquals(new Integer[]{new Integer(9), new Integer(10)}, LargestSmallestIntegers.largestSmallestIntegers(result));
	}

	/**
	* Test case for method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
	* using a list parameter that is not a List.
	*/
	@Test
	public final void testLargestSmallestIntegers_list5() {
		final List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			result.add(new Integer(i));
		}
		assertArrayEquals(new Integer[]{new Integer(10)}, LargestSmallestIntegers.largestSmallestIntegers(result));
	}

	/**
	* Test case for method {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
	* using a list parameter that contains a null value.
	*/
	@Test
	public final void testLargestSmallestIntegers_listNull() {
		final List<Integer> nullList = null;
		final List<Integer> list = LargestSmallestIntegers.largestSmallestIntegers(nullList);
		assertNotNull(list);
		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i) == null)) {
				fail("LargestSmallestIntegers must return a List with null elements, was " + list.get(i));
			}
		}
		assertEquals(nullList, list);
	}

}
