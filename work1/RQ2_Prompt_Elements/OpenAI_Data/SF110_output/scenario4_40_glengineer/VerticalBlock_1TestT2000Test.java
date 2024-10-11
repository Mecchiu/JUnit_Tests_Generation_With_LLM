// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {

	/**
	 * Test case 1.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_1() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 2.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_2() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 3.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_3() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 4.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_4() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 5.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_5() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 6.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_6() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 7.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	void testExtractParallelSubblocks_7() {
		Scheme scheme = new Scheme(
			"  a  " +
			"  |  " +
			"  b  " +
			"  |  " +
			"  c  "
		);
		VerticalBlock block = new VerticalBlock(scheme);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, 0, 4), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 1, 0, 4, 4), subblocks.get(1));
	}

	/**
	 * Test case 8.
	 * <p>
	 * The scheme contains a single vertical line.
	 * The block is the whole scheme.
	 * <p>
	 * The method should return a list of two blocks:
	 * the left one is the vertical line,
	 * the right one is the rest of the scheme.
	 */
	@Test
	