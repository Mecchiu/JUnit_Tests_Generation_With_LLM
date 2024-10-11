// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#get(int)} method.
*/
class Memory_1Test {
UnsignedAddressAddressUnitTest {

		@Test
		public void unitTest() {
				RAMMemory ram = RAMMemory.createRam();
				assertEquals(RAMMemory.RAM_SIZE, ram.size());
				ram.addMemoryArray(new RAMArray());
				RAMArray array = ram.get(RamMemory.ROM_ADDRESS);
				assertEquals(1, array.getLength());
				RAMMemory.RAM_SIZE++;
				int address = RamMemory.ROM_ADDRESS + RamMemory.RAM_SIZE * RamMemory.ROM_LENGTH_ENTRIES;
				short value = RamMemory.RAM_SIZE * RamMemory.RAM_LENGTH_ENTRIES;
				RAMMemory.or(address, value);
				array = ram.get(RamMemory.ROM_ADDRESS);
				RAMArray.RAM_OFFSET_BITS_SHIFT = RamMemory.RAM_PALLET_OFFSET_BITS_SHIFT;
				if (RamMemory.ROM_PALLET_OFFSET_BITS_SHIFT == RamMemory.ROM_OFFSET_BITS_SHIFT) {
						assertEquals(value, array.getValue());
				} else {
						assertEquals(RamMemory.RAM_SIZE * RamArray.RAM_SIZE, array.getValue());
				}
			RAMMemory.size();
		}
		
}

// MemoryArray.java
class RAMArray extends RAMMemoryArray {
	RAMArray(short length, short unitLength, short startOffset, short valueOffset, short endOffset) {
		super(length, unitLength, startOffset, valueOffset, endOffset);
	}
}
