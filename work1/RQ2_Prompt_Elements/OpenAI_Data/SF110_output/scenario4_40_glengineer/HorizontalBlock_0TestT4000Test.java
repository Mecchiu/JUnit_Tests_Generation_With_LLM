// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {

	/**
	 * Test case 1.
	 * <p>
	 * The block contains a single word.
	 * <p>
	 * The expected result is a list containing a single optimized block
	 * which is equal to the original block.
	 */
	@Test
	void testExtractSequentialSubblocks_1() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 26, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(block, subblocks.get(0));
	}

	/**
	 * Test case 2.
	 * <p>
	 * The block contains a single word and a single gap.
	 * <p>
	 * The expected result is a list containing two optimized blocks:
	 * the first one is equal to the original block,
	 * and the second one is a gap block.
	 */
	@Test
	void testExtractSequentialSubblocks_2() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 28, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 28, 0), subblocks.get(1));
	}

	/**
	 * Test case 3.
	 * <p>
	 * The block contains a single word and a single horizontal line.
	 * <p>
	 * The expected result is a list containing two optimized blocks:
	 * the first one is equal to the original block,
	 * and the second one is a horizontal line block.
	 */
	@Test
	void testExtractSequentialSubblocks_3() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "---"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 29, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 29, 0), subblocks.get(1));
	}

	/**
	 * Test case 4.
	 * <p>
	 * The block contains a single word and a single gap
	 * followed by a single horizontal line.
	 * <p>
	 * The expected result is a list containing three optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a gap block,
	 * and the third one is a horizontal line block.
	 */
	@Test
	void testExtractSequentialSubblocks_4() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "  ---"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 30, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 28, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 28, 0, 30, 0), subblocks.get(2));
	}

	/**
	 * Test case 5.
	 * <p>
	 * The block contains a single word and a single horizontal line
	 * followed by a single gap.
	 * <p>
	 * The expected result is a list containing three optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a horizontal line block,
	 * and the third one is a gap block.
	 */
	@Test
	void testExtractSequentialSubblocks_5() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "---  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 31, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 29, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 29, 0, 31, 0), subblocks.get(2));
	}

	/**
	 * Test case 6.
	 * <p>
	 * The block contains a single word and a single horizontal line
	 * followed by a single gap followed by a single horizontal line.
	 * <p>
	 * The expected result is a list containing four optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a horizontal line block,
	 * the third one is a gap block,
	 * and the fourth one is a horizontal line block.
	 */
	@Test
	void testExtractSequentialSubblocks_6() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "---  ---"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 33, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 29, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 29, 0, 31, 0), subblocks.get(2));
		assertEquals(new HorizontalBlock(scheme, 31, 0, 33, 0), subblocks.get(3));
	}

	/**
	 * Test case 7.
	 * <p>
	 * The block contains a single word and a single gap
	 * followed by a single horizontal line followed by a single gap.
	 * <p>
	 * The expected result is a list containing four optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a gap block,
	 * the third one is a horizontal line block,
	 * and the fourth one is a gap block.
	 */
	@Test
	void testExtractSequentialSubblocks_7() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "  ---  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 34, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 28, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 28, 0, 31, 0), subblocks.get(2));
		assertEquals(new HorizontalBlock(scheme, 31, 0, 34, 0), subblocks.get(3));
	}

	/**
	 * Test case 8.
	 * <p>
	 * The block contains a single word and a single horizontal line
	 * followed by a single gap followed by a single horizontal line
	 * followed by a single gap.
	 * <p>
	 * The expected result is a list containing five optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a horizontal line block,
	 * the third one is a gap block,
	 * the fourth one is a horizontal line block,
	 * and the fifth one is a gap block.
	 */
	@Test
	void testExtractSequentialSubblocks_8() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "---  ---  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 36, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 29, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 29, 0, 31, 0), subblocks.get(2));
		assertEquals(new HorizontalBlock(scheme, 31, 0, 34, 0), subblocks.get(3));
		assertEquals(new HorizontalBlock(scheme, 34, 0, 36, 0), subblocks.get(4));
	}

	/**
	 * Test case 9.
	 * <p>
	 * The block contains a single word and a single gap
	 * followed by a single horizontal line followed by a single gap
	 * followed by a single horizontal line followed by a single gap.
	 * <p>
	 * The expected result is a list containing five optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a gap block,
	 * the third one is a horizontal line block,
	 * the fourth one is a gap block,
	 * and the fifth one is a horizontal line block.
	 */
	@Test
	void testExtractSequentialSubblocks_9() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "  ---  ---  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 37, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 28, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 28, 0, 31, 0), subblocks.get(2));
		assertEquals(new HorizontalBlock(scheme, 31, 0, 34, 0), subblocks.get(3));
		assertEquals(new HorizontalBlock(scheme, 34, 0, 37, 0), subblocks.get(4));
	}

	/**
	 * Test case 10.
	 * <p>
	 * The block contains a single word and a single horizontal line
	 * followed by a single gap followed by a single horizontal line
	 * followed by a single gap followed by a single horizontal line.
	 * <p>
	 * The expected result is a list containing five optimized blocks:
	 * the first one is equal to the original block,
	 * the second one is a horizontal line block,
	 * the third one is a gap block,
	 * the fourth one is a horizontal line block,
	 * and the fifth one is a horizontal line block.
	 */
	@Test
	void testExtractSequentialSubblocks_10() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "---  ---  ---"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 38, 0);
		List<Block> subblocks = block.extractSequentialSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 29, 0), subblocks.get(1));
		assertEquals(new HorizontalBlock(scheme, 29, 0, 31, 0), subblocks.get(2));
		assertEquals(new HorizontalBlock(scheme, 31, 0, 34, 0), subblocks.get(3));
		assertEquals(new HorizontalBlock(scheme, 34, 0, 38, 0), subblocks.get(4));
	}
}

// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {
		
	/**
	 * Test case 1.
	 * <p>
	 * The block contains a single word.
	 * <p>
	 * The expected result is a list containing a single optimized block
	 * which is equal to the original block.
	 */
	@Test
	void testExtractParallelSubblocks_1() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 26, 0);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(block, subblocks.get(0));
	}

	/**
	 * Test case 2.
	 * <p>
	 * The block contains a single word and a single gap.
	 * <p>
	 * The expected result is a list containing two optimized blocks:
	 * the first one is equal to the original block,
	 * and the second one is a gap block.
	 */
	@Test
	void testExtractParallelSubblocks_2() {
		Scheme scheme = new Scheme(
			"a b c d e f g h i j k l m n o p q r s t u v w x y z"
			+ "  "
		);
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 28, 0);
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 26, 0), subblocks.get(0));
		assertEquals(new HorizontalBlock(scheme, 26, 0, 28, 0), subblocks.get(1));
	}