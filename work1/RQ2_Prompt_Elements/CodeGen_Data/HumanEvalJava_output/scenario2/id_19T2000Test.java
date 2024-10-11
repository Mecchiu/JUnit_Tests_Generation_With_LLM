// SortNumbersTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains one unit test case for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
// SortNumbers.java
package scenario2;

import java.util.Arrays;

class SortNumbers {

    /**
     * Input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five','six','seven', 'eight' and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     */
    public static String sortNumbers(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int[] numbersInt = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i].equals("zero")) {
                numbersInt[i] = 0;
            } else if (numbersArray[i].equals("one")) {
                numbersInt[i] = 1;
            } else if (numbersArray[i].equals("two")) {
                numbersInt[i] = 2;
            } else if (numbersArray[i].equals("three")) {
                numbersInt[i] = 3;
            } else if (numbersArray[i].equals("four")) {
                numbersInt[i] = 4;
            } else if (numbersArray[i].equals("five")) {
                numbersInt[i] = 5;
            } else if (numbersArray[i].equals("six")) {
                numbersInt[i] = 6;
            } else if (numbersArray[i].equals("seven")) {
                numbersInt[i] = 7;
            } else if (numbersArray[i].equals("eight")) {
                numbersInt[i] = 8;
            } else if (numbersArray[i].equals("nine")) {
                numbersInt[i] = 9;
            } else {
                numbersInt[i] = -1;
            }
        }
        Arrays.sort(numbersInt);
        String result = "";
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i] == 0) {
                result += "zero ";
            } else if (numbersInt[i] == 1) {
                result += "one ";
            } else if (numbersInt[i] == 2) {
                result += "two ";
            } else if (numbersInt[i] == 3) {
                result += "three ";
            } else if (numbersInt[i] == 4) {
                result += "four ";
            } else if (numbersInt[i] == 5) {
                result += "five ";
            } else if (numbersInt[i] == 6) {
                result += "six ";
            } else if (numbersInt[i] == 7) {
                result += "seven ";
            } else if (numbersInt[i] == 8) {
                result += "eight ";
            } else if (numbersInt[i] == 9) {
                result += "nine ";
            }
        }
        return result.trim();
    }
}

// SortNumbersTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains one unit test case for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
		/**
		 * Input is a two element array of the three integers from 'zero' to 'nine'.
		 * Each test case is tested for the array length and valid answers.
		 * The test cases are the following two.
		 * <ul>
		 * <li>Input has length 2. Array with two integers from '0' to '9' will be returned.
		 * <li>Input has length 2.
		 * </ul>
		 */
		@Test
		public void testSortNumbers() {
			String[] input = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

			String[] outputArray = SortNumbers.sortNumbers(input);
			assertTrue(outputArray.length == input.length);
			for (int i = 0; i < input.length; i++) {
				assertEquals("0", outputArray[i]);
			}
		}

}