// Here's the source code for the DigitsumTest class with ten unit test cases for the digitSum method.

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsumTest {

    @Test
    void testEmptyString() {
        assertEquals(0, Digitsum.digitSum(""));
    }

    @Test
    void testSingleLetter() {
        assertEquals(65, Digitsum.digitSum("A"));
    }

    @Test
    void testLowerCaseLetter() {
        assertEquals(0, Digitsum.digitSum("a"));
    }

    @Test
    void testMultipleLetters() {
        assertEquals(195, Digitsum.digitSum("ABCdefGHI"));
    }

    @Test
    void testNumbers() {
        assertEquals(0, Digitsum.digitSum("123"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(0, Digitsum.digitSum("!@#$%^&*()"));
    }

    @Test
    void testMixedCharacters() {
        assertEquals(195, Digitsum.digitSum("ABC123def!@#GHI"));
    }

    @Test
    void testUnicodeCharacters() {
        assertEquals(195, Digitsum.digitSum("ABC\u00DFdef\u00D6GHI"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Digitsum.digitSum(null));
    }

    @Test
    void testPerformance() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Digitsum.digitSum(s);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue(duration < 1000);
    }
}