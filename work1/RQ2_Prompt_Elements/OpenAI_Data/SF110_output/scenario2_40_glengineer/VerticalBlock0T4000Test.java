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
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(0, result.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains only one character.
	 */
	@Test
	void testExtractSequentialSubblocks2() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1)), result.get(0));
	}
	
	/**
	 * Test case 3.
	 * The block contains two sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks3() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 2));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 2)), result.get(0));
	}
	
	/**
	 * Test case 4.
	 * The block contains two non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks4() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 2));
		block.add(new CharPosition1(0, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 4), new CharPosition1(0, 4)), result.get(1));
	}
	
	/**
	 * Test case 5.
	 * The block contains three sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks5() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3)), result.get(0));
	}
	
	/**
	 * Test case 6.
	 * The block contains three non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks6() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3));
		block.add(new CharPosition1(0, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 5), new CharPosition1(0, 5)), result.get(1));
	}
	
	/**
	 * Test case 7.
	 * The block contains four sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks7() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4)), result.get(0));
	}
	
	/**
	 * Test case 8.
	 * The block contains four non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks8() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4));
		block.add(new CharPosition1(0, 6));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 6), new CharPosition1(0, 6)), result.get(1));
	}
	
	/**
	 * Test case 9.
	 * The block contains five sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks9() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 5)), result.get(0));
	}
	
	/**
	 * Test case 10.
	 * The block contains five non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks10() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 5));
		block.add(new CharPosition1(0, 7));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 5)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 7), new CharPosition1(0, 7)), result.get(1));
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
    public List<Block> extractSequentialSubblocks() {
        this.optimize();
        if (isTrivial())
            return new LinkedList<Block>();
        List<Block> result = new LinkedList<Block>();
        HorizontalBlock firstBlock;
        HorizontalBlock theRest = this;
        do {
            firstBlock = theRest.extractFirstSequentialSubblock();
            theRest = theRest.cloneWith(new CharPosition1(firstBlock.x2, this.y1));
            firstBlock.optimize();
            if (!firstBlock.isTrivial())
                result.add(firstBlock);
            theRest.optimize();
        } while (!theRest.isTrivial());
        return result;
    }
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
	 * The block is empty.
	 */
	@Test
	void testExtractSequentialSubblocks1() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(0, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(0, result.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains only one character.
	 */
	@Test
	void testExtractSequentialSubblocks2() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(1, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(1, 0)), result.get(0));
	}
	
	/**
	 * Test case 3.
	 * The block contains two sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks3() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0)), result.get(0));
	}
	
	/**
	 * Test case 4.
	 * The block contains two non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks4() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0));
		block.add(new CharPosition1(4, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(4, 0), new CharPosition1(4, 0)), result.get(1));
	}
	
	/**
	 * Test case 5.
	 * The block contains three sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks5() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0)), result.get(0));
	}
	
	/**
	 * Test case 6.
	 * The block contains three non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks6() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0));
		block.add(new CharPosition1(5, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(5, 0)), result.get(1));
	}
	
	/**
	 * Test case 7.
	 * The block contains four sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks7() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0)), result.get(0));
	}
	
	/**
	 * Test case 8.
	 * The block contains four non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks8() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0));
		block.add(new CharPosition1(6, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(6, 0), new CharPosition1(6, 0)), result.get(1));
	}
	
	/**
	 * Test case 9.
	 * The block contains five sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks9() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
	}
	
	/**
	 * Test case 10.
	 * The block contains five non-sequential characters.
	 */
	@Test
	void testExtractSequentialSubblocks10() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0));
		block.add(new CharPosition1(7, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
		assertEquals(new HorizontalBlock(new CharPosition1(7, 0), new CharPosition1(7, 0)), result.get(1));
	}
}

// Block.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;

/**
 * An abstract class representing a block of characters.
 * A block is a set of characters with the same x-coordinate
 * or the same y-coordinate.
 */
public abstract class Block {

    /**
     * The first character of the block.
     */
    protected CharPosition1 first;

    /**
     * The last character of the block.
     */
    protected CharPosition1 last;

    /**
     * The x-coordinate of the first character of the block.
     */
    protected int x1;

    /**
     * The x-coordinate of the last character of the block.
     */
    protected int x2;

    /**
     * The y-coordinate of the first character of the block.
     */
    protected int y1;

    /**
     * The y-coordinate of the last character of the block.
     */
    protected int y2;

    /**
     * The set of characters of the block.
     */
    protected Set<CharPosition1> chars;

    /**
     * Constructs a block with the given first and last characters.
     *
     * @param first the first character of the block.
     * @param last the last character of the block.
     */
    public Block(CharPosition1 first, CharPosition1 last) {
        this.first = first;
        this.last = last;
        this.x1 = first.getX();
        this.x2 =