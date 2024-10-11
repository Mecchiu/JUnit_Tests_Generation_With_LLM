// PrimeFibTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
			// Test case 1
    @Test
    void testPrimeFib1() {
        int n = 1;
        int expected = 2;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 2
    @Test
    void testPrimeFib2() {
        int n = 2;
        int expected = 3;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 3
    @Test
    void testPrimeFib3() {
        int n = 3;
        int expected = 5;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 4
    @Test
    void testPrimeFib4() {
        int n = 4;
        int expected = 7;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testPrimeFib5() {
        int n = 5;
        int expected = 11;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testPrimeFib6() {
        int n = 6;
        int expected = 13;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testPrimeFib7() {
        int n = 7;
        int expected = 17;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testPrimeFib8() {
        int n = 8;
        int expected = 19;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testPrimeFib9() {
        int n = 9;
        int expected = 23;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testPrimeFib10() {
        int n = 10;
        int expected = 29;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
}