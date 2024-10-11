// MultiplyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains ten unit test cases for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {
			// Test case 1
    @Test
    void testMultiply1() {
        int result = Multiply.multiply(2, 3);
        assertEquals(6, result);
    }

    // Test case 2
    @Test
    void testMultiply2() {
        int result = Multiply.multiply(0, 3);
        assertEquals(0, result);
    }

    // Test case 3
    @Test
    void testMultiply3() {
        int result = Multiply.multiply(2, 0);
        assertEquals(0, result);
    }

    // Test case 4
    @Test
    void testMultiply4() {
        int result = Multiply.multiply(0, 0);
        assertEquals(0, result);
    }

    // Test case 5
    @Test
    void testMultiply5() {
        int result = Multiply.multiply(-2, 3);
        assertEquals(6, result);
    }

    // Test case 6
    @Test
    void testMultiply6() {
        int result = Multiply.multiply(2, -3);
        assertEquals(6, result);
    }

    // Test case 7
    @Test
    void testMultiply7() {
        int result = Multiply.multiply(-2, -3);
        assertEquals(6, result);
    }

    // Test case 8
    @Test
    void testMultiply8() {
        int result = Multiply.multiply(2, 11);
        assertEquals(2, result);
    }

    // Test case 9
    @Test
    void testMultiply9() {
        int result = Multiply.multiply(11, 2);
        assertEquals(2, result);
    }

    // Test case 10
    @Test
    void testMultiply10() {
        int result = Multiply.multiply(11, 11);
        assertEquals(1, result);
    }
}