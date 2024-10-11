// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#size()} method.
*/
class Memory_0Test {

		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_0() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x10000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x20000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_2() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x30000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_3() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x40000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_4() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x50000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_5() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x60000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_6() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x70000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_7() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x80000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_8() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0x90000, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_9() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				memory.addMemoryArray(new MemoryArray(0x10000));
				assertEquals(0xA0000, memory.size());
		}
		
}

// MemoryArray.java
package net.virtualinfinity.atrobots.computer;

/**
 * A section of memory.
 *
 * @author Daniel Pitts
 */
public class MemoryArray {
    private final short[] memory;
    private ComputerErrorHandler errorHandler;

    /**
     * Create a new section of memory.
     *
     * @param size the size of the memory.
     */
    public MemoryArray(int size) {
        memory = new short[size];
    }

    /**
     * Get the size of this memory section.
     *
     * @return the size.
     */
    public int size() {
        return memory.length;
    }

    /**
     * Read the value at the specific address
     *
     * @param