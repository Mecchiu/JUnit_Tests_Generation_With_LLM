// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {

    /**
     * Defines the test case:
     * - it initializes an array "s" with 5 x 0,1 y 0 and 3 with 1 x + 1 y + 0 is the value
     * - it determines the orientation of the block based on the values of its elements
     * - the unit name to be checked is "y"
     */
	@Test
	public void testVerticalLayout() {
                
		int[] s = new int[]{0,0,3,2,1,0};
		List<Block> subblocks = HorizontalBlock.extractParallelSubblocks();
	
		int[] orient = {0,0,1,0,1,1};

		for (int[] i : subblocks) {
			List<Block> newsubblocks = new ArrayList<Block>();
			int[] m = i;
			int[] o = orient;
			//System.out.println(Arrays.toString(s));
			List<Block> subblock = HorizontalBlock.extractParallelSubblocks();
			for (Block block : subblock) {
				// System.out.println(Arrays.toString(m)+"->"+Arrays.toString(s));
				assertEquals(Arrays.toString(m)+"->"+Arrays.toString(s),
						block.getOrientation(), o[0]);
				assertEquals(Arrays.toString(m)+"->"+Arrays.toString(s), block.getOrientation(), o[1]);
				newsubblocks.add(block);
			}
			s[0] = m;
			s[1] = s[0] + 1;
			s[2] = s[1] + 1;
			s[3] = s[2] + 1;
			
			assertEquals("vertical layout of block" + block, s, HorizontalBlock.getHorizontalLayout(s));
		}
	}
}//HorizontalBlock_1Test.java