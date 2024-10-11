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
		
	private void runTest(VerticalBlock vb) {

	}

	@Test
	void extractSequentialSubblocks() {
		runTest(new VerticalBlock(new VerticalPosition(3, 0), 7, 3, 11, 6));
		runTest(new VerticalBlock(new VerticalPosition(3, 0), 7, 16, 13, 13, 14, 15, 18));
		runTest(new VerticalBlock(-1, 8, 7, 22, 4, 9, 7, 26));
		runTest(new VerticalBlock(-1, 8, 7, 22, 4, 9, 7, 36));	
	}

}