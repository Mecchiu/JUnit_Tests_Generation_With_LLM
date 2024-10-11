// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {

    /**
     * Test method for
     * {@link glengineer.bases.HorizontalBlock#extractSequentialSubblocks()}
     *.
     *
     * @copyright Copyright (C) 2016-2018 Stanislav Gorka
     */
    @Test
    public void testExtractSequentialSubblocks() {
    	assertNotNull(HorizontalBlock.extractSequentialSubblocks());
    }
}
