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
	* The block is empty.
	*/
	@Test
	void testCase1() {
		HorizontalBlock block = new HorizontalBlock();
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	* Test case 2.
	* The block contains one word.
	*/
	@Test
	void testCase2() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	* Test case 3.
	* The block contains two words.
	*/
	@Test
	void testCase3() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	* Test case 4.
	* The block contains three words.
	*/
	@Test
	void testCase4() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(0, subblocks.size());
	}
	
	/**
	* Test case 5.
	* The block contains three words and one line.
	*/
	@Test
	void testCase5() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(1, subblocks.size());
		assertEquals(3, subblocks.get(0).size());
	}
	
	/**
	* Test case 6.
	* The block contains three words and two lines.
	*/
	@Test
	void testCase6() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		block.add(new HLinePosition(0, 10, 50, 10));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(2, subblocks.size());
		assertEquals(2, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
	}
	
	/**
	* Test case 7.
	* The block contains three words and three lines.
	*/
	@Test
	void testCase7() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		block.add(new HLinePosition(0, 10, 50, 10));
		block.add(new HLinePosition(0, 20, 50, 20));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(3, subblocks.size());
		assertEquals(1, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
	}
	
	/**
	* Test case 8.
	* The block contains three words and four lines.
	*/
	@Test
	void testCase8() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		block.add(new HLinePosition(0, 10, 50, 10));
		block.add(new HLinePosition(0, 20, 50, 20));
		block.add(new HLinePosition(0, 30, 50, 30));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(4, subblocks.size());
		assertEquals(1, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
		assertEquals(0, subblocks.get(3).size());
	}
	
	/**
	* Test case 9.
	* The block contains three words and five lines.
	*/
	@Test
	void testCase9() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		block.add(new HLinePosition(0, 10, 50, 10));
		block.add(new HLinePosition(0, 20, 50, 20));
		block.add(new HLinePosition(0, 30, 50, 30));
		block.add(new HLinePosition(0, 40, 50, 40));
		List<Block> subblocks = block.extractParallelSubblocks();
		assertEquals(5, subblocks.size());
		assertEquals(1, subblocks.get(0).size());
		assertEquals(1, subblocks.get(1).size());
		assertEquals(1, subblocks.get(2).size());
		assertEquals(0, subblocks.get(3).size());
		assertEquals(0, subblocks.get(4).size());
	}
	
	/**
	* Test case 10.
	* The block contains three words and six lines.
	*/
	@Test
	void testCase10() {
		HorizontalBlock block = new HorizontalBlock();
		block.add(new HWordPosition(0, 0, 10, 10));
		block.add(new HWordPosition(20, 0, 30, 10));
		block.add(new HWordPosition(40, 0, 50, 10));
		block.add(new HLinePosition(0, 0, 50, 0));
		block.add(new HLinePosition(0, 10, 50, 10));
		block.add(new HLinePosition(0, 20, 50, 20));
		block.add(new HLinePosition(0, 30, 50, 30));
		block.add(new HLinePosition(0, 40, 50, 40));
		block.add(new HLinePosition(0, 50, 50, 50));
