```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_case1() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3, 2, 4));
        List<Object> expected = new ArrayList<>(List.of(1, 3, 4));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_case2() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_case3() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Object> expected = new ArrayList<>(List.of(1, 2, 3, 4));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_case4() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3, 2, 4, 3, 5));
        List<Object> expected = new ArrayList<>(List.of(1, 4, 5));
        assertEquals(expected, RemoveDuplicates.removeDuplicates(input));
    }

    // Add more test cases as needed
}
```
