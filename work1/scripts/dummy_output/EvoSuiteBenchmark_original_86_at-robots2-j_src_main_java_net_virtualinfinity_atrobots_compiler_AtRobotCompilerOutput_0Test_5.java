// AtRobotCompilerOutput_0Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutput_0Test {
		private static final int INVALID_COUNT = 1000;

	@Test
	public void ifInvalidCountCallsToFactory() throws Throwable {
		//
		AtRobotCompilerOutput_0 instance = new AtRobotCompilerOutput_0();
		for (int i=0; i< INVALID_COUNT; i++) {
			Program f = instance.createRobotFactory("robot" + i);
			assertNotNull(f);
		}
	}
}