// TruncateNumberTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
			// Test case 1: Positive number with decimal part
    @Test
    void testTruncateNumber1() {
        Double number = 3.5;
        Double expected = 0.5;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 2: Positive number without decimal part
    @Test
    void testTruncateNumber2() {
        Double number = 3.0;
        Double expected = 0.0;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 3: Negative number with decimal part
    @Test
    void testTruncateNumber3() {
        Double number = -3.5;
        Double expected = -0.5;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 4: Negative number without decimal part
    @Test
    void testTruncateNumber4() {
        Double number = -3.0;
        Double expected = -0.0;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 5: Positive number with more than three decimal places
    @Test
    void testTruncateNumber5() {
        Double number = 3.1234;
        Double expected = 0.1234;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 6: Negative number with more than three decimal places
    @Test
    void testTruncateNumber6() {
        Double number = -3.1234;
        Double expected = -0.1234;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 7: Positive number with three decimal places
    @Test
    void testTruncateNumber7() {
        Double number = 3.123;
        Double expected = 0.123;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 8: Negative number with three decimal places
    @Test
    void testTruncateNumber8() {
        Double number = -3.123;
        Double expected = -0.123;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 9: Positive number with one decimal place
    @Test
    void testTruncateNumber9() {
        Double number = 3.1;
        Double expected = 0.1;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }

    // Test case 10: Negative number with one decimal place
    @Test
    void testTruncateNumber10() {
        Double number = -3.1;
        Double expected = -0.1;
        Double actual = TruncateNumber.truncateNumber(number);
        assertEquals(expected, actual);
    }
}