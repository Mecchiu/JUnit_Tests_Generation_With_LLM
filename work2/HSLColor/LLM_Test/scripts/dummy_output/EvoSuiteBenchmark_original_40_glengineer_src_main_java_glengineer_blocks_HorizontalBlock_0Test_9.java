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
		private Rectangle2D dimension = new Rectangle2D.Float();

		/**
		 * The constructor of the test class.
		 */
		public HorizontalBlock_0Test() {
	}

		/**
		 * @see HorizontalBlock#extractSequentialSubblocks(Collection)
		 */
	@Test
	void extractSequentialSubblocksIntoCollection() {
		block = new HorizontalBlock(Scheme.HORIZONTAL);
		List result = block.extractSequentialSubblocksIntoCollection(new Collection<Block>());
		assertEquals(1, result.size());
		Collection<Block> b = new ArrayList<Block>(result);
		assertEquals(block, b.elementAt(0));
		assertEquals(block, b.elementAt(1));
		
		assertEquals(2, block.subBlocksOf("block1").size());
		assertEquals(2, block.subBlocksOf("block1").size());
		Set<Block> o = block.getSubBlocksOf("block1");
		assertEquals(b.size(), o.size());
		Iterator i = b.iterator();
		for (Iterator j = o.iterator(); i.hasNext(); ) {
			Block b01 = (Block) i.next();
			Block b012 = (Block) j.next();
			assertEquals(dim, b01.getDim());
			assertEquals(dimension, b012.getDim());
			assertEquals(b01, b012);
		}
	}

		/**
		 * @see HorizontalBlock#firstEntityBelow(Dimension2D)
		 */
	@Test
	void firstEntityAbove() {
		block = new HorizontalBlock(Scheme.HORIZONTAL);
		assertEquals(-1, block.firstEntityBelow(dimension));
		
		dimension = new Dimension2D.Int32();
		block = new HorizontalBlock(Scheme.HORIZONTAL);
		block.setDimension(dimension);
		assertEquals(0, block.firstEntityBelow(dimension));
		block.setDimension(new Dimension2D.Int32());
		assertEquals(1, block.firstEntityBelow(dimension));
	}

	@Test
	void firstEntityBelowWithoutLimit() {
		block = new HorizontalBlock(Scheme.HORIZONTAL);
		block.setDimension(new Dimension.Int32());
		assertEquals(-1, block.firstEntityBelow(new Dimension.Int32()));

		block = new HorizontalBlock(Scheme.HORIZONTAL);
		block.setDimension(dimension);
		assertEquals(0, block.firstEntityBelow(dimension));
		
		block = new HorizontalBlock(Scheme.HORIZONTAL);
		block.setDimension(new Dimension.Int32());
		assertEquals(-1, block.firstEntityBelow(new Dimension.Int32()));
	}

		/**
		 * @see HorizontalBlock#entityAt(Number)
		 */
	@Test
	void entityAt() {
		block = new HorizontalBlock(Scheme.HORIZONTAL);
}
}