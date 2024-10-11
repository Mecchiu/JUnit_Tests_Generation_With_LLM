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
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into two subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_1() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, scheme.height() - 1), subblocks.get(1));
	}

	/**
	 * Test case 2.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_2() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, scheme.height() - 1), subblocks.get(2));
	}

	/**
	 * Test case 3.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into four subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_3() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, scheme.height() - 1), subblocks.get(3));
	}

	/**
	 * Test case 4.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into five subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_4() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, scheme.height() - 1), subblocks.get(4));
	}

	/**
	 * Test case 5.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into six subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_5() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(6, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, scheme.height() - 1), subblocks.get(5));
	}

	/**
	 * Test case 6.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into seven subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_6() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(7, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, 11), subblocks.get(5));
		assertEquals(new VerticalBlock(scheme, 0, 12, scheme.width() - 1, scheme.height() - 1), subblocks.get(6));
	}

	/**
	 * Test case 7.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into eight subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_7() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(8, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, 11), subblocks.get(5));
		assertEquals(new VerticalBlock(scheme, 0, 12, scheme.width() - 1, 13), subblocks.get(6));
		assertEquals(new VerticalBlock(scheme, 0, 14, scheme.width() - 1, scheme.height() - 1), subblocks.get(7));
	}

	/**
	 * Test case 8.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into nine subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_8() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(9, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, 11), subblocks.get(5));
		assertEquals(new VerticalBlock(scheme, 0, 12, scheme.width() - 1, 13), subblocks.get(6));
		assertEquals(new VerticalBlock(scheme, 0, 14, scheme.width() - 1, 15), subblocks.get(7));
		assertEquals(new VerticalBlock(scheme, 0, 16, scheme.width() - 1, scheme.height() - 1), subblocks.get(8));
	}

	/**
	 * Test case 9.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into ten subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_9() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(10, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, 11), subblocks.get(5));
		assertEquals(new VerticalBlock(scheme, 0, 12, scheme.width() - 1, 13), subblocks.get(6));
		assertEquals(new VerticalBlock(scheme, 0, 14, scheme.width() - 1, 15), subblocks.get(7));
		assertEquals(new VerticalBlock(scheme, 0, 16, scheme.width() - 1, 17), subblocks.get(8));
		assertEquals(new VerticalBlock(scheme, 0, 18, scheme.width() - 1, scheme.height() - 1), subblocks.get(9));
	}

	/**
	 * Test case 10.
	 * <p>
	 * The block contains no vertical lines.
	 * <p>
	 * The block is divided into eleven subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_10() {
		Scheme scheme = new Scheme("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		VerticalBlock block = new VerticalBlock(scheme, 0, 0, scheme.width() - 1, scheme.height() - 1);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(11, subblocks.size());
		assertEquals(new VerticalBlock(scheme, 0, 0, scheme.width() - 1, 1), subblocks.get(0));
		assertEquals(new VerticalBlock(scheme, 0, 2, scheme.width() - 1, 3), subblocks.get(1));
		assertEquals(new VerticalBlock(scheme, 0, 4, scheme.width() - 1, 5), subblocks.get(2));
		assertEquals(new VerticalBlock(scheme, 0, 6, scheme.width() - 1, 7), subblocks.get(3));
		assertEquals(new VerticalBlock(scheme, 0, 8, scheme.width() - 1, 9), subblocks.get(4));
		assertEquals(new VerticalBlock(scheme, 0, 10, scheme.width() - 1, 11), subblocks.get(5));
		assertEquals(new VerticalBlock(scheme, 0, 12, scheme.width() - 1, 13), subblocks.get(6));
		assertEquals(new VerticalBlock(scheme, 0, 14, scheme.width() - 1, 15), subblocks.get(7));
		assertEquals(new VerticalBlock(scheme, 0, 16, scheme.width() - 1, 17), subblocks.get(8));
		assertEquals(new VerticalBlock(scheme, 0, 18, scheme.width() - 1, 19), subblocks.get(9));
		assertEquals(new VerticalBlock(scheme, 0, 20, scheme.width() - 1, scheme.height() - 1), subblocks.get(10));
	}
}

// VerticalBlock_2Test.java
package glengineer.blocks;

import glengineer.positions.*