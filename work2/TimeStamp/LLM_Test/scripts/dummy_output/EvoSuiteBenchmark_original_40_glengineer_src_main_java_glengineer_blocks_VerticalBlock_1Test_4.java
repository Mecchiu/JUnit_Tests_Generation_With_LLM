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
		public VerticalBlock_1Test(){
		}
		/**
		* Verifies whether a vertical block
		* contains only horizontal line.
		*/
		@Test
		public void vertValidation() throws VerificationException{
			CharPosition p1 = new CharPosition("Line (1)", "Word");
			CharPosition p2 = new CharPosition("Line (2)", "Line (1)", "Word1");
			CharPosition p3 = new CharPosition("Line (3)", "Line", 3);
			CharPosition p4 = new CharPosition("Line (4)", "Line (1)", "Word (3", "");
			CharPosition p5 = new CharPosition("Line (5)", "Line (1)", "Word (4", "");
			CharPosition p6 = new CharPosition("Line (6)", "Word (3", "");
			CharPosition p7 = new CharPosition("Line (7)", "Word (4", "");
}
}