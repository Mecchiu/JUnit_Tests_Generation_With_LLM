import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testAllEvenDigits() {
        int n = 2468;
        int expected = 0;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testOneOddDigit() {
        int n = 1234;
        int expected = 3;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleOddDigits() {
        int n = 13579;
        int expected = 945;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testZero() {
        int n = 0;
        int expected = 0;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumber() {
        int n = 123456789;
        int expected = 945;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeNumber() {
        int n = -13579;
        int expected = 945;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testMaxValue() {
        int n = Integer.MAX_VALUE;
        int expected = 1;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testMinValue() {
        int n = Integer.MIN_VALUE;
        int expected = 0;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testRepeatedOddDigits() {
        int n = 1133557799;
        int expected = 2187;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }

    @Test
    void testRepeatedEvenDigits() {
        int n = 22446688;
        int expected = 0;
        int actual = Digits.digits(n);
        assertEquals(expected, actual);
    }
}