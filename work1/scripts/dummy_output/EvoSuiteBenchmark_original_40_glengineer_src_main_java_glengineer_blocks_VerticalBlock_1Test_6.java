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
		protected CharPosition currentWord;
		private Set<VWordPosition> vLines;
		private Set<VWordPosition> vWords;
		private boolean isALine;
		private int positionLimit;
		protected char c;
		private Set<CharPosition1> horizontalLines;
		private Set<CharPosition1> horizontalGaps;
		private List<CharPosition1> verticalLines;
		private List<CharPosition1> verticalGaps;
		
		
		/**
		* Creates a new test case for the {@link VerticalBlock_1Test#extractParallelSubblocks()} method.
		*/
		VerticalBlock_1Test() {
		}

		/**
		* Creates a new test case for the {@link VerticalBlock_1Test#extractWordInCurrentLine()} method.
		*/
		void runTest() { 
			initializeCurrentWord();
}
}