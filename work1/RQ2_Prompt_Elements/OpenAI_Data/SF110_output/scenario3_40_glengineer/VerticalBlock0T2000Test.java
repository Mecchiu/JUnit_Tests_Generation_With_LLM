// VerticalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlockTest {

	/**
	 * Test case 1.
	 * The block contains only one position.
	 */
	@Test
	void testCase1() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(1, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
	}
	
	/**
	 * Test case 2.
	 * The block contains two positions.
	 */
	@Test
	void testCase2() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(2, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
	}
	
	/**
	 * Test case 3.
	 * The block contains three positions.
	 */
	@Test
	void testCase3() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(3, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
	}
	
	/**
	 * Test case 4.
	 * The block contains four positions.
	 */
	@Test
	void testCase4() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(4, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
	}
	
	/**
	 * Test case 5.
	 * The block contains five positions.
	 */
	@Test
	void testCase5() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(5, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
	}
	
	/**
	 * Test case 6.
	 * The block contains six positions.
	 */
	@Test
	void testCase6() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		block.addPosition(new Position(0, 5));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(6, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
		assertEquals(new Position(0, 5), subblocks.get(0).getPositions().get(5));
	}
	
	/**
	 * Test case 7.
	 * The block contains seven positions.
	 */
	@Test
	void testCase7() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		block.addPosition(new Position(0, 5));
		block.addPosition(new Position(0, 6));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(7, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
		assertEquals(new Position(0, 5), subblocks.get(0).getPositions().get(5));
		assertEquals(new Position(0, 6), subblocks.get(0).getPositions().get(6));
	}
	
	/**
	 * Test case 8.
	 * The block contains eight positions.
	 */
	@