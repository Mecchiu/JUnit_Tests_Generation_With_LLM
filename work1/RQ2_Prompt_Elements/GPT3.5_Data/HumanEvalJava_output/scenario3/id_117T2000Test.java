// SelectWords.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SelectWords {

    /**
     * Given a string s and a natural number n, you have been tasked to implement
     * a function that returns a list of all words from string s that contain exactly
     * n consonants, in order these words appear in the string s.
     * If the string s is empty then the function should return an empty list.
     * Note: you may assume the input string contains only letters and spaces.
     * Examples:
     * selectWords("Mary had a little lamb", 4) ==> ["little"]
     * selectWords("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
     * selectWords("simple white space", 2) ==> []
     * selectWords("Hello world", 4) ==> ["world"]
     * selectWords("Uncle sam", 3) ==> ["Uncle"]
     *
     * > selectWords("Mary had a little lamb", 4)
     * ["little"]
     * > selectWords("Mary had a little lamb", 3)
     * ["Mary", "lamb"]
     * > selectWords("simple white space", 2)
     * []
     * > selectWords("Hello world", 4)
     * ["world"]
     * > selectWords("Uncle sam", 3)
     * ["Uncle"]
     * > selectWords("", 4)
     * []
     * > selectWords("a b c d e f", 1)
     * ["b", "c", "d", "f"]
     */
    public static List<String> selectWords(String s, int n) {
        List<String> result = new ArrayList<>();
        if (s.isEmpty()) {
            return result;
        }
        String[] words = s.split(" ");
        for (String word : words) {
            int consonantCount = 0;
            for (char c : word.toCharArray()) {
                if (isConsonant(c)) {
                    consonantCount++;
                }
            }
            if (consonantCount == n) {
                result.add(word);
            }
        }
        return result;
    }

    private static boolean isConsonant(char c) {
        return !Arrays.asList('a', 'e', 'i', 'o', 'u').contains(Character.toLowerCase(c)) && Character.isLetter(c);
    }
}

// SelectWordsTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains ten unit test cases for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

    @Test
    void testSelectWordsWithValidInput() {
        List<String> expected = Arrays.asList("little");
        List<String> actual = SelectWords.selectWords("Mary had a little lamb", 4);
        assertEquals(expected, actual);

        expected = Arrays.asList("Mary", "lamb");
        actual = SelectWords.selectWords("Mary had a little lamb", 3);
        assertEquals(expected, actual);

        expected = Arrays.asList();
        actual = SelectWords.selectWords("simple white space", 2);
        assertEquals(expected, actual);

        expected = Arrays.asList("world");
        actual = SelectWords.selectWords("Hello world", 4);
        assertEquals(expected, actual);

        expected = Arrays.asList("Uncle");
        actual = SelectWords.selectWords("Uncle sam", 3);
        assertEquals(expected, actual);

        expected = Arrays.asList("b", "c", "d", "f");
        actual = SelectWords.selectWords("a b c d e f", 1);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWordsWithEmptyString() {
        List<String> expected = Arrays.asList();
        List<String> actual = SelectWords.selectWords("", 4);
        assertEquals(expected, actual);
    }
}