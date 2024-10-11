// RollingMaxTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

		/**
		* Test case 1.
		* The input list is empty.
		* The expected result is an empty list.
		*/
		@Test
		void testCase1() {
				List<Object> numbers = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input list contains one element.
		* The expected result is a list with one element.
		*/
		@Test
		void testCase2() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input list contains two elements.
		* The expected result is a list with two elements.
		*/
		@Test
		void testCase3() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input list contains three elements.
		* The expected result is a list with three elements.
		*/
		@Test
		void testCase4() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input list contains four elements.
		* The expected result is a list with four elements.
		*/
		@Test
		void testCase5() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input list contains five elements.
		* The expected result is a list with five elements.
		*/
		@Test
		void testCase6() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input list contains six elements.
		* The expected result is a list with six elements.
		*/
		@Test
		void testCase7() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input list contains seven elements.
		* The expected result is a list with seven elements.
		*/
		@Test
		void testCase8() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input list contains eight elements.
		* The expected result is a list with eight elements.
		*/
		@Test
		void testCase9() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				numbers.add(8);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input list contains nine elements.
		* The expected result is a list with nine elements.
		*/
		@Test
		void testCase10() {
				List<Object> numbers = new ArrayList<Object>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				numbers.add(8);
				numbers.add(9);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				expected.add(5);
				expected.add(6);
				expected.add(7);
				expected.add(8);
				expected.add(9);
				List<Object> actual = RollingMax.rollingMax(numbers);
				assertEquals(expected, actual);
		}
}