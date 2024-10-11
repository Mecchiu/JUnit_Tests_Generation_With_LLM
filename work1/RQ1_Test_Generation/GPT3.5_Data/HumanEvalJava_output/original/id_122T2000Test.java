```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddElementsTest {

    @Test
    void testAddElements_case1() {
        List<Integer> arr = List.of(1, -2, -3, 41, 57, 76, 87, 88, 99);
        int k = 3;
        assertEquals(-4, AddElements.addElements(arr, k));
    }

    @Test
    void testAddElements_case2() {
        List<Integer> arr = List.of(111, 121, 3, 4000, 5, 6);
        int k = 2;
        assertEquals(0, AddElements.addElements(arr, k));
    }

    @Test
    void testAddElements_case3() {
        List<Integer> arr = List.of(11, 21, 3, 90, 5, 6, 7, 8, 9);
        int k = 4;
        assertEquals(125, AddElements.addElements(arr, k));
    }

    @Test
    void testAddElements_case4() {
        List<Integer> arr = List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9);
        int k = 4;
        assertEquals(24, AddElements.addElements(arr, k));
    }

    @Test
    void testAddElements_case5() {
        List<Integer> arr = List.of(1);
        int k = 1;
        assertEquals(1, AddElements.addElements(arr, k));
    }
}
```
