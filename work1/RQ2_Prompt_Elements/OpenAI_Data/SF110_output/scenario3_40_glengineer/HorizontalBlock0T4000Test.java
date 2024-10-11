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
	 * The block is empty.
	 */
	@Test
	void testExtractSequentialSubblocks1() {
		HorizontalBlock block = new HorizontalBlock();
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains one position.
	 */
	@Test
	void testExtractSequentialSubblocks2() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(1, subblocks.get(0).size());
	}
	
	/**
	 * Test case 3.
	 * The block contains two positions.
	 */
	@Test
	void testExtractSequentialSubblocks3() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
	}
	
	/**
	 * Test case 4.
	 * The block contains three positions.
	 */
	@Test
	void testExtractSequentialSubblocks4() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(3, subblocks.get(0).size());
	}
	
	/**
	 * Test case 5.
	 * The block contains four positions.
	 */
	@Test
	void testExtractSequentialSubblocks5() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(4, subblocks.get(0).size());
	}
	
	/**
	 * Test case 6.
	 * The block contains five positions.
	 */
	@Test
	void testExtractSequentialSubblocks6() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		block.add(new Position(4, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(5, subblocks.get(0).size());
	}
	
	/**
	 * Test case 7.
	 * The block contains six positions.
	 */
	@Test
	void testExtractSequentialSubblocks7() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		block.add(new Position(4, 0));
		block.add(new Position(5, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(6, subblocks.get(0).size());
	}
	
	/**
	 * Test case 8.
	 * The block contains seven positions.
	 */
	@Test
	void testExtractSequentialSubblocks8() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		block.add(new Position(4, 0));
		block.add(new Position(5, 0));
		block.add(new Position(6, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(7, subblocks.get(0).size());
	}
	
	/**
	 * Test case 9.
	 * The block contains eight positions.
	 */
	@Test
	void testExtractSequentialSubblocks9() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		block.add(new Position(4, 0));
		block.add(new Position(5, 0));
		block.add(new Position(6, 0));
		block.add(new Position(7, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(8, subblocks.get(0).size());
	}
	
	/**
	 * Test case 10.
	 * The block contains nine positions.
	 */
	@Test
	void testExtractSequentialSubblocks10() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(1, 0));
		block.add(new Position(2, 0));
		block.add(new Position(3, 0));
		block.add(new Position(4, 0));
		block.add(new Position(5, 0));
		block.add(new Position(6, 0));
		block.add(new Position(7, 0));
		block.add(new Position(8, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(9, subblocks.get(0).size());
	}
}

// VerticalBlock.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An implementation of the abstract class {@code Block}
 * used for vertical layouting.
 */
public class VerticalBlock extends Block {

    /**
     * Divides the current block into a set of sequential subblocks,
     * optimizes these subblocks and returns them as a linked list.
     *
     * @return a list of optimized sequential subblocks.
     */
    public List<Block> extractSequentialSubblocks();
}

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
	 * The block is empty.
	 */
	@Test
	void testExtractSequentialSubblocks1() {
		VerticalBlock block = new VerticalBlock();
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains one position.
	 */
	@Test
	void testExtractSequentialSubblocks2() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(1, subblocks.get(0).size());
	}
	
	/**
	 * Test case 3.
	 * The block contains two positions.
	 */
	@Test
	void testExtractSequentialSubblocks3() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
	}
	
	/**
	 * Test case 4.
	 * The block contains three positions.
	 */
	@Test
	void testExtractSequentialSubblocks4() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(3, subblocks.get(0).size());
	}
	
	/**
	 * Test case 5.
	 * The block contains four positions.
	 */
	@Test
	void testExtractSequentialSubblocks5() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(4, subblocks.get(0).size());
	}
	
	/**
	 * Test case 6.
	 * The block contains five positions.
	 */
	@Test
	void testExtractSequentialSubblocks6() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		block.add(new Position(0, 4));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(5, subblocks.get(0).size());
	}
	
	/**
	 * Test case 7.
	 * The block contains six positions.
	 */
	@Test
	void testExtractSequentialSubblocks7() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		block.add(new Position(0, 4));
		block.add(new Position(0, 5));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(6, subblocks.get(0).size());
	}
	
	/**
	 * Test case 8.
	 * The block contains seven positions.
	 */
	@Test
	void testExtractSequentialSubblocks8() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		block.add(new Position(0, 4));
		block.add(new Position(0, 5));
		block.add(new Position(0, 6));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(7, subblocks.get(0).size());
	}
	
	/**
	 * Test case 9.
	 * The block contains eight positions.
	 */
	@Test
	void testExtractSequentialSubblocks9() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		block.add(new Position(0, 4));
		block.add(new Position(0, 5));
		block.add(new Position(0, 6));
		block.add(new Position(0, 7));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(8, subblocks.get(0).size());
	}
	
	/**
	 * Test case 10.
	 * The block contains nine positions.
	 */
	@Test
	void testExtractSequentialSubblocks10() {
		VerticalBlock block = new VerticalBlock();
		block.add(new Position(0, 0));
		block.add(new Position(0, 1));
		block.add(new Position(0, 2));
		block.add(new Position(0, 3));
		block.add(new Position(0, 4));
		block.add(new Position(0, 5));
		block.add(new Position(0, 6));
		block.add(new Position(0, 7));
		block.add(new Position(0, 8));
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(9, subblocks.get(0).size());
	}
}

// Position.java
package glengineer.positions;

/**
 * A class representing a position on the game board.
 */
public class Position {

    /**
     * The x coordinate of the position.
     */
    private int x;

    /**
     * The y coordinate of the position.
     */
    private int y;

    /**
     * Constructs a new position with the given coordinates.
     *
     * @param x the x coordinate of the position.
     * @param y the y coordinate of the position.
     */
    public Position(int x, int y);

    /**
     * Returns the x coordinate of the position.
     *
     * @return the x coordinate of the position.
     */
    public int getX();

    /**
     * Returns the y coordinate of the position.
     *
     * @return the y coordinate of the position.
     */
    public int getY();

    /**
     * Returns the hash code of the position.
     *
     * @return the hash code of the position.
     */
    public int hashCode();

    /**
     * Returns whether the given object is equal to the position.
     *
     * @param obj the object to be compared with the position.
     * @return {@code true} if the given object is equal to the position,
     *         {@code false} otherwise.
     */
    public boolean equals(Object obj);
}

// PositionTest.java
package glengineer.positions;

import org.junit.jupiter.api.Test;
import static org.junit