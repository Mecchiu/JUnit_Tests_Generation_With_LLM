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
	void size() {
		Memory memory = new Memory();
		assertEquals(0, memory.size());
	}
	
	private void create(short index, MemoryArray addressArray, int elementCount) {
	
		MemoryArray array      = new MemoryArray(index, addressArray);
		MemoryCell address    = new MemoryCell(new MemoryArray(index, addressArray));
		short elementSize = (short) addressArray.getElementSize();
		
		assertEquals(elementCount, array.getElementCount(elementSize));
		for (int i = 0; i < elementCount; ++i){
			array.setElement(i, 0L);
		}
		List<ArrayList<Long>>  result =  memory.create(address, elementCount);
		result.forEach(elementArray -> assertEquals(elementCount, array.getElementCount(elementArray.getElementSize())));
		
	}
}