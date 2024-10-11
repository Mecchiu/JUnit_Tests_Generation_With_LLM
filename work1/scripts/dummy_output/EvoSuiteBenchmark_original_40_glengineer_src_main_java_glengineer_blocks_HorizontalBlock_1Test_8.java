// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains one unit test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {
		class Test {
		public Void run()
		{
            int x1 = 100;
            int y1 = 150;
            int y2 = 150;

            return null;
        }
		}
		@Test
		void run2() {
			Test t = new Test();
            int x1 = 100;
            int y1 = 150;
            int y2 = 150;

			t.run();
		}

		/**
		* Verifies the result when
		* all horizontal lines are not righter than the
		* end of the element where it occurs
		* (i.e. the word)
		* and the end of the line of the element is at the
		* specified vertical coordinate.
		* <p>
		* Does not allow the end of a horizontal line
		* to be further in the word
		* (as it would not be a natural split).
		*/
		@Test
		void blockEndAtHLINE() {
			Test t = new Test();
			assertFalse(HorizontalBlock.extractParallelSubblocks().equals(t.run()));
			assertEquals(HorizontalBlock.extractParallelSubblocks().get(0), t.run());
		}


}