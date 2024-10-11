// RoundedAvgTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
			// Test case 1
    @Test
    void testRoundedAvg1() {
        assertEquals("0b100", RoundedAvg.roundedAvg(1, 3));
    }

    // Test case 2
    @Test
    void testRoundedAvg2() {
        assertEquals("0b101", RoundedAvg.roundedAvg(1, 4));
    }

    // Test case 3
    @Test
    void testRoundedAvg3() {
        assertEquals("0b110", RoundedAvg.roundedAvg(1, 5));
    }

    // Test case 4
    @Test
    void testRoundedAvg4() {
        assertEquals("0b111", RoundedAvg.roundedAvg(1, 6));
    }

    // Test case 5
    @Test
    void testRoundedAvg5() {
        assertEquals("0b1000", RoundedAvg.roundedAvg(1, 7));
    }

    // Test case 6
    @Test
    void testRoundedAvg6() {
        assertEquals("0b1001", RoundedAvg.roundedAvg(1, 8));
    }

    // Test case 7
    @Test
    void testRoundedAvg7() {
        assertEquals("0b1010", RoundedAvg.roundedAvg(1, 9));
    }

    // Test case 8
    @Test
    void testRoundedAvg8() {
        assertEquals("0b1011", RoundedAvg.roundedAvg(1, 10));
    }

    // Test case 9
    @Test
    void testRoundedAvg9() {
        assertEquals("0b1100", RoundedAvg.roundedAvg(1, 11));
    }

    // Test case 10
    @Test
    void testRoundedAvg10() {
        assertEquals("0b1101", RoundedAvg.roundedAvg(1, 12));
    }
}