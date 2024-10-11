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
		private HorizontalBlock block;
		private CharPosition position1, position2;
		private int y2;

	/**
	* Constructor for the class {@link HorizontalBlock_0Test}.
	*/
	public HorizontalBlock_0Test() {
	}

	/**
	* Tests a successful extraction from the horizontal lines of this block.
	*/
	@Test
	public void testExtractSequentialSubblocks() {
		this.block = new HorizontalBlock(createPositions(), position1, position2);
		this.block.extractSequentialSubblocks();
		assertEquals(false, this.block.entityAt(0, 0));
		assertEquals(true, this.block.entityAt(0, (this.y2 + 1)));
		assertEquals(true, this.block.entityAt((this.y2 + 1), 0));
		assertEquals(true, this.block.entityAt((this.y2 + 1), (this.y2 + 1)));
	}

	/**
	* Tests a failing extraction from the horizontal lines of this block.
	*/
	@Test
	public void testExtractParallelSubblocksSeparatedByLines() {
		this.block = new HorizontalBlock(createPositions(), position1, position2);
		this.block.extractParallelSubblocksSeparatedBy(new HashSet<Integer>());
		assertEquals(false, this.block.entityAt(0, 0));
		assertEquals(true, this.block.entityAt(0, (this.y2 + 1)));
		assertEquals(true, this.block.entityAt((this.y2 + 1), 0));
		assertEquals(true, this.block.entityAt((this.y2 + 1), (this.y2 + 1)));
	}

	/**
	* Tests a failing extraction from the horizontal lines of this block.
	*/
	@Test
	public void testExtractParallelSubblocksWithoutLines() {
		this.block = new HorizontalBlock(createPositions(), position1, position2);
		this.block.extractParallelSubblocksWithoutLines();
		assertEquals(true, this.block.entityAt(0, 0));
		assertEquals(false, this.block.entityAt(0, (this.y2 + 1)));
		assertEquals(false, this.block.entityAt((this.y2 + 1), 0));
		assertEquals(false, this.block.entityAt((this.y2 + 1), (this.y2 + 1)));
	}

	/**
	* Provides the underlying position of the {@link HorizontalBlock}
	* of this test
	*/
	private static Positions createPositions() {
		return new Positions(new Span[]{new Span(1, 1, false), new Span(0, 0, false)});
	}
}