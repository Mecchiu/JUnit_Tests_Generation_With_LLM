// CheckIfLastCharIsALetterTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is false.
		*/
		@Test
		void testCase1() {
				String txt = "";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains only one letter.
		* The expected result is true.
		*/
		@Test
		void testCase2() {
				String txt = "a";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one digit.
		* The expected result is false.
		*/
		@Test
		void testCase3() {
				String txt = "1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one special character.
		* The expected result is false.
		*/
		@Test
		void testCase4() {
				String txt = "!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains two letters.
		* The expected result is false.
		*/
		@Test
		void testCase5() {
				String txt = "ab";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains two digits.
		* The expected result is false.
		*/
		@Test
		void testCase6() {
				String txt = "12";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains two special characters.
		* The expected result is false.
		*/
		@Test
		void testCase7() {
				String txt = "!!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains a letter and a digit.
		* The expected result is false.
		*/
		@Test
		void testCase8() {
				String txt = "a1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains a letter and a special character.
		* The expected result is true.
		*/
		@Test
		void testCase9() {
				String txt = "a!";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains a digit and a special character.
		* The expected result is false.
		*/
		@Test
		void testCase10() {
				String txt = "1!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
}

// CheckIfLastCharIsALetterTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
		
		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is false.
		*/
		@Test
		void testCase1() {
				String txt = "";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains only one letter.
		* The expected result is true.
		*/
		@Test
		void testCase2() {
				String txt = "a";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one digit.
		* The expected result is false.
		*/
		@Test
		void testCase3() {
				String txt = "1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one special character.
		* The expected result is false.
		*/
		@Test
		void testCase4() {
				String txt = "!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains two letters.
		* The expected result is false.
		*/
		@Test
		void testCase5() {
				String txt = "ab";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains two digits.
		* The expected result is false.
		*/
		@Test
		void testCase6() {
				String txt = "12";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains two special characters.
		* The expected result is false.
		*/
		@Test
		void testCase7() {
				String txt = "!!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains a letter and a digit.
		* The expected result is false.
		*/
		@Test
		void testCase8() {
				String txt = "a1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains a letter and a special character.
		* The expected result is true.
		*/
		@Test
		void testCase9() {
				String txt = "a!";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains a digit and a special character.
		* The expected result is false.
		*/
		@Test
		void testCase10() {
				String txt = "1!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
}

// CheckIfLastCharIsALetter.java
package scenario2;

class CheckIfLastCharIsALetter {

    public static Boolean checkIfLastCharIsALetter(String txt) {
        if (txt.length() == 0) {
            return false;
        }
        char lastChar = txt.charAt(txt.length() - 1);
        if (Character.isLetter(lastChar)) {
            if (txt.length() == 1) {
                return true;
            }
            char secondLastChar = txt.charAt(txt.length() - 2);
            if (Character.isLetter(secondLastChar)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

// CheckIfLastCharIsALetterTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
		
		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is false.
		*/
		@Test
		void testCase1() {
				String txt = "";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains only one letter.
		* The expected result is true.
		*/
		@Test
		void testCase2() {
				String txt = "a";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one digit.
		* The expected result is false.
		*/
		@Test
		void testCase3() {
				String txt = "1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one special character.
		* The expected result is false.
		*/
		@Test
		void testCase4() {
				String txt = "!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains two letters.
		* The expected result is false.
		*/
		@Test
		void testCase5() {
				String txt = "ab";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains two digits.
		* The expected result is false.
		*/
		@Test
		void testCase6() {
				String txt = "12";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains two special characters.
		* The expected result is false.
		*/
		@Test
		void testCase7() {
				String txt = "!!";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains a letter and a digit.
		* The expected result is false.
		*/
		@Test
		void testCase8() {
				String txt = "a1";
				Boolean expected = false;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains a letter and a special character.
		* The expected result is true.
		*/
		@Test
		void testCase9() {
				String txt = "a!";
				Boolean expected = true;
				Boolean actual = CheckIfLastCharIsALetter.checkIfLastCharIsALetter(txt);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains a digit and a special character.
		*