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
		* Construct a new {@link Memory_0Test#Memory_0Test(List)}.
		*
		* @param arrays the arrays to add.
		*/
		public Memory_0Test(BitwiseOrArray[] arrays) {
			assertEquals(1 << 20, arrays.length);
			this.arrays.add(arrays[0]);
		}

		/**
		 * Test the {@link Memory#size()} method.
		 */
        @Test
		public void test01() {
			List<MemoryArray> arrayArrayList = new ArrayList<MemoryArray>();
			arrayArrayList.add(new MemoryArray("memory", 10, 2));
			arrayArrayList.add(new MemoryArray("memory", 10, 2));
			Memory memory0Test = new Memory(arrayArrayList);
			int size = memory0Test.size();
			assertEquals(30, size);
			system((byte) 0);
			assertEquals(32, system());
			system((byte) 0);
			assertEquals(24, system());
		}

		private List<Memory> system(byte address) {
			final List<Memory> list = new ArrayList<Memory>();
			list.add(new Memory(0, 0, 0));
			if (address!= 0) {
				for (int i = 1, j = 0; i < 3; i++, j++) {
					if (AddressConstants.EQUAL_16_OR_32_BYTES.getValue()
							== 1) {
						list.add(new Memory(0, 4, address + (j*3)));
					}
				}
			}
			return list;
		}
}