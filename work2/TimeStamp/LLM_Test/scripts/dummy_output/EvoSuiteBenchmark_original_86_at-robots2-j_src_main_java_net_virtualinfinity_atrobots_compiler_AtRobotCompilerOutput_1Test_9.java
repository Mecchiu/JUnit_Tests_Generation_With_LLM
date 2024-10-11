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
	 * Test hasErrors implementation.
	 * Checks if the hasErrors() method returns a boolean value.
	 * @throws Exception unexpected exception.
	 */
	@Test
	void testHasErrors() throws Exception {

		AtRobotCompilerOutput robotCompilerOutput = new AtRobotCompilerOutput(new Errors());
		assertTrue("hasErrors() should return a boolean", robotCompilerOutput.hasErrors());
		
		// Check the robotFactory
		AtRobot robot1 = new RobotFactory1(new HardwareSpecFactory());
		robotCompilerOutput = new AtRobotCompilerOutput(robot1.getErrors());
		assertTrue("hasErrors is incorrect", robot1.hasErrors());
		
		// Check the program
		Program program1 = new Program("", "", new HardwareSpecBuilder());
		assertTrue("hasErrors is incorrect", program1.hasErrors());
		
		// Check the hardware specification
		HardwareSpecification hardwareSpecification1 = new HardwareSpecBuilder().setMaxProcessorSpeed(1).createHardwareSpecification();
		assertTrue("hasErrors is incorrect", hardwareSpecification1.getMaxProcessorSpeed() == 1);
	}
	
}
// end AtRobotCompilerOutput_1Test.java