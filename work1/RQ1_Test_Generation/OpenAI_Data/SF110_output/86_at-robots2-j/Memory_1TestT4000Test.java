// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#get(int)} method.
*/
class Memory_1Test {

		/**
		* Test case for {@link Memory#get(int)}
		*
		* @see Memory#get(int)
		*/
		@Test
		void testGet() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(new short[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 }));
				assertEquals(100, memory.size());
				assertEquals(0, memory.get(0));
				assertEquals(1, memory.get(1));
				assertEquals(2, memory.get(2));
				assertEquals(3, memory.get(3));
				assertEquals(4, memory.get(4));
				assertEquals(5, memory.get(5));
				assertEquals(6, memory.get(6));
				assertEquals(7, memory.get(7));
				assertEquals(8, memory.get(8));
				assertEquals(9, memory.get(9));
				assertEquals(10, memory.get(10));
				assertEquals(11, memory.get(11));
				assertEquals(12, memory.get(12));
				assertEquals(13, memory.get(13));
				assertEquals(14, memory.get(14));
				assertEquals(15, memory.get(15));
				assertEquals(16, memory.get(16));
				assertEquals(17, memory.get(17));
				assertEquals(18, memory.get(18));
				assertEquals(19, memory.get(19));
				assertEquals(20, memory.get(20));
				assertEquals(21, memory.get(21));
				assertEquals(22, memory.get(22));
				assertEquals(23, memory.get(23));
				assertEquals(24, memory.get(24));
				assertEquals(25, memory.get(25));
				assertEquals(26, memory.get(26));
				assertEquals(27, memory.get(27));
				assertEquals(28, memory.get(28));
				assertEquals(29, memory.get(29));
				assertEquals(30, memory.get(30));
				assertEquals(31, memory.get(31));
				assertEquals(32, memory.get(32));
				assertEquals(33, memory.get(33));
				assertEquals(34, memory.get(34));
				assertEquals(35, memory.get(35));
				assertEquals(36, memory.get(36));
				assertEquals(37, memory.get(37));
				assertEquals(38, memory.get(38));
				assertEquals(39, memory.get(39));
				assertEquals(40, memory.get(40));
				assertEquals(41, memory.get(41));
				assertEquals(42, memory.get(42));
				assertEquals(43, memory.get(43));
				assertEquals(44, memory.get(44));
				assertEquals(45, memory.get(45));
				assertEquals(46, memory.get(46));
				assertEquals(47, memory.get(47));
				assertEquals(48, memory.get(48));
				assertEquals(49, memory.get(49));
				assertEquals(50, memory.get(50));
				assertEquals(51, memory.get(51));
				assertEquals(52, memory.get(52));
				assertEquals(53, memory.get(53));
				assertEquals(54, memory.get(54));
				assertEquals(55, memory.get(55));
				assertEquals(56, memory.get(56));
				assertEquals(57, memory.get(57));
				assertEquals(58, memory.get(58));
				assertEquals(59, memory.get(59));
				assertEquals(60, memory.get(60));
				assertEquals(61, memory.get(61));
				assertEquals(62, memory.get(62));
				assertEquals(63, memory.get(63));
				assertEquals(64, memory.get(64));
				assertEquals(65, memory.get(65));
				assertEquals(66, memory.get(66));
				assertEquals(67, memory.get(67));
				assertEquals(68, memory.get(68));
				assertEquals(69, memory.get(69));
				assertEquals(70, memory.get(70));
				assertEquals(71, memory.get(71));
				assertEquals(72, memory.get(72));
				assertEquals(73, memory.get(73));
				assertEquals(74, memory.get(74));
				assertEquals(75, memory.get(75));
				assertEquals(76, memory.get(76));
				assertEquals(77, memory.get(77));
				assertEquals(78, memory.get(78));
				assertEquals(79, memory.get(79));
				assertEquals(80, memory.get(80));
				assertEquals(81, memory.get(81));
				assertEquals(82, memory.get(82));
				assertEquals(83, memory.get(83));
				assertEquals(84, memory.get(84));
				assertEquals(85, memory.get(85));
				assertEquals(86, memory.get(86));
				assertEquals(87, memory.get(87));
				assertEquals(88, memory.get(88));
				assertEquals(89, memory.get(89));
				assertEquals(90, memory.get(90));
				assertEquals(91, memory.get(91));
				assertEquals(92, memory.get(92));
				assertEquals(93, memory.get(93));
				assertEquals(94, memory.get(94));
				assertEquals(95, memory.get(95));
				assertEquals(96, memory.get(96));
				assertEquals(97, memory.get(97));
				assertEquals(98, memory.get(98));
				assertEquals(99, memory.get(99));
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
     * @param memory the memory.
     */
    public MemoryArray(short[] memory) {
        this.memory = memory;
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
     * @param address the address to read.
     * @return the value at that address, or 0 if invalid.
     */
    public short get(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return 0;
        }
        return memory[address];
    }

    /**
     * writes the value at the specific address
     *
     * @param address the address to write.
     * @param value   the value to write at that address.
     */
    public void put(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] = value;
    }

    /**
     * Bitwise-or the value at the given location with the given value.
     *
     * @param address the address
     * @param value   the value to or.
     */
    public void or(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] |= value;
    }

    /**
     * Bitwise-and the value at the given location with the given value.
     *
     * @param address the address
     * @param value   the value to or.
     */
    public void and(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] &= value;
    }

    public void setErrorHandler(ComputerErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public void decrement(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]--;
    }

    public void increment(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]++;
    }
}

// MemoryCell.java
package net.virtualinfinity.atrobots.computer;

/**
 * A memory cell.
 *
 * @author Daniel Pitts
 */
public class MemoryCell {
    private final Memory memory;
    private final int index;

    /**
     * Create a new memory cell.
     *
     * @param memory the memory.
     * @param index  the index.
     */
    public MemoryCell(Memory memory, int index) {
        this.memory = memory;
        this.index = index;
    }

    /**
     * Get the value of this memory cell.
     *
     * @return the value.
     */
    public short get() {
        return memory.get(index);
    }

    /**
     * Set the value of this memory cell.
     *
     * @param value the value.
     */
    public void set(short value) {
        memory.set(index, value);
    }

    /**
     * Increment the value of this memory cell.
     */
    public void increment() {
        memory.increment(index);
    }

    /**
     * Decrement the value of this memory cell.
     */
    public void decrement() {
        memory.decrement(index);
    }

    /**
     * Bitwise-or the value of this memory cell with the given value.
     *
     * @param value the value to or.
     */
    public void or(short value) {
        memory.or(index, value);
    }

    /**
     * Bitwise-and the value of this memory cell with the given value.
     *
     * @param value the value to or.
     */
    public void and(short value) {
        memory.and(index, value);
    }
}

// MemoryCell_1Test.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MemoryCell}.
* It contains ten unit test cases for the {@link MemoryCell#get()} method.
*/
class MemoryCell_1Test {
		
		/**
		* Test case for {@link MemoryCell#get()}
		*
		* @see MemoryCell#get()
		*/
		@Test
		void testGet() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(new short[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 }));
				memory.addMemoryArray(new MemoryArray(new short[] { 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 }));
				MemoryCell memoryCell = memory.getCell(0);
				assertEquals(0, memoryCell.get());
				memoryCell = memory.getCell(1);
				assertEquals(1, memoryCell.get());
				memoryCell = memory.getCell(2);
				assertEquals(2, memoryCell.get());
			