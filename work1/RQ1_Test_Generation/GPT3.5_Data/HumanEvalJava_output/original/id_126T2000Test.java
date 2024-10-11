```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSortedTest {

    @Test
    void testIsSortedWithSingleElement() {
        assertTrue(IsSorted.isSorted(List.of(5)));
    }

    @Test
    void testIsSortedWithSortedElements() {
        assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void testIsSortedWithUnsortedElements() {
        assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5)));
    }

    @Test
    void testIsSortedWithDuplicateElements() {
        assertFalse(IsSorted.isSorted(List.of(1, 2, 2, 2, 3, 4)));
    }

    @Test
    void testIsSortedWithAllUniqueElements() {
        assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6, 7)));
    }

    @Test
    void testIsSortedWithMixedElements() {
        assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5, 6, 7)));
    }

    @Test
    void testIsSortedWithEmptyList() {
        assertTrue(IsSorted.isSorted(List.of()));
    }

    @Test
    void testIsSortedWithSingleElementList() {
        assertTrue(IsSorted.isSorted(List.of(1)));
    }

    @Test
    void testIsSortedWithDescendingOrder() {
        assertFalse(IsSorted.isSorted(List.of(3, 2, 1)));
    }

    @Test
    void testIsSortedWithConsecutiveDuplicates() {
        assertFalse(IsSorted.isSorted(List.of(1, 2, 3, 3, 3, 4)));
    }
}
```
