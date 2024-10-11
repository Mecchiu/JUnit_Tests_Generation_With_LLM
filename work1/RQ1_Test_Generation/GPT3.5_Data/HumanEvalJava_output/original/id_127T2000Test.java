```java
package original;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void testIntersection1() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(2, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection2() {
        List<Integer> interval1 = Arrays.asList(-1, 1);
        List<Integer> interval2 = Arrays.asList(0, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection3() {
        List<Integer> interval1 = Arrays.asList(-3, -1);
        List<Integer> interval2 = Arrays.asList(-5, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection4() {
        List<Integer> interval1 = Arrays.asList(-2, 2);
        List<Integer> interval2 = Arrays.asList(-4, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection5() {
        List<Integer> interval1 = Arrays.asList(-11, 2);
        List<Integer> interval2 = Arrays.asList(-1, -1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection6() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(3, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection7() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(1, 2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection8() {
        List<Integer> interval1 = Arrays.asList(-2, -2);
        List<Integer> interval2 = Arrays.asList(-3, -2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}
```
