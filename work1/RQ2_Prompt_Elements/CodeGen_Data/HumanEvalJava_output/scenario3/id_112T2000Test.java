// ReverseDeleteTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains one unit test case for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {

    @Test
    void test1() {
            String test1 = "abcdef";
            Boolean result = ReverseDelete.reverseDelete(test1, test1);
            assertTrue(result);
            
            test1 = test1.substring(0, 1);
            result = ReverseDelete.reverseDelete(test1, test1);
            assertFalse(result);
    }
}