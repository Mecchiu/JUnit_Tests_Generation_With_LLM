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
			// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<String> input = new ArrayList<String>();
				List<String> expected = new ArrayList<String>();
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<String> input = new ArrayList<String>();
				input.add("12345");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 5 in the string 12345 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with multiple elements, all even numbers
			@Test
			void testAllEvenNumbers() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add("1357");
				input.add("02468");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 4 in the string 1357 of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with multiple elements, all odd numbers
			@Test
			void testAllOddNumbers() {
				List<String> input = new ArrayList<String>();
				input.add("1357");
				input.add("97531");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 4 in the string 1357 of the input.");
				expected.add("the number of odd elements 5 in the string 97531 of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with multiple elements, mix of even and odd numbers
			@Test
			void testMixOfEvenAndOddNumbers() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add("1357");
				input.add("02468");
				input.add("97531");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 4 in the string 1357 of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 5 in the string 97531 of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with multiple elements, mix of numbers and non-numbers
			@Test
			void testMixOfNumbersAndNonNumbers() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add("abcde");
				input.add("02468");
				input.add("fghij");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 0 in the string abcde of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 0 in the string fghij of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with multiple elements, mix of numbers and special characters
			@Test
			void testMixOfNumbersAndSpecialCharacters() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add("!@#$%");
				input.add("02468");
				input.add("^&*()");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 0 in the string !@#$% of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 0 in the string ^&*() of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with multiple elements, mix of numbers and spaces
			@Test
			void testMixOfNumbersAndSpaces() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add(" ");
				input.add("02468");
				input.add(" ");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 0 in the string   of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 0 in the string   of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with multiple elements, mix of numbers and empty strings
			@Test
			void testMixOfNumbersAndEmptyStrings() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add("");
				input.add("02468");
				input.add("");
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 0 in the string  of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 0 in the string  of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with multiple elements, mix of numbers and null values
			@Test
			void testMixOfNumbersAndNullValues() {
				List<String> input = new ArrayList<String>();
				input.add("2468");
				input.add(null);
				input.add("02468");
				input.add(null);
				input.add("7531");
				List<String> expected = new ArrayList<String>();
				expected.add("the number of odd elements 0 in the string 2468 of the input.");
				expected.add("the number of odd elements 0 in the string null of the input.");
				expected.add("the number of odd elements 0 in the string 02468 of the input.");
				expected.add("the number of odd elements 0 in the string null of the input.");
				expected.add("the number of odd elements 4 in the string 7531 of the input.");
				List<String> actual = OddCount.oddCount(input);
				assertEquals(expected, actual);
			}
}