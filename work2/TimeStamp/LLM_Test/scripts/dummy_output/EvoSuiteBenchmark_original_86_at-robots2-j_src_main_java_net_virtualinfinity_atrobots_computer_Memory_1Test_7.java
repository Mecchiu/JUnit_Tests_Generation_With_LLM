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
		@Test
		public void testGet() {
			Computer computer = new Computer();
			Memory memory = computer.getMemory();
			assertNotNull(memory);
			assertEquals(0, memory.size());
		}

		@Test
		public void testAddMemoryArray() {
			Computer computer = new Computer();
            Memory memory = computer.getMemory();
			byte[] dataBytes = new byte[] { 127, 127, 127 };
			MemoryArray  aArray = new MemoryArray(dataBytes);
			computer.addMemoryArray(aArray);
			memory = computer.getMemory();
			assertNotNull(memory);
			// assertEquals(dataBytes.length, memory.size());
		}
}