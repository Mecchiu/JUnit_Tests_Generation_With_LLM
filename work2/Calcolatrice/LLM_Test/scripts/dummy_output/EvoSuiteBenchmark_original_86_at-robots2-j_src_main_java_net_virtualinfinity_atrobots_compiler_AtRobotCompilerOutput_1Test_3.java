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
		
	/** {@link AtRobotCompilerOutput#atRobotCompilerOutput_1Test(net.virtualinfinity.atrobots.compiler.AtRobotCompilerOutput) Test cases in which the compiler will be able to construct
	 * a {@link Program} instance. */
	@Test
	public void atRobotCompilerOutput_1_Test() throws Exception {
		final AtRobotCompilerOutput atRobotCompilerOutput_1 = AtRobotCompilerOutput.atRobotCompilerOutput_1Test(new AtRobotCompilerOutput());
		
		assertNotNull(atRobotCompilerOutput_1);
		
		assertTrue(atRobotCompilerOutput_1.hasErrors());
		assertTrue(atRobotCompilerOutput_1.getProgram() instanceof Program);
		assertEquals(1, atRobotCompilerOutput_1.getHardwareSpecification().getMaxProcessorSpeed(), 0.01);
		
		assertNotNull(atRobotCompilerOutput_1.getProgramCode());
		assertNotNull(atRobotCompilerOutput_1.getMessage());
		
	}
	
}