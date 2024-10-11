// HorizontalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlockTest {

	/**
	 * Test case 1.
	 * <p>
	 * The block has no horizontal lines.
	 * <p>
	 * The block is divided into two parallel subblocks.
	 */
	@Test
	void testCase1() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(1).getBottomRight());
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The block has one horizontal line.
	 * <p>
	 * The block is divided into two parallel subblocks.
	 */
	@Test
	void testCase2() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		block.addHorizontalLine(5);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(1).getBottomRight());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block has two horizontal lines.
	 * <p>
	 * The block is divided into three parallel subblocks.
	 */
	@Test
	void testCase3() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		block.addHorizontalLine(5);
		block.addHorizontalLine(7);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 7), subblocks.get(1).getBottomRight());
		assertEquals(new Position(0, 7), subblocks.get(2).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(2).getBottomRight());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block has three horizontal lines.
	 * <p>
	 * The block is divided into four parallel subblocks.
	 */
	@Test
	void testCase4() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		block.addHorizontalLine(5);
		block.addHorizontalLine(7);
		block.addHorizontalLine(9);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 7), subblocks.get(1).getBottomRight());
		assertEquals(new Position(0, 7), subblocks.get(2).getTopLeft());
		assertEquals(new Position(10, 9), subblocks.get(2).getBottomRight());
		assertEquals(new Position(0, 9), subblocks.get(3).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(3).getBottomRight());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block has four horizontal lines.
	 * <p>
	 * The block is divided into five parallel subblocks.
	 */
	@Test
	void testCase5() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		block.addHorizontalLine(5);
		block.addHorizontalLine(7);
		block.addHorizontalLine(9);
		block.addHorizontalLine(11);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 7), subblocks.get(1).getBottomRight());
		assertEquals(new Position(0, 7), subblocks.get(2).getTopLeft());
		assertEquals(new Position(10, 9), subblocks.get(2).getBottomRight());
		assertEquals(new Position(0, 9), subblocks.get(3).getTopLeft());
		assertEquals(new Position(10, 11), subblocks.get(3).getBottomRight());
		assertEquals(new Position(0, 11), subblocks.get(4).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(4).getBottomRight());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block has five horizontal lines.
	 * <p>
	 * The block is divided into six parallel subblocks.
	 */
	@Test
	void testCase6() {
		Block block = new HorizontalBlock(
			new Position(0, 0),
			new Position(10, 10)
		);
		block.addHorizontalLine(5);
		block.addHorizontalLine(7);
		block.addHorizontalLine(9);
		block.addHorizontalLine(11);
		block.addHorizontalLine(13);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(6, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 7), subblocks.get(1).getBottomRight());
		assertEquals(new Position(0, 7), subblocks.get(2).getTopLeft());
		assertEquals(new Position(10, 9), subblocks.get(2).getBottomRight());
		assertEquals(new Position(0, 9), subblocks.get(3).getTopLeft());
		assertEquals(new Position(10, 11), subblocks.get(3).getBottomRight());
		assertEquals(new Position(0, 11), sub