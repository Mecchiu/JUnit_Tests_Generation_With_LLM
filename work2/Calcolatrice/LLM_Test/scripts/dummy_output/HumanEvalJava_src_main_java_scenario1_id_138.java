// IsEqualToSumEvenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsEqualToSumEven}.
* It contains ten unit test cases for the {@link IsEqualToSumEven#isEqualToSumEven(int)} method.
*/
class IsEqualToSumEvenTest {
			// Test case 1: n = 0
    @Test
    void testIsEqualToSumEven1() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(0));
    }

    // Test case 2: n = 1
    @Test
    void testIsEqualToSumEven2() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(1));
    }

    // Test case 3: n = 2
    @Test
    void testIsEqualToSumEven3() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(2));
    }

    // Test case 4: n = 3
    @Test
    void testIsEqualToSumEven4() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(3));
    }

    // Test case 5: n = 4
    @Test
    void testIsEqualToSumEven5() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(4));
    }

    // Test case 6: n = 5
    @Test
    void testIsEqualToSumEven6() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(5));
    }

    // Test case 7: n = 6
    @Test
    void testIsEqualToSumEven7() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(6));
    }

    // Test case 8: n = 7
    @Test
    void testIsEqualToSumEven8() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(7));
    }

    // Test case 9: n = 8
    @Test
    void testIsEqualToSumEven9() {
        assertTrue(IsEqualToSumEven.isEqualToSumEven(8));
    }

    // Test case 10: n = 9
    @Test
    void testIsEqualToSumEven10() {
        assertFalse(IsEqualToSumEven.isEqualToSumEven(9));
    }
}