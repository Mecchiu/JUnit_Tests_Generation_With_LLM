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
		
	@Test
	void extractParallelSubblocksShouldBeAbleToExtendBL() {
		Position a = new Position().set(0, 1);
		Position b = new Position().set(2, 1);
		assertEquals(new Parallelogram(1, 2, 0).combine(b),
				new Parallelogram(1, 2, 0).combine(a));
	}
		
}