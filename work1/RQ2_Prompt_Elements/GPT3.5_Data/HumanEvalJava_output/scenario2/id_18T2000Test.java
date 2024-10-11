Here's the code for the HowManyTimesTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HowManyTimes}.
 * It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
 */
class HowManyTimesTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "test"));
    }

    @Test
    void testEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("test", ""));
    }

    @Test
    void testSubstringNotFound() {
        assertEquals(0, HowManyTimes.howManyTimes("test", "notfound"));
    }

    @Test
    void testSubstringFoundOnce() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "es"));
    }

    @Test
    void testSubstringFoundMultipleTimes() {
        assertEquals(3, HowManyTimes.howManyTimes("testestest", "es"));
    }

    @Test
    void testSubstringAtBeginning() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "te"));
    }

    @Test
    void testSubstringAtEnd() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "st"));
    }

    @Test
    void testSubstringOverlapping() {
        assertEquals(2, HowManyTimes.howManyTimes("testest", "te"));
    }

    @Test
    void testSubstringEqualToString() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "test"));
    }

    @Test
    void testSubstringEqualToSubstring() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "es"));
    }
}
```

This test class contains ten unit test cases for the `howManyTimes` method of the `HowManyTimes` class. Each test case tests a different scenario, such as an empty string, an empty substring, a substring not found in the string, a substring found multiple times, and so on. The `assertEquals` method is used to compare the expected result with the actual result returned by the `howManyTimes` method.