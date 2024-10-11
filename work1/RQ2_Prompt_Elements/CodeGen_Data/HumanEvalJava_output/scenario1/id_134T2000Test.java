// CheckIfLastCharIsALetterTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains one unit test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
/**
		* Check if last character is A letter.
		*/
		@Test
		public void checkIfFirstLetterContainsALetter() {
			String s1 = "hello";
            String s2 = "hallo";
            assertEquals(true, new CheckIfLastCharIsALetter().checkIfFirstLetterContainsALetter(s1));
            assertEquals(true, new CheckIfLastCharIsALetter().checkIfFirstLetterContainsALetter(s2));
        }

		/**
		* Check if last character is an A letter not containing the first letter.
		*/
		@Test
		public void checkIfLastCharNotContainsALetter() {
			String s1 = "hello";
			assertEquals(false, new CheckIfLastCharIsALetter().checkIfLastCharNotContainsALetter(s1));
		}

	}