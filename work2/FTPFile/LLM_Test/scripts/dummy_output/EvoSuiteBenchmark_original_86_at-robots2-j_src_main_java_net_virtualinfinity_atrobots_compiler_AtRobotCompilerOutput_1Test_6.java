// AtRobotCompilerOutput_1Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutput_1Test {
		
	/**
	* Test if the methods {@link #hasErrors()} and {@link #getProgram()} return the expected values. 
	*/
	@Test
	void testGetProgram() {
		AtRobotCompilerOutput_1Test.hasProgram();
		AtRobotCompilerOutput_1Test.getProgram();
	}
	
	/**
	* Test if the methods {@link #hasErrors(String, DebugInfo)} and {@link #getProgram()} return the expected values.
	* Override test the code if it is necessary.
	*/
	@Test
	void testHasErrors() {
		AtRobotCompilerOutput_1Test.hasErrors(null);
		AtRobotCompilerOutput_1Test.hasErrors("");
		AtRobotCompilerOutput_1Test.hasErrors(".");
		
		AtRobotCompilerOutput_1Test.hasErrors("Error");
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors();
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors(null, null);
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors(null, null);
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors(null, new DebugInfo());
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors(null, new DebugInfo(null));
		AtRobotCompilerOutput_1Test.getProgram();
		
		AtRobotCompilerOutput_1Test.hasErrors(null, new DebugInfo("Error"));
		AtRobotCompilerOutput_1Test.getProgram();

		AtRobotCompilerOutput_1Test.hasErrors(null, DebugInfo("Error"));
		AtRobotCompilerOutput_1Test.getProgram();
	}
	

	/**
	* Test if the methods {@link #error(String, DebugInfo)} and {@link #error(String)} return the expected values.
	* Override test the code if it is necessary.
	*/
	@Test
	void testError() {
		AtRobotCompilerOutput_1Test.hasErrors(null);
		Program program = AtRobotCompilerOutput_1Test.getProgram();
		AtRobotCompilerOutput_1Test.error(null);
		AtRobotCompilerOutput_1Test.error("Error");

		Program program2 = AtRobotCompilerOutput_1Test.getProgram();
		AtRobotCompilerOutput_1Test.error(null);
		AtRobotCompilerOutput_1Test.error("Error");
		AtRobotCompilerOutput_1Test.error(null);
		AtRobotCompilerOutput_1Test.error("Error");
		
		Program program3 = AtRobotCompilerOutput_1Test.getProgram();
		AtRobotCompilerOutput_1Test.error(null);
		AtRobotCompilerOutput_1Test.error("Error");
		AtRobotCompilerOutput_1Test.error(null);
		AtRobotCompilerOutput_1Test.error("Error");
		AtRobotCompilerOutput_1Test.error(null);
		

		assertTrue(program1.hasErrors());
		assertTrue(program3.hasErrors());
		assertEquals(program.getErrors(), program3.getErrors());

		assertTrue(program2.hasErrors());
		assertTrue(program3.hasErrors());
		assertEquals(program2.getErrors(), program3.getErrors());

		assertTrue(program3.hasErrors());
		assertTrue(program1.hasErrors());
		assertFalse(program1.hasErrors());
		
		program = null;
		program2 = null;
		program3 = null;
	}
	
}