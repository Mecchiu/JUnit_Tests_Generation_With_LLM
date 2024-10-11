// StartsOneEnds.java
package scenario3;

class StartsOneEnds {

    /**
     * Given a positive integer n, return the count of the numbers of n-digit
     * positive integers that start or end with 1.
     *
     * > startsOneEnds(1)
     * 1
     * > startsOneEnds(2)
     * 18
     * > startsOneEnds(3)
     * 180
     * > startsOneEnds(4)
     * 1800
     * > startsOneEnds(5)
     * 18000
     */
    public static int startsOneEnds(int n) {
        int count = 0;
        if (n == 1) {
            count = 1;
        } else {
            count = 9 * (int) Math.pow(10, n - 2) * 2;
        }
        return count;
    }
}

// StartsOneEndsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {
    @Test
    void testStartsOneEnds1() {
        assertEquals(1, StartsOneEnds.startsOneEnds(1));
    }

    @Test
    void testStartsOneEnds2() {
        assertEquals(18, StartsOneEnds.startsOneEnds(2));
    }

    @Test
    void testStartsOneEnds3() {
        assertEquals(180, StartsOneEnds.startsOneEnds(3));
    }

    @Test
    void testStartsOneEnds4() {
        assertEquals(1800, StartsOneEnds.startsOneEnds(4));
    }

    @Test
    void testStartsOneEnds5() {
        assertEquals(18000, StartsOneEnds.startsOneEnds(5));
    }

    @Test
    void testStartsOneEnds6() {
        assertEquals(0, StartsOneEnds.startsOneEnds(0));
    }

    @Test
    void testStartsOneEnds7() {
        assertEquals(0, StartsOneEnds.startsOneEnds(-1));
    }

    @Test
    void testStartsOneEnds8() {
        assertEquals(2, StartsOneEnds.startsOneEnds(2));
    }

    @Test
    void testStartsOneEnds9() {
        assertEquals(20, StartsOneEnds.startsOneEnds(3));
    }

    @Test
    void testStartsOneEnds10() {
        assertEquals(200, StartsOneEnds.startsOneEnds(4));
    }
}