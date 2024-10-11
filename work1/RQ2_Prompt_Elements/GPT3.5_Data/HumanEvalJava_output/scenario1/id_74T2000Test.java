// TotalMatchTest.java
package scenario1;

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
    void testEmptyLists() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = new ArrayList<>();
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertTrue(result.isEmpty());
    }

    @Test
    void testOneEmptyList() {
        List<Object> lst1 = new ArrayList<>();
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testEqualLengthStringLists() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("foo", "bar");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testDifferentLengthStringLists() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("foo", "bar", "baz");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testMixedLists() {
        List<Object> lst1 = Arrays.asList("hello", 42, "world");
        List<Object> lst2 = Arrays.asList("foo", "bar", 3.14);
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }

    @Test
    void testOnlyNumbers() {
        List<Object> lst1 = Arrays.asList(1, 2, 3);
        List<Object> lst2 = Arrays.asList(4, 5, 6);
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testOnlyStrings() {
        List<Object> lst1 = Arrays.asList("hello", "world");
        List<Object> lst2 = Arrays.asList("foo", "bar");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testOnlyBooleans() {
        List<Object> lst1 = Arrays.asList(true, false);
        List<Object> lst2 = Arrays.asList(false, true);
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }

    @Test
    void testNullLists() {
        List<Object> lst1 = null;
        List<Object> lst2 = null;
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertNull(result);
    }

    @Test
    void testNullAndNonNullLists() {
        List<Object> lst1 = null;
        List<Object> lst2 = Arrays.asList("hello", "world");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
}