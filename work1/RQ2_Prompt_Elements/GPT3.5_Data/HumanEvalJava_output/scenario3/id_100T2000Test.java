// MakeAPile.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class MakeAPile {

    /**
     * * Given a positive integer n, you have to make a pile of n levels of stones.
     * The first level has n stones.
     * The number of stones in the next level is:
     * - the next odd number if n is odd.
     * - the next even number if n is even.
     * Return the number of stones in each level in a list, where element at index
     * i represents the number of stones in the level (i+1).
     *
     * Examples:
     * >>> makeAPile(3)
     * [3, 5, 7]
     *
     * > makeAPile(3)
     * [3, 5, 7]
     * > makeAPile(4)
     * [4, 6, 8, 10]
     * > makeAPile(5)
     * [5, 7, 9, 11, 13]
     * > makeAPile(6)
     * [6, 8, 10, 12, 14, 16]
     * > makeAPile(8)
     * [8, 10, 12, 14, 16, 18, 20, 22]
     */
    public static List<Integer> makeAPile(int n) {
        List<Integer> pile = new ArrayList<>();
        int stones = n;
        pile.add(stones);
        for (int i = 2; i <= n; i++) {
            if (n % 2 == 0) {
                stones += 2;
            } else {
                stones += 1;
            }
            pile.add(stones);
        }
        return pile;
    }
}

// MakeAPileTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {
    
    @Test
    void testMakeAPileWithThree() {
        List<Integer> expected = Arrays.asList(3, 5, 7);
        List<Integer> actual = MakeAPile.makeAPile(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFour() {
        List<Integer> expected = Arrays.asList(4, 6, 8, 10);
        List<Integer> actual = MakeAPile.makeAPile(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFive() {
        List<Integer> expected = Arrays.asList(5, 7, 9, 11, 13);
        List<Integer> actual = MakeAPile.makeAPile(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithSix() {
        List<Integer> expected = Arrays.asList(6, 8, 10, 12, 14, 16);
        List<Integer> actual = MakeAPile.makeAPile(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithEight() {
        List<Integer> expected = Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22);
        List<Integer> actual = MakeAPile.makeAPile(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithOne() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = MakeAPile.makeAPile(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithZero() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = MakeAPile.makeAPile(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            MakeAPile.makeAPile(-1);
        });
    }
    
    @Test
    void testMakeAPileWithLargeNumber() {
        List<Integer> expected = Arrays.asList(1000000001, 1000000003, 1000000005, 1000000007, 1000000009, 1000000011, 1000000013, 1000000015, 1000000017, 1000000019, 1000000021, 1000000023, 1000000025, 1000000027, 1000000029, 1000000031, 1000000033, 1000000035, 1000000037, 1000000039, 1000000041, 1000000043, 1000000045, 1000000047, 1000000049, 1000000051, 1000000053, 1000000055, 1000000057, 1000000059, 1000000061, 1000000063, 1000000065, 1000000067, 1000000069, 1000000071, 1000000073, 1000000075, 1000000077, 1000000079, 1000000081, 1000000083, 1000000085, 1000000087, 1000000089, 1000000091, 1000000093, 1000000095, 1000000097, 1000000099, 1000000101, 1000000103, 1000000105, 1000000107, 1000000109, 1000000111, 1000000113, 1000000115, 1000000117, 1000000119, 1000000121, 1000000123, 1000000125, 1000000127, 1000000129, 1000000131, 1000000133, 1000000135, 1000000137, 1000000139, 1000000141, 1000000143, 1000000145, 1000000147, 1000000149, 1000000151, 1000000153, 1000000155, 1000000157, 1000000159, 1000000161, 1000000163, 1000000165, 1000000167, 1000000169, 1000000171, 1000000173, 1000000175, 1000000177, 1000000179, 1000000181, 1000000183, 1000000185, 1000000187, 1000000189, 1000000191, 1000000193, 1000000195, 1000000197, 1000000199, 1000000201, 1000000203, 1000000205, 1000000207, 1000000209, 1000000211, 1000000213, 1000000215, 1000000217, 1000000219, 1000000221, 1000000223, 1000000225, 1000000227, 1000000229, 1000000231, 1000000233, 1000000235, 1000000237, 1000000239, 1000000241, 1000000243, 1000000245, 1000000247, 1000000249, 1000000251, 1000000253, 1000000255, 1000000257, 1000000259, 1000000261, 1000000263, 1000000265, 1000000267, 1000000269, 1000000271, 1000000273, 1000000275, 1000000277, 1000000279, 1000000281, 1000000283, 1000000285, 1000000287, 1000000289, 1000000291, 1000000293, 1000000295, 1000000297, 1000000299, 1000000301, 1000000303, 1000000305, 1000000307, 1000000309, 1000000311, 1000000313, 1000000315, 1000000317, 1000000319, 1000000321, 1000000323, 1000000325, 1000000327, 1000000329, 1000000331, 1000000333, 1000000335, 1000000337, 1000000339, 1000000341, 1000000343, 1000000345, 1000000347, 1000000349, 1000000351, 1000000353, 1000000355, 100000