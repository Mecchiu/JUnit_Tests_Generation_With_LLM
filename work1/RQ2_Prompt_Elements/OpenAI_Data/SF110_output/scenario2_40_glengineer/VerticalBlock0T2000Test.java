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
	void test1() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(0, result.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains only one character.
	 */
	@Test
	void test2() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(0, result.size());
	}
	
	/**
	 * Test case 3.
	 * The block contains two sequential characters.
	 */
	@Test
	void test3() {
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
	void test4() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 2), new CharPosition1(0, 3)), result.get(1));
	}
	
	/**
	 * Test case 5.
	 * The block contains three sequential characters.
	 */
	@Test
	void test5() {
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
	void test6() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 2), new CharPosition1(0, 3)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(0, 4), new CharPosition1(0, 4)), result.get(2));
	}
	
	/**
	 * Test case 7.
	 * The block contains four sequential characters.
	 */
	@Test
	void test7() {
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
	void test8() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 2), new CharPosition1(0, 3)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(0, 4), new CharPosition1(0, 4)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(0, 5), new CharPosition1(0, 5)), result.get(3));
	}
	
	/**
	 * Test case 9.
	 * The block contains five sequential characters.
	 */
	@Test
	void test9() {
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
	void test10() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 6));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 1)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(0, 2), new CharPosition1(0, 3)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(0, 4), new CharPosition1(0, 4)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(0, 5), new CharPosition1(0, 5)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(0, 6), new CharPosition1(0, 6)), result.get(4));
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
import static org.j