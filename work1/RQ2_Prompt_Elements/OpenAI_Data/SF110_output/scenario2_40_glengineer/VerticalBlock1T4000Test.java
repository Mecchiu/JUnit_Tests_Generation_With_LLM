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
	 * The block contains no words.
	 * <p>
	 * The block is trivial.
	 * <p>
	 * The block is not divided.
	 */
	@Test
	void testExtractParallelSubblocks1() {
		VerticalBlock block = new VerticalBlock();
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The block contains one word.
	 * <p>
	 * The block is trivial.
	 * <p>
	 * The block is not divided.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block contains two words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into two subblocks.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block contains three words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block contains four words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into four subblocks.
	 */
	@Test
	void testExtractParallelSubblocks5() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block contains five words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into five subblocks.
	 */
	@Test
	void testExtractParallelSubblocks6() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The block contains six words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into six subblocks.
	 */
	@Test
	void testExtractParallelSubblocks7() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(6, subblocks.size());
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The block contains seven words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into seven subblocks.
	 */
	@Test
	void testExtractParallelSubblocks8() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(7, subblocks.size());
	}
	
	/**
	 * Test case 9.
	 * <p>
	 * The block contains eight words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into eight subblocks.
	 */
	@Test
	void testExtractParallelSubblocks9() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(8, subblocks.size());
	}
	
	/**
	 * Test case 10.
	 * <p>
	 * The block contains nine words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into nine subblocks.
	 */
	@Test
	void testExtractParallelSubblocks10() {
		VerticalBlock block = new VerticalBlock();
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new VWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(9, subblocks.size());
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
     * Divides the current block into a set of parallel subblocks,
     * optimizes these subblocks and returns them as a linked list.
     * <p>
     * If the block has horizontal lines,
     * this method divides the block by the maximal horizontal lines only.
     * <p>
     * If there are no horizontal lines, the block is divided into
     * usual parallel subblocks.
     */
    public List<Block> extractParallelSubblocks() {
        this.optimize();
        if (isTrivial())
            return new LinkedList<Block>();
        Set<HWordPosition> hLines = getIntersectingHLines();
        if (hLines.size() > 0)
            return extractParallelSubblocksSeparatedByLines(hLines);
        else
            return extractParallelSubblocksWithoutLines();
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
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlockTest {
		
	/**
	 * Test case 1.
	 * <p>
	 * The block contains no words.
	 * <p>
	 * The block is trivial.
	 * <p>
	 * The block is not divided.
	 */
	@Test
	void testExtractParallelSubblocks1() {
		HorizontalBlock block = new HorizontalBlock();
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The block contains one word.
	 * <p>
	 * The block is trivial.
	 * <p>
	 * The block is not divided.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		HorizontalBlock block = new HorizontalBlock();
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block contains two words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into two subblocks.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		HorizontalBlock block = new HorizontalBlock();
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block contains three words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		HorizontalBlock block = new HorizontalBlock();
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block contains four words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into four subblocks.
	 */
	@Test
	void testExtractParallelSubblocks5() {
		HorizontalBlock block = new HorizontalBlock();
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		block.addWord(new HWordPosition(0, 0, 0, 0, 0, 0, 0, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block contains five words.
	 * <p>
	 * The block is not trivial.
	 * <p>
	 * The block is divided into five subblocks.
	 */
	@Test
	void testExtractParallelSubblocks6() {
		HorizontalBlock block = new HorizontalBlock();
		block.