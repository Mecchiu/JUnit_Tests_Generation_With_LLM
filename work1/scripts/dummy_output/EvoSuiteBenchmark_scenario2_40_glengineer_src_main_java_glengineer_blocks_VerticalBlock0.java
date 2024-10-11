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