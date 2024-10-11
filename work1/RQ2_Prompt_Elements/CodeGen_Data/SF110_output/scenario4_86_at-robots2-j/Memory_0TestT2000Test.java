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

	@Test
	public void testSize() {
		Memory_0 memory = new Memory_0();
		assertEquals(0, memory.size());
		
	}

	@Test
	public void testAdd2() {
		List<MemoryArray> arraylist1 = new ArrayList<MemoryArray>();
		MemoryArray array1 = new MemoryArray(7);
		array1.setAddr(1);
		array1.setRead_length(4);
		array1.setWrite_length(1);
		array1.setAddr(2);
		array1 = arraylist1.get(0);
		array1.setAddr(0);
		array1.setRead_length(1);
		array1.setWrite_length(1);
		array1.setAddr(2);
		array1.setRead_length(12);
		array1.setWrite_length(1);
		array1.setAddr(3);
		array1.setRead_length(15);
		array1.setWrite_length(1);
		array1.setAddr(4);
		array1.setRead_length(100);
		array1.setWrite_length(6);
		array1.setAddr(5);
		array1.setRead_length(1);
		arraylist1.add(array1);
		assertEquals(6, arraylist1.get(0).getRead_length());
		assertEquals(0, arraylist1.get(1).getWrite_length());
		MemoryArray array2 = new MemoryArray(100);
		array2.setAddr(1);
		array2.setWrite_length(4);
		array2.setRead_length(1);
		array2.setAddr(2);
		array2.setRead_length(1);
		array2.setWrite_length(1);
		arraylist1.add(array2);
		assertEquals(0, array2.getAddr());
		assertEquals(4, array2.getRead_length());
		
	}

	@Test
	public void testAdd3() {
		MemoryArray array10 = new MemoryArray(100);
		MemoryArray array11 = new MemoryArray(100);
		MemoryArray array12 = new MemoryArray(100);
		MemoryArray array21 = new MemoryArray(100);
		MemoryArray array22 = new MemoryArray(100);
		MemoryArray array23 = new MemoryArray(100);
		MemoryArray array30 = new MemoryArray(100);
		MemoryArray array31 = new MemoryArray(100);
		MemoryArray array32 = new MemoryArray(100);
		MemoryArray array33 = new MemoryArray(100);
		memory.addMemoryArray(array10);
		memory.addMemoryArray(array11);
		memory.addMemoryArray(array12);
		memory.addMemoryArray(array21);
		memory.addMemoryArray(array22);
		memory.addMemoryArray(array23);
		memory.addMemoryArray(array30);
		memory.addMemoryArray(array31);
		memory.addMemoryArray(array32);
		memory.addMemoryArray(array33);
		
		ArrayList<MemoryArray> arraylist = new ArrayList<MemoryArray>();
		arraylist.add(array11);
		arraylist.add(array10);
		arraylist.add(array21);
		arraylist.add(array22);
		arraylist.add(array23);
		assertEquals(4, arraylist.get(2).getRead_length());
		try {
			memory.addMemoryArray(array10);
		}
		catch (NoMemoryException e) {}
		try {
			memory.addMemoryArray(array11);
		}
		catch (NoMemoryException e) {
			assertEquals(Integer.MAX_VALUE, memory.addMemoryArray(array10).getAddr());
		}
		assertEquals(100, memory.addMemoryArray(array10).getAddr());
		assertEquals(100, memory.addMemoryArray(array11).getAddr());
		assertEquals(100, arraylist.get(2).getAddr());
		assertEquals(100, arraylist.get(2).getRead_length());
		
	}
}
