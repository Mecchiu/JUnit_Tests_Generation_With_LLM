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

	/**
	 * Constructor for test class {@link VerticalBlock_0Test}.
	 */
	public VerticalBlock_0Test() {}

	/**
	 * Test method with exception thrown by the {@link VerticalBlock#extractSequentialSubblocks()} method.
	 */
	@Test
	public void test0() {
		VertexBlock block = new TopBlock();
        List<Block> subblocks1 = block.extractSequentialSubblocks();
        assertNotNull(subblocks1);
        assertTrue(!subblocks1.isEmpty());
        Block block1 = subblocks1.get(0);
        assertTrue(block1 instanceof VerticalBlock);
	}
}