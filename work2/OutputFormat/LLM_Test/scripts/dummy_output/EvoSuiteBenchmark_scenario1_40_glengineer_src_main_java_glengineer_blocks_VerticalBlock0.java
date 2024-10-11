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
		
	@Test
	void testExtractSequentialSubblocks1() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}
	
	@Test
	void testExtractSequentialSubblocks2() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
	}
	
	@Test
	void testExtractSequentialSubblocks3() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 4)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
	}
	
	@Test
	void testExtractSequentialSubblocks4() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
	}
	
	@Test
	void testExtractSequentialSubblocks5() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 5)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 5), new CharPosition1(1, 5)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 6), new CharPosition1(1, 6)), result.get(3));
	}
	
	@Test
	void testExtractSequentialSubblocks6() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
	}
	
	@Test
	void testExtractSequentialSubblocks7() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 8), new CharPosition1(1, 8)), result.get(4));
	}
	
	@Test
	void testExtractSequentialSubblocks8() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 9)), result.get(4));
	}
	
	@Test
	void testExtractSequentialSubblocks9() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		block.add(new CharPosition1(1, 10));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(6, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 9)), result.get(4));
		assertEquals(new VerticalBlock(new CharPosition1(1, 10), new CharPosition1(1, 10)), result.get(5));
	}
	
	@Test
	void testExtractSequentialSubblocks10() {
		VerticalBlock block = new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 3));
		block.add(new CharPosition1(1, 4));
		block.add(new CharPosition1(1, 5));
		block.add(new CharPosition1(1, 6));
		block.add(new CharPosition1(1, 7));
		block.add(new CharPosition1(1, 8));
		block.add(new CharPosition1(1, 9));
		block.add(new CharPosition1(1, 10));
		block.add(new CharPosition1(1, 11));
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(6, result.size());
		assertEquals(new VerticalBlock(new CharPosition1(1, 1), new CharPosition1(1, 2)), result.get(0));
		assertEquals(new VerticalBlock(new CharPosition1(1, 4), new CharPosition1(1, 7)), result.get(1));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(2));
		assertEquals(new VerticalBlock(new CharPosition1(1, 7), new CharPosition1(1, 7)), result.get(3));
		assertEquals(new VerticalBlock(new CharPosition1(1, 9), new CharPosition1(1, 11)), result.get(4));
		assertEquals(new VerticalBlock(new CharPosition1(1, 11), new CharPosition1(1, 11)), result.get(5));
	}
}