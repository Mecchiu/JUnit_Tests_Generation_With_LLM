// TotalMatch.java
package scenario3;

import java.util.List;

class TotalMatch {

    /**
     * * Write a function that accepts two lists of strings and returns the list that has
     * total number of chars in the all strings of the list less than the other list.
     *
     * if the two lists have the same number of chars, return the first list.
     *
     * Examples
     * total_match([], []) ➞ []
     * total_match(['hi', 'admin'], ['hI', 'Hi']) ➞ ['hI', 'Hi']
     * total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) ➞ ['hi', 'admin']
     * total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) ➞ ['hI', 'hi', 'hi']
     * total_match(['4'], ['1', '2', '3', '4', '5']) ➞ ['4']
     *
     * > totalMatch([], [])
     * []
     * > totalMatch(["hi", "admin"], ["hi", "hi"])
     * ["hi", "hi"]
     * > totalMatch(["hi", "admin"], ["hi", "hi", "admin", "project"])
     * ["hi", "admin"]
     * > totalMatch(["4"], ["1", "2", "3", "4", "5"])
     * ["4"]
     * > totalMatch(["hi", "admin"], ["hI", "Hi"])
     * ["hI", "Hi"]
     * > totalMatch(["hi", "admin"], ["hI", "hi", "hi"])
     * ["hI", "hi", "hi"]
     * > totalMatch(["hi", "admin"], ["hI", "hi", "hii"])
     * ["hi", "admin"]
     * > totalMatch([], ["this"])
     * []
     * > totalMatch(["this"], [])
     * []
     */
    public static List<String> totalMatch(List<String> lst1, List<String> lst2) {
        int totalChars1 = lst1.stream().mapToInt(String::length).sum();
        int totalChars2 = lst2.stream().mapToInt(String::length).sum();
        return totalChars1 <= totalChars2 ? lst1 : lst2;
    }
}

// TotalMatchTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
    
    @Test
    void testEmptyLists() {
        List<String> lst1 = Collections.emptyList();
        List<String> lst2 = Collections.emptyList();
        List<String> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testSameTotalChars() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hi", "hi");
        List<String> expected = Arrays.asList("hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testDifferentTotalChars() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hi", "hi", "admin", "project");
        List<String> expected = Arrays.asList("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testOneElementList() {
        List<String> lst1 = Arrays.asList("4");
        List<String> lst2 = Arrays.asList("1", "2", "3", "4", "5");
        List<String> expected = Arrays.asList("4");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testCaseInsensitive() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hI", "Hi");
        List<String> expected = Arrays.asList("hI", "Hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testLongerList() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hI", "hi", "hi");
        List<String> expected = Arrays.asList("hI", "hi", "hi");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testNoMatch() {
        List<String> lst1 = Arrays.asList("hi", "admin");
        List<String> lst2 = Arrays.asList("hI", "hi", "hii");
        List<String> expected = Arrays.asList("hi", "admin");
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testEmptyListAndNonEmptyList() {
        List<String> lst1 = Collections.emptyList();
        List<String> lst2 = Arrays.asList("this");
        List<String> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
    
    @Test
    void testNonEmptyListAndEmptyList() {
        List<String> lst1 = Arrays.asList("this");
        List<String> lst2 = Collections.emptyList();
        List<String> expected = Collections.emptyList();
        assertEquals(expected, TotalMatch.totalMatch(lst1, lst2));
    }
}