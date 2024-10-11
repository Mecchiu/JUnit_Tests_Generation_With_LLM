// RoundedAvg.java
package scenario2;

class RoundedAvg {

    /**
     * You are given two positive integers n and m, and your task is to compute the
     * average of the integers from n through m (including n and m).
     * Round the answer to the nearest integer and convert that to binary.
     * If n is greater than m, return -1.
     */
    public static Object roundedAvg(int n, int m) {
        if (n > m) {
            return -1;
        }
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        double avg = (sum * 1.0) / (m - n + 1);
        int roundedAvg = (int) Math.rint(avg);
        return "0b" + Integer.toBinaryString(roundedAvg);
    }
}

// RoundedAvgTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
    
    @Test
    void testRoundedAvg1() {
        assertEquals("0b101", RoundedAvg.roundedAvg(1, 5));
    }
    
    @Test
    void testRoundedAvg2() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 3));
    }
    
    @Test
    void testRoundedAvg3() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(5, 1));
    }
    
    @Test
    void testRoundedAvg4() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 1));
    }
    
    @Test
    void testRoundedAvg5() {
        assertEquals("0b100", RoundedAvg.roundedAvg(90, 110));
    }
    
    @Test
    void testRoundedAvg6() {
        assertEquals("0b100", RoundedAvg.roundedAvg(95, 105));
    }
    
    @Test
    void testRoundedAvg7() {
        assertEquals("0b100", RoundedAvg.roundedAvg(100, 100));
    }
    
    @Test
    void testRoundedAvg8() {
        assertEquals("0b100000", RoundedAvg.roundedAvg(100000, 100000));
    }
    
    @Test
    void testRoundedAvg9() {
        assertEquals("0b100000", RoundedAvg.roundedAvg(99999, 100001));
    }
    
    @Test
    void testRoundedAvg10() {
        assertEquals("0b100000", RoundedAvg.roundedAvg(99998, 100002));
    }
}