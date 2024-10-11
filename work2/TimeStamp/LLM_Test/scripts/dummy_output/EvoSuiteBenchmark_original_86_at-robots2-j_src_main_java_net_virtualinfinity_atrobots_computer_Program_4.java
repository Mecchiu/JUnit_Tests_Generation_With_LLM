// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		private long address;

		private TestUnit testCase;

    /**
     * Empty test which initializes a memory array
     */
    @Test
    void testProgramInit() {
    	Program program = new Program(null);
    	program.initializeProgramMemory();
    }
	
	/**
	* Sets up the test.
	* 
	* @throws Exception
	* to make sure the constructor is correctly called.
     */
    @Test
    @SuppressWarnings("SameReturnValue")
    void testProgramCreate() throws Exception {
    	try {
    		address = 1;
    		testCase = new TestUnit("test " + "programCreate" + address);
    	} catch (Throwable e) {
    		e.printStackTrace();
    		assertTrue(false);
    	}
    }

    /**
     * Creates a {@link TestUnit} and executes the {@link Program#createProgramMemory()} method.
	* 
     * @return an instance of a {@link TestUnit}.
     * 
	 * @throws Exception
     * to make sure the constructor is correctly called.
    */
    TestUnit testConstructor() throws Exception {
        return testCase;
    }
	
	/**
	* Gets the program code by accessing the array.
	*
	* @return the {@link short} representation of the array.
	*
	*/
    public short getProgramCode() {
        return programCode[0];
    }
	
	/**
	* Writes a {@link short} value into the array.
	*
	* @param value the {@link short} value to write.
	* @throws Exception
     * to make sure the operation is correctly executed.
	*/
    void writeProgramCode(short value) throws Exception {
    	 programCode[0] = (short)value;
    }


    /**
     * Reads a {@link short} value from the array.
     *
     * @return the {@link short} value read.
     * 
     */
    short readProgramCode() throws Exception {
        return programCode[0];
    }
}