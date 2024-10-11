// HasCloseElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains one unit test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	/**
	 * Test for the {@link HasCloseElements#hasCloseElements(List, Double)} method whose parameters are list of numbers, whose elements are less than
	 * {@code threshold}.
	 */
	@Test
    public void testCase1 () {
		assertEquals(true, HasCloseElements.hasCloseElements("10", 0.2));
		assertEquals(true, HasCloseElements.hasCloseElements("1", 0.2));
		assertEquals(true, HasCloseElements.hasCloseElements("-1", 0.2));
		assertEquals(false, HasCloseElements.hasCloseElements("1", 0.5));
		assertEquals(false, HasCloseElements.hasCloseElements("-1", 0.1));
		assertEquals(false, HasCloseElements.hasCloseElements("1", 0.0));
		assertEquals(false, HasCloseElements.hasCloseElements("-1", 1.0));
		assertEquals(false, HasCloseElements.hasCloseElements("1", 1.0));
	}

	/**
 	 * Test for the {@link HasCloseElements#hasCloseElements(List, Double)} method
 	 * whose parameters are list of numbers and the elements are lesser than given threshold.
 	 */
	@Test
    public void testCase2 () {
		List<Double> numbers = ListTest.get10List();
		Double threshold = 0.0;
		assertEquals(true, HasCloseElements.hasCloseElements(numbers, threshold));
		threshold = 1.0;
		assertEquals(true, HasCloseElements.hasCloseElements(numbers, threshold));
		threshold = 1.1;
		threshold = 0.99;
		threshold = 0.9;
		assertEquals(false, HasCloseElements.hasCloseElements(numbers, threshold));
		threshold = 1.0;
		threshold = 1.1;
		threshold = 1.9;
		threshold = 2.0;
		assertEquals(false, HasCloseElements.hasCloseElements(numbers, threshold));
		threshold = 1.0;
		assertEquals(false, HasCloseElements.hasCloseElements(numbers, threshold));
	}

	/**
	 * Test for the {@link HasCloseElements#hasCloseElements(List, Double)} method whose parameters are list of numbers
	 * having the same minimum number of elements as the list to be compared and the elements are lesser than
	 * {@code threshold}.
	 */
	@Test
    public void testCase3 () {
		List<Double> numbers = ListTest.get10List();

			List<Double> list1 = ListTest.newList(2);
			List<Double> list2 = ListTest.newList(1);

			list1.add(5.0);
			list2.add(1.0);

			assertEquals(true, HasCloseElements.hasCloseElements(list1, 0.0));
			assertEquals(true, HasCloseElements.hasCloseElements(list2, 0.0));
			assertEquals(false, HasCloseElements.hasCloseElements(list1, 0.0));
			assertEquals(false, HasCloseElements.hasCloseElements(list2, 0.0));

			for (Double number: numbers) {
				assertTrue(0.0 <= number);
				assertTrue(number <= 1.0);
			}
			assertEquals(false, HasCloseElements.hasCloseElements(list1, 0.1));
			assertEquals(false, HasCloseElements.hasCloseElements(list2, 0.1));

			assertEquals(true, HasCloseElements.hasCloseElements(list1, 1.1));
			assertEquals(true, HasCloseElements.hasCloseElements(list2, 1.0));
			assertEquals(false, HasCloseElements.hasCloseElements(list1, 0.1));
			assertEquals(false, HasCloseElements.hasCloseElements(list2, 0.1));
    }

} // HasCloseElementsTest

