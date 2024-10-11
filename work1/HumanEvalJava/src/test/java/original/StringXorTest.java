// StringXorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
			// Test case 1: Both strings are empty
    @Test
    void testStringXor1() {
        String a = "";
        String b = "";
        String expected = "";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 2: Both strings have length 1
    @Test
    void testStringXor2() {
        String a = "1";
        String b = "0";
        String expected = "1";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 3: Both strings have length 2
    @Test
    void testStringXor3() {
        String a = "01";
        String b = "10";
        String expected = "11";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 4: Both strings have length 3
    @Test
    void testStringXor4() {
        String a = "010";
        String b = "110";
        String expected = "100";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 5: Both strings have length 4
    @Test
    void testStringXor5() {
        String a = "0101";
        String b = "0000";
        String expected = "0101";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 6: Both strings have length 5
    @Test
    void testStringXor6() {
        String a = "11100";
        String b = "10101";
        String expected = "01001";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 7: Both strings have length 6
    @Test
    void testStringXor7() {
        String a = "111000";
        String b = "101010";
        String expected = "010010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 8: Both strings have length 7
    @Test
    void testStringXor8() {
        String a = "1110000";
        String b = "1010101";
        String expected = "0100101";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 9: Both strings have length 8
    @Test
    void testStringXor9() {
        String a = "11100000";
        String b = "10101010";
        String expected = "01001010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 10: Both strings have length 9
    @Test
    void testStringXor10() {
        String a = "111000000";
        String b = "101010101";
        String expected = "010010101";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }
}