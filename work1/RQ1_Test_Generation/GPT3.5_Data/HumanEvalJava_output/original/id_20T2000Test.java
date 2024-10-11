```java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestElementsTest {

    @Test
    void testFindClosestElements_case1() {
        List<Double> input = new ArrayList<>(List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2));
        List<Double> expected = List.of(3.9, 4.0);
        assertEquals(expected, FindClosestElements.findClosestElements(input));
    }

    @Test
    void testFindClosestElements_case2() {
        List<Double> input = new ArrayList<>(List.of(1.0, 2.0, 5.9, 4.0, 5.0));
        List<Double> expected = List.of(5.0, 5.9);
        assertEquals(expected, FindClosestElements.findClosestElements(input));
    }

    @Test
    void testFindClosestElements_case3() {
        List<Double> input = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2));
        List<Double> expected = List.of(2.0, 2.2);
        assertEquals(expected, FindClosestElements.findClosestElements(input));
    }

    @Test
    void testFindClosestElements_case4() {
        List<Double> input = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0));
        List<Double> expected = List.of(2.0, 2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(input));
    }

    @Test
    void testFindClosestElements_case5() {
        List<Double> input = new ArrayList<>(List.of(1.1, 2.2, 3.1, 4.1, 5.1));
        List<Double> expected = List.of(2.2, 3.1);
        assertEquals(expected, FindClosestElements.findClosestElements(input));
    }
}
```
```