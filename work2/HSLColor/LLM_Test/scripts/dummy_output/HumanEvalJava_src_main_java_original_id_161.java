// SolveTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {
			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only letters.
			*/
			@Test
			void testOnlyLetters() {
				String input = "AsDf";
				String expected = "aSdF";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only digits.
			*/
			@Test
			void testOnlyDigits() {
				String input = "1234";
				String expected = "4321";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only special characters.
			*/
			@Test
			void testOnlySpecialCharacters() {
				String input = "#$@^&";
				String expected = "&^@#$";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains both letters and digits.
			*/
			@Test
			void testLettersAndDigits() {
				String input = "#AsdfW^45";
				String expected = "#aSDFw^45";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains both letters and special characters.
			*/
			@Test
			void testLettersAndSpecialCharacters() {
				String input = "#6@2";
				String expected = "2@6#";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains both digits and special characters.
			*/
			@Test
			void testDigitsAndSpecialCharacters() {
				String input = "#$a^D";
				String expected = "#$A^d";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only one letter.
			*/
			@Test
			void testOneLetter() {
				String input = "a";
				String expected = "A";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only one digit.
			*/
			@Test
			void testOneDigit() {
				String input = "1";
				String expected = "1";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string contains only one special character.
			*/
			@Test
			void testOneSpecialCharacter() {
				String input = "#";
				String expected = "#";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link Solve#solve(String)} method.
			* It tests the case when the input string is empty.
			*/
			@Test
			void testEmptyString() {
				String input = "";
				String expected = "";
				String actual = Solve.solve(input);
				assertEquals(expected, actual);
			}
}