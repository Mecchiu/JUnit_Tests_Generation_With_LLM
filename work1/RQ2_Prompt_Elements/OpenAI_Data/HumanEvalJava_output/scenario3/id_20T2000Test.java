// FindClosestElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {
	@Test
			void testFindClosestElements() {
				List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
				List<Double> expected = List.of(3.9, 4.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements2() {
				List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
				List<Double> expected = List.of(5.0, 5.9);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements3() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
				List<Double> expected = List.of(2.0, 2.2);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements4() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
				List<Double> expected = List.of(2.0, 2.0);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements5() {
				List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
				List<Double> expected = List.of(2.2, 3.1);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements6() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2, 3.3);
				List<Double> expected = List.of(2.2, 3.3);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements7() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2, 3.3, 4.4);
				List<Double> expected = List.of(3.3, 4.4);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements8() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2, 3.3, 4.4, 5.5);
				List<Double> expected = List.of(4.4, 5.5);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements9() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2, 3.3, 4.4, 5.5, 6.6);
				List<Double> expected = List.of(5.5, 6.6);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}

			@Test
			void testFindClosestElements10() {
				List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7);
				List<Double> expected = List.of(6.6, 7.7);
				List<Double> actual = FindClosestElements.findClosestElements(numbers);
				assertEquals(expected, actual);
			}
}
