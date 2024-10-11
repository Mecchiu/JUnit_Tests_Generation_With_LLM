// SimplifyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {
			// Test case 1
    @Test
    void testSimplify1() {
        String x = "1/2";
        String n = "2/4";
        Boolean result = Simplify.simplify(x, n);
        assertTrue(result);
    }
			// Test case 2
    @Test
    void testSimplify2() {
        String x = "1/2";
        String n = "3/4";
        Boolean result = Simplify.simplify(x, n);
        assertFalse(result);
    }
			// Test case 3
    @Test
    void testSimplify3() {
        String x = "1/2";
        String n = "4/8";
        Boolean result = Simplify.simplify(x, n);
        assertTrue(result);
    }
			// Test case 4
    @Test
    void testSimplify4() {
        String x = "1/2";
        String n = "5/8";
        Boolean result = Simplify.simplify(x, n);
        assertFalse(result);
    }
			// Test case 5
    @Test
    void testSimplify5() {
        String x = "1/2";
        String n = "6/8";
        Boolean result = Simplify.simplify(x, n);
        assertTrue(result);
    }
			// Test case 6
    @Test
    void testSimplify6() {
        String x = "1/2";
        String n = "7/8";
        Boolean result = Simplify.simplify(x, n);
        assertFalse(result);
    }
			// Test case 7
    @Test
    void testSimplify7() {
        String x = "1/2";
        String n = "8/8";
        Boolean result = Simplify.simplify(x, n);
        assertTrue(result);
    }
			// Test case 8
    @Test
    void testSimplify8() {
        String x = "1/2";
        String n = "9/8";
        Boolean result = Simplify.simplify(x, n);
        assertFalse(result);
    }
			// Test case 9
    @Test
    void testSimplify9() {
        String x = "1/2";
        String n = "10/8";
        Boolean result = Simplify.simplify(x, n);
        assertTrue(result);
    }
			// Test case 10
    @Test
    void testSimplify10() {
        String x = "1/2";
        String n = "11/8";
        Boolean result = Simplify.simplify(x, n);
        assertFalse(result);
    }
}