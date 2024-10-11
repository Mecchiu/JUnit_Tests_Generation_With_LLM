// RoundedAvg.java
package scenario1;

class RoundedAvg {

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
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
    
    @Test
    void testRoundedAvg1() {
        assertEquals("0b1", RoundedAvg.roundedAvg(1, 1));
    }
    
    @Test
    void testRoundedAvg2() {
        assertEquals("0b2", RoundedAvg.roundedAvg(1, 3));
    }
    
    @Test
    void testRoundedAvg3() {
        assertEquals("0b3", RoundedAvg.roundedAvg(1, 5));
    }
    
    @Test
    void testRoundedAvg4() {
        assertEquals("0b4", RoundedAvg.roundedAvg(1, 7));
    }
    
    @Test
    void testRoundedAvg5() {
        assertEquals("0b5", RoundedAvg.roundedAvg(1, 9));
    }
    
    @Test
    void testRoundedAvg6() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(3, 1));
    }
    
    @Test
    void testRoundedAvg7() {
        assertEquals("0b1", RoundedAvg.roundedAvg(-1, 1));
    }
    
    @Test
    void testRoundedAvg8() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(1, -1));
    }
    
    @Test
    void testRoundedAvg9() {
        assertEquals("0b0", RoundedAvg.roundedAvg(0, 0));
    }
    
    @Test
    void testRoundedAvg10() {
        assertEquals("0b-1", RoundedAvg.roundedAvg(-1, -3));
    }
}