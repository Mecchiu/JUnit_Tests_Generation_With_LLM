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
		block.add(new H