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
		@Test
		void testHasErrors() {
			AtRobotCompilerOutput aco = new AtRobotCompilerOutput("", "");
			aco.hasErrors();
			aco = new AtRobotCompilerOutput("foo-1", "");
			aco.hasErrors();
		}
}