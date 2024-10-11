// DigitsumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {
			// Test case 1
    @Test
    void testDigitSum1() {
        int result = Digitsum.digitSum("Hello");
        assertEquals(372, result);
    }

    // Test case 2
    @Test
    void testDigitSum2() {
        int result = Digitsum.digitSum("Hello World");
        assertEquals(832, result);
    }

    // Test case 3
    @Test
    void testDigitSum3() {
        int result = Digitsum.digitSum("Hello World!");
        assertEquals(832, result);
    }

    // Test case 4
    @Test
    void testDigitSum4() {
        int result = Digitsum.digitSum("Hello World!!");
        assertEquals(832, result);
    }

    // Test case 5
    @Test
    void testDigitSum5() {
        int result = Digitsum.digitSum("Hello World!!!");
        assertEquals(832, result);
    }

    // Test case 6
    @Test
    void testDigitSum6() {
        int result = Digitsum.digitSum("Hello World!!!!");
        assertEquals(832, result);
    }

    // Test case 7
    @Test
    void testDigitSum7() {
        int result = Digitsum.digitSum("Hello World!!!!!");
        assertEquals(832, result);
    }

    // Test case 8
    @Test
    void testDigitSum8() {
        int result = Digitsum.digitSum("Hello World!!!!!!");
        assertEquals(832, result);
    }

    // Test case 9
    @Test
    void testDigitSum9() {
        int result = Digitsum.digitSum("Hello World!!!!!!!");
        assertEquals(832, result);
    }

    // Test case 10
    @Test
    void testDigitSum10() {
        int result = Digitsum.digitSum("Hello World!!!!!!!!");
        assertEquals(832, result);
    }
}