```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {

    @Test
    void testRemoveVowels_allVowels() {
        assertEquals("", RemoveVowels.removeVowels("aaaaa"));
    }

    @Test
    void testRemoveVowels_noVowels() {
        assertEquals("bcdf", RemoveVowels.removeVowels("abcdef"));
    }

    @Test
    void testRemoveVowels_mixedCase() {
        assertEquals("B", RemoveVowels.removeVowels("aaBAA"));
    }

    @Test
    void testRemoveVowels_noVowelsWithNewLine() {
        assertEquals("bcdf\nghjklm", RemoveVowels.removeVowels("abcdef\nghijklm"));
    }

    @Test
    void testRemoveVowels_someVowels() {
        assertEquals("fdcb", RemoveVowels.removeVowels("fedcba"));
    }

    @Test
    void testRemoveVowels_someVowelsMixedCase() {
        assertEquals("cB", RemoveVowels.removeVowels("acBAA"));
    }

    @Test
    void testRemoveVowels_someVowelsMixedCase2() {
        assertEquals("cB", RemoveVowels.removeVowels("EcBOO"));
    }

    @Test
    void testRemoveVowels_noVowels2() {
        assertEquals("ybcd", RemoveVowels.removeVowels("ybcd"));
    }

    @Test
    void testRemoveVowels_allVowels2() {
        assertEquals("", RemoveVowels.removeVowels("eeeee"));
    }
}
```
