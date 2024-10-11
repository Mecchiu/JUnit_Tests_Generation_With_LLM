// TruncateNumberTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
			// Test case 1: Positive number
    @Test
    void testTruncateNumberPositive() {
        Double number = 123.456;
        Double expected = 0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 2: Negative number
    @Test
    void testTruncateNumberNegative() {
        Double number = -123.456;
        Double expected = -0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 3: Zero
    @Test
    void testTruncateNumberZero() {
        Double number = 0.0;
        Double expected = 0.0;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 4: Integer
    @Test
    void testTruncateNumberInteger() {
        Double number = 123.0;
        Double expected = 0.0;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 5: Positive number with three decimal places
    @Test
    void testTruncateNumberPositiveThreeDecimalPlaces() {
        Double number = 123.456;
        Double expected = 0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 6: Negative number with three decimal places
    @Test
    void testTruncateNumberNegativeThreeDecimalPlaces() {
        Double number = -123.456;
        Double expected = -0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 7: Positive number with more than three decimal places
    @Test
    void testTruncateNumberPositiveMoreThanThreeDecimalPlaces() {
        Double number = 123.4567;
        Double expected = 0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 8: Negative number with more than three decimal places
    @Test
    void testTruncateNumberNegativeMoreThanThreeDecimalPlaces() {
        Double number = -123.4567;
        Double expected = -0.456;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 9: Positive number with less than three decimal places
    @Test
    void testTruncateNumberPositiveLessThanThreeDecimalPlaces() {
        Double number = 123.45;
        Double expected = 0.45;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 10: Negative number with less than three decimal places
    @Test
    void testTruncateNumberNegativeLessThanThreeDecimalPlaces() {
        Double number = -123.45;
        Double expected = -0.45;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }
}