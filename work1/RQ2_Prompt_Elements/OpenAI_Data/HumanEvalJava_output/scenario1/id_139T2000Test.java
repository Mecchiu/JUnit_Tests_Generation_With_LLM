// SpecialFactorialTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SpecialFactorial}.
* It contains ten unit test cases for the {@link SpecialFactorial#specialFactorial(int)} method.
*/
class SpecialFactorialTest {
	// Test case 1
    @Test
    void testSpecialFactorial1() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }

    // Test case 2
    @Test
    void testSpecialFactorial2() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    // Test case 3
    @Test
    void testSpecialFactorial3() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }

    // Test case 4
    @Test
    void testSpecialFactorial4() {
        assertEquals(12, SpecialFactorial.specialFactorial(3));
    }

    // Test case 5
    @Test
    void testSpecialFactorial5() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }

    // Test case 6
    @Test
    void testSpecialFactorial6() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }

    // Test case 7
    @Test
    void testSpecialFactorial7() {
        assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    }

    // Test case 8
    @Test
    void testSpecialFactorial8() {
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
    }

    // Test case 9
    @Test
    void testSpecialFactorial9() {
        assertEquals(5_056_896_000_000L, SpecialFactorial.specialFactorial(8));
    }

    // Test case 10
    @Test
    void testSpecialFactorial10() {
        assertEquals(1_551_121_004_032_000L, SpecialFactorial.specialFactorial(9));
    }
}
