// IntersectionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
			// Test case 1
    @Test
    void testIntersection1() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(2, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    // Test case 2
    @Test
    void testIntersection2() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(3, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    // Test case 3
    @Test
    void testIntersection3() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(2, 3);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    // Test case 4
    @Test
    void testIntersection4() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(1, 3);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    // Test case 5
    @Test
    void testIntersection5() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(2, 2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    // Test case 6
    @Test
    void testIntersection6() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(3, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    // Test case 7
    @Test
    void testIntersection7() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(4, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    // Test case 8
    @Test
    void testIntersection8() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(1, 2);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    // Test case 9
    @Test
    void testIntersection9() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(2, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    // Test case 10
    @Test
    void testIntersection10() {
        List<Integer> interval1 = List.of(1, 3);
        List<Integer> interval2 = List.of(1, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
}