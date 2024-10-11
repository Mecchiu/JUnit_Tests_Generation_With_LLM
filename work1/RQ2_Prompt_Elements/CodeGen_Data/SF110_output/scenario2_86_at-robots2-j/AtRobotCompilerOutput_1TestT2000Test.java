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
		public void hasErrors() {
			assertFalse(AtRobotCompilerOutput.hasErrors());
			AtRobotCompilerOutput instance = new AtRobotCompilerOutput();
			assertTrue(instance.hasErrors());
		}
		@Test
		public void getErrors()
				throws Exception {
			DebugInfo info = new DebugInfo();
			AtRobotCompilerOutput.compilerOutput =
					new AtRobotCompilerOutput(Program.getProgram(info),
							DebugInfo.getInstance().getJVM(), info);
			AtRobotCompilerOutput instance = new AtRobotCompilerOutput();
			String err = instance.getErrors();
			assertNotNull(err);
			assertTrue(err.contains("Failed"));
		}
}