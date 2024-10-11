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
	@Test
	void testCase8() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		block.addPosition(new Position(0, 5));
		block.addPosition(new Position(0, 6));
		block.addPosition(new Position(0, 7));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(8, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
		assertEquals(new Position(0, 5), subblocks.get(0).getPositions().get(5));
		assertEquals(new Position(0, 6), subblocks.get(0).getPositions().get(6));
		assertEquals(new Position(0, 7), subblocks.get(0).getPositions().get(7));
	}
	
	/**
	 * Test case 9.
	 * The block contains nine positions.
	 */
	@Test
	void testCase9() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		block.addPosition(new Position(0, 5));
		block.addPosition(new Position(0, 6));
		block.addPosition(new Position(0, 7));
		block.addPosition(new Position(0, 8));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(9, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
		assertEquals(new Position(0, 5), subblocks.get(0).getPositions().get(5));
		assertEquals(new Position(0, 6), subblocks.get(0).getPositions().get(6));
		assertEquals(new Position(0, 7), subblocks.get(0).getPositions().get(7));
		assertEquals(new Position(0, 8), subblocks.get(0).getPositions().get(8));
	}
	
	/**
	 * Test case 10.
	 * The block contains ten positions.
	 */
	@Test
	void testCase10() {
		VerticalBlock block = new VerticalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(0, 1));
		block.addPosition(new Position(0, 2));
		block.addPosition(new Position(0, 3));
		block.addPosition(new Position(0, 4));
		block.addPosition(new Position(0, 5));
		block.addPosition(new Position(0, 6));
		block.addPosition(new Position(0, 7));
		block.addPosition(new Position(0, 8));
		block.addPosition(new Position(0, 9));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(10, subblocks.get(0).getPositions().size());
		assertEquals(new Position(0, 0), subblocks.get(0).getPositions().get(0));
		assertEquals(new Position(0, 1), subblocks.get(0).getPositions().get(1));
		assertEquals(new Position(0, 2), subblocks.get(0).getPositions().get(2));
		assertEquals(new Position(0, 3), subblocks.get(0).getPositions().get(3));
		assertEquals(new Position(0, 4), subblocks.get(0).getPositions().get(4));
		assertEquals(new Position(0, 5), subblocks.get(0).getPositions().get(5));
		assertEquals(new Position(0, 6), subblocks.get(0).getPositions().get(6));
		assertEquals(new Position(0, 7), subblocks.get(0).getPositions().get(7));
		assertEquals(new Position(0, 8), subblocks.get(0).getPositions().get(8));
		assertEquals(new Position(0, 9), subblocks.get(0).getPositions().get(9));
	}
}

// HorizontalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for horizontal layouting.
 */
public class HorizontalBlock extends Block {

    /**
     * Divides the current block into a set of sequential subblocks,
     * optimizes these subblocks and returns them as a linked list.
     *
     * @return a list of optimized sequential subblocks.
     */
    public List<Block> extractSequentialSubblocks();
}

// HorizontalBlockTest.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlockTest {
		
	/**
	 * Test case 1.
	 * The block contains only one position.
	 */
	@Test
	void testCase1() {
		HorizontalBlock block = new HorizontalBlock();
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
		HorizontalBlock block = new HorizontalBlock();
		block.addPosition(new Position(0, 0));
		block.addPosition(new Position(1, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.