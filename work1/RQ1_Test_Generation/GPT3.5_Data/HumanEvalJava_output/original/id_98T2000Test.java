```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUpperTest {

    @Test
    void testCountUpper_emptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testCountUpper_noUpperCaseVowels() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
    }

    @Test
    void testCountUpper_upperCaseVowelsAtEvenIndices() {
        assertEquals(1, CountUpper.countUpper("aBCdEf"));
    }

    @Test
    void testCountUpper_onlyUpperCaseVowels() {
        assertEquals(2, CountUpper.countUpper("EEEE"));
    }

    @Test
    void testCountUpper_upperCaseVowelsAtOddIndices() {
        assertEquals(0, CountUpper.countUpper("dBBE"));
    }

    @Test
    void testCountUpper_mixedCaseVowelsAtEvenIndices() {
        assertEquals(1, CountUpper.countUpper("aBCdEfG"));
    }

    @Test
    void testCountUpper_mixedCaseVowelsAtOddIndices() {
        assertEquals(0, CountUpper.countUpper("dBBEg"));
    }

    @Test
    void testCountUpper_specialCharacters() {
        assertEquals(0, CountUpper.countUpper("!@#$%^&*()"));
    }

    @Test
    void testCountUpper_mixedCaseLetters() {
        assertEquals(1, CountUpper.countUpper("aBCdEfGh"));
    }

    @Test
    void testCountUpper_allUpperCaseVowels() {
        assertEquals(2, CountUpper.countUpper("AEIOU"));
    }
}
```
