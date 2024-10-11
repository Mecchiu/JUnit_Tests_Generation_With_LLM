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
		List<Block> test_run = new ArrayList<>();
		
		/**
		 * test_run is the original list of blocks.
		 */
		List<Block> test_run_1 = new ArrayList<>();
				
		/**
		 * test_run_1 contains the first block encountered.
		 */
		Block test_run_1_firstBlock;

		/**
		 * test_run_1 contains the remaining block encountered.
		 */
		Block test_run_1_remainingBlock;

		/**
		 * first_element is a list position of the blocks
		 * contained in this test case.
		 */
		List<Block> first_element;
		
		/**
		 * sortedYsOf returns the vertical coordinates
		 * of each vertical line in the {@code sortedYsOf} list.
		 */
		Set<Integer> sortedYsOf_1 = new HashSet<>();
	
		/**
		* splitOf creates a list of two blocks such that the first
		* block's y positions have an x position equal to the x
		* of the second block's.
		*/
	    List<Block> splitOf (Set<Block> blocks);

	    
	    @Test
		void extractParallelSubblocks();

	    @Test
		void extractParallelSubblocksWithoutLines();
		
	    @Test
		void removeSmallHLinesFrom();
}

// HorizontalBlock_2.java