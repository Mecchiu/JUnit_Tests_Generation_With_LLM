// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

	@Test
    public void programTest() throws Exception {
			
		final Program program = new Program();
		final MemoryArray programMemoryArray = program.createProgramMemory();
		
    final MemoryArray[] inputMemoryArray = {
    			new MemoryArray(new byte[] {(byte)0xF0, (byte)0xF1, (byte)0xF2, (byte)0xF3,
                    (byte)0xF4, (byte)0xF5, (byte)0xF6, (byte)0xF7, (byte)0xF8, (byte)0xF9,
                    (byte)0xFA, (byte)0xFB, (byte)0xFC, (byte)0xFD, (byte)0xFE,
                    (byte)0xFF}),
    			new MemoryArray(new byte[] {(byte)0x5A, (byte)0x5B, (byte)0x5C, (byte)0x5D,
                    (byte)0x5E, (byte)0x5F, (byte)0x60, (byte)0x61, (byte)0x62, (byte)0x63,
                    (byte)0x64, (byte)0x65, (byte)0x66, (byte)0x67,
                    (byte)0x68, (byte)0x69, (byte)0x6A, (byte)0x6B, (byte)0x6C,
                    (byte)0x6D, (byte)0x6E, (byte)0x6F, (byte)0x70, (byte)0x71,
                    (byte)0x72, (byte)0x73, (byte)0x74, (byte)0x75, (byte)0x76,
                    (byte)0x77, (byte)0x78, (byte)0x79, (byte)0x7A, (byte)0x7B,
                    (byte)0x7C, (byte)0x7D, (byte)0x7E, (byte)0x7F}),
    			new MemoryArray(new byte[] {(byte)0x54, (byte)0x55, (byte)0x56, (byte)0x57,
                    (byte)0x58, (byte)0x59, (byte)0x5A, (byte)0x5B, (byte)0x5C, (byte)0x5D,
                    (byte)0x5E, (byte)0x5F, (byte)0x60, (byte)0x61, (byte)0x62, (byte)0x63,
                    (byte)0x64, (byte)0x65, (byte)0x66, (byte)0x67,
                    (byte)0x68, (byte)0x69, (byte)0x6A, (byte)0x6B, (byte)0x6C,
                    (byte)0x6D, (byte)0x6E, (byte)0x6F, (byte)0x70, (byte)0x71,
                    (byte)0x72, (byte)0x73, (byte)0x74, (byte)0x75, (byte)0x76,
                    (byte)0x77, (byte)0x78, (byte)0x79, (byte)0x7A, (byte)0x7B,
                    (byte)0x7C, (byte)0x7D, (byte)0x7E, (byte)0x7F}),
    }
		
		
    final MemoryArray[] expectedOutputArray = {
    			new MemoryArray(new byte[] {(byte)0xF0, (byte)0xF1, (byte)0xF2, (byte)0xF3,
                    (byte)0xF4, (byte)0xF5, (byte)0xF6, (byte)0xF7, (byte)0xF8, (byte)0xF9,
                    (byte)0xFA, (byte)0xFB, (byte)0xFC, (byte)0xFD, (byte)0xFE,
                    (byte)0xFF}),
    			new MemoryArray(new byte[] {(byte)0x5A, (byte)0x5B, (byte)0x5C, (byte)0x5D,
                    (byte)0x5E, (byte)0x5F, (byte)0x60, (byte)0x61, (byte)0x62, (byte)0x63,
                    (byte)0x64, (byte)0x65, (byte)0x66, (byte)0x67, (byte)0x68, (byte)0x69,
                    (byte)0x6A, (byte)0x6B, (byte)0x6C, (byte)0x6D, (byte)0x6E, (byte)0x6F,
                    (byte)0x70, (byte)0x71, (byte)0x72, (byte)0x73, (byte)0x74, (byte)0x75,
                    (byte)0x76, (byte)0x77, (byte)0x78, (byte)0x79, (byte)0x7A, (byte)0x7B,
                    (byte)0x7C, (byte)0x7D, (byte)0x7E, (byte)0x7F}),
    			new MemoryArray(new byte[] {(byte)0x54, (byte)0x55, (byte)0x56, (byte)0x57,
                    (byte)0x58, (byte)0x59, (byte)0x5A, (byte)0x5B, (byte)0x5C, (byte)0x5D,
                    (byte)0x5E, (byte)0x5F, (byte)0x60, (byte)0x61, (byte)0x62, (byte)0x63,
                    (byte)0x64, (byte)0x65, (byte)0x66, (byte)0x67, (byte)0x68, (byte)0x69,
                    (byte)0x6A, (byte)0x6B, (byte)0x6C, (byte)0x6D, (byte)0x6E, (byte)0x6F,
                    (byte)0x70, (byte)0x71, (byte)0x72, (byte)0x73, (byte)0x74, (byte)0x75,
                    (byte)0x76, (byte)0x77, (byte)0x78, (byte)0x79, (byte)0x7A, (byte)0x7B,
                    (byte)0x7C, (byte)0x7D, (byte)0x7E, (byte)0x7F}),
    };
	
		
		System.out.println("[" + program.programCode.toString() + "]");
		checkArrayEquals(expectedOutputArray, program);
		System.out.println("Program " + program);
	}
      
}
