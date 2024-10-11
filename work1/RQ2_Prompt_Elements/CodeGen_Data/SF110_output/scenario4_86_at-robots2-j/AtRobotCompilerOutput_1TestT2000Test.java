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

	@Before
	public void setUp() {
	}

	@Test
	public void test1() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput(null);
		output.hasErrors(true);
		assertTrue(output.hasErrors());
	}
	
	@Test
	public void test2() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput(new StringBuilder()).build();
		assertFalse(output.hasErrors());
	}

}

// AtRobotCompilerOutput.java
