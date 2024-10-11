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
	public void test1GetBlockStart() {
		
		CharPosition cc1 = new CharPosition(100, 100);
		assertEquals(cc1, VerticalBlock.extractFirstParallelSubblock().getBlockStart());
		
		CharPosition cc2 = new CharPosition(100, 200);
		assertEquals(cc2, VerticalBlock.extractOnlyOneParallelSubblock().getBlockStart());
		
		CharPosition cc3 = new CharPosition(100, 500);
		assertEquals(cc3, VerticalBlock.extractOnlyOneParallelSubblock().getBlockStart());
		assertEquals(cc2, VerticalBlock.extractFirstParallelSubblock().getBlockStart());
		
	}

}