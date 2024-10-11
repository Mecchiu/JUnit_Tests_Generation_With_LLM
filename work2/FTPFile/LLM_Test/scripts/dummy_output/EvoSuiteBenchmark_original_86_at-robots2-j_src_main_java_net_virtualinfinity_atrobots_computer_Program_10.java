// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    private Program program;
 
    /**
    * Initializes a test with a pre-flashed program code.
    */
    @Test
    void initWithPreFlashedProgramCode() {
        program = Program.createProgramMemory();
	
        program.programCode = new short[16];
        
        program.programCode[0] = (short)(0xA3 << 4); // programA1

        program.programCode[1] = (short)(0x10 << 4); // programA1

        program.programCode[2] = (short)(0x09 << 4); // programA1

        program.programCode[3] = (short)(0x08 << 4); // programA1

        program.programCode[4] = (short)(0xf5 << 4); // programA1

        program.programCode[5] = (short)(0xf1 << 4); // programA1

        program.programCode[6] = (short)(0xf0 << 4); // programA1

        program.programCode[7] = (short)(0xf0 << 4); // programA1

        program.programCode[8] = (short)0x0f << 4; // programA1
        program.programCode[9] = (short)(0x07 << 4); // programA1

        program.programCode[10] = (short)0x06 << 4; // programA1
        program.programCode[11] = (short)(0x01 << 4); // programA1

        program.programCode[12] = (short)(0x04 << 4); // programA1
        program.programCode[13] = (short)(0x02 << 4); // programA1

        program.programCode[14] = (short)(0x01 << 4); // programA1
        program.programCode[15] = (short)(0x0d << 4); // programA1
    }

}// end class