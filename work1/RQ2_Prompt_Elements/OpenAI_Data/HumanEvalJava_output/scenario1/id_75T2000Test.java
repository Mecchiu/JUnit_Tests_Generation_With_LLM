// IsMultiplyPrimeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {
	// Test case 1: 2 * 3 * 5 = 30
    @Test
    void testIsMultiplyPrime1() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
    }

    // Test case 2: 2 * 3 * 7 = 42
    @Test
    void testIsMultiplyPrime2() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(42));
    }

    // Test case 3: 2 * 5 * 11 = 110
    @Test
    void testIsMultiplyPrime3() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(110));
    }

    // Test case 4: 2 * 3 * 3 * 5 = 90
    @Test
    void testIsMultiplyPrime4() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(90));
    }

    // Test case 5: 2 * 2 * 3 * 5 = 60
    @Test
    void testIsMultiplyPrime5() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(60));
    }

    // Test case 6: 2 * 2 * 2 * 3 * 3 = 72
    @Test
    void testIsMultiplyPrime6() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(72));
    }

    // Test case 7: 2 * 2 * 2 * 2 * 3 * 3 = 144
    @Test
    void testIsMultiplyPrime7() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(144));
    }

    // Test case 8: 2 * 2 * 2 * 2 * 2 * 3 * 3 = 288
    @Test
    void testIsMultiplyPrime8() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(288));
    }

    // Test case 9: 2 * 2 * 2 * 2 * 2 * 2 * 3 * 3 = 576
    @Test
    void testIsMultiplyPrime9() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(576));
    }

    // Test case 10: 2 * 2 * 2 * 2 * 2 * 2 * 2 * 3 * 3 = 1152
    @Test
    void testIsMultiplyPrime10() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(1152));
    }
}
