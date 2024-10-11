// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {
		private ScanState current;
		private HWordPosition firstEntity;
		private List<Block> subblocks;
		private List<Block> parallelSubblocks;
		private Map<Integer, Integer> ySorted;
		private List<Integer> ySeparators;
		private String name ;
		private Block b;

	private void init(String name ) {
		this.name = name;
	}

	@Test
	void test() {
		init(name);
		this.b = this.subblocks.get(0);
		this.current = this.firstEntity = this.firstEntityBelow(0,0);

		// 1. extract first sequential subblock
		this.subblocks = this.b.extractSequentialSubblocks();

		assertFalse(this.subblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		this.subblocks.removeAll(this.current);

		assertFalse(this.subblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 2. extract parallel subblocks
		this.parallelSubblocks = this.b.extractParallelSubblocks();

		assertFalse(this.parallelSubblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 3. extract parallel subblocks
		this.subblocks.removeAll(this.current);

		assertFalse(this.subblocks.isEmpty());
		this.subblocks.clear();
		this.current.clear();

		// 4. extract parallel subblocks separated by lines;
		this.parallelSubblocks = this.b.extractParallelSubblocksSeparatedByLines(this.subblocks);

		assertFalse(this.parallelSubblocks.isEmpty());
		assertTrue(this.current.isEmpty());

		// 5. optimize parallel subblocks
		this.b.optimizeParallelSubblocks();

		assertFalse(this.parallelSubblocks.isEmpty());
		assertFalse(this.current.isEmpty());

		this.ySeparators = this.b.sortedYsOf(this.current);

		assertFalse(this.ySeparators.isEmpty());
		assertFalse(this.current.isEmpty());

	}

}