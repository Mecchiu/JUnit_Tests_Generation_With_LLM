// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
private static final int TOTALWORDS = 10000000;
		private static final int NUMROWS = 10;
		private static final int NUMCOLS = 10;
		/**
		* Verifies that createProgramMemory() correctly creates a memory array.
		*/
    @Test
    void createProgramMemory() {
			assertArrayOfShortEquals(new short[]{}, Program.createProgramMemory());
    }	

	/**
	 * Tests that the two program codes are equal.
	 */
@Test
    public void twoProgramCodesAreEqual() {
		short[] programCode1 = new short[TOTALWORDS];
		short[] programCode2 = new short[TOTALWORDS];

		int i = 0;
		for (; i < TOTALWORDS; i++) {
			programCode1[i] = (short) (i % NUMROWS);
			programCode2[i] = (short) ((i + 1) % NUMROWS);
		}

		// check that two program codes are the same
		assertArrayOfShortEquals(programCode1, programCode2);
    }

	/**
	 * Tests that createProgramMemory() removes the program code from the byte array.
	 */
@Test
    public void removeProgramCode() {
		ShortArrayProgramCodeProgramMapping mapping = new ShortArrayProgramCodeProgramMapping();

		short[] programCode = new short[TOTALWORDS];
        for (ShortProgramCode shortProgramCode : mapping.getProgramCodes()) {
            programCode[shortProgramCode.getCode()] = (short)(shortProgramCode.getCode());
        }

		// check that the code and code array are empty
		assertArrayOfShortEquals(new short[]{}, programCode);

	    // check that removing the code and code array does not remove it
		mapping.setProgramCodes(new short[NUMROWS]);
		programCode = new short[TOTALWORDS];
		for (ShortProgramCode shortProgramCode : mapping.getProgramCodes()) {
			programCode[shortProgramCode.getCode()] = (short)(shortProgramCode.getCode());
        }

		// check that the code array and the code array do not remain empty
		assertArrayOfShortEquals(new short[]{}, programCode);
    }

	/**
	 * Tests that creating the memory array properly creates a memory array.
	 */
@Test
    public void createProgramMemory() {

		int[] array = new int[NUMROWS * NUMCOLS];
		for (int i = 0; i < array.length; ++i) {
			array[i] = i % COLS;
		}

		// check that createProgramMemory() creates the correct memory array with the correct data
		long address = Program.createProgramMemory().getLongDataAtIndex(0);
		assertArrayOfIntEquals(array, address);
		int curArrayIndex = 0;
		for (int i = 0; i < TOTALWORDS; i++) {
			short code = (short) i;
			address += Program.createProgramMemory().getLongAtIndex(curArrayIndex++);
			assertEquals(array[address], code);
		}

       // check that the memory object has been created correctly
       assertEquals(array.length, TOTALWORDS * NUMROWS * NUMCOLS);
    }

	/**
	 * Tests the clear() method of the memory.
	 */
	@Test
    public void clearMemory() {
		// create memory object
		ShortArrayProgramCodeProgramMapping map = new ShortArrayProgramCodeProgramMapping();

		// create memory object with some code array
		ShortArrayProgramMemoryProgramMapping memory = map.getProgramMemory();
		for (int i = 0; i < NUMROWS * NUMCOLS; i++) {
			memory.setShortAtIndex(0, (short) (i % COLS));
		}
		memory.clear();

		// check that memory array is correctly cleared
		assertArrayOfShortEquals(new short[]{}, memory.getShortArrayAtIndex(0));
    }

	/**
	 * Tests the writeMemory() method of the memory object.
	 */
	@Test
    public void writeMemory() {
		// create memory object
        ShortArrayProgramCodeProgramMapping map = new ShortArrayProgramCodeProgramMapping();

		// create memory object with some code array
        ShortArrayProgramMemoryProgramMapping program = map.getProgramMemory();
		for (int i = 0; i < TOTALWORDS * NUMROWS * NUMCOLS; i++) {
			program.setShortAtIndex(0, (short) (i % COLS));
		}

		// read memory by first setter
        program.writeMemory(0, new int[NUMCOLS]);

		// check that both program memory and the read byte arrays are the same
		assertArrayOfShortEquals(new short[][]{{0}, {4}},
				(short[]) ((ShortArrayProgramMemoryProgramMapping) program.getShortArrayAtIndex(0)).getIntArrayAtIndex(0));
		assertArrayOfIntEquals((int[]) ((ShortArrayProgramMemoryProgramMapping) program.getShortArrayAtIndex(0)).getLongArrayAtIndex(0), (int) (4));

	    // check that neither program nor read byte arrays are left unchanged
		assertArrayOfShortEquals(new short[][]{{0}, {0}},
				(short[]) ((ShortArrayProgramMemoryProgramMapping) program.getShortArrayAtIndex(0)).getIntArrayAtIndex(0));
		assertArrayOfIntEquals((int[]) ((ShortArrayProgramMemoryProgramMapping) program.getShortArrayAtIndex(0)).getLongArrayAtIndex(0), 0);
    }

}
