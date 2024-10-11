// SortedListSum.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedListSum {

    /**
     * Write a function that accepts a list of strings as a parameter,
     * deletes the strings that have odd lengths from it,
     * and returns the resulted list with a sorted order,
     * The list is always a list of strings and never an array of numbers,
     * and it may contain duplicates.
     * The order of the list should be ascending by length of each word, and you
     * should return the list sorted by that rule.
     * If two words have the same length, sort the list alphabetically.
     * The function should return a list of strings in sorted order.
     * You may assume that all words will have the same length.
     * For example:
     * assert sortedListSum(["aa", "a", "aaa"]) => ["aa"]
     * assert sortedListSum(["ab", "a", "aaa", "cd"]) => ["ab", "cd"]
     *
     * > sortedListSum(["aa", "a", "aaa"])
     * ["aa"]
     * > sortedListSum(["school", "AI", "asdf", "b"])
     * ["AI", "asdf", "school"]
     * > sortedListSum(["d", "b", "c", "a"])
     * []
     * > sortedListSum(["d", "dcba", "abcd", "a"])
     * ["abcd", "dcba"]
     * > sortedListSum(["AI", "ai", "au"])
     * ["AI", "ai", "au"]
     * > sortedListSum(["a", "b", "b", "c", "c", "a"])
     * []
     * > sortedListSum(["aaaa", "bbbb", "dd", "cc"])
     * ["cc", "dd", "aaaa", "bbbb"]
     */
    public static List<String> sortedListSum(List<String> lst) {
        List<String> result = new ArrayList<>();
        for (String s : lst) {
            if (s.length() % 2 == 0) {
                result.add(s);
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        return result;
    }
}

// SortedListSumTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {
    @Test
    void testEmptyList() {
        List<String> lst = Arrays.asList();
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    @Test
    void testNoEvenLengthStrings() {
        List<String> lst = Arrays.asList("a", "bb", "ccc", "dddd");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    @Test
    void testOneEvenLengthString() {
        List<String> lst = Arrays.asList("aa", "a", "aaa");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(1, result.size());
        assertEquals("aa", result.get(0));
    }

    @Test
    void testMultipleEvenLengthStrings() {
        List<String> lst = Arrays.asList("ab", "a", "aaa", "cd");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(2, result.size());
        assertEquals("ab", result.get(0));
        assertEquals("cd", result.get(1));
    }

    @Test
    void testSameLengthDifferentStrings() {
        List<String> lst = Arrays.asList("d", "dcba", "abcd", "a");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(2, result.size());
        assertEquals("abcd", result.get(0));
        assertEquals("dcba", result.get(1));
    }

    @Test
    void testSameLengthSameStrings() {
        List<String> lst = Arrays.asList("AI", "ai", "au");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(3, result.size());
        assertEquals("AI", result.get(0));
        assertEquals("ai", result.get(1));
        assertEquals("au", result.get(2));
    }

    @Test
    void testDuplicateStrings() {
        List<String> lst = Arrays.asList("a", "b", "b", "c", "c", "a");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(0, result.size());
    }

    @Test
    void testLongerStrings() {
        List<String> lst = Arrays.asList("aaaa", "bbbb", "dd", "cc");
        List<String> result = SortedListSum.sortedListSum(lst);
        assertEquals(4, result.size());
        assertEquals("cc", result.get(0));
        assertEquals("dd", result.get(1));
        assertEquals("aaaa", result.get(2));
        assertEquals("bbbb", result.get(3));
    }
}