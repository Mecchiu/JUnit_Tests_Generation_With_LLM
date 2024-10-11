// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
			// Test case 1
    @Test
    void testHexKey1() {
        int result = HexKey.hexKey("123");
        assertEquals(0, result);
    }
			// Test case 2
    @Test
    void testHexKey2() {
        int result = HexKey.hexKey("2");
        assertEquals(1, result);
    }
			// Test case 3
    @Test
    void testHexKey3() {
        int result = HexKey.hexKey("3");
        assertEquals(1, result);
    }
			// Test case 4
    @Test
    void testHexKey4() {
        int result = HexKey.hexKey("5");
        assertEquals(1, result);
    }
			// Test case 5
    @Test
    void testHexKey5() {
        int result = HexKey.hexKey("7");
        assertEquals(1, result);
    }
			// Test case 6
    @Test
    void testHexKey6() {
        int result = HexKey.hexKey("B");
        assertEquals(1, result);
    }
			// Test case 7
    @Test
    void testHexKey7() {
        int result = HexKey.hexKey("D");
        assertEquals(1, result);
    }
			// Test case 8
    @Test
    void testHexKey8() {
        int result = HexKey.hexKey("1234567890ABCDEF");
        assertEquals(4, result);
    }
			// Test case 9
    @Test
    void testHexKey9() {
        int result = HexKey.hexKey("1234567890ABCDEF1234567890ABCDEF");
        assertEquals(8, result);
    }
			// Test case 10
    @Test
    void testHexKey10() {
        int result = HexKey.hexKey("1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF");
        assertEquals(16, result);
    }
}