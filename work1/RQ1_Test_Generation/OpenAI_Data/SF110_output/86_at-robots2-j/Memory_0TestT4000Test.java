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
				assertEquals(0, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				assertEquals(1, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_2() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				assertEquals(3, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_3() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				assertEquals(6, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_4() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				assertEquals(10, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_5() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				memory.addMemoryArray(new MemoryArray(5));
				assertEquals(15, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_6() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				memory.addMemoryArray(new MemoryArray(5));
				memory.addMemoryArray(new MemoryArray(6));
				assertEquals(21, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_7() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				memory.addMemoryArray(new MemoryArray(5));
				memory.addMemoryArray(new MemoryArray(6));
				memory.addMemoryArray(new MemoryArray(7));
				assertEquals(28, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_8() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				memory.addMemoryArray(new MemoryArray(5));
				memory.addMemoryArray(new MemoryArray(6));
				memory.addMemoryArray(new MemoryArray(7));
				memory.addMemoryArray(new MemoryArray(8));
				assertEquals(36, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_9() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				memory.addMemoryArray(new MemoryArray(2));
				memory.addMemoryArray(new MemoryArray(3));
				memory.addMemoryArray(new MemoryArray(4));
				memory.addMemoryArray(new MemoryArray(5));
				memory.addMemoryArray(new MemoryArray(6));
				memory.addMemoryArray(new MemoryArray(7));
				memory.addMemoryArray(new MemoryArray(8));
				memory.addMemoryArray(new MemoryArray(9));
				assertEquals(45, memory.size());
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

    public MemoryCell(Memory memory, int index) {
        this.memory = memory;
        this.index = index;
    }

    public short get() {
        return memory.get(index);
    }

    public void set(short value) {
        memory.set(index, value);
    }

    public void or(short value) {
        memory.or(index, value);
    }

    public void and(short value) {
        memory.and(index, value);
    }

    public void increment() {
        memory.increment(index);
    }

    public void decrement() {
        memory.decrement(index);
    }
}

// Computer.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.interrupts.InterruptHandler;

/**
 * Represents a computer.
 *
 * @author Daniel Pitts
 */
public class Computer {
    private final Memory memory;
    private final InterruptHandler interruptHandler;
    private final ComputerErrorHandler errorHandler;
    private final Registers registers;
    private final Flags flags;
    private final InstructionSet instructionSet;
    private final InstructionPointer instructionPointer;
    private final Stack stack;
    private final int[] scratch;
    private final int[] scratch2;
    private final int[] scratch3;
    private final int[] scratch4;
    private final int[] scratch5;
    private final int[] scratch6;
    private final int[] scratch7;
    private final int[] scratch8;
    private final int[] scratch9;
    private final int[] scratch10;
    private final int[] scratch11;
    private final int[] scratch12;
    private final int[] scratch13;
    private final int[] scratch14;
    private final int[] scratch15;
    private final int[] scratch16;
    private final int[] scratch17;
    private final int[] scratch18;
    private final int[] scratch19;
    private final int[] scratch20;
    private final int[] scratch21;
    private final int[] scratch22;
    private final int[] scratch23;
    private final int[] scratch24;
    private final int[] scratch25;
    private final int[] scratch26;
    private final int[] scratch27;
    private final int[] scratch28;
    private final int[] scratch29;
    private final int[] scratch30;
    private final int[] scratch31;
    private final int[] scratch32;
    private final int[] scratch33;
    private final int[] scratch34;
    private final int[] scratch35;
    private final int[] scratch36;
    private final int[] scratch37;
    private final int[] scratch38;
    private final int[] scratch39;
    private final int[] scratch40;
    private final int[] scratch41;
    private final int[] scratch42;
    private final int[] scratch43;
    private final int[] scratch44;
    private final int[] scratch45;
    private final int[] scratch46;
    private final int[] scratch47;
    private final int[] scratch48;
    private final int[] scratch49;
    private final int[] scratch50;
    private final int[] scratch51;
    private final int[] scratch52;
    private final int[] scratch53;
    private final int[] scratch54;
    private final int[] scratch55;
    private final int[] scratch56;
    private final int[] scratch57;
    private final int[] scratch58;
    private final int[] scratch59;
    private final int[] scratch60;
    private final int[] scratch61;
    private final int[] scratch62;
    private final int[] scratch63;
    private final int[] scratch64;
    private final int[] scratch65;
    private final int[] scratch66;
    private final int[] scratch67;
    private final int[] scratch68;
    private final int[] scratch69;
    private final int[] scratch70;
    private final int[] scratch71;
    private final int[] scratch72;
    private final int[] scratch73;
    private final int[] scratch74;
    private final int[] scratch75;
    private final int[] scratch76;
    private final int[] scratch77;
    private final int[] scratch78;
    private final int[] scratch79;
    private final int[] scratch80;
    private final int[] scratch81;
    private final int[] scratch82;
    private final int[] scratch83;
    private final int[] scratch84;
    private final int[] scratch85;
    private final int[] scratch86;
    private final int[] scratch87;
    private final int[] scratch88;
    private final int[] scratch89;
    private final int[] scratch90;
    private final int[] scratch91;
    private final int[] scratch92;
    private final int[] scratch93;
    private final int[] scratch94;
    private final int[] scratch95;
    private final int[] scratch96;
    private final int[] scratch97;
    private final int[] scratch98;
    private final int[] scratch99;
    private final int[] scratch100;
    private final int[] scratch101;
    private final int[] scratch102;
    private final int[] scratch103;
    private final int[] scratch104;
    private final int[] scratch105;
    private final int[] scratch106;
    private final int[] scratch107;
    private final int[] scratch108;
    private final int[] scratch109;
    private final int[] scratch110;
    private final int[] scratch111;
    private final int[] scratch112;
    private final int[] scratch113;
    private final int[] scratch114;
    private final int[] scratch115;
    private final int[] scratch116;
    private final int[] scratch117;
    private final int[] scratch118;
    private final int[] scratch119;
    private final int[] scratch120;
    private final int[] scratch121;
    private final int[] scratch122;
    private final int[] scratch123;
    private final int[] scratch124;
    private final int[] scratch125;
    private final int[] scratch126;
    private final int[] scratch127;
    private final int[] scratch128;
    private final int[] scratch129;
    private final int[] scratch130;
    private final int[] scratch131;
    private final int[] scratch132;
    private final int[] scratch133;
    private final int[] scratch134;
    private final int[] scratch135;
    private final int[] scratch136;
    private final int[] scratch137;
    private final int[] scratch138;
    private final int[] scratch139;
    private final int[] scratch140;
    private final int[] scratch141;
    private final int[] scratch142;
    private final int[] scratch143;
    private final int[] scratch144;
    private final int[] scratch145;
    private final int[] scratch146;
    private final int[] scratch147;
    private final int[] scratch148;
    private final int[] scratch149;
    private final int[] scratch150;
    private final int[] scratch151;
    private final int[] scratch152;
    private final int[] scratch153;
    private final int[] scratch154;
    private final int[] scratch155;
    private final int[] scratch156;
    private final int[] scratch157;