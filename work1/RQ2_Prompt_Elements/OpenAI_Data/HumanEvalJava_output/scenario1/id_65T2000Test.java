// CircularShiftTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains ten unit test cases for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
	// Test case 1
    @Test
    void testCircularShift1() {
        int x = 12345;
        int shift = 2;
        String expResult = "45123";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testCircularShift2() {
        int x = 12345;
        int shift = 3;
        String expResult = "34512";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testCircularShift3() {
        int x = 12345;
        int shift = 4;
        String expResult = "23451";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testCircularShift4() {
        int x = 12345;
        int shift = 5;
        String expResult = "12345";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testCircularShift5() {
        int x = 12345;
        int shift = 6;
        String expResult = "45123";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testCircularShift6() {
        int x = 12345;
        int shift = 7;
        String expResult = "34512";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testCircularShift7() {
        int x = 12345;
        int shift = 8;
        String expResult = "23451";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testCircularShift8() {
        int x = 12345;
        int shift = 9;
        String expResult = "12345";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testCircularShift9() {
        int x = 12345;
        int shift = 10;
        String expResult = "45123";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testCircularShift10() {
        int x = 12345;
        int shift = 11;
        String expResult = "34512";
        String result = CircularShift.circularShift(x, shift);
        assertEquals(expResult, result);
    }
}
