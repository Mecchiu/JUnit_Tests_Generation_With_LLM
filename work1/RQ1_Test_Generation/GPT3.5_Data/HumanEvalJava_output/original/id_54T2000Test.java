```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {

    @Test
    void testSameChars1() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabce"));
    }

    @Test
    void testSameChars2() {
        assertTrue(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc"));
    }

    @Test
    void testSameChars3() {
        assertTrue(SameChars.sameChars("abcd", "dddddddabc"));
    }

    @Test
    void testSameChars4() {
        assertTrue(SameChars.sameChars("dddddddabc", "abcd"));
    }

    @Test
    void testSameChars5() {
        assertFalse(SameChars.sameChars("eabcd", "dddddddabc"));
    }

    @Test
    void testSameChars6() {
        assertFalse(SameChars.sameChars("abcd", "dddddddabcf"));
    }

    @Test
    void testSameChars7() {
        assertFalse(SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }

    @Test
    void testSameChars8() {
        assertFalse(SameChars.sameChars("aabb", "aaccc"));
    }
}
```
