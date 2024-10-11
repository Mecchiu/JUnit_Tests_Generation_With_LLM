// StringXorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
	// Test case 1
    @Test
    void stringXorTest1() {
        String a = "101010";
        String b = "010101";
        String expected = "111111";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void stringXorTest2() {
        String a = "000000";
        String b = "111111";
        String expected = "111111";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void stringXorTest3() {
        String a = "111111";
        String b = "000000";
        String expected = "111111";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void stringXorTest4() {
        String a = "111111";
        String b = "111111";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void stringXorTest5() {
        String a = "000000";
        String b = "000000";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void stringXorTest6() {
        String a = "101010";
        String b = "101010";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void stringXorTest7() {
        String a = "010101";
        String b = "010101";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void stringXorTest8() {
        String a = "111111";
        String b = "010101";
        String expected = "101010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void stringXorTest9() {
        String a = "010101";
        String b = "111111";
        String expected = "101010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void stringXorTest10() {
        String a = "101010";
        String b = "000000";
        String expected = "101010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }
}
