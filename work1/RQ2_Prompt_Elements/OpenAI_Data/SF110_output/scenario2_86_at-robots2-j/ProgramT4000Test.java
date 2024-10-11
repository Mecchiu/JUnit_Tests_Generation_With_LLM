// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 0.
		*/
		@Test
		void testCreateProgramMemory_0() {
				Program program = new Program();
				program.programCode = new short[0];
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(0, memoryArray.getSize());
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 1.
		*/
		@Test
		void testCreateProgramMemory_1() {
				Program program = new Program();
				program.programCode = new short[1];
				program.programCode[0] = (short) 0x1234;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(1, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 2.
		*/
		@Test
		void testCreateProgramMemory_2() {
				Program program = new Program();
				program.programCode = new short[2];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(2, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 3.
		*/
		@Test
		void testCreateProgramMemory_3() {
				Program program = new Program();
				program.programCode = new short[3];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(3, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 4.
		*/
		@Test
		void testCreateProgramMemory_4() {
				Program program = new Program();
				program.programCode = new short[4];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(4, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 5.
		*/
		@Test
		void testCreateProgramMemory_5() {
				Program program = new Program();
				program.programCode = new short[5];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(5, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 6.
		*/
		@Test
		void testCreateProgramMemory_6() {
				Program program = new Program();
				program.programCode = new short[6];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				program.programCode[5] = (short) 0x5678;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(6, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
				assertEquals((short) 0x5678, memoryArray.get(5));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 7.
		*/
		@Test
		void testCreateProgramMemory_7() {
				Program program = new Program();
				program.programCode = new short[7];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				program.programCode[5] = (short) 0x5678;
				program.programCode[6] = (short) 0x9ABC;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(7, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
				assertEquals((short) 0x5678, memoryArray.get(5));
				assertEquals((short) 0x9ABC, memoryArray.get(6));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 8.
		*/
		@Test
		void testCreateProgramMemory_8() {
				Program program = new Program();
				program.programCode = new short[8];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				program.programCode[5] = (short) 0x5678;
				program.programCode[6] = (short) 0x9ABC;
				program.programCode[7] = (short) 0xDEF0;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(8, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
				assertEquals((short) 0x5678, memoryArray.get(5));
				assertEquals((short) 0x9ABC, memoryArray.get(6));
				assertEquals((short) 0xDEF0, memoryArray.get(7));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 9.
		*/
		@Test
		void testCreateProgramMemory_9() {
				Program program = new Program();
				program.programCode = new short[9];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				program.programCode[5] = (short) 0x5678;
				program.programCode[6] = (short) 0x9ABC;
				program.programCode[7] = (short) 0xDEF0;
				program.programCode[8] = (short) 0x1234;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(9, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
				assertEquals((short) 0x5678, memoryArray.get(5));
				assertEquals((short) 0x9ABC, memoryArray.get(6));
				assertEquals((short) 0xDEF0, memoryArray.get(7));
				assertEquals((short) 0x1234, memoryArray.get(8));
		}
		
		/**
		* Test case for {@link Program#createProgramMemory()} method.
		* It tests the method with a program code of length 10.
		*/
		@Test
		void testCreateProgramMemory_10() {
				Program program = new Program();
				program.programCode = new short[10];
				program.programCode[0] = (short) 0x1234;
				program.programCode[1] = (short) 0x5678;
				program.programCode[2] = (short) 0x9ABC;
				program.programCode[3] = (short) 0xDEF0;
				program.programCode[4] = (short) 0x1234;
				program.programCode[5] = (short) 0x5678;
				program.programCode[6] = (short) 0x9ABC;
				program.programCode[7] = (short) 0xDEF0;
				program.programCode[8] = (short) 0x1234;
				program.programCode[9] = (short) 0x5678;
				MemoryArray memoryArray = program.createProgramMemory();
				assertEquals(10, memoryArray.getSize());
				assertEquals((short) 0x1234, memoryArray.get(0));
				assertEquals((short) 0x5678, memoryArray.get(1));
				assertEquals((short) 0x9ABC, memoryArray.get(2));
				assertEquals((short) 0xDEF0, memoryArray.get(3));
				assertEquals((short) 0x1234, memoryArray.get(4));
				assertEquals((short) 0x5678, memoryArray.get(5));
				assertEquals((short) 0x9ABC, memoryArray.get(6));
				assertEquals((short) 0xDEF0, memoryArray.get(7));
				assertEquals((short) 0x1234, memoryArray.get(8));
				assertEquals((short) 0x5678, memoryArray.get(9));
		}
		
}

// ReadOnlyMemoryArray.java
package net.virtualinfinity.atrobots.computer;

/**
 * A read-only memory array.
 *
 * @author Daniel Pitts
 */
public class ReadOnlyMemoryArray implements MemoryArray {
    private final short[] memory;

    public ReadOnlyMemoryArray(int size) {
        memory = new short[size];
    }

    public void flash(short[] programCode) {
        System.arraycopy(programCode, 0, memory, 0, programCode.length);
    }

    public int getSize() {
        return memory.length;
    }

    public short get(int address) {
        return memory[address];
    }

    public void set(int address, short value) {
        throw new UnsupportedOperationException("Read-only memory.");
