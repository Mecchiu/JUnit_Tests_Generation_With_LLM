// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		private static final int MAX_CODE_SIZE = 20;

        // Unit test cases
        @Test
        void getTotalSize() {
            System.out.println("getTotalSize");
            assertEquals(MAX_CODE_SIZE + 1, Program.INSTANCE.getTotalSize());
        }
        @Test
        void writeToMemory() {
            System.out.println("write to memory");
            Program instance = Program.INSTANCE;
            Memory memory = instance.createProgramMemory();
            
            byte[] code = instance.getProgramCode();
            assertEquals(MAX_CODE_SIZE + 1, code.length);
            System.arraycopy(code, 0, memory.getData(), 0, MAX_CODE_SIZE + 1);
            memory.setData(new byte[MAX_CODE_SIZE + 1]);
			System.out.println("Success: "+memory.getData().length);
        }
        @Test
        void readFromMemory() {
            System.out.println("read from memory");
            Program instance = Program.INSTANCE;
            Memory memory = instance.createProgramMemory();
            
            byte[] code = instance.getProgramCode();
            assertEquals(MAX_CODE_SIZE + 1, code.length);

            memory.setData(new byte[code.length]);
			System.out.println("Success: "+memory.getData().length);
            // Reading code
            assertEquals(MAX_CODE_SIZE + 1, memory.getData().length);
            System.arraycopy(code, MAX_CODE_SIZE + 1, memory.getData(), 0, MAX_CODE_SIZE + 1);
            assertEquals(MAX_CODE_SIZE + 1, code.length);
        }

 /**
 * Returns the number of operations that can be executed by a program.
 * It is expected to be executed when the program is "started."
 * @return the number of operands that can be executed by a program.
 * @see Program#getTotalSize()
 */
	@Test
    void getOperandsLength() {
    		System.out.println("getOperandsLength");
    		Program instance = Program.INSTANCE;
    		// The following operation is not defined: 
    		int i = MAX_CODE_SIZE;
    		assertEquals(0, instance.getOperandsLength());
 
    		for (; i >= 0; i--) {
				System.out.println("op: "+i);
        		short j = (short)i;
        		assertEquals(2, instance.getOperandsLength());
        		assertEquals(2, instance.getOperandsLength(j));
        		assertEquals(2, instance.getOperandsLength(j - 1));
        	}
    		
    }
}