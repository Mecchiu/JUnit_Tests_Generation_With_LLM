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
		private final AtRobotCompilerOutput instance;
		
		/**
		 * Construct a new instance.
		 */
		public AtRobotCompilerOutput_1Test() {
			instance = new AtRobotCompilerOutput(new DebugInfo());
			instance.getErrors().setVerbose(false);
		}
		
//		@Test
		public void hasErrors_ShouldReturnTrueWhenThereAreMoreErrors() {
			instance.hasErrors(); // Check if all errors have been encountered.
			assertTrue(
				instance.getErrors().getErrors().size() > 1,
				String.format(
					"Expected more than one error was encountered. There were: %d.\n",
					instance.getErrors().getErrors().size()));
		}
//		@Test
		public void hasErrors_ShouldReturnTrueWhenThereAreMoreErrors() {
			instance.hasErrors(); // Check if all errors have been encountered.
			assertTrue(
				instance.getErrors().getErrors().size() > 1,
				String.format(
					"Expected more than one ERROR was encountered. There were: %d.\n",
					instance.getErrors().getErrors().size()));
			assertTrue(
				instance.getErrors().getErrors().getErrors().get(0).hasError(),
				String.format("At robot robot failed with error %s.",
					instance.getErrors().getErrors().getErrors().get(0).getError()));
		}
		@Test
		public void getErrors_DoesNotReturnNull() {
			instance = new AtRobotCompilerOutput(new DebugInfo());
			instance.getErrors();
			assertNotNull(
				instance.getErrors().getErrors(),
				String.format(
					"The DebugInfo object did not need to be created or retrieved!"));
		}
		@Test
		public void getProgram_DoesNotReturnNull() {
			instance = new AtRobotCompilerOutput(new HardwareSpecification(new RuntimeVersion()));
			instance.getProgram();
			assertNotNull(
				instance.getProgram(),
				String.format(
					"The hardware specification did not need to be created or retrieved!"));
		}
		@Test
		public void getHardwareSpecification_DoesNotReturnNull() {
			instance = new AtRobotCompilerOutput(new HardwareSpecification());
			instance.getHardwareSpecification();
			assertNotNull(
				instance.getHardwareSpecification(),
				String.format(
					"The hardware specification did not need to be created or retrieved!"));
		}
		@Test
		public void getDebugInfo_DoesNotReturnNull() {
			instance = new AtRobotCompilerOutput(new DebugInfo());
			instance.getDebugInfo();
			assertNotNull(
				instance.getDebugInfo(),
				String.format(
					"The DebugInfo object did not need to be created or retrieved!"));
		}
}