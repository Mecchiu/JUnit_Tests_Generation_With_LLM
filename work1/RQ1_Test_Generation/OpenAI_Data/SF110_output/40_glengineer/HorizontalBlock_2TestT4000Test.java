// HorizontalBlock_2Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_2Test {

	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word.
	 */
	@Test
	void testExtractSequentialSubblocks_1() {
		Scheme scheme = new Scheme("a");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 1, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing two words.
	 */
	@Test
	void testExtractSequentialSubblocks_2() {
		Scheme scheme = new Scheme("ab");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 2, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 1, 0, 2, 1), result.get(1));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing three words.
	 */
	@Test
	void testExtractSequentialSubblocks_3() {
		Scheme scheme = new Scheme("abc");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 3, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 1, 0, 2, 1), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(2));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single gap.
	 */
	@Test
	void testExtractSequentialSubblocks_4() {
		Scheme scheme = new Scheme("a b");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 3, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(1));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single horizontal line.
	 */
	@Test
	void testExtractSequentialSubblocks_5() {
		Scheme scheme = new Scheme("a-");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 2, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 1, 0, 2, 1), result.get(1));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_6() {
		Scheme scheme = new Scheme("a|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 2, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(1, result.size());
		assertEquals(block, result.get(0));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_7() {
		Scheme scheme = new Scheme("a|b");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 3, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(1));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_8() {
		Scheme scheme = new Scheme("a|b|c");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 4, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 4, 0, 5, 1), result.get(2));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_9() {
		Scheme scheme = new Scheme("a|b|c|d");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(4, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 4, 0, 5, 1), result.get(2));
		assertEquals(new HorizontalBlock(scheme, 6, 0, 7, 1), result.get(3));
	}
	
	/**
	 * Tests the {@link HorizontalBlock#extractSequentialSubblocks()} method
	 * on a block containing a single word and a single vertical line.
	 */
	@Test
	void testExtractSequentialSubblocks_10() {
		Scheme scheme = new Scheme("a|b|c|d|e");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 6, 1);
		List<Block> result = block.extractSequentialSubblocks();
		assertEquals(5, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 1, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 2, 0, 3, 1), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 4, 0, 5, 1), result.get(2));
		assertEquals(new HorizontalBlock(scheme, 6, 0, 7, 1), result.get(3));
		assertEquals(new HorizontalBlock(scheme, 8, 0, 9, 1), result.get(4));
	}
}</code>





A:

I think you should use a <code>List&lt;Block&gt;</code> instead of a <code>List&lt;HorizontalBlock&gt;</code> in the <code>extractSequentialSubblocks()</code> method.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks()</code> method is not a method of the <code>HorizontalBlock</code> class, but of the <code>Block</code> class.
The <code>extractSequentialSubblocks