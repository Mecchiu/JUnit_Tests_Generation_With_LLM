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
	 * The block is empty.
	 * <p>
	 * The expected result is an empty list.
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
	 * The expected result is an empty list.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block contains two words.
	 * <p>
	 * The expected result is an empty list.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block contains three words.
	 * <p>
	 * The expected result is a list of two blocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block contains four words.
	 * <p>
	 * The expected result is a list of three blocks.
	 */
	@Test
	void testExtractParallelSubblocks5() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block contains five words.
	 * <p>
	 * The expected result is a list of three blocks.
	 */
	@Test
	void testExtractParallelSubblocks6() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		block.add(new HWordPosition(0, 0, "word5"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(2, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The block contains six words.
	 * <p>
	 * The expected result is a list of four blocks.
	 */
	@Test
	void testExtractParallelSubblocks7() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		block.add(new HWordPosition(0, 0, "word5"));
		block.add(new HWordPosition(0, 0, "word6"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(2, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
		assertEquals(1, subblocks.get(3).size());
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The block contains seven words.
	 * <p>
	 * The expected result is a list of four blocks.
	 */
	@Test
	void testExtractParallelSubblocks8() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		block.add(new HWordPosition(0, 0, "word5"));
		block.add(new HWordPosition(0, 0, "word6"));
		block.add(new HWordPosition(0, 0, "word7"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(2, subblocks.get(1).size());
		assertEquals(2, subblocks.get(2).size());
		assertEquals(1, subblocks.get(3).size());
	}
	
	/**
	 * Test case 9.
	 * <p>
	 * The block contains eight words.
	 * <p>
	 * The expected result is a list of five blocks.
	 */
	@Test
	void testExtractParallelSubblocks9() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		block.add(new HWordPosition(0, 0, "word5"));
		block.add(new HWordPosition(0, 0, "word6"));
		block.add(new HWordPosition(0, 0, "word7"));
		block.add(new HWordPosition(0, 0, "word8"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(2, subblocks.get(1).size());
		assertEquals(2, subblocks.get(2).size());
		assertEquals(1, subblocks.get(3).size());
		assertEquals(1, subblocks.get(4).size());
	}
	
	/**
	 * Test case 10.
	 * <p>
	 * The block contains nine words.
	 * <p>
	 * The expected result is a list of five blocks.
	 */
	@Test
	void testExtractParallelSubblocks10() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, "word1"));
		block.add(new HWordPosition(0, 0, "word2"));
		block.add(new HWordPosition(0, 0, "word3"));
		block.add(new HWordPosition(0, 0, "word4"));
		block.add(new HWordPosition(0, 0, "word5"));
		block.add(new HWordPosition(0, 0, "word6"));
		block.add(new HWordPosition(0, 0, "word7"));
		block.add(new HWordPosition(0, 0, "word8"));
		block.add(new HWordPosition(0, 0, "word9"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(2, subblocks.get(1).size());
		assertEquals(2, subblocks.get(2).size());
		assertEquals(2, subblocks.get(3).size());
		assertEquals(1, subblocks.get(4).size());
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
     * Divides the current block into a set of parallel subblocks,
     * optimizes these subblocks and returns them as a linked list.
     * <p>
     * If the block has vertical lines,
     * this method divides the block by the maximal vertical lines only.
     * <p>
     * If there are no vertical lines, the block is divided into
     * usual parallel subblocks.
     */
    public List<Block> extractParallelSubblocks() {
        this.optimize();
        if (isTrivial())
            return new LinkedList<Block>();
        Set<VWordPosition> vLines = getIntersectingVLines();
        if (vLines.size() > 0)
            return extractParallelSubblocksSeparatedByLines(vLines);
        else
            return extractParallelSubblocksWithoutLines();
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
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlockTest {
		
	/**
	 * Test case 1.
	 * <p>
	 * The block is empty.
	 * <p>
	 * The expected result is an empty list.
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
	 * The expected result is an empty list.
	 */
	@Test
	void testExtractParallelSubblocks2() {
		VerticalBlock block = new VerticalBlock();
		block.add(new VWordPosition(0, 0, "word"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block contains two words.
	 * <p>
	 * The expected result is an empty list.
	 */
	@Test
	void testExtractParallelSubblocks3() {
		VerticalBlock block = new VerticalBlock();
		block.add(new VWordPosition(0, 0, "word1"));
		block.add(new VWordPosition(0, 0, "word2"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block contains three words.
	 * <p>
	 * The expected result is a list of two blocks.
	 */
	@Test
	void testExtractParallelSubblocks4() {
		VerticalBlock block = new VerticalBlock();
		block.add(new VWordPosition(0, 0, "word1"));
		block.add(new VWordPosition(0, 0, "word2"));
		block.add(new VWordPosition(0, 0, "word3"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block contains four words.
	 * <p>
	 * The expected result is a list of three blocks.
	 */
	@Test
	void testExtractParallelSubblocks5() {
		VerticalBlock block = new VerticalBlock();
		block.add(new VWordPosition(0, 0, "word1"));
		block.add(new VWordPosition(0, 0, "word2"));
		block.add(new VWordPosition(0, 0, "word3"));
		block.add(new VWordPosition(0, 0, "word4"));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block contains five words.
	 * <p>
	 * The expected result is a list of three blocks.
	 */
	@Test
	void testExtractParallelSubblocks6() {
		VerticalBlock block = new VerticalBlock();
		block.add(new VWordPosition(0, 0, "word1"));
		block.add(new VWordPosition(0, 0, "word2"));
		block.add(new VWordPosition(0, 0, "word3"));
		block.add(new VWordPosition(0, 0, "word4"));
		block.add(new VWordPosition(0, 0, "word5"));
		List<Block> sub