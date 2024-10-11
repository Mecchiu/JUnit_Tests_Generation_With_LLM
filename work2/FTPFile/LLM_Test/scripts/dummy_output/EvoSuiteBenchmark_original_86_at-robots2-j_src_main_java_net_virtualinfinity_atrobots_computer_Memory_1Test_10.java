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
		/**
		* This is a unit test case.
		* @throws ClassCastException if any elements of the array array parameter are of type {@code List<>}.
		* @throws NullPointerException if any element of the array array parameter is {@code null}
		* @throws IndexOutOfBoundsException if the index is negative or greater than the number of elements of the array.
		* @throws ArithmeticException if a negative or zero divisor is passed into the {@code compareAndSwap} method.
		* @throws Exception if an unexpected error occurs.
		*/		
	@Test
	void test() throws ClassCastException, NullPointerException, Exception {
		// Create a list of arrays where each array contains 1 Byte with the first Bit the last Byte.
		final List<MemoryArray> list = new ArrayList<>();
		
		// Add some tests; make sure we are never creating 0 bytes, then we test for the
		// following cases and throw exceptions for those cases:
		//   if any of the arrays contain 0 bytes
		//   if any of the arrays have fewer elements than it had
		list.add(new MemoryArray(0x1000));    // 0 bytes, no elements
		list.add(new MemoryArray(2));          // two elements, last is a second element
		list.add(new MemoryArray(new byte[]{5, 8, 6}));
		list.add(new MemoryArray(new short[]{1300, 13, 0}));
		list.add(new MemoryArray(new short[]{1200, 12, 6}, 2));
		
		// Add some more tests; make sure we are never creating 0 bytes, then we test for the
		// following cases and throw exceptions for those cases:
		//   if any of the arrays contain 0 bytes
		//   if any of the arrays have fewer elements than it had
		list.add(new MemoryArray(1));           // 1 Byte, no elements
		list.add(new MemoryArray(new byte[]{}));
		list.add(new MemoryArray(new short[]{}));
		list.add(new MemoryArray(new short[]{}));
		
		// Create a new memory object with all the arrays correctly.
		final Memory memory = new Memory(list.toArray(new MemoryArray[list.size()]));
		
		// check that the first element is the 2nd, and no second elements are the 1st,
		// and no more than the number given by the address of the first element.
		Memory.decrement(memory.get(Memory.unsigned));
		Memory.decrement(memory.get(Memory.unsigned));
		Memory.decrement(memory.get(Memory.unsigned));
		assertFalse(memory.get(Memory.length));
		assertFalse(memory.get(Memory.size));
		assertTrue(memory.get(Memory.byteLength));
		assertFalse(memory.get(Memory.intLength));
		assertFalse(memory.get(Memory.intLength + 1));
		assertEquals(2, memory.get(Memory.getOffset(Memory.length)));
		assertEquals(1, memory.get(Memory.getOffset(Memory.size)));
	}
}