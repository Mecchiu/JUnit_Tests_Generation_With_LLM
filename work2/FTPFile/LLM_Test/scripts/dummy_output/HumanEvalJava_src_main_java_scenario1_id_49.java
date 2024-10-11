// ModpTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
			// Test case 1
    @Test
    void testModp1() {
        int n = 0;
        int p = 1;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testModp2() {
        int n = 1;
        int p = 1;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testModp3() {
        int n = 1;
        int p = 2;
        int expResult = 2;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testModp4() {
        int n = 2;
        int p = 1;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testModp5() {
        int n = 2;
        int p = 2;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testModp6() {
        int n = 2;
        int p = 3;
        int expResult = 4;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testModp7() {
        int n = 3;
        int p = 1;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testModp8() {
        int n = 3;
        int p = 2;
        int expResult = 0;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testModp9() {
        int n = 3;
        int p = 3;
        int expResult = 8;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testModp10() {
        int n = 4;
        int p = 3;
        int expResult = 2;
        int result = Modp.modp(n, p);
        assertEquals(expResult, result);
    }
}