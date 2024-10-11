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
		 * Get the total size of this memory.
		 *
		 * @return the size.
		 */
		public int size();
		
        final static int BOOST_WIDTH = 5;
        final static int BOOST_LOW_VAL = 0x55;
        final static int BOOST_HIGH_VAL = 0x5555;
        
        /**
         * Add the next section of memory.
         *
         * @param array a section of memory.
         */
        public void addMemoryArray(MemoryArray array);
				
		/**
		 * Get the value at the specific address (index 0).
		 *
		 * @param address the address to read.
		 * @param index   the index at which the value of 0 will be read.
		 * @return the value at that address, or 0 if invalid.
		 */
		public short get(int address, int index);

		/**
		 * Change the bitwidth of this RAM.
		 * @param width the new width.
		 */
		public void set(int width);
		
		/**
		 * Write the value at the specific address (index 0).
		 * @param address the address to write at that index.
		 * @param value  the value.
		 */
		public void set(int address, short value);
		
		/**
		 * Start incrementing.
		 */
		public void increment(int address, short value);
		
		/**
		 * Start decrement.
		 */
		public void decrement(int address, short value);
		
		/**
		 * Read the value at the specific address (index 0).
		 * @param address the address to read.
		 * @param index   the index at which the value of 0 will be read.
		 * @return the value at that address, or 0 if invalid.
		 */
		public short get(int address, int index);
		
		/**
		 * Set the value at the specific index.
		 *
		 * @param address the address to write.
		 * @param index   the index at which the value is written.
		 * @param value   the value.
		 */
		public void set(int address, int index, short value);
		
		/**
		 * Start incrementing.
		 */
		public void increment(int address, int index, short value);
		
		/**
		 * Start decrement.
		 */
		public void decrement(int address, int index, short value);
		
		/**
		 * Read the value at the specific index.
		 * @param index the index to read the value.
		 * @return the value at the index, or 0 if the value is invalid.
		 */
		public short get(int index);
		
		/**
		 * Decrement the size of the RAM
		 */
		public void decrement(int address);
		
		/**
		 * Increment the size of the RAM
		 */
		public void increment(int address);
}