// UniqueDigitsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains one unit test case for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	@Test
    public void test() {
        assertNotNull(uniqueDigits(new Integer[]{}));
        assertNotNull(uniqueDigits(new Integer[]{1}));
        assertNull(uniqueDigits(new Integer[]{0}));
    }
}