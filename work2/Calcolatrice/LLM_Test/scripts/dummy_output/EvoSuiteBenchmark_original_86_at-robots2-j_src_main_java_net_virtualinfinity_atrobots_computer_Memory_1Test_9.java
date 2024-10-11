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
		* Tests the {@link Memory#addMemoryArray(MemoryArray)}.
		*/
    @Test
    void addAddress1() {
    int address = (unsigned(5) << 4);
		for (int i=0; i < 5; i++) {
			assertEquals(address, Memory.get(address+i));
    }
    }

    /**
	{@link Memory#addMemoryArray(MemoryArray)}.
	*/
    @Test
    void addAddress5() {
        int address = (unsigned(5) << 4);
    }

    @Test
    void addAddress13() {
        throw new UnsupportedOperationException("Unable to test due to unimplemented method for Memory.");
    }

    @Test
    void addAddress255() {
        throw new UnsupportedOperationException("Unable to test due to unimplemented method for Memory.");
    }

    @Test
    void addZero() {
            assertEquals(0, Memory.get(0));
            assertEquals(0, Memory.addressLength(0));
            assertEquals(0, Memory.addressLength(Address.BYTE.getAddress()));
            assertEquals(0, Memory.addressLength(Address.HALF_FLASH.getAddress()));
    }

    @Test
    void readAddress1() {
	    MemoryArray array = new MemoryArray();
	    array.read(0, 3);
		assertTrue(array.containsAddress(Address.BYTE.getAddress()));
		assertTrue(array.containsAddress(Address.INT_VALUE_REG.getAddress()));
		assertTrue(array.containsAddress(Address.NONE.getAddress()));
	    array.read(1, 3);
		assertTrue(array.containsShort(Short.valueOf((short) 2)));
		assertTrue(array.containsShort(Short.valueOf((short) 8)));
	    array.read(1, 9);
		assertTrue(array.containsShort(Short.valueOf((short) 10)));
		assertTrue(array.containsShort(Short.valueOf((short) 4)));
		array.read(1, 12);
		assertTrue(array.containsShort(Short.valueOf((short) 6)));
		array.read(1, 29);
		assertTrue(array.containsShort(Short.valueOf((short) 5)));
		array.read(1, 27);
		assertTrue(array.containsShort(Short.valueOf((short) 8)));
	    array.read(2, 16);
		assertTrue(array.contains(Short.valueOf((short) 0)));
	}
}
// Memory_2.java