// CanArrangeTest.java
package original;

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
			* It tests the method with the following input:
			* > canArrange([1, 2, 4, 3, 5])
			* 3
			*/
			@Test
			void testCanArrange1() {
				List<Object> arr = List.of(1, 2, 4, 3, 5);
				int expected = 3;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 2, 4, 5])
			* -1
			*/
			@Test
			void testCanArrange2() {
				List<Object> arr = List.of(1, 2, 4, 5);
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 4, 2, 5, 6, 7, 8, 9, 10])
			* 2
			*/
			@Test
			void testCanArrange3() {
				List<Object> arr = List.of(1, 4, 2, 5, 6, 7, 8, 9, 10);
				int expected = 2;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([4, 8, 5, 7, 3])
			* 4
			*/
			@Test
			void testCanArrange4() {
				List<Object> arr = List.of(4, 8, 5, 7, 3);
				int expected = 4;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([])
			* -1
			*/
			@Test
			void testCanArrange5() {
				List<Object> arr = List.of();
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 2, 3])
			* -1
			*/
			@Test
			void testCanArrange6() {
				List<Object> arr = List.of(1, 2, 3);
				int expected = -1;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
			* 9
			*/
			@Test
			void testCanArrange7() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				int expected = 9;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([10, 9, 8, 7, 6, 5, 4, 3, 2, 1])
			* 0
			*/
			@Test
			void testCanArrange8() {
				List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
				int expected = 0;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
			* 10
			*/
			@Test
			void testCanArrange9() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
				int expected = 10;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link CanArrange#canArrange(List)} method.
			* It tests the method with the following input:
			* > canArrange([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
			* 11
			*/
			@Test
			void testCanArrange10() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
				int expected = 11;
				int actual = CanArrange.canArrange(arr);
				assertEquals(expected, actual);
			}
}