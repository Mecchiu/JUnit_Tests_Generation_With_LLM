// Intersection.java
package scenario3;

import java.util.List;

class Intersection {

    /**
     * You are given two intervals,
     * where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
     * The given intervals are closed which means that the interval (start, end)
     * includes both start and end.
     * For each given interval, it is assumed that its start is less or equal its end.
     * Your task is to determine whether the length of intersection of these two
     * intervals is a prime number.
     * Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
     * which its length is 1, which not a prime number.
     * If the length of the intersection is a prime number, return "YES",
     * otherwise, return "NO".
     * If the two intervals don't intersect, return "NO".
     *
     * [input/output] samples:
     * intersection((1, 2), (2, 3)) ==> "NO"
     * intersection((-1, 1), (0, 4)) ==> "NO"
     * intersection((-3, -1), (-5, 5)) ==> "YES"
     *
     * > intersection([1, 2], [2, 3])
     * "NO"
     * > intersection([-1, 1], [0, 4])
     * "NO"
     * > intersection([-3, -1], [-5, 5])
     * "YES"
     * > intersection([-2, 2], [-4, 0])
     * "YES"
     * > intersection([-11, 2], [-1, -1])
     * "NO"
     * > intersection([1, 2], [3, 5])
     * "NO"
     * > intersection([1, 2], [1, 2])
     * "NO"
     * > intersection([-2, -2], [-3, -2])
     * "NO"
     */
    public static String intersection(List<Integer> interval1, List<Integer> interval2) {
        int start1 = interval1.get(0);
        int end1 = interval1.get(1);
        int start2 = interval2.get(0);
        int end2 = interval2.get(1);

        if (end1 < start2 || end2 < start1) {
            return "NO";
        }

        int start = Math.max(start1, start2);
        int end = Math.min(end1, end2);
        int length = end - start + 1;

        if (length <= 1) {
            return "NO";
        }

        for (int i = 2; i <= Math.sqrt(length); i++) {
            if (length % i == 0) {
                return "NO";
            }
        }

        return "YES";
    }
}

// IntersectionTest.java
package scenario3;

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

    @Test
    void testIntersection9() {
        List<Integer> interval1 = Arrays.asList(0, 0);
        List<Integer> interval2 = Arrays.asList(0, 0);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test
    void testIntersection10() {
        List<Integer> interval1 = Arrays.asList(1, 10);
        List<Integer> interval2 = Arrays.asList(5, 15);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}