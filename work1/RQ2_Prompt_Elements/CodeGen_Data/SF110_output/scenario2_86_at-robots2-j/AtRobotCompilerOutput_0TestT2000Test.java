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
 /**
		  * Tests {@link AtRobotCompilerOutput#createRobotFactory(String)}.
		  * @throws IllegalStateException if there are compiler errors.
		  *
		  * @throws Exception may be thrown by the calling method.
		  */
		@Test
		 void testCreateRobotFactory()
				throws Exception {
				int result = 0;
				result += testGetProgram(
						"{@link Program#PROGRAM}",
						new AtRobotCompilerOutput_0_GetProgram_0()
						);
				result += testGetProgram(
						"{@link Program#PPROGRAM}",
						new AtRobotCompilerOutput_0_GetProgram_1()
						);
				result += testHardwareSpecifications(
						"{@link DebugInfo#DEBUGINFO}",
						new AtRobotCompilerOutput_0_GetHardwareSpecifications_0()
						);
				result += testHardwareSpecifications(
						"{@link DebugInfo#NO_PROGRAM}",
						new AtRobotCompilerOutput_0_GetHardwareSpecifications_1()
						);
				assertEquals("GetProgram_0", result, 1);
		}
}


