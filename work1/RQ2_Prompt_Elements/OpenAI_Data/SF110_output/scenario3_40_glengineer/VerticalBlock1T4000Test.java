// VerticalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlockTest {

	/**
	 * Test case 1.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into two parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks1() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(1).getRightTop());
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into three parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(2).getRightTop());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into four parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		block.addLine(new Position(0, 9), new Position(10, 9));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 9), subblocks.get(2).getRightTop());
		assertEquals(new Position(0, 9), subblocks.get(3).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(3).getRightTop());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into five parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		block.addLine(new Position(0, 9), new Position(10, 9));
		block.addLine(new Position(0, 2), new Position(10, 2));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 2), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 2), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(2).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(3).getLeftBottom());
		assertEquals(new Position(10, 9), subblocks.get(3).getRightTop());
		assertEquals(new Position(0, 9), subblocks.get(4).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(4).getRightTop());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into six parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks5() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		block.addLine(new Position(0, 9), new Position(10, 9));
		block.addLine(new Position(0, 2), new Position(10, 2));
		block.addLine(new Position(0, 4), new Position(10, 4));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(6, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 2), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 2), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 4), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 4), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(2).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(3).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(3).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(4).getLeftBottom());
		assertEquals(new Position(10, 9), subblocks.get(4).getRightTop());
		assertEquals(new Position(0, 9), subblocks.get(5).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(5).getRightTop());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into seven parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks6() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		block.addLine(new Position(0, 9), new Position(10, 9));
		block.addLine(new Position(0, 2), new Position(10, 2));
		block.addLine(new Position(0, 4), new Position(10, 4));
		block.addLine(new Position(0, 6), new Position(10, 6));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(7, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 2), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 2), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 4), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 4), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(2).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(3).getLeftBottom());
		assertEquals(new Position(10, 6), subblocks.get(3).getRightTop());
		assertEquals(new Position(0, 6), subblocks.get(4).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(4).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(5).getLeftBottom());
		assertEquals(new Position(10, 9), subblocks.get(5).getRightTop());
		assertEquals(new Position(0, 9), subblocks.get(6).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(6).getRightTop());
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into eight parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks7() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(0, 10));
		block.addLine(new Position(10, 0), new Position(10, 10));
		block.addLine(new Position(0, 5), new Position(10, 5));
		block.addLine(new Position(0, 7), new Position(10, 7));
		block.addLine(new Position(0, 9), new Position(10, 9));
		block.addLine(new Position(0, 2), new Position(10, 2));
		block.addLine(new Position(0, 4), new Position(10, 4));
		block.addLine(new Position(0, 6), new Position(10, 6));
		block.addLine(new Position(0, 8), new Position(10, 8));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(8, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getLeftBottom());
		assertEquals(new Position(10, 2), subblocks.get(0).getRightTop());
		assertEquals(new Position(0, 2), subblocks.get(1).getLeftBottom());
		assertEquals(new Position(10, 4), subblocks.get(1).getRightTop());
		assertEquals(new Position(0, 4), subblocks.get(2).getLeftBottom());
		assertEquals(new Position(10, 5), subblocks.get(2).getRightTop());
		assertEquals(new Position(0, 5), subblocks.get(3).getLeftBottom());
		assertEquals(new Position(10, 6), subblocks.get(3).getRightTop());
		assertEquals(new Position(0, 6), subblocks.get(4).getLeftBottom());
		assertEquals(new Position(10, 7), subblocks.get(4).getRightTop());
		assertEquals(new Position(0, 7), subblocks.get(5).getLeftBottom());
		assertEquals(new Position(10, 8), subblocks.get(5).getRightTop());
		assertEquals(new Position(0, 8), subblocks.get(6).getLeftBottom());
		assertEquals(new Position(10, 9), subblocks.get(6).getRightTop());
		assertEquals(new Position(0, 9), subblocks.get(7).getLeftBottom());
		assertEquals(new Position(10, 10), subblocks.get(7).getRightTop());
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into nine parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks8() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Position(0, 0), new Position(10, 0));
		block.addLine(new Position(0, 10), new Position(