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
	void test1() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(0, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(0, result.size());
	}
	
	/**
	 * Test case 2.
	 * The block contains only one character.
	 */
	@Test
	void test2() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(1, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(1, 0), result.get(0).x2);
	}
	
	/**
	 * Test case 3.
	 * The block contains two sequential characters.
	 */
	@Test
	void test3() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(2, 0), result.get(0).x2);
	}
	
	/**
	 * Test case 4.
	 * The block contains two non-sequential characters.
	 */
	@Test
	void test4() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(2, 0));
		block.add(new CharPosition1(1, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(1, 0), result.get(0).x2);
		assertEquals(new CharPosition1(1, 1), result.get(1).x1);
		assertEquals(new CharPosition1(2, 0), result.get(1).x2);
	}
	
	/**
	 * Test case 5.
	 * The block contains three sequential characters.
	 */
	@Test
	void test5() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(3, 0), result.get(0).x2);
	}
	
	/**
	 * Test case 6.
	 * The block contains three non-sequential characters.
	 */
	@Test
	void test6() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(3, 0));
		block.add(new CharPosition1(1, 1));
		block.add(new CharPosition1(2, 2));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(1, 0), result.get(0).x2);
		assertEquals(new CharPosition1(1, 1), result.get(1).x1);
		assertEquals(new CharPosition1(2, 0), result.get(1).x2);
		assertEquals(new CharPosition1(2, 2), result.get(2).x1);
		assertEquals(new CharPosition1(3, 0), result.get(2).x2);
	}
	
	/**
	 * Test case 7.
	 * The block contains four sequential characters.
	 */
	@Test
	void test7() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(4, 0), result.get(0).x2);
	}
	
	/**
	 * Test case 8.
	 * The block contains four non-sequential characters.
	 */
	@Test
	void test8() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(4, 0));
		block.add(new CharPosition1(1, 1));
		block.add(new CharPosition1(2, 2));
		block.add(new CharPosition1(3, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(1, 0), result.get(0).x2);
		assertEquals(new CharPosition1(1, 1), result.get(1).x1);
		assertEquals(new CharPosition1(2, 0), result.get(1).x2);
		assertEquals(new CharPosition1(2, 2), result.get(2).x1);
		assertEquals(new CharPosition1(3, 0), result.get(2).x2);
		assertEquals(new CharPosition1(3, 3), result.get(3).x1);
		assertEquals(new CharPosition1(4, 0), result.get(3).x2);
	}
	
	/**
	 * Test case 9.
	 * The block contains five sequential characters.
	 */
	@Test
	void test9() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(5, 0), result.get(0).x2);
	}
	
	/**
	 * Test case 10.
	 * The block contains five non-sequential characters.
	 */
	@Test
	void test10() {
		HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0));
		block.add(new CharPosition1(1, 1));
		block.add(new CharPosition1(2, 2));
		block.add(new CharPosition1(3, 3));
		block.add(new CharPosition1(4, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).x1);
		assertEquals(new CharPosition1(1, 0), result.get(0).x2);
		assertEquals(new CharPosition1(1, 1), result.get(1).x1);
		assertEquals(new CharPosition1(2, 0), result.get(1).x2);
		assertEquals(new CharPosition1(2, 2), result.get(2).x1);
		assertEquals(new CharPosition1(3, 0), result.get(2).x2);
		assertEquals(new CharPosition1(3, 3), result.get(3).x1);
		assertEquals(new CharPosition1(4, 0), result.get(3).x2);
		assertEquals(new CharPosition1(4, 4), result.get(4).x1);
		assertEquals(new CharPosition1(5, 0), result.get(4).x2);
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
    public List<Block> extractSequentialSubblocks() {
        this.optimize();
        if (isTrivial())
            return new LinkedList<Block>();
        List<Block> result = new LinkedList<Block>();
        Block firstBlock;
        VerticalBlock theRest = this;
        do {
            firstBlock = theRest.extractFirstSequentialSubblock();
            theRest = theRest.cloneWith(new CharPosition1(this.x1, firstBlock.y2));
            firstBlock.optimize();
            if (!firstBlock.isTrivial())
                result.add(firstBlock);
            theRest.optimize();
        } while (!theRest.isTrivial());
        return result;
    }
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
		assertEquals(1, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 1), result.get(0).y2);
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
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 2), result.get(0).y2);
	}
	
	/**
	 * Test case 4.
	 * The block contains two non-sequential characters.
	 */
	@Test
	void test4() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 2));
		block.add(new CharPosition1(1, 1));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 1), result.get(0).y2);
		assertEquals(new CharPosition1(1, 1), result.get(1).y1);
		assertEquals(new CharPosition1(0, 2), result.get(1).y2);
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
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 3), result.get(0).y2);
	}
	
	/**
	 * Test case 6.
	 * The block contains three non-sequential characters.
	 */
	@Test
	void test6() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 3));
		block.add(new CharPosition1(1, 1));
		block.add(new CharPosition1(2, 2));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 1), result.get(0).y2);
		assertEquals(new CharPosition1(1, 1), result.get(1).y1);
		assertEquals(new CharPosition1(0, 2), result.get(1).y2);
		assertEquals(new CharPosition1(2, 2), result.get(2).y1);
		assertEquals(new CharPosition1(0, 3), result.get(2).y2);
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
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 4), result.get(0).y2);
	}
	
	/**
	 * Test case 8.
	 * The block contains four non-sequential characters.
	 */
	@Test
	void test8() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(0, 4));
		block.add(new CharPosition1(1, 1));
		block.add(new CharPosition1(2, 2));
		block.add(new CharPosition1(3, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new CharPosition1(0, 0), result.get(0).y1);
		assertEquals(new CharPosition1(0, 1), result.get(0).y2);
		assertEquals(new CharPosition1(1, 1), result.get(1).y1);
		assertEquals(new CharPosition1(0, 2), result.get(1).y2);
		assertEqu