// Here's the source code for the OddCountTest class:

package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OddCount}.
 * It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
 */
class OddCountTest {

    @Test
    void testEmptyList() {
        List<String> lst = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testSingleDigit() {
        List<String> lst = Arrays.asList("1");
        List<String> expected = Arrays.asList("the number of odd elements in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testSingleEvenDigit() {
        List<String> lst = Arrays.asList("2");
        List<String> expected = Arrays.asList("the number of odd elements in the string 0 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testSingleOddDigit() {
        List<String> lst = Arrays.asList("3");
        List<String> expected = Arrays.asList("the number of odd elements in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testMultipleDigits() {
        List<String> lst = Arrays.asList("123", "456", "789");
        List<String> expected = Arrays.asList("the number of odd elements in the string 2 of the input.", 
                                               "the number of odd elements in the string 0 of the input.", 
                                               "the number of odd elements in the string 2 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testLeadingZeros() {
        List<String> lst = Arrays.asList("00123", "0456", "00789");
        List<String> expected = Arrays.asList("the number of odd elements in the string 2 of the input.", 
                                               "the number of odd elements in the string 0 of the input.", 
                                               "the number of odd elements in the string 2 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testNonDigitCharacters() {
        List<String> lst = Arrays.asList("12a3", "4.56", "7#89");
        List<String> expected = Arrays.asList("the number of odd elements in the string 1 of the input.", 
                                               "the number of odd elements in the string 1 of the input.", 
                                               "the number of odd elements in the string 1 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testEmptyString() {
        List<String> lst = Arrays.asList("");
        List<String> expected = Arrays.asList("the number of odd elements in the string 0 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testNullString() {
        List<String> lst = Arrays.asList(null);
        List<String> expected = Arrays.asList("the number of odd elements in the string 0 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testMixedNullAndNonNullStrings() {
        List<String> lst = Arrays.asList("123", null, "456", null, "789");
        List<String> expected = Arrays.asList("the number of odd elements in the string 2 of the input.", 
                                               "the number of odd elements in the string 0 of the input.", 
                                               "the number of odd elements in the string 0 of the input.", 
                                               "the number of odd elements in the string 0 of the input.", 
                                               "the number of odd elements in the string 2 of the input.");
        assertEquals(expected, OddCount.oddCount(lst));
    }

    @Test
    void testLargeInput() {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i % 10);
            lst.add(sb.toString());
        }
        List<String> expected = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            expected.add("the number of odd elements in the string " + ((i % 2 == 0) ? "0" : "1") + " of the input.");
        }
        assertEquals(expected, OddCount.oddCount(lst));
    }
}