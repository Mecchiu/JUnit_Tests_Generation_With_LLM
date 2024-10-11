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
		 * Returns the size of this memory.
		 *
		 * @return the size.
		 */
		@Test
		void memory_size() {
			assertEquals(Memory.size(), 0);
		}
}