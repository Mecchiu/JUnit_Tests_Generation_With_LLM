// PrimeFibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
			// Test case 1
    @Test
    void primeFibTest1() {
        int n = 1;
        int expected = 2;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void primeFibTest2() {
        int n = 2;
        int expected = 3;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void primeFibTest3() {
        int n = 3;
        int expected = 5;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void primeFibTest4() {
        int n = 4;
        int expected = 13;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void primeFibTest5() {
        int n = 5;
        int expected = 89;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void primeFibTest6() {
        int n = 6;
        int expected = 233;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void primeFibTest7() {
        int n = 7;
        int expected = 1597;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void primeFibTest8() {
        int n = 8;
        int expected = 28657;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void primeFibTest9() {
        int n = 9;
        int expected = 514229;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void primeFibTest10() {
        int n = 10;
        int expected = 433494437;
        int actual = PrimeFib.primeFib(n);
        assertEquals(expected, actual);
    }
}