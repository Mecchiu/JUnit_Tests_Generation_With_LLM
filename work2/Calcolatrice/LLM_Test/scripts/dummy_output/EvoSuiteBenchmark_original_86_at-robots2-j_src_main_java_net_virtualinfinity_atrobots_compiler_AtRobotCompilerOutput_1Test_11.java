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
		static final String MESSAGE1 = "MESSAGE1";
		static final String MESSAGE2 = "MESSAGE2";
		static final String MESSAGE2_2 = "MESSAGE2_2";
			
		/**
         * Checks that one test case exists for which {@link AtRobotCompilerOutput#hasErrors()}
         * returns {@code true}.
         */
        @Test
        public void hasError() {
            assertTrue(AtRobotCompilerOutput.hasErrors());
            
            assertEquals(1, AtRobotCompilerOutput.getErrors().getErrorCount());
            
            //TODO: check for errors.
        }
}