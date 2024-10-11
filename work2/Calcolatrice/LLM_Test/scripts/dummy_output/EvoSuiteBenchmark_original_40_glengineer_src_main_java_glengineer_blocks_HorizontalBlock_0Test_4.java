// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {
		
	private List<Block> listOfParallelSubblocks;

	/**
	* Default constructor.
	*/
	HorizontalBlock_0Test() {
	}

	/**
	* Constructor with parameter.
	*/
	HorizontalBlock_0Test(List<Block> list, List<HWordPosition> hLines) {
		
		if (list!= null) {
			listOfParallelSubblocks = list;
		} else {
			listOfParallelSubblocks = new ArrayList<Block>();
		}
		if (hLines!= null) {
			listOfParallelSubblocks.add(extractSequentialSubblocks());
		}
		
	}

	@Test
	void testExtractSequentialSubblocksWithoutLines() {
 		
		HorizontalBlock_0Test instance = new HorizontalBlock_0Test(listOfParallelSubblocks, empty);
		assertTrue(instance.getIntersectingHLines().isEmpty());
		assertNotNull(instance.findAWordExtendingSubblockToTheRightFrom(firstEntity()));
	}
	
	@Test
	void testFindAWordExtendingSubblockToTheRightFrom() {
		
		List<Block> listOfSubblocks = extractSequentialSubblocks();
		HWordPosition firstWordPosition = firstEntity();
		
		HorizontalBlock_0Test instance = new HorizontalBlock_0Test(listOfSubblocks, empty);
		List<Block> returnValue = instance.findAWordExtendingSubblockToTheRightFrom(firstWordPosition);
		assertEquals(2, returnValue.size());		
	}

	@Test
	void testParallelSubblocksSeparatedByLines() {
		
		List<Integer> lines_ = sortedYsOf(listOfParallelSubblocks.get(0).getYs());
		List<Block> all_ = extractParallelSubblocksSeparatedBy(lines_);
		
		HorizontalBlock_0Test instance = new HorizontalBlock_0Test(all_, empty);
		List<Block> allSubblocks = instance.extractParallelSubblocksSeparatedBy(lines_);
		
		
		assertEquals(all_, allSubblocks);
	}

}