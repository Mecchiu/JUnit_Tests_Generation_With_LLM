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
	void test() {
		VWordPosition firstWord = new HWordPosition(10, 20);
		VWordPosition secondWord = new HWordPosition(1, 2);
		
		VerticalBlock block1 = new VerticalBlock(new HexLayout(10, 20), firstWord, secondWord);

		List<Block> subblocks = block1.extractParallelSubblocks();

		assertNotNull("expected subblock to exist", subblocks);
		assertEquals("expected size of subblock", 2, subblocks.size());
		assertTrue("expected first word to be horizontal;", subblocks.get(0) instanceof VerticalBlock);

		assertTrue("expected second word to be horizontal", subblocks.get(1) instanceof HorizontalBlock);

	}

}