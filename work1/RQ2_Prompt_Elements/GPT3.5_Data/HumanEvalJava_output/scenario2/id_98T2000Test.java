Here's the code for the CountUpperTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUpperTest {

    @Test
    void testCountUpper_emptyString() {
        assertEquals(0, CountUpper.countUpper(""));
    }

    @Test
    void testCountUpper_noUppercaseVowels() {
        assertEquals(0, CountUpper.countUpper("hello"));
    }

    @Test
    void testCountUpper_oneUppercaseVowel() {
        assertEquals(1, CountUpper.countUpper("hEllo"));
    }

    @Test
    void testCountUpper_allUppercaseVowels() {
        assertEquals(2, CountUpper.countUpper("AEIOU"));
    }

    @Test
    void testCountUpper_onlyUppercaseVowels() {
        assertEquals(1, CountUpper.countUpper("AEiOU"));
    }

    @Test
    void testCountUpper_onlyEvenIndices() {
        assertEquals(1, CountUpper.countUpper("aEiOu"));
    }

    @Test
    void testCountUpper_onlyOddIndices() {
        assertEquals(0, CountUpper.countUpper("aeiou"));
    }

    @Test
    void testCountUpper_mixedCase() {
        assertEquals(2, CountUpper.countUpper("hEllo wOrld"));
    }

    @Test
    void testCountUpper_specialCharacters() {
        assertEquals(0, CountUpper.countUpper("!@#$%^&*()"));
    }

    @Test
    void testCountUpper_numbers() {
        assertEquals(0, CountUpper.countUpper("1234567890"));
    }
}
```

This test class contains ten unit test cases for the `CountUpper.countUpper(String)` method. Each test case tests a different scenario, such as an empty string, a string with no uppercase vowels, a string with only one uppercase vowel, and so on. The `assertEquals` method is used to compare the expected result with the actual result returned by the `countUpper` method.