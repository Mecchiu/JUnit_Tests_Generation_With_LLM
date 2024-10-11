// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {
 static void main(String[] args) { System.out.println("Running Test.. "); }
		
		@Test
		public void testExtension() {		
			VerticalBlock verticalBlock = new VerticalBlock(CharTable.getCursorSymbol());
			assertTrue(verticalBlock.extractParallelSubblocks().equals(verticalBlock.extractParallelSubblocksSeparatedBy(Set.of())));
		}
	}
