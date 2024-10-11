// CanArrangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains one unit test case for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    /**
     * Test method for {@link CanArrange#toString()}.
     */
    @Test
    public void testToString() {
        List<Object> arr = List.of();
        assertEquals(">0", CanArrange.canArrange(arr).toString());
    }
}