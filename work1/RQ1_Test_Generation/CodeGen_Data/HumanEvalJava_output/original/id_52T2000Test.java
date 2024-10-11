// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains one unit test case for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

    /**
     * Test case for {@link BelowThreshold#belowThreshold(List, int)}.
     * Tests if all the elements are below or are equal to the
     * threshold.
     */
    @Test
    void test() {
        assertEquals(true, BelowThreshold.belowThreshold([10,11,9], 100));
        assertEquals(true, BelowThreshold.belowThreshold([11,9,8], 100));
        assertEquals(true, BelowThreshold.belowThreshold([9,9,1], 30));
    }
}

/*
 * ______________________________________________________________________
 *
 *                                   Class Name
 *
 *  BelowThresholdTest is a java unit test class for class "BelowThreshold"       
 */
