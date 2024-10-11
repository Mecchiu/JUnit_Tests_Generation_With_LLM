// IntersectionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
			// Test case 1: interval1 = [1, 10], interval2 = [5, 15]
    @Test
    void testIntersection1() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(5, 15);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 2: interval1 = [1, 10], interval2 = [11, 20]
    @Test
    void testIntersection2() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(11, 20);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("NO", result);
    }

    // Test case 3: interval1 = [1, 10], interval2 = [10, 20]
    @Test
    void testIntersection3() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(10, 20);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 4: interval1 = [1, 10], interval2 = [1, 10]
    @Test
    void testIntersection4() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(1, 10);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 5: interval1 = [1, 10], interval2 = [5, 10]
    @Test
    void testIntersection5() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(5, 10);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 6: interval1 = [1, 10], interval2 = [1, 5]
    @Test
    void testIntersection6() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(1, 5);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 7: interval1 = [1, 10], interval2 = [10, 15]
    @Test
    void testIntersection7() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(10, 15);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("YES", result);
    }

    // Test case 8: interval1 = [1, 10], interval2 = [15, 20]
    @Test
    void testIntersection8() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(15, 20);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("NO", result);
    }

    // Test case 9: interval1 = [1, 10], interval2 = [20, 25]
    @Test
    void testIntersection9() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(20, 25);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("NO", result);
    }

    // Test case 10: interval1 = [1, 10], interval2 = [25, 30]
    @Test
    void testIntersection10() {
        List<Integer> interval1 = List.of(1, 10);
        List<Integer> interval2 = List.of(25, 30);
        String result = Intersection.intersection(interval1, interval2);
        assertEquals("NO", result);
    }
}