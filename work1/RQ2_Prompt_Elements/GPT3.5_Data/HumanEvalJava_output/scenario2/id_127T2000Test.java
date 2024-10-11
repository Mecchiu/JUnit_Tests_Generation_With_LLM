// IntersectionTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

    @Test
    void testIntersectionWithNoOverlap() {
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(4, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithOnePointOverlap() {
        List<Integer> interval1 = Arrays.asList(1, 3);
        List<Integer> interval2 = Arrays.asList(3, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithTwoPointOverlap() {
        List<Integer> interval1 = Arrays.asList(1, 4);
        List<Integer> interval2 = Arrays.asList(3, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithSameInterval() {
        List<Integer> interval1 = Arrays.asList(1, 4);
        List<Integer> interval2 = Arrays.asList(1, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithOneIntervalInsideAnother() {
        List<Integer> interval1 = Arrays.asList(1, 6);
        List<Integer> interval2 = Arrays.asList(2, 4);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithNegativeIntervals() {
        List<Integer> interval1 = Arrays.asList(-5, -2);
        List<Integer> interval2 = Arrays.asList(-3, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithPrimeLength() {
        List<Integer> interval1 = Arrays.asList(1, 7);
        List<Integer> interval2 = Arrays.asList(3, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithNonPrimeLength() {
        List<Integer> interval1 = Arrays.asList(1, 3);
        List<Integer> interval2 = Arrays.asList(2, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithSameStartAndEnd() {
        List<Integer> interval1 = Arrays.asList(1, 1);
        List<Integer> interval2 = Arrays.asList(1, 1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersectionWithLargeIntervals() {
        List<Integer> interval1 = Arrays.asList(1000000000, 1000000001);
        List<Integer> interval2 = Arrays.asList(1000000001, 1000000002);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }
}