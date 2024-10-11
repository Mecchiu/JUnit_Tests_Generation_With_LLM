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
		 * Test constructor.
		 */
		public AtRobotCompilerOutput_0Test() {
		}

		/**
		 * Test the value of {@link #errors} is as expected.
		 */
		@Test
		public void testErrors() {
			if (errors.hasErrors()) {
				throw errors.getErrors();
			}
		}

		/**
		 * Test the value of {@link #getProgram} is as expected.
		 */
		@Test
		public void testProgram() {
			try {
				program = programFactory.create(name);
			} catch (IllegalArgumentException e) {
				throw new Failure("Program", e);
			}
		}

		/**
		 * Test the value of {@link #hasErrors} is as expected.
		 */
		@Test
		public void testHasErrors() {
			if (errors!= null && hasErrors()) {
				throw errors.hasErrors();
			}
		}

		/**
		 * Test the value of {@link #getMessage} is as expected.
		 */
		@Test
		public void testMessage() {
			if (hasErrors()) {
				throw new Failure("testMessage", errors.getMessage());
			}
		}

		/**
		 * Test the value of {@link #getHardwareSpecification} is as expected.
		 */
		@Test
		public void testHardwareSpecification() {
			if (errors!= null && hasErrors()) {
				throw new Failure("testHardwareSpecification", errors.getHardwareSpecification());
			}
		}

		/**
		 * Test the value of {@link #getMaxProcessorSpeed} is as expected.
		 */
		@Test
		public void testMaxProcessorSpeed() {
			if (errors!= null && hasErrors()) {
				throw new Failure("testMaxProcessorSpeed", errors.getMaxProcessorSpeed());
			}
		}

		/**
		 * Test the value of {@link #getDebugInfo} is as expected.
		 */
		@Test
		public void testDebugInfo() {
			if (errors!= null && hasErrors()) {
				throw new Failure("testDebugInfo", debugInfo.getDebugInfo());
			}
		}

		/**
		 * Test the value of {@link #isAvailableToCompile} is as expected.
		 */
		@Test
		public void testIsAvailableToCompile() {
			if (errors!= null && hasErrors()) {
				throw new Failure("testIsAvailableToCompile", isAvailableToCompile());
			}
		}

		/**
		 * Test the value of {@link #isCompiled} is as expected.
		 */
		@Test
		public void testCompiled() {
			if (errors!= null && hasErrors()) {
				throw new Failure("testCompiled", isCompiled());
			}
		}
}