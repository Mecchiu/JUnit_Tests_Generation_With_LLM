// XOrYTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains ten unit test cases for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
	// Test case 1
    @Test
    void testXOrY1() {
        assertEquals(1, XOrY.xOrY(1, 1, 2));
    }

    // Test case 2
    @Test
    void testXOrY2() {
        assertEquals(2, XOrY.xOrY(2, 1, 2));
    }

    // Test case 3
    @Test
    void testXOrY3() {
        assertEquals(1, XOrY.xOrY(3, 1, 2));
    }

    // Test case 4
    @Test
    void testXOrY4() {
        assertEquals(2, XOrY.xOrY(4, 1, 2));
    }

    // Test case 5
    @Test
    void testXOrY5() {
        assertEquals(1, XOrY.xOrY(5, 1, 2));
    }

    // Test case 6
    @Test
    void testXOrY6() {
        assertEquals(2, XOrY.xOrY(6, 1, 2));
    }

    // Test case 7
    @Test
    void testXOrY7() {
        assertEquals(1, XOrY.xOrY(7, 1, 2));
    }

    // Test case 8
    @Test
    void testXOrY8() {
        assertEquals(2, XOrY.xOrY(8, 1, 2));
    }

    // Test case 9
    @Test
    void testXOrY9() {
        assertEquals(1, XOrY.xOrY(9, 1, 2));
    }

    // Test case 10
    @Test
    void testXOrY10() {
        assertEquals(2, XOrY.xOrY(10, 1, 2));
    }
}
