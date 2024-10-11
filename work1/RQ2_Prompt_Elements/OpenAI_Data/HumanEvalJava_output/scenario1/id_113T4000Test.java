// OddCountTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

		/**
		* Test case 1.
		* The input is a list of strings with one element.
		* The expected result is a list of strings with one element.
		*/
		@Test
		void testCase1() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input is a list of strings with two elements.
		* The expected result is a list of strings with two elements.
		*/
		@Test
		void testCase2() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input is a list of strings with three elements.
		* The expected result is a list of strings with three elements.
		*/
		@Test
		void testCase3() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input is a list of strings with four elements.
		* The expected result is a list of strings with four elements.
		*/
		@Test
		void testCase4() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input is a list of strings with five elements.
		* The expected result is a list of strings with five elements.
		*/
		@Test
		void testCase5() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input is a list of strings with six elements.
		* The expected result is a list of strings with six elements.
		*/
		@Test
		void testCase6() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input is a list of strings with seven elements.
		* The expected result is a list of strings with seven elements.
		*/
		@Test
		void testCase7() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input is a list of strings with eight elements.
		* The expected result is a list of strings with eight elements.
		*/
		@Test
		void testCase8() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input is a list of strings with nine elements.
		* The expected result is a list of strings with nine elements.
		*/
		@Test
		void testCase9() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input is a list of strings with ten elements.
		* The expected result is a list of strings with ten elements.
		*/
		@Test
		void testCase10() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
		}
}