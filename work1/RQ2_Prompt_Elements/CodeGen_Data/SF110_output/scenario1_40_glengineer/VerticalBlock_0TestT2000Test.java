// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {

	@Test
    public void test() {
		int x1 = 15, y2 = 15, x2 = 15, y3 = 15, x3 = 15, y4 = 15, x4 = 9, y5 = 15, x5 = 9, y6 = 15, x6 = 9, y7 = 15, x7 = 9, y8 = 15, x8 = 9;
		VerticalBlock firstBlock = new VerticalBlock(x1, y2, Position.RELATIVE_BLOCK_LEFT);
		VerticalBlock theRest = new VerticalBlock(x2, y3, Position.RELATIVE_BLOCK_TOP);
		VerticalBlock secondBlock = new VerticalBlock(x5, y5, Position.RELATIVE_BLOCK_RIGHT);
        //first block
		List<Block> secondBlocks = new LinkedList<Block>();
		secondBlocks.add(firstBlock);
		secondBlocks.add(theRest);
        //the rest
        secondBlocks.add(theRest);
        //extractSubblocks
		firstBlock.extractSubblocks(null, secondBlocks);
		theRest.extractSubblocks(null, secondBlocks);

		assertEquals(12, firstBlock.extractSubblocks(y6, null).size());
		assertEquals(12, theRest.extractSubblocks(y7, null).size());
		assertEquals(12, secondBlock.extractSubblocks(y8, null).size());
		assertEquals(3, firstBlock.extractSubblocks(x4, null).size());
		assertEquals(3, theRest.extractSubblocks(x5, null).size());
		assertEquals(3, secondBlock.extractSubblocks(x6, null).size());
	}
}

// VerticalBlock_1Test.java
package glengineer.blocks;
