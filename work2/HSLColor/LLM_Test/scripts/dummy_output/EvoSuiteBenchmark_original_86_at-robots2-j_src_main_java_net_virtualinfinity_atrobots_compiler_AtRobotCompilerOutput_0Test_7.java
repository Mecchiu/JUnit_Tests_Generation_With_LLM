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
		

    private final int maxProcessorSpeed;
    private final String message;
    private final HardwareSpecification hardwareSpecification;
    private final DebugInfo debugInfo;

		AtRobotCompilerOutput_0Test(int maxProcessorSpeed, String message, HardwareSpecification hardwareSpecification, DebugInfo debugInfo) {
        this.maxProcessorSpeed = maxProcessorSpeed;
        this.message = message;
        this.hardwareSpecification = hardwareSpecification;
        this.debugInfo = debugInfo;
    }		

    @Test
    void testCreateRobotFactory() throws Exception {
    }

    @Test
    void testHasErrors() throws Exception {
    }

    @Test
    void testGetProgram() throws Exception {
    }

    @Test
    void testGetMessage() throws Exception {
    }

    @Test
    void testGetHardwareSpecification() throws Exception {
    }

    @Test
    void testGetMaxProcessorSpeed() throws Exception {
    }

    @Test
    void testGetDebugInfo() throws Exception {
    }	
}