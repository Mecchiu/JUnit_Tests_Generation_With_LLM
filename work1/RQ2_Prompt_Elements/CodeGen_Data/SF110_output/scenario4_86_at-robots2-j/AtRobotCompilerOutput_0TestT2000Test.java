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
    * Constructs a test suite which is run once.
    *
    * @return a test suite.
    */
    @Test
    void test() {
        // given
        AtRobotCompilerOutput o = new AtRobotCompilerOutput(new Errors(), new Program(0),new HardwareSpecification(0), 1, DebugInfo.NOPE, "no message");
                // when
        String name = o.getProgram().name;
        String output = o.getMessage();

        // then
        assertEquals(name, "no message");
        assertEquals(output, "no message");
    }
    
}
