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
		public static Test suite() throws Exception {

		VerticalBlockBuilder.scheme().extract("[a,b,c,d,f,s,x]")

			.withWidth(3).withHHeight(1);
		return new VerticalBlockBuilder.TestSuite();
	}

	int x1; /* Cell value. */
	int y1; /* Cell value to extend. */
	int x2; /* Cell value after extension. */
	int y2; /* Result of extension. */

	@Test
	void findAWordExtendToTheRightFrom() {
		HWordPosition b = new HWordPosition(new CharPosition(x1, y1));
		assertFalse(extractFirstSequentialSubblock().contains(extendToTheRight(x1, y1)));
		assertTrue(findAWordExtendingSubblockToTheRightFrom(b).contains(extendToTheRight(x2, y1)));
	}

	@Test
	void extractFirstSequentialSubblock() {
		assertTrue(extractFirstSequentialSubblock().contains(extendFromTheRight(x1, y1)));
	}

	@Test
	void extractFirstSequentialSubblockBelow() {
		assertTrue(extractFirstSequentialSubblockBelow(x1).contains(extendFromTheRight(x2, y2)));
	}

	@Test
	void extractFirstSequentialSubblockFromTheRight() {
		assertTrue(extractFirstSequentialSubblockFromTheRight(x1).contains(extendToTheRight(x2, y2)));
	}

	@Test
	void removeSmallHLinesFrom() {
		removeSmallHLinesFrom(Arrays.asList(x1,x2));

		assertTrue(sortedYsOfFromExtendingToTheRight(x1,y1).contains(2) &&
				sortedYsOfFromExtendingToTheRight(x2,y2).contains(2));

		assertTrue(extractFirstSequentialSubblock().contains(extendToTheRight(x1,y1)));
	}
}