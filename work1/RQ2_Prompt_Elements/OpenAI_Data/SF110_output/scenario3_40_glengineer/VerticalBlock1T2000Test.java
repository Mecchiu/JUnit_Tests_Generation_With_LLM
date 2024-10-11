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
		block.addLine(new Line(new Position(0, 0), new Position(10, 0)));
		block.addLine(new Line(new Position(0, 10), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 0), new Position(0, 10)));
		block.addLine(new Line(new Position(10, 0), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 5), new Position(10, 5)));
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
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into three parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Line(new Position(0, 0), new Position(10, 0)));
		block.addLine(new Line(new Position(0, 10), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 0), new Position(0, 10)));
		block.addLine(new Line(new Position(10, 0), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 5), new Position(10, 5)));
		block.addLine(new Line(new Position(0, 7), new Position(10, 7)));
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
	 * Test case 3.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into four parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Line(new Position(0, 0), new Position(10, 0)));
		block.addLine(new Line(new Position(0, 10), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 0), new Position(0, 10)));
		block.addLine(new Line(new Position(10, 0), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 5), new Position(10, 5)));
		block.addLine(new Line(new Position(0, 7), new Position(10, 7)));
		block.addLine(new Line(new Position(0, 9), new Position(10, 9)));
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
	 * Test case 4.
	 * <p>
	 * The block has no vertical lines.
	 * <p>
	 * The block is divided into five parallel subblocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
		block.addLine(new Line(new Position(0, 0), new Position(10, 0)));
		block.addLine(new Line(new Position(0, 10), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 0), new Position(0, 10)));
		block.addLine(new Line(new Position(10, 0), new Position(10, 10)));
		block.addLine(new Line(new Position(0, 5), new Position(10, 5)));
		block.addLine(new Line(new Position(0, 7), new Position(10, 7)));
		block.addLine(new Line(new Position(0, 9), new Position(10, 9)));
		block.addLine(new Line(new Position(0, 2), new Position(10, 2)));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new Position(0, 0), subblocks.get(0).getTopLeft());
		assertEquals(new Position(10, 2), subblocks.get(0).getBottomRight());
		assertEquals(new Position(0, 2), subblocks.get(1).getTopLeft());
		assertEquals(new Position(10, 5), subblocks.get(1).getBottomRight());
		assertEquals(new Position(0, 5), subblocks.get(2).getTopLeft());
		assertEquals(new Position(10, 7), subblocks.get(2).getBottomRight());
		assertEquals(new Position(0, 7), subblocks.get(3).getTopLeft());
		assertEquals(new Position(10, 9), subblocks.get(3).getBottomRight());
		assertEquals(new Position(0, 9), subblocks.get(4).getTopLeft());
		assertEquals(new Position(10, 10), subblocks.get(4).getBottomRight());
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
		block.addLine(new Line(new Position(0, 0), new Position(10, 0)));
