Here's the code for the VowelsCountTest class with ten unit test cases for the vowelsCount method:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelsCountTest {

    @Test
    void testEmptyString() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    @Test
    void testAllVowelsLowerCase() {
        assertEquals(5, VowelsCount.vowelsCount("aeiou"));
    }

    @Test
    void testAllVowelsUpperCase() {
        assertEquals(5, VowelsCount.vowelsCount("AEIOU"));
    }

    @Test
    void testMixedCaseVowels() {
        assertEquals(5, VowelsCount.vowelsCount("aEiOu"));
    }

    @Test
    void testVowelsAndConsonants() {
        assertEquals(4, VowelsCount.vowelsCount("hello"));
    }

    @Test
    void testVowelsAndY() {
        assertEquals(2, VowelsCount.vowelsCount("happy"));
    }

    @Test
    void testVowelsAndYUpperCase() {
        assertEquals(2, VowelsCount.vowelsCount("HAPPY"));
    }

    @Test
    void testVowelsAndYMixedCase() {
        assertEquals(2, VowelsCount.vowelsCount("hApPy"));
    }

    @Test
    void testVowelsAndYAtEnd() {
        assertEquals(1, VowelsCount.vowelsCount("sky"));
    }
}
```