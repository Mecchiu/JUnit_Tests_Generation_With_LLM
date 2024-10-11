// SortNumbersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

	@Test
	void testSortNumbers() {
		assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
		assertEquals("", SortNumbers.sortNumbers(""));
		assertEquals("three", SortNumbers.sortNumbers("three"));
		assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
		assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
		assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
	}
}