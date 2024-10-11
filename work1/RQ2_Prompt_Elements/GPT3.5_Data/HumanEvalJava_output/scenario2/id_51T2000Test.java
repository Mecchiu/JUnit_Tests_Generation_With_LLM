// RemoveVowelsTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RemoveVowels}.
 * It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
 */
class RemoveVowelsTest {

    @Test
    void testRemoveVowelsWithEmptyString() {
        String result = RemoveVowels.removeVowels("");
        assertEquals("", result);
    }

    @Test
    void testRemoveVowelsWithOnlyVowels() {
        String result = RemoveVowels.removeVowels("aeiouAEIOU");
        assertEquals("", result);
    }

    @Test
    void testRemoveVowelsWithOnlyConsonants() {
        String result = RemoveVowels.removeVowels("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ");
        assertEquals("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ", result);
    }

    @Test
    void testRemoveVowelsWithMixedString() {
        String result = RemoveVowels.removeVowels("Hello World!");
        assertEquals("Hll Wrld!", result);
    }

    @Test
    void testRemoveVowelsWithNumbers() {
        String result = RemoveVowels.removeVowels("1234567890");
        assertEquals("1234567890", result);
    }

    @Test
    void testRemoveVowelsWithSpecialCharacters() {
        String result = RemoveVowels.removeVowels("!@#$%^&*()_+-=[]{}|;':\",./<>?");
        assertEquals("!@#$%^&*()_+-=[]{}|;':\",./<>?", result);
    }

    @Test
    void testRemoveVowelsWithWhitespace() {
        String result = RemoveVowels.removeVowels("   ");
        assertEquals("   ", result);
    }

    @Test
    void testRemoveVowelsWithNewline() {
        String result = RemoveVowels.removeVowels("\n");
        assertEquals("\n", result);
    }

    @Test
    void testRemoveVowelsWithTab() {
        String result = RemoveVowels.removeVowels("\t");
        assertEquals("\t", result);
    }

    @Test
    void testRemoveVowelsWithMixedStringAndWhitespace() {
        String result = RemoveVowels.removeVowels("The quick brown fox jumps over the lazy dog.");
        assertEquals("Th qck brwn fx jmps vr th lzy dg.", result);
    }
}