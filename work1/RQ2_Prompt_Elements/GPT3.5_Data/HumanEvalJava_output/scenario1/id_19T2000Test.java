// SortNumbersTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    @Test
    void testSortNumbersWithEmptyString() {
        String result = SortNumbers.sortNumbers("");
        assertEquals("", result);
    }

    @Test
    void testSortNumbersWithOneNumber() {
        String result = SortNumbers.sortNumbers("one");
        assertEquals("one", result);
    }

    @Test
    void testSortNumbersWithTwoNumbers() {
        String result = SortNumbers.sortNumbers("one two");
        assertEquals("one two", result);
    }

    @Test
    void testSortNumbersWithThreeNumbers() {
        String result = SortNumbers.sortNumbers("one two three");
        assertEquals("one two three", result);
    }

    @Test
    void testSortNumbersWithFourNumbers() {
        String result = SortNumbers.sortNumbers("one two three four");
        assertEquals("four one three two", result);
    }

    @Test
    void testSortNumbersWithFiveNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five");
        assertEquals("five four one three two", result);
    }

    @Test
    void testSortNumbersWithSixNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five six");
        assertEquals("five four one six three two", result);
    }

    @Test
    void testSortNumbersWithSevenNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five six seven");
        assertEquals("five four one six seven three two", result);
    }

    @Test
    void testSortNumbersWithEightNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five six seven eight");
        assertEquals("eight five four one six seven three two", result);
    }

    @Test
    void testSortNumbersWithNineNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five six seven eight nine");
        assertEquals("eight five four nine one six seven three two", result);
    }

    @Test
    void testSortNumbersWithTenNumbers() {
        String result = SortNumbers.sortNumbers("one two three four five six seven eight nine zero");
        assertEquals("eight five four nine one six seven three two zero", result);
    }
}