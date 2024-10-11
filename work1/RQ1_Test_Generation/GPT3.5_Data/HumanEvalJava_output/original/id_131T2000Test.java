```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testDigitsWithSingleOddDigit() {
        assertEquals(1, Digits.digits(1));
    }

    @Test
    void testDigitsWithSingleEvenDigit() {
        assertEquals(0, Digits.digits(4));
    }

    @Test
    void testDigitsWithMultipleOddDigits() {
        assertEquals(15, Digits.digits(235));
    }

    @Test
    void testDigitsWithSingleOddDigitInNumber() {
        assertEquals(5, Digits.digits(5));
    }

    @Test
    void testDigitsWithOddAndEvenDigits() {
        assertEquals(5, Digits.digits(54));
    }

    @Test
    void testDigitsWithZeroAndOddDigit() {
        assertEquals(1, Digits.digits(120));
    }

    @Test
    void testDigitsWithEvenAndOddDigits() {
        assertEquals(5, Digits.digits(5014));
    }

    @Test
    void testDigitsWithMultipleOddDigitsInNumber() {
        assertEquals(315, Digits.digits(98765));
    }

    @Test
    void testDigitsWithMultipleOddDigitsInNumber2() {
        assertEquals(2625, Digits.digits(5576543));
    }

    @Test
    void testDigitsWithAllEvenDigits() {
        assertEquals(0, Digits.digits(2468));
    }
}
```
