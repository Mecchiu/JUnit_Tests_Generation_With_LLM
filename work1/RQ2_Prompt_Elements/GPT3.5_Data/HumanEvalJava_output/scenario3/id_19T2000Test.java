// SortNumbers.java
package scenario3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class SortNumbers {

    /**
     * Input is a space-delimited string of numbers from 'zero' to 'nine'.
     * Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
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
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }

        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        String[] numberArray = numbers.split(" ");
        Integer[] intArray = new Integer[numberArray.length];

        for (int i = 0; i < numberArray.length; i++) {
            intArray[i] = numberMap.get(numberArray[i]);
        }

        Arrays.sort(intArray, Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArray.length; i++) {
            for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
                if (entry.getValue().equals(intArray[i])) {
                    sb.append(entry.getKey()).append(" ");
                    break;
                }
            }
        }

        return sb.toString().trim();
    }
}

// SortNumbersTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortNumbers}.
* It contains ten unit test cases for the {@link SortNumbers#sortNumbers(String)} method.
*/
class SortNumbersTest {

    @Test
    void testSortNumbersWithValidInput() {
        assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
        assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
        assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
        assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
    }

    @Test
    void testSortNumbersWithEmptyInput() {
        assertEquals("", SortNumbers.sortNumbers(""));
    }

    @Test
    void testSortNumbersWithSingleNumber() {
        assertEquals("three", SortNumbers.sortNumbers("three"));
    }

    @Test
    void testSortNumbersWithInvalidInput() {
        assertEquals("", SortNumbers.sortNumbers("invalid input"));
        assertEquals("", SortNumbers.sortNumbers("one two three invalid"));
    }

    @Test
    void testSortNumbersWithDuplicateNumbers() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine zero one two three four five six seven eight nine"));
    }

    @Test
    void testSortNumbersWithNumbersInReverseOrder() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("nine eight seven six five four three two one zero"));
    }

    @Test
    void testSortNumbersWithNumbersInRandomOrder() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight one six two three"));
    }

    @Test
    void testSortNumbersWithNumbersInUpperCase() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE"));
    }

    @Test
    void testSortNumbersWithNumbersInMixedCase() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zErO oNe TwO ThReE fOuR fIvE sIx SeVeN eIgHt nInE"));
    }
}