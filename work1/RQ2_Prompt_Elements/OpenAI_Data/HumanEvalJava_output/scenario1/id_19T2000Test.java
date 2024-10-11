// SortNumbersTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {
	// Test case 1
    @Test
    void testSortNumbers1() {
        String numbers = "one two three";
        String expResult = "one two three";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testSortNumbers2() {
        String numbers = "nine eight seven";
        String expResult = "seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testSortNumbers3() {
        String numbers = "zero one two three four five six seven eight nine";
        String expResult = "zero one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testSortNumbers4() {
        String numbers = "one one one";
        String expResult = "one one one";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testSortNumbers5() {
        String numbers = "one two three four five six seven eight nine zero";
        String expResult = "zero one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testSortNumbers6() {
        String numbers = "one two three four five six seven eight nine ten";
        String expResult = "one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testSortNumbers7() {
        String numbers = "one two three four five six seven eight nine ten eleven";
        String expResult = "one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testSortNumbers8() {
        String numbers = "one two three four five six seven eight nine ten eleven twelve";
        String expResult = "one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testSortNumbers9() {
        String numbers = "one two three four five six seven eight nine ten eleven twelve thirteen";
        String expResult = "one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testSortNumbers10() {
        String numbers = "one two three four five six seven eight nine ten eleven twelve thirteen fourteen";
        String expResult = "one two three four five six seven eight nine";
        String result = SortNumbers.sortNumbers(numbers);
        assertEquals(expResult, result);
    }
}
