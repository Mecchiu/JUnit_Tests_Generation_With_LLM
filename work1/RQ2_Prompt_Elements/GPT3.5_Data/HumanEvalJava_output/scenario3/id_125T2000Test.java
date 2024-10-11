// SplitWords.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class SplitWords {

    /**
     * * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
     * should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
     * alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
     * Examples
     * splitWords("Hello world!") ➞ ["Hello", "world!"]
     * splitWords("Hello,world!") ➞ ["Hello", "world!"]
     * splitWords("abcdef") == 3
     *
     * > splitWords("Hello world!")
     * ["Hello", "world!"]
     * > splitWords("Hello,world!")
     * ["Hello", "world!"]
     * > splitWords("Hello world,!")
     * ["Hello", "world,!"]
     * > splitWords("Hello,Hello,world !")
     * ["Hello,Hello,world", "!"]
     * > splitWords("abcdef")
     * 3
     * > splitWords("aaabb")
     * 2
     * > splitWords("aaaBb")
     * 1
     * > splitWords("")
     * 0
     */
    public static Object splitWords(String txt) {
        List<String> words = new ArrayList<>();
        if (txt.isEmpty()) {
            return 0;
        }
        if (txt.contains(" ")) {
            String[] split = txt.split(" ");
            for (String s : split) {
                words.add(s);
            }
        } else if (txt.contains(",")) {
            String[] split = txt.split(",");
            for (String s : split) {
                words.add(s);
            }
        } else {
            int count = 0;
            for (char c : txt.toCharArray()) {
                if (Character.isLowerCase(c) && ((int) c - 97) % 2 != 0) {
                    count++;
                }
            }
            return count;
        }
        return words;
    }
}

// SplitWordsTest.java
package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SplitWords}.
 * It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
 */
class SplitWordsTest {

    @Test
    void testSplitWords1() {
        assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello world!"));
    }

    @Test
    void testSplitWords2() {
        assertEquals(Arrays.asList("Hello", "world!"), SplitWords.splitWords("Hello,world!"));
    }

    @Test
    void testSplitWords3() {
        assertEquals(Arrays.asList("Hello", "world,!"), SplitWords.splitWords("Hello world,!"));
    }

    @Test
    void testSplitWords4() {
        assertEquals(Arrays.asList("Hello,Hello,world", "!"), SplitWords.splitWords("Hello,Hello,world !"));
    }

    @Test
    void testSplitWords5() {
        assertEquals(3, SplitWords.splitWords("abcdef"));
    }

    @Test
    void testSplitWords6() {
        assertEquals(2, SplitWords.splitWords("aaabb"));
    }

    @Test
    void testSplitWords7() {
        assertEquals(1, SplitWords.splitWords("aaaBb"));
    }

    @Test
    void testSplitWords8() {
        assertEquals(0, SplitWords.splitWords(""));
    }

    @Test
    void testSplitWords9() {
        assertEquals(Arrays.asList("Hello", "world", "this", "is", "a", "test"), SplitWords.splitWords("Hello world this is a test"));
    }

    @Test
    void testSplitWords10() {
        assertEquals(Arrays.asList("Hello", "world", "this", "is", "a", "test"), SplitWords.splitWords("Hello,world,this,is,a,test"));
    }
}