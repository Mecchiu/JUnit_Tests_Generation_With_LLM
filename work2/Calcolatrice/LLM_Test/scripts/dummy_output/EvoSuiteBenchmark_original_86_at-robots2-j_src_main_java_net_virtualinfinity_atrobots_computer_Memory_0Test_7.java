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
		
    @Test(expected = NullPointerException.class)
		public void testNullPointer() {
            new Memory().size();
        }
    
    @Test
    public void testSize() {
		
        assertEquals(0, new Memory().size());
        assertEquals(0, new Memory(null).size());
        assertEquals(0, new Memory2(null).size());
        assertEquals(0, new Memory(0, 1-1).size());
        assertEquals(0, new Memory(0, 2, 1-2, 33-33-99-13).size());
        assertEquals(1, new Memory(1).size());
        assertEquals(1, new Memory(2).size());
        assertEquals(2, new Memory(3).size());
        assertEquals(3, new Memory(4, 11-22, 31-28, 10-32, 30-10-29, 7-7, 3, 15-10, 1-16-11, 0, 15-10-11).size());
    }
	
    @Test
    public void testArray() {
        MemoryArray array;
        
        //empty arrays
        array = new MemoryArray();
        assertArrayEquals(new MemoryArray(),array);
        array = new MemoryArray(new byte[0]);
        assertArrayEquals(new MemoryArray(),array);
        array = new MemoryArray(new byte[32]);
        assertArrayEquals(new MemoryArray(),array);

        //one element
        array = new MemoryArray(new MemoryArray());

        //empty one element
        assertEquals(ArrayList.class,new MemoryArray().getClass());
        assertEquals(new MemoryArray(),array.getArray());
        array = new MemoryArray(new short[0]);
        array = new MemoryArray(new byte[32]);
        array = new MemoryArray(new boolean[32]);
}
}