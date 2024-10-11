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
		