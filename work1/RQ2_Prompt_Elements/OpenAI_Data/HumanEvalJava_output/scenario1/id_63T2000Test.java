// FibfibTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fibfib}.
* It contains ten unit test cases for the {@link Fibfib#fibfib(int)} method.
*/
class FibfibTest {
	// Test case 1
    @Test
    void testFibfib1() {
        int n = 0;
        int expResult = 0;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testFibfib2() {
        int n = 1;
        int expResult = 0;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testFibfib3() {
        int n = 2;
        int expResult = 1;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testFibfib4() {
        int n = 3;
        int expResult = 1;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testFibfib5() {
        int n = 4;
        int expResult = 2;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testFibfib6() {
        int n = 5;
        int expResult = 4;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testFibfib7() {
        int n = 6;
        int expResult = 7;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testFibfib8() {
        int n = 7;
        int expResult = 13;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testFibfib9() {
        int n = 8;
        int expResult = 24;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testFibfib10() {
        int n = 9;
        int expResult = 44;
        int result = Fibfib.fibfib(n);
        assertEquals(expResult, result);
    }
}
