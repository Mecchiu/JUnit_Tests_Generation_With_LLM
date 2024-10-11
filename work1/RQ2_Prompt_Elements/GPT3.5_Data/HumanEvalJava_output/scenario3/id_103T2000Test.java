// RoundedAvg.java
package scenario3;

class RoundedAvg {

    /**
     * You are given two positive integers n and m, and your task is to compute the
     * average of the integers from n through m (including n and m).
     * Round the answer to the nearest integer and convert that to binary.
     * If n is greater than m, return -1.
     * Example:
     * roundedAvg(1, 5) => "0b11"
     * roundedAvg(7, 5) => -1
     * roundedAvg(10, 20) => "0b1111"
     * roundedAvg(20, 33) => "0b11010"
     *
     * > roundedAvg(1, 5)
     * "0b11"
     * > roundedAvg(7, 13)
     * "0b1010"
     * > roundedAvg(964, 977)
     * "0b1111001010"
     * > roundedAvg(996, 997)
     * "0b1111100100"
     * > roundedAvg(560, 851)
     * "0b1011000010"
     * > roundedAvg(185, 546)
     * "0b101101110"
     * > roundedAvg(362, 496)
     * "0b110101101"
     * > roundedAvg(350, 902)
     * "0b1001110010"
     * > roundedAvg(197, 233)
     * "0b11010111"
     * > roundedAvg(7, 5)
     * -1
     * > roundedAvg(5, 1)
     * -1
     * > roundedAvg(5, 5)
     * "0b101"
     */
    public static Object roundedAvg(int n, int m) {
        if (n > m) {
            return -1;
        }
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        int avg = Math.round((float) sum / (m - n + 1));
        return Integer.toBinaryString(avg);
    }
}

// RoundedAvgTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
    @Test
    void testRoundedAvg1() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
    }

    @Test
    void testRoundedAvg2() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvg3() {
        assertEquals("0b1111", RoundedAvg.roundedAvg(10, 20));
    }

    @Test
    void testRoundedAvg4() {
        assertEquals("0b11010", RoundedAvg.roundedAvg(20, 33));
    }

    @Test
    void testRoundedAvg5() {
        assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
    }

    @Test
    void testRoundedAvg6() {
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
    }

    @Test
    void testRoundedAvg7() {
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
    }

    @Test
    void testRoundedAvg8() {
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
    }

    @Test
    void testRoundedAvg9() {
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
    }

    @Test
    void testRoundedAvg10() {
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
    }

    @Test
    void testRoundedAvg11() {
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
    }

    @Test
    void testRoundedAvg12() {
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
    }

    @Test
    void testRoundedAvg13() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    @Test
    void testRoundedAvg14() {
        assertEquals(-1, RoundedAvg.roundedAvg(5, 1));
    }

    @Test
    void testRoundedAvg15() {
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }
}