// FindMax.java
package scenario3;

import java.util.*;

class FindMax {

    /**
     * Write a function that accepts a list of strings.
     * The list contains different words. Return the word with maximum number
     * of unique characters. If multiple strings have maximum number of unique
     * characters, return the one which comes first in lexicographical order.
     *
     * findMax(["name", "of", "string"]) == "string"
     * findMax(["name", "enam", "game"]) == "enam"
     * findMax(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
     *
     * > findMax(["name", "of", "string"])
     * "string"
     * > findMax(["name", "enam", "game"])
     * "enam"
     * > findMax(["aaaaaaa", "bb", "cc"])
     * "aaaaaaa"
     * > findMax(["abc", "cba"])
     * "abc"
     * > findMax(["play", "this", "game", "of", "footbott"])
     * "footbott"
     * > findMax(["we", "are", "gonna", "rock"])
     * "gonna"
     * > findMax(["we", "are", "a", "mad", "nation"])
     * "nation"
     * > findMax(["this", "is", "a", "prrk"])
     * "this"
     * > findMax(["b"])
     * "b"
     * > findMax(["play", "play", "play"])
     * "play"
     */
    public static String findMax(List<String> words) {
        String maxWord = "";
        int maxUniqueChars = 0;
        for (String word : words) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }
            if (uniqueChars.size() > maxUniqueChars || (uniqueChars.size() == maxUniqueChars && word.compareTo(maxWord) < 0)) {
                maxWord = word;
                maxUniqueChars = uniqueChars.size();
            }
        }
        return maxWord;
    }
}

// FindMaxTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {
    
    @Test
    void testFindMax1() {
        List<String> words = Arrays.asList("name", "of", "string");
        String expected = "string";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax2() {
        List<String> words = Arrays.asList("name", "enam", "game");
        String expected = "enam";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax3() {
        List<String> words = Arrays.asList("aaaaaaa", "bb", "cc");
        String expected = "aaaaaaa";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax4() {
        List<String> words = Arrays.asList("abc", "cba");
        String expected = "abc";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax5() {
        List<String> words = Arrays.asList("play", "this", "game", "of", "footbott");
        String expected = "footbott";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax6() {
        List<String> words = Arrays.asList("we", "are", "gonna", "rock");
        String expected = "gonna";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax7() {
        List<String> words = Arrays.asList("we", "are", "a", "mad", "nation");
        String expected = "nation";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax8() {
        List<String> words = Arrays.asList("this", "is", "a", "prrk");
        String expected = "this";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax9() {
        List<String> words = Arrays.asList("b");
        String expected = "b";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFindMax10() {
        List<String> words = Arrays.asList("play", "play", "play");
        String expected = "play";
        String actual = FindMax.findMax(words);
        assertEquals(expected, actual);
    }
}