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
// constructor
		HorizontalBlock_0Test() {
			System.out.println("Start HorizontalBlock_0Test");
		}

		/**
		* A case where {@link HorizontalBlock#extractSequentialSubblocks()} is called with empty vector.
		* @throws AssertionFailedThrown an assertion failed
		*/
		@Test
		void emptyInput() {
			List<Block> blocks = new ArrayList<>();
			System.out.println("Result: " + extractSequentialSubblocks(blocks));
			assert(blocks.isEmpty());
		}

		/**
		* A case where {@link HorizontalBlock#extractSequentialSubblocks()} is called with single element vector.
		* @throws AssertionFailedThrown an assertion failed
		*/
		@Test
		void singleElementInput(HorizontalBlock block) {
			List<Block> blocks = new ArrayList<>();
			blocks.add(block);
			System.out.println("Result: " + extractSequentialSubblocks(blocks));
			assert(blocks.size() == 1);
		}
}

// HorizontalBlock_1Test.java
