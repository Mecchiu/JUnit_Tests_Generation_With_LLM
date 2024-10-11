// DigitsumTest.java
package scenario1;


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
        int result = Digitsum.digitSum("ABC");
        assertEquals(198, result);
    }
			// Test case 2
    @Test
    void testDigitSum2() {
        int result = Digitsum.digitSum("XYZ");
        assertEquals(264, result);
    }
			// Test case 3
    @Test
    void testDigitSum3() {
        int result = Digitsum.digitSum("ABCXYZ");
        assertEquals(462, result);
    }
			// Test case 4
    @Test
    void testDigitSum4() {
        int result = Digitsum.digitSum("abc");
        assertEquals(0, result);
    }
			// Test case 5
    @Test
    void testDigitSum5() {
        int result = Digitsum.digitSum("xyz");
        assertEquals(0, result);
    }
			// Test case 6
    @Test
    void testDigitSum6() {
        int result = Digitsum.digitSum("abcxyz");
        assertEquals(0, result);
    }
			// Test case 7
    @Test
    void testDigitSum7() {
        int result = Digitsum.digitSum("123");
        assertEquals(0, result);
    }
			// Test case 8
    @Test
    void testDigitSum8() {
        int result = Digitsum.digitSum("456");
        assertEquals(0, result);
    }
			// Test case 9
    @Test
    void testDigitSum9() {
        int result = Digitsum.digitSum("123456");
        assertEquals(0, result);
    }
			// Test case 10
    @Test
    void testDigitSum10() {
        int result = Digitsum.digitSum("");
        assertEquals(0, result);
    }
}