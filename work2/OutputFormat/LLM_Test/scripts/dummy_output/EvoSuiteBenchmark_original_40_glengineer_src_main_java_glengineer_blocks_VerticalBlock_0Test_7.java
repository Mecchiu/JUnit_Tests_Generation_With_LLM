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
		* Initializes the instance.
		*/
		public VerticalBlock_0Test(){
				final Position position = new Position ();
		}
		/**
		* The test method for {@link VerticalBlock#extractSequentialSubblocks()}.
		*/
		@Test
		public void test_01_extractSequentialSubblocks(){

				VerticalBlock verticalBlock = VerticalBlock.extractSequentialSubblocks();
				assertNotNull(verticalBlock);
				assertSame(verticalBlock, verticalBlock);
				assertEquals(verticalBlock.getClass(), VerticalBlock.class);
				assertEquals(verticalBlock.getClass().getSuperclass(), VerticalBlock.class);
				verticalBlock = VerticalBlock_0.extractSequentialSubblocks();
				assertNotNull(verticalBlock);
				assertSame(verticalBlock, verticalBlock);
}
}