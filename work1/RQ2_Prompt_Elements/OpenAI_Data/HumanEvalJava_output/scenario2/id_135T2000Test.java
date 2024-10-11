// CanArrangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
	/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertEquals(0, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange1() {
				List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
				assertEquals(-1, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange2() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				assertEquals(0, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange3() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9);
				assertEquals(9, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange4() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				assertEquals(0, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange5() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9);
				assertEquals(9, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange6() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				assertEquals(0, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange7() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9);
				assertEquals(9, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange8() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				assertEquals(0, CanArrange.canArrange(arr));
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It checks if the method returns the correct index of the element which is not greater than or equal to the element immediately preceding it.
			*/
			@Test
			void testCanArrange9() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9);
				assertEquals(9, CanArrange.canArrange(arr));
			}
}
