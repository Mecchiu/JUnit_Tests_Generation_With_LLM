// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {

	/**
	 * Test case 1.
	 * <p>
	 * The scheme is empty.
	 * <p>
	 * The expected result is an empty list.
	 */
	@Test
	void testExtractSequentialSubblocks_1() {
		Scheme scheme = new Scheme(0, 0);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> result = block.extractSequentialSubblocks();
		assertTrue(result.isEmpty());
	}

	/**
	 * Test case 2.
	 * <p>
	 * The scheme contains a single word.
	 * <p>
	 * The expected result is a list containing a single block
	 * which is equal to the scheme.
	 */
	@Test
	void testExtractSequentialSubblocks_2() {
		Scheme scheme = new Scheme(1, 1);
		scheme.setCharAt(0, 0, 'a');
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}

	/**
	 * Test case 3.
	 * <p>
	 * The scheme contains a single vertical line.
	 * <p>
	 * The expected result is a list containing a single block
	 * which is equal to the scheme.
	 */
	@Test
	void testExtractSequentialSubblocks_3() {
		Scheme scheme = new Scheme(1, 1);
		scheme.setCharAt(0, 0, '|');
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}

	/**
	 * Test case 4.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_4() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, 'a');
		scheme.setCharAt(1, 0, '|');
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 5.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_5() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, '|');
		scheme.setCharAt(1, 0, 'a');
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 6.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_6() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, 'a');
		scheme.setCharAt(1, 0, '|');
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, 1, 0);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 7.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_7() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, '|');
		scheme.setCharAt(1, 0, 'a');
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, 1, 0);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 8.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_8() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, 'a');
		scheme.setCharAt(1, 0, '|');
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, 1, 0);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 9.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks:
	 * the first one is the word, the second one is the vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_9() {
		Scheme scheme = new Scheme(2, 1);
		scheme.setCharAt(0, 0, '|');
		scheme.setCharAt(1, 0, 'a');
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, 1, 0);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 0), result.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 1, 0), result.get(1));
	}

	/**
	 * Test case 10.
	 * <p>
	 * The scheme contains a single word and a single vertical line.
	 * <p>
	 * The expected result is a list containing two blocks: