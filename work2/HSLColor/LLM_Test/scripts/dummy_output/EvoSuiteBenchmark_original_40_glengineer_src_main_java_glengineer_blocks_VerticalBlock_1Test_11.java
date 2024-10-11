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
		
            public VerticalBlock_1Test(){}

        @Test
        public void extractParallelSubblocksNoVerticalLines_test(){
                        List<Block> subblocks = new ArrayList<Block>();
                        Block firstBlock = VerticalBlock.extractParallelSubblocksWithoutLines(subblocks);
                        assertEquals("block should contain only first word character found", null, firstBlock);
                        assertEquals("block should contain only first components", 0, subblocks.size());
            }
            
        public void containsVerticalChar_1_test(){
                        Character lastCharFound = null;
                        List<VWordPosition> vWordsBelow = new ArrayList<VWordPosition>();
                        Subblock firstBlock_ = VerticalBlock.extractFirstParallelSubblock();
}
}