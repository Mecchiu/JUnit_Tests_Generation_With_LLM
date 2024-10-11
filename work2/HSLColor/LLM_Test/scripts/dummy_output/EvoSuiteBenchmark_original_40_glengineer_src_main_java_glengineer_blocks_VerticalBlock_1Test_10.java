// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {
		
    /**
     * Initialization part
     * <p>
     * There is a test case for this method in the general {@link VerticalBlock} test case.
     * In the test case there is no specific initialisation
     */
    @Test
    void create_initialiser() {
    }

    /**
     * Returns a list of elements intersecting the specified range.
     * <p>
     * All elements with the same coordinate are returned.
     * Subblocks end at 0, so that the result
     * depends only on the coordinate {@code x2}.
     */
    private Set<VWordPosition> intersects(int x1, int y1, int x2, int y2) {
        return null;
    }

    /**
     * Returns a list of elements overlapping the specified range.
     * <p>
     * Intersections are not counted.
     */
}