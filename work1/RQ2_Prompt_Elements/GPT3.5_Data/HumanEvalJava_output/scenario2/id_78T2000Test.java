// HexKeyTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HexKey}.
 * It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
 */
class HexKeyTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HexKey.hexKey(""));
    }

    @Test
    void testNoPrimes() {
        assertEquals(0, HexKey.hexKey("0123456789ABCDEF"));
    }

    @Test
    void testOnePrime() {
        assertEquals(1, HexKey.hexKey("2"));
    }

    @Test
    void testTwoPrimes() {
        assertEquals(2, HexKey.hexKey("23"));
    }

    @Test
    void testThreePrimes() {
        assertEquals(3, HexKey.hexKey("235"));
    }

    @Test
    void testFourPrimes() {
        assertEquals(4, HexKey.hexKey("2357"));
    }

    @Test
    void testFivePrimes() {
        assertEquals(5, HexKey.hexKey("2357B"));
    }

    @Test
    void testSixPrimes() {
        assertEquals(6, HexKey.hexKey("2357BD"));
    }

    @Test
    void testUpperCase() {
        assertEquals(6, HexKey.hexKey("2357BDCEF"));
    }

    @Test
    void testLowerCase() {
        assertEquals(6, HexKey.hexKey("2357bdcf"));
    }
}