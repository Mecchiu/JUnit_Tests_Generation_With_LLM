// SortedListSum.java
package scenario2;

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
     */
    public static List<String> sortedListSum(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).length() % 2 == 0) {
                result.add(lst.get(i));
            }
        }
        Collections.sort(result, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        return result;
    }
}

// SortedListSumTest.java
package scenario2;

import java.util.ArrayList;
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
        List<String> lst = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithOneEvenWord() {
        List<String> lst = Arrays.asList("hello");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithOneOddWord() {
        List<String> lst = Arrays.asList("hi");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithMultipleWords() {
        List<String> lst = Arrays.asList("hello", "world", "java", "programming");
        List<String> expected = Arrays.asList("java", "world");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithDuplicateWords() {
        List<String> lst = Arrays.asList("hello", "world", "java", "programming", "java");
        List<String> expected = Arrays.asList("java", "java", "world");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithAllOddWords() {
        List<String> lst = Arrays.asList("hi", "bye", "java", "python");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithAllEvenWords() {
        List<String> lst = Arrays.asList("hello", "world", "java", "programming");
        List<String> expected = Arrays.asList("java", "world");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithAllWordsSameLength() {
        List<String> lst = Arrays.asList("cat", "dog", "bat", "rat");
        List<String> expected = Arrays.asList("bat", "cat", "dog", "rat");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithAllWordsSameLengthAndDuplicates() {
        List<String> lst = Arrays.asList("cat", "dog", "bat", "rat", "cat", "dog");
        List<String> expected = Arrays.asList("bat", "cat", "cat", "dog", "dog", "rat");
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
    
    @Test
    void testListWithAllWordsSameLengthAndAllOdd() {
        List<String> lst = Arrays.asList("hi", "bye", "why", "cry");
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, SortedListSum.sortedListSum(lst));
    }
}