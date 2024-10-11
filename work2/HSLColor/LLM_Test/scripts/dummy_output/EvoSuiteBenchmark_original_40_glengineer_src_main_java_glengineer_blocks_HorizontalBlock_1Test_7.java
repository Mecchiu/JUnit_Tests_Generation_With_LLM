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
		
	@Test
    public void extractParallelSubblocks() {
		List<Block> aParallelSubblocks = new ArrayList<Block>();
		List<Integer> aIntersectionYsOfBLines = new ArrayList<Integer>();
		
		aParallelSubblocks.add(new Par1());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		aParallelSubblocks.add(new Par2());
		
		List<Integer> listOfYsInPARandomHexBlock = new ArrayList<Integer>();

		listOfYsInPARandomHexBlock.add(aParallelSubblocks.get(0).getY1());
		listOfYsInPARandomHexBlock.add(aParallelSubblocks.get(1).getY1());
		listOfYsInPARandomHexBlock.add(aParallelSubblocks.get(2).getY1());
		listOfYsInPARandomHexBlock.add(aParallelSubblocks.get(3).getY1());
		
		List<Integer> listOfYsInLines = new ArrayList<Integer>();

		listOfYsInLines.add(aParallelSubblocks.get(0).getY2());
		listOfYsInLines.add(aParallelSubblocks.get(1).getY2());
		listOfYsInLines.add(aParallelSubblocks.get(2).getY2());
		listOfYsInLines.add(aParallelSubblocks.get(3).getY2());
		
		Collections.sort( listOfYsInParallelSubblocksSortedByLines( aParallelSubblocks ) );
		
		assertTrue( listOfYsInPARandomHexBlock.equals( listOfYsInLines ) );
		assertFalse( listOfYsInPARandomHexBlock.equals( listOfYsInBLines ) );
		
        //
		
		List<Block> subblocksWithIntersectionY = new ArrayList<Block>();

}
}