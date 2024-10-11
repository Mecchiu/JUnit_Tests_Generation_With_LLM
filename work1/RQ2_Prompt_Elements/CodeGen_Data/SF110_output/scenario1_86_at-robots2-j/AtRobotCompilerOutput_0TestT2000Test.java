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

    @Test
    void constructor() {
        AtRobotCompilerOutput.createRobotFactory("");
    }
    
    @Test
    void hasErrors() {
        AtRobotCompilerOutput.createRobotFactory("");
        AtRobotCompilerOutput.hasErrors("");
        AtRobotCompilerOutput.hasErrors("");
        AtRobotCompilerOutput.hasErrors("");
    }
    
    @Test
    void hasMaxProcessorSpeed() {
        AtRobotCompilerOutput.createRobotFactory("");
        Program program = Program.createProgram("foo");
        AtRobotCompilerOutput.hasMaxProcessorSpeed(program, 10);
        AtRobotCompilerOutput.hasMaxProcessorSpeed(program, 100);
        AtRobotCompilerOutput.hasMaxProcessorSpeed(program, 200);
    }
    
    @Test
    void getProgram() {
        Program program = Program.createProgram("foo");
        AtRobotCompilerOutput.getProgram(program);
    }
    
    @Test
    void getHardSpecification() {
        System.out.println("HardSpecification");
        Program program = Program.createProgram("");
        DebugInfo debugInfo = DebugInfo.createDebugInfo(program);
        AtRobotCompilerOutput.getHardSpecification(program, debugInfo);
    }
    
    @Test
    void getCPU() {
        System.out.println("CPU");
        String cpuName = "";
        Program program = Program.createProgram("");
        DebugInfo debugInfo = DebugInfo.createDebugInfo(program);
        AtRobotCompilerOutput.getCPU(program, cpuName, debugInfo);
    }
    
    @Test
    void getProcessorSpeed() {
        System.out.println("ProcessorSpeed");
        Program program = Program.createProgram("");
        System.out.println("cpu: " + (program.getProcessorSpeed(cpuName) + 1));
    }
    
    @Test
    void getDebugInfo() {
        System.out.println("DebugInfo");
        DebugInfo debugInfo = DebugInfo.createDebugInfo(program);
        System.out.println("getError: " + debuggerInfo.getError());
        AtRobotCompilerOutput.getDebugInfo(debugInfo);
    }
    
    @Test
    void hasError() {
        Program program = Program.createProgram("");
        Error error = Error.createError(program, "foo.java:0");
        AtRobotCompilerOutput.hasError(program, error);
    }
}