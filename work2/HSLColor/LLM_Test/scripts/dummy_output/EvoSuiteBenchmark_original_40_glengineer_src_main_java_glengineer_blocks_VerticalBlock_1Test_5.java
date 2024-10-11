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
		public static final int BLOCK_WIDTH = 2; // 2 pixel width
		public static final int BLOCK_TOP = 1; // 1 pixel offset in y direction

		// List of required blocks
		private Block[][] requiredBlocks;

		// Block objects for required blocks
		private final Set<Block> requiredBlocksFromArray;

		/**
		 * Instantiates a new Vertical block instance.
		 */
		private VerticalBlock_1Test() {
}
}