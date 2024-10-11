// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

	// UnitTest.
	@Test
	void createProgramMemory() {
		final Program program = new Program();
		
		// The input memory is already populated.
		// Make sure that the empty array is returned.
		assertSame(program.createProgramMemory(), program.createProgramMemory());
	}
}
