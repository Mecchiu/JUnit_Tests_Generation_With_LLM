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
@Test
		public void shouldReturnEmptyListWithoutLines() {
			List<Block> res = getTestBlock().extractParallelSubblocks();
            assertTrue(res.size() == 0);
		}
		@Test
		public void shouldReturnEmptyListWithoutVerticalLines() {
			List<Block> res = getTestBlock().extractParallelSubblocksWithoutLines();
            assertTrue(res.size() == 0);
		}
		@Test
		public void shouldReturnParallelBlocks() {
			List<Block> res = getTestBlock().extractParallelSubblocks();
			assertTrue(isBlockEmpty(res));
		}
}



// VerticalBlock.java
