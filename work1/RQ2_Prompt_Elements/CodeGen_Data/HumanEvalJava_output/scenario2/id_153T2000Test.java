// StrongestExtensionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains one unit test case for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {
@Test
    void shouldReturnStrongestExtension(String testString) {
        List<String> extensions = Lists.newArrayList("ClassName.StrongestExtension");
        String result = StrongestExtension.strongestExtension(testString, extensions);
        assertEquals(testString, result);
    }
}
