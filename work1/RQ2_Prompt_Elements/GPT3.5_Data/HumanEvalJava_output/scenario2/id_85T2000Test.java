Here's the source code for the Add1Test class:

```
// Add1Test.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Add1}.
 * It contains ten unit test cases for the {@link Add1#add(List)} method.
 */
class Add1Test {

    @Test
    void testAddEmptyList() {
        List<Integer> lst = Arrays.asList();
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testAddNoEvenElements() {
        List<Integer> lst = Arrays.asList(1, 3, 5, 7, 9);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testAddOneEvenElementAtOddIndex() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        int result = Add1.add(lst);
        assertEquals(2, result);
    }

    @Test
    void testAddOneEvenElementAtEvenIndex() {
        List<Integer> lst = Arrays.asList(1, 3, 2, 4, 5);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testAddMultipleEvenElementsAtOddIndices() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = Add1.add(lst);
        assertEquals(12, result);
    }

    @Test
    void testAddMultipleEvenElementsAtEvenIndices() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testAddAllEvenElementsAtOddIndices() {
        List<Integer> lst = Arrays.asList(2, 4, 6, 8, 10);
        int result = Add1.add(lst);
        assertEquals(30, result);
    }

    @Test
    void testAddAllEvenElementsAtEvenIndices() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = Add1.add(lst);
        assertEquals(0, result);
    }

    @Test
    void testAddMixedElements() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = Add1.add(lst);
        assertEquals(12, result);
    }

    @Test
    void testAddDuplicateEvenElementsAtOddIndices() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 2, 5, 6, 7, 8, 9);
        int result = Add1.add(lst);
        assertEquals(16, result);
    }
}
```