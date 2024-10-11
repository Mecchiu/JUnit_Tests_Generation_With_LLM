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
private static final Set<VWordPosition> testSet = new HashSet<VWordPosition>();

		static {
			for (int i = 1; i < 100; i++) {
					testSet.add(new VWordPosition(Integer.toString(i), null, null, null, null));
			}
		}

    /*
	 * Tests {@link VerticalBlock#extractSequentialSubblocks()}
	 * by comparing its return value with
	 * the returned value from {@link VerticalBlock#extractParallelSubblocks()}.
	 */
    @Test
		public void testExtractParallelSubblocks() {
			//Verifies empty (empty) block
			VerticalBlock empty = new VerticalBlock(TestScheme.EmptyScheme, -1, -1);
			List<Block> result = empty.extractParallelSubblocks();
			assertEquals(0, result.size());

            //