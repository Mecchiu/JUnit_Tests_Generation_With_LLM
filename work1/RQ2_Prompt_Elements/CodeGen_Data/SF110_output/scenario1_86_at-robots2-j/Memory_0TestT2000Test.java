// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
class Memory_0Test {
/**
		 * Test of the size operation method.
		 */
		@Test
		public void testSize() {
			assertEquals("There should be 2 ram in the Memory", 2, new Memory().size());
		}
		
		/**
		 * Test of a number of arrays contained within the Memory.
		 */
		@Test
		public void testArrays_list_array_array() {
			List<MemoryArray> arrays = new ArrayList<MemoryArray>(3);
			arrays.add(new MemoryArray(0));
			arrays.add(new MemoryArray(1));
			arrays.add(new MemoryArray(2));
			
			new Memory().arrays(arrays);

			assertTrue(arrays.size() == 3);
			for (MemoryArray item : arrays) {
				assertTrue(item.size() == 0);
			}
		}
		
}