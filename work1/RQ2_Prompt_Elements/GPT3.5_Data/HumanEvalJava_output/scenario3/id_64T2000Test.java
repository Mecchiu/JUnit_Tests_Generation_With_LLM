// VowelsCount.java
package scenario3;

class VowelsCount {

    /**
     * Write a function vowels_count which takes a string representing
     * a word as input and returns the number of vowels in the string.
     * Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
     * vowel, but only when it is at the end of the given word.
     *
     * > vowelsCount("abcde")
     * 2
     * > vowelsCount("Alone")
     * 3
     * > vowelsCount("key")
     * 2
     * > vowelsCount("bye")
     * 1
     * > vowelsCount("keY")
     * 2
     * > vowelsCount("bYe")
     * 1
     * > vowelsCount("ACEDY")
     * 3
     */
    public static int vowelsCount(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            } else if (i == s.length() - 1 && c == 'y') {
                count++;
            }
        }
        return count;
    }
}

// VowelsCountTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
    @Test
    void testVowelsCount1() {
        assertEquals(2, VowelsCount.vowelsCount("abcde"));
    }

    @Test
    void testVowelsCount2() {
        assertEquals(3, VowelsCount.vowelsCount("Alone"));
    }

    @Test
    void testVowelsCount3() {
        assertEquals(2, VowelsCount.vowelsCount("key"));
    }

    @Test
    void testVowelsCount4() {
        assertEquals(1, VowelsCount.vowelsCount("bye"));
    }

    @Test
    void testVowelsCount5() {
        assertEquals(2, VowelsCount.vowelsCount("keY"));
    }

    @Test
    void testVowelsCount6() {
        assertEquals(1, VowelsCount.vowelsCount("bYe"));
    }

    @Test
    void testVowelsCount7() {
        assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
    }

    @Test
    void testVowelsCount8() {
        assertEquals(0, VowelsCount.vowelsCount(""));
    }

    @Test
    void testVowelsCount9() {
        assertEquals(0, VowelsCount.vowelsCount("xyz"));
    }

    @Test
    void testVowelsCount10() {
        assertEquals(1, VowelsCount.vowelsCount("y"));
    }
}