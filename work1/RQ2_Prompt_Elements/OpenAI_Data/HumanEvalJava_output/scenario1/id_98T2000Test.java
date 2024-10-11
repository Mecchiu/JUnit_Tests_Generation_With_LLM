// CountUpperTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
	// Test case 1
    @Test
    void testCountUpper1() {
        String s = "A";
        int result = CountUpper.countUpper(s);
        assertEquals(1, result);
    }
			// Test case 2
    @Test
    void testCountUpper2() {
        String s = "a";
        int result = CountUpper.countUpper(s);
        assertEquals(0, result);
    }
			// Test case 3
    @Test
    void testCountUpper3() {
        String s = "Aa";
        int result = CountUpper.countUpper(s);
        assertEquals(1, result);
    }
			// Test case 4
    @Test
    void testCountUpper4() {
        String s = "aA";
        int result = CountUpper.countUpper(s);
        assertEquals(0, result);
    }
			// Test case 5
    @Test
    void testCountUpper5() {
        String s = "AA";
        int result = CountUpper.countUpper(s);
        assertEquals(2, result);
    }
			// Test case 6
    @Test
    void testCountUpper6() {
        String s = "aa";
        int result = CountUpper.countUpper(s);
        assertEquals(0, result);
    }
			// Test case 7
    @Test
    void testCountUpper7() {
        String s = "AaA";
        int result = CountUpper.countUpper(s);
        assertEquals(2, result);
    }
			// Test case 8
    @Test
    void testCountUpper8() {
        String s = "aAa";
        int result = CountUpper.countUpper(s);
        assertEquals(0, result);
    }
			// Test case 9
    @Test
    void testCountUpper9() {
        String s = "AAa";
        int result = CountUpper.countUpper(s);
        assertEquals(1, result);
    }
			// Test case 10
    @Test
    void testCountUpper10() {
        String s = "aAA";
        int result = CountUpper.countUpper(s);
        assertEquals(0, result);
    }
}
