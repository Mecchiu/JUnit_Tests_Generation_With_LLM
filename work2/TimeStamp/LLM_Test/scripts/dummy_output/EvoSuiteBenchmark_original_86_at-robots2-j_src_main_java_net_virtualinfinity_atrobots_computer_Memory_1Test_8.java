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
		
    final List<MemoryArray> arrays = new ArrayList<MemoryArray>();
    
    @Test
    void get() {
        MemoryArray array = new MemoryArray();
        array.setLength(8);
        array.setStartAddress(1);
        array.setAddress(0xc9cf8738);
        array.setLength(1);
//        System.out.println();
//        System.out.println("array.get() -> " + arrays.get(0));
        array.setLength(8);
        array.setStartAddress(0xc9cf873c + 1);
        array.setAddress(0xdeadbeef);
        assertEquals(array, arrays.get(0));
    }

}