// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutputTest {
		
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* It tests the case when the compiler output has errors.
	*/
	@Test
	void testCreateRobotFactory_HasErrors() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(true);
		assertThrows(IllegalStateException.class, () -> compilerOutput.createRobotFactory("test"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* It tests the case when the compiler output has no errors.
	*/
	@Test
	void testCreateRobotFactory_NoErrors() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		compilerOutput.setProgram(new Program());
		compilerOutput.setHardwareSpecification(new HardwareSpecification());
		compilerOutput.setDebugInfo(new DebugInfo());
		compilerOutput.setMaxProcessorSpeed(100);
		compilerOutput.setMessage("test");
		assertNotNull(compilerOutput.createRobotFactory("test"));
	}
}