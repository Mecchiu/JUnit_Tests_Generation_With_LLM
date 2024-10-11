// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
			// Test case 1
    @Test
    void testAntiShuffle1() {
        String input = "hello world";
        String expected = "ehllo dlorw";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testAntiShuffle2() {
        String input = "java is fun";
        String expected = "aajv is fnu";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testAntiShuffle3() {
        String input = "programming is awesome";
        String expected = "aggimmnoprr is aeemosw";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testAntiShuffle4() {
        String input = "I love programming";
        String expected = "I elov agimmnoprr";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testAntiShuffle5() {
        String input = "I am a programmer";
        String expected = "I am a eegmoprrrmar";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testAntiShuffle6() {
        String input = "I am a Java programmer";
        String expected = "I am a Jaa eegmoprrrmarv";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testAntiShuffle7() {
        String input = "I am a Java programmer and I love it";
        String expected = "I am a Jaa eegmoprrrmarv adn I elov it";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testAntiShuffle8() {
        String input = "I am a Java programmer and I love it so much";
        String expected = "I am a Jaa eegmoprrrmarv adn I elov it os chmu";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testAntiShuffle9() {
        String input = "I am a Java programmer and I love it so much that I want to do it every day";
        String expected = "I am a Jaa eegmoprrrmarv adn I elov it os chmu taht I antw ot do it eervy ady";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testAntiShuffle10() {
        String input = "I am a Java programmer and I love it so much that I want to do it every day and I am happy";
        String expected = "I am a Jaa eegmoprrrmarv adn I elov it os chmu taht I antw ot do it eervy ady adn I am ahppy";
        String actual = AntiShuffle.antiShuffle(input);
        assertEquals(expected, actual);
    }
}