// AntiShuffleTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
			@Test
    void testAntiShuffleHi() {
        String expected = "Hi";
        String actual = AntiShuffle.antiShuffle("Hi");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleHello() {
        String expected = "ehllo";
        String actual = AntiShuffle.antiShuffle("hello");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleNumber() {
        String expected = "bemnru";
        String actual = AntiShuffle.antiShuffle("number");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleAbcd() {
        String expected = "abcd";
        String actual = AntiShuffle.antiShuffle("abcd");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleHelloWorld() {
        String expected = "Hello !!!Wdlor";
        String actual = AntiShuffle.antiShuffle("Hello World!!!");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleEmpty() {
        String expected = "";
        String actual = AntiShuffle.antiShuffle("");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleHiMyNameIsMisterRobotHowAreYou() {
        String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
        String actual = AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleLongString() {
        String expected = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        String actual = AntiShuffle.antiShuffle(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleLongStringWithSpaces() {
        String expected = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        String actual = AntiShuffle.antiShuffle(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
        assertEquals(expected, actual);
    }

    @Test
    void testAntiShuffleLongStringWithSpacesAndNewLines() {
        String expected = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        String actual = AntiShuffle.antiShuffle(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\n !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
        assertEquals(expected, actual);
    }
}