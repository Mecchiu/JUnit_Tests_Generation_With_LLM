// HasCloseElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0);
		Double threshold = 0.5;
		Boolean expected = false;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.3;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.3;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
		Double threshold = 0.05;
		Boolean expected = false;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_5() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.95;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_6() {
		List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
		Double threshold = 0.8;
		Boolean expected = false;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.1;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_8() {
		List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		Double threshold = 1.0;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_9() {
		List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
		Double threshold = 0.5;
		Boolean expected = false;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
	
	@Test
	void testHasCloseElements_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
		Double threshold = 0.1;
		Boolean expected = true;
		Boolean actual = HasCloseElements.hasCloseElements(numbers, threshold);
		assertEquals(expected, actual);
	}
}