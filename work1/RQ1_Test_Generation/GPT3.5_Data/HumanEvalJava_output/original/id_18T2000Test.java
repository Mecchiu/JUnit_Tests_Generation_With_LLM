```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HowManyTimesTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }

    @Test
    void testSingleCharacterSubstring() {
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
    }

    @Test
    void testMultipleCharacterSubstring() {
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
    }

    @Test
    void testEmptyStringWithDifferentSubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("", "x"));
    }

    @Test
    void testMultipleOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    void testOverlappingOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
    }

    @Test
    void testSubstringAtBeginning() {
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
    }

    @Test
    void testSubstringNotPresent() {
        assertEquals(0, HowManyTimes.howManyTimes("hello world", "foo"));
    }

    @Test
    void testSubstringSameAsOriginalString() {
        assertEquals(1, HowManyTimes.howManyTimes("test", "test"));
    }

    @Test
    void testSubstringLongerThanOriginalString() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcdef"));
    }
}
```
