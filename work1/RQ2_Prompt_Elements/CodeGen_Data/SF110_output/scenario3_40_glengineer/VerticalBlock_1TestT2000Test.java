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
     * Check if block works as expected.
     *
     * @throws Exception is thrown if block is not a pure block (e.g. it has no sub blocks).
     */
    @Test
    public void check() throws Exception {
		
        VerticalBlock block = new VerticalBlock();
        
        assertEquals(1, block.subBlocks.size());
        assertEquals("Lines", block.subBlocks.get(0).blockType());
        
        block.extractParallelSubblocks();
        assertEquals(1, block.subBlocks.size());
    }
}