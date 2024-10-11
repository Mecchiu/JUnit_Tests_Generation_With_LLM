// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

    private String[] arrays = {
        new String("hello"),
        new String("goodbye"),
        new String("are"),
        new String("to"),
    };
    private String[] expecteds = {
        new String("hello"),
        new String("goodbye"),
        new String("are"),
        new String("to"),
    };
    
    @Test
    public void antiShuffleTest() {
        for (int i = 0; i < expecteds.length; i++){
            for (int j = 0; j < arrays.length; j++) {
                assertEquals(expecteds[i], antiShuffle(arrays[j]));
            }
        }
    }

}
