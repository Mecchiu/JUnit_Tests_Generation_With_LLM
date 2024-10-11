// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    /**
     * * Test of antiShuffle(String).
     * This test case contains one assertion :
     *    1. antiShuffle(String) is positive.
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void test1() {
        AntivirusApproach1.antiShuffle("Hello");
    }
    
    /**
     * Test of antiShuffle(String).
     */
    @Test
    public void test2() {
        String testString = "This is a test with only whitespace at the end and blank lines";
        Arrays.sort(testString.split("------------------------------------------------------------------"));
        String[] expectedResultString = "HELO World of Awesome!" + "This is a test with just whitespace at the end and blank lines.";
        // TODO: replace testString (testString = "   This is a test with only whitespace at the end and blank lines.")
        String[] expectedResult = { "HELO World of Awesome!", "This is a test with only whitespiral at the end and blank lines." };
        assertEquals(testString, Arrays.toString(expectedResult));
        // TODO: replace testString (testString = "   This is a test with only whitespace at the end and blank lines.")
        assertTrue(Arrays.equals(expectedResultString, expectedResult));
    }
}

