// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {
		/**
		 * Tests the findBestInVisiblePositions_1Method.
		 */
		@Test
		void testFindBestInVisiblePositions_1() {
				// Given
				List<HWordPosition> positions = new ArrayList<>(4);
				positions.add(HWordPosition.create(0, 1));
				positions.add(HWordPosition.create(2, 1));
				positions.add(HWordPosition.create(3, 1));
				positions.add(HWordPosition.create(3, 2));
}
}