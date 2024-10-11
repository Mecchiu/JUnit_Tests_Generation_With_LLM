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
		
	HorizontalBlock blk;
/*	{
	  int y1 = 10;
	  int y2 = 20;
	  HWordPosition hwp1 = new HWordPosition(y1, 10, 13);
	  HWordPosition hwp2 = new HWordPosition(y2, 10, 13);
	  
	  blk = new HorizontalBlock(p1 = hwp1, p2 = hwp2);
	} */

	/**
	* Constructs a new instance of <code>HorizontalBlock_0Test</code>.
	* @throws NullPointerException if no parameters are specified.
	*/
	HorizontalBlock_0Test() {
	}
	
	/**
	* Test method for "extractSequentialSubblocks()".
	* This method tests the {@code extractSequentialSubblocks()} method.
	*/
	@Test
	void testExtractSequentialSubblocks() {
	
		List<Block> subblocks = blk.extractSequentialSubblocks();

		assertNotNull(subblocks);
		Iterator<Block> subblockIterator = subblocks.iterator();
		
		assertTrue(subblockIterator.hasNext());
		Block b = subblockIterator.next();
		assertEquals(b.getScheme(), this.blk.scheme);
		assertTrue(b.getAbsolutePosition() == blk.getAbsolutePosition());
		assertTrue(b.getAbsoluteX() == blk.getAbsoluteX());
		assertTrue(b.getAbsoluteY() == blk.getAbsoluteY());
		//System.out.println(b.toString());
	}
	
	/**
	* Test method for "extractParallelSubblocksSeparatedBy()".
	* This method tests the {@code extractParallelSubblocksSeparatedBy()} method.
	*/
	@Test
	void testExtractParallelSubblocksSeparatedBy() {
		
		List<Block> br = blk.extractParallelSubblocksSeparatedBy(ySeparators = Arrays.asList(new int[] { 12, 15 }));
		
		assertNotNull(br);
		Iterator<Block> r = br.iterator();

		assertTrue(r.hasNext());
		Block b = r.next();
		assertEquals(b.getScheme(), this.blk.scheme);
		assertTrue(b.getAbsolutePosition() == blk.getAbsolutePosition());
		assertTrue(b.getAbsoluteY() == blk.getAbsoluteY());
		assertTrue(b.getAbsoluteX() == blk.getAbsoluteX());
		assertTrue(b.getAbsoluteHeight() == blk.getAbsoluteHeight());
		assertTrue(b.getAbsoluteWidth() == blk.getAbsoluteWidth());
		//System.out.println(b.toString());
	}
	
	/**
	* Test method for "removeSmallHLinesFrom(List<Integer> ySeparators)"
	* This method tests the method {@code removeSmallHLinesFrom(List<Integer> ySeparators)} 
	*/
}