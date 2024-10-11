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
	public void shouldCompile(){

        /* A test case with correct output */
        final Program expected = new InstructionBuilder().buildProgram();

        AtRobotCompilerOutput result = new AtRobotCompilerOutput();
        Program actual = result.buildProgram();

        assertEquals(expected, actual);

        /* A test case with incorrect output */
        result = new AtRobotCompilerOutput(DebugInfo.NO_INFO);
        try {
            actual = result.buildProgram();
        } catch (DebugInfo.ExpectedException ex) {
            fail("DebugInfo.ExpectedException could not be checked");
        }

        assertEquals(DebugInfo.NO_INFO, actual);
	}


}
