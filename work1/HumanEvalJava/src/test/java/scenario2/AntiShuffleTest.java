// AntiShuffleTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
			@Test
    void testAntiShuffle() {
        String[] inputs = {"hello", "world", "java", "programming", "is", "fun", "test", "case", "for", "antiShuffle"};
        String[] expected = {"ehllo", "dlorw", "aajv", "aggimmnoprr", "is", "fnu", "estt", "ace", "for", "Aefhilnottu"};
        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expected[i], AntiShuffle.antiShuffle(inputs[i]));
        }
    }
}