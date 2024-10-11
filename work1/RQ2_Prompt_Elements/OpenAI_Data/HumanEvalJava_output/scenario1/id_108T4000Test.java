// CountNumsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums2() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums3() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums4() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums5() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertEquals(20, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums6() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums7() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertEquals(20, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums8() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
				assertEquals(10, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums9() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				assertEquals(20, CountNums.countNums(arr));
		}
		
		/**
		* Test case for {@link CountNums#countNums(List)} method.
		* It checks if the method returns the correct number of positive numbers in the list.
		*/
		@Test
		void testCountNums10() {
				List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
				assertEquals(10, CountNums.countNums(arr));
		}
}