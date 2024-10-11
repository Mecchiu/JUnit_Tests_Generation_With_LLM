// ChangeBaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {
	// Test case 1
    @Test
    void testChangeBase1() {
        assertEquals("0", ChangeBase.changeBase(0, 2));
    }

    // Test case 2
    @Test
    void testChangeBase2() {
        assertEquals("1", ChangeBase.changeBase(1, 2));
    }

    // Test case 3
    @Test
    void testChangeBase3() {
        assertEquals("10", ChangeBase.changeBase(2, 2));
    }

    // Test case 4
    @Test
    void testChangeBase4() {
        assertEquals("11", ChangeBase.changeBase(3, 2));
    }

    // Test case 5
    @Test
    void testChangeBase5() {
        assertEquals("100", ChangeBase.changeBase(4, 2));
    }

    // Test case 6
    @Test
    void testChangeBase6() {
        assertEquals("101", ChangeBase.changeBase(5, 2));
    }

    // Test case 7
    @Test
    void testChangeBase7() {
        assertEquals("110", ChangeBase.changeBase(6, 2));
    }

    // Test case 8
    @Test
    void testChangeBase8() {
        assertEquals("111", ChangeBase.changeBase(7, 2));
    }

    // Test case 9
    @Test
    void testChangeBase9() {
        assertEquals("1000", ChangeBase.changeBase(8, 2));
    }

    // Test case 10
    @Test
    void testChangeBase10() {
        assertEquals("1001", ChangeBase.changeBase(9, 2));
    }
}
