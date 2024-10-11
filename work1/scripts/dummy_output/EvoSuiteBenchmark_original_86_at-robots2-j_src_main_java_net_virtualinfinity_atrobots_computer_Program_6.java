// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		/**
		* Creates a unit test case for {@link Program#createProgramMemory()}.
		*
		* @throws Exception if something goes wrong.
		*/		
		@Test
		void createProgramMemory() throws Exception {
			Program test = new Program(new short [] {0x5e, 0x52, 0x61});
			MemoryArray testArray = test.createProgramMemory();
			
			assert (testArray.getShort(0, 0) == 0x5e);
			assert (testArray.getShort(0, 1) == 0x52);
			assert (testArray.getShort(0, 2) == 0x61);
			
		}
}