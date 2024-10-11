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
final DebugInfo info = new DebugInfo("ATest", 4);
		final Program program = new Program(info);

		static {
			DebugInfo.setGlobalDebugInfo(program);
		}

        @Test
        void testHasErrors() {
            assertFalse(AtRobotCompilerOutput.hasErrors(program));
        }
}