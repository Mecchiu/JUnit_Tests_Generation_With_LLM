Here's the source code for the CommonTest class with ten unit test cases for the common() method:

```
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Common}.
 * It contains ten unit test cases for the {@link Common#common(List, List)} method.
 */
class CommonTest {

    @Test
    void testCommonWithTwoNonEmptyLists() {
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = Arrays.asList(1, 5, 653);
        List<Object> actual = Common.common(l1, l2);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingDuplicates() {
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2);
        List<Object> expected = Arrays.asList(2, 3);
        List<Object> actual = Common.common(l1, l2);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingAllElementsInCommon() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2, 4);
        List<Object> expected = Arrays.asList(2, 3, 4);
        List<Object> actual = Common.common(l1, l2);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneEmptyList() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoEmptyLists() {
        List<Integer> l1 = Collections.emptyList();
        List<Object> l2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneListContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Object> l2 = Arrays.asList(null, 2, 3);
        List<Object> expected = Arrays.asList(2, 3);
        List<Object> actual = Common.common(l1, l2);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingNull() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, null);
        List<Object> l2 = Arrays.asList(null, 2, 3);
        List<Object> expected = Arrays.asList(2, 3, null);
        List<Object> actual = Common.common(l1, l2);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithOneListContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Object> l2 = Arrays.asList(1, 2, 3);
        List<Object> expected = Collections.emptyList();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingOnlyNull() {
        List<Integer> l1 = Arrays.asList(null, null, null);
        List<Object> l2 = Arrays.asList(null, null, null);
        List<Object> expected = Collections.emptyList();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void testCommonWithTwoListsContainingDifferentTypes() {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Object> l2 = Arrays.asList("1", "2", "3");
        List<Object> expected = Collections.emptyList();
        List<Object> actual = Common.common(l1, l2);
        assertEquals(expected, actual);
    }
}
```