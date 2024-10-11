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
		
	private ScmBlock block;
  private HWordPosition position;
	
	/**
	 * Initializes a new instance of the class.
	*/
	public HorizontalBlock_1Test(){
		block=new ScmBlock();
		block.addHWord(position);
	}
	
	

	/**
	 * Testing of the super method.
	*/
	@Test
	public void whenAddingHWordToBlock_andThenFindingHWordInBlock_doesNotChangeTheHWord()
	{
		block.addHWord(position);
		assertTrue(block.equals(position));
	}

	
	/**
	 * Testing that when adding HWord to this block and then calling
	 * {@link #extractParallelSubblocks()} to get its list of
	 * parallel subblocks doesn't change its contents.
	 */
	@Test
	public void whenExtractParallelSubblocks_thenHWordsShouldNotChangeTheList(){
		List<Block> blocks = block.extractParallelSubblocks();
		List<HWordPosition> hWorPositions = blocks.get(0).sortedYsOf(blocks.get(0).getAllYs());
		assertEquals(hWorPositions, position.sortedYsOf(position.getAllYs()));
	}

	
	/**
	 * Testing of the super method.
	*/
	@Test
	public void whenExtractParallelSubblocksWithoutLines_thenHWordsShouldNotChangeTheList(){
		List<Block> blocks = block.extractParallelSubblocksWithoutLines();
		assertEquals(new ArrayList<>(), blocks.get(0).sortedYsOf(blocks.get(0).getAllYs()));
	}

	public List<Integer> sortedYsOf(List<Integer> hLines) {
		List<Integer> sorted = new ArrayList<>();
		for (int y : hLines)
			sorted.add(y);
	        
		return sorted;
	}
	
	
} // HorizontalBlock_1Test.java