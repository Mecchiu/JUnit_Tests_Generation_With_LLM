// TotalMatchTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TotalMatch}.
 * It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
 */
class TotalMatchTest {

    @Test
    void testTotalMatchWithEmptyLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithOneEmptyList() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = Arrays.asList("abc", "def");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithEqualLengthLists() {
        List<Object> lst1 = Arrays.asList("abc", "def");
        List<Object> lst2 = Arrays.asList("ghi", "jkl");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithDifferentLengthLists() {
        List<Object> lst1 = Arrays.asList("abc", "def", "ghi");
        List<Object> lst2 = Arrays.asList("jkl", "mno");
        List<Object> expected = lst2;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingNonStringObjects() {
        List<Object> lst1 = Arrays.asList("abc", 123, "def");
        List<Object> lst2 = Arrays.asList("ghi", "jkl", 456);
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingNullValues() {
        List<Object> lst1 = Arrays.asList("abc", null, "def");
        List<Object> lst2 = Arrays.asList("ghi", "jkl", null);
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingEmptyStrings() {
        List<Object> lst1 = Arrays.asList("abc", "", "def");
        List<Object> lst2 = Arrays.asList("ghi", "jkl", "");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingWhitespaceStrings() {
        List<Object> lst1 = Arrays.asList("abc", "  ", "def");
        List<Object> lst2 = Arrays.asList("ghi", "jkl", " ");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingSpecialCharacters() {
        List<Object> lst1 = Arrays.asList("abc", "!@#", "def");
        List<Object> lst2 = Arrays.asList("ghi", "$%^", "&*(");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }

    @Test
    void testTotalMatchWithListsContainingUnicodeCharacters() {
        List<Object> lst1 = Arrays.asList("abc", "\u00E9", "def");
        List<Object> lst2 = Arrays.asList("ghi", "\u00F6", "\u00FC");
        List<Object> expected = lst1;
        List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(expected, actual);
    }
}