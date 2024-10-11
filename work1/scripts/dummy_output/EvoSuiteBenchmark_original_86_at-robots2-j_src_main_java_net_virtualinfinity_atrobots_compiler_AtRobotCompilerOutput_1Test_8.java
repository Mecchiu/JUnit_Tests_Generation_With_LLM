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
		public void hasErrors() throws Exception {
			// No Errors
			AtRobotCompilerOutput output = new AtRobotCompilerOutput(null, new Program(), null, 0, null, null);
			assertFalse(output.hasErrors());
			
			// No program
			output = new AtRobotCompilerOutput(null, null, null, 0, null, null);
			assertFalse(output.hasErrors());
			
			AtRobotCompilerOutput.ErrorInfo errorInfo = null;
			// No errors
			output = new AtRobotCompilerOutput(null, new Program(), null, 0, errorInfo, null);
			assertFalse(output.hasErrors());
			
			// No hardware
			output = new AtRobotCompilerOutput(null, null, null, 0, null, errorInfo);
			assertFalse(output.hasErrors());
			
			Object message = null;
			// No error
			errorInfo = new AtRobotCompilerOutput.ErrorInfo(null, null, null);
			output = new AtRobotCompilerOutput(null, new Program(), null, 0, errorInfo, message);
			assertTrue(output.hasErrors());
			assertEquals(message, output.getErrors().getErrorList().getMessage());
			assertSame(output.getErrors().getErrorList().get(0).getSourceCode(), new Program().getName());  // check that our error text matches the source code.
		}
}