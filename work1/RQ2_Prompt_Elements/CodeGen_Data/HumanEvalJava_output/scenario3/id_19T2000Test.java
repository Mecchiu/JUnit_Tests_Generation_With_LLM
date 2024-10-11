// SortNumbersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains one unit test case for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
// SortNumbers.java
package scenario3;

class SortNumbers {

    /**
     * Input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five','six','seven', 'eight' and 'nine'.
     * Return the string with numbers sorted from smallest to largest
     *
     * > sortNumbers("three one five")
     * "one three five"
     * > sortNumbers("")
     * ""
     * > sortNumbers("three")
     * "three"
     * > sortNumbers("three five nine")
     * "three five nine"
     * > sortNumbers("five zero four seven nine eight")
     * "zero four five seven eight nine"
     * > sortNumbers("six five four three two one zero")
     * "zero one two three four five six"
     */
    public static String sortNumbers(String numbers) {
    }
}

// SortNumbersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains one unit test case for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
		    
  @Test @SuppressWarnings("unused")
		void sortNumbersTest(){
      String numbers = "three one five nine";
      System.out.println(sortNumbers(numbers));
      numbers = "";
      System.out.println(sortNumbers(numbers));
      numbers = null;
      System.out.println(sortNumbers(numbers));
		}
	}
