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
	* Test method for {@link VerticalBlock#extractParallelSubblocks()}.
	*/
	@Test
	public void testExtractParallelSubblocks() {
		{
			VerticalBlock verticalBlock = new VerticalBlock(Pose.vertical(), 10d);
			verticalBlock.setBlock(VerticalBlock.VERTICAL_BLOCK);
			assertTrue(verticalBlock.getVerticalLine().equals(verticalBlock.getHorizontalLine()));
		}
		List<Block> list = verticalBlock.extractParallelSubblocks();
		assertNotNull(list);
		assertTrue(list.size() == 1);
	}
	
	/**
	* Test method for {@link VerticalBlock#findAWordExtendingSubblockToTheRightFrom(VWordPosition currentWordReverse}
	*/
}