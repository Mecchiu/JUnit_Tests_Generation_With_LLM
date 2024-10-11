// Here's an example implementation of the AtRobotCompilerOutput class:

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;

/**
 * The results of a compilation attempt.
 *
 * @author Daniel Pitts
 */
public class AtRobotCompilerOutput {

    private final Errors errors;
    private final Program program;
    private final HardwareSpecification hardwareSpecification;
    private final int maxProcessorSpeed;
    private final DebugInfo debugInfo;
    private final String message;

    /**
     * Construct an output.
     *
     * @param errors                the errors (if any). Should not be null.
     * @param program               the program produced by the compiler.
     * @param hardwareSpecification the hardware specs produced by the compiler
     * @param maxProcessorSpeed     the max processor speed. TODO: This should be part of HardwareSpecification
     * @param debugInfo             debug information.
     * @param message               the robots message.
     * @throws NullPointerException if errors is null, or if errors.hasErrors() is false and any of program, hardwareSpecification, or debugInfo is null.
     */
    public AtRobotCompilerOutput(Errors errors, Program program, HardwareSpecification hardwareSpecification, int maxProcessorSpeed, DebugInfo debugInfo, String message) {
        if (errors == null) {
            throw new NullPointerException("errors cannot be null");
        }
        if (!errors.hasErrors() && (program == null || hardwareSpecification == null || debugInfo == null)) {
            throw new NullPointerException("program, hardwareSpecification, and debugInfo cannot be null if there are no errors");
        }
        this.errors = errors;
        this.program = program;
        this.hardwareSpecification = hardwareSpecification;
        this.maxProcessorSpeed = maxProcessorSpeed;
        this.debugInfo = debugInfo;
        this.message = message;
    }

    /**
     * Creates an RobotFactory based on this compiled output.
     *
     * @param name the name of the entrant to create.
     * @return a configured entrant
     * @throws IllegalStateException if there are compiler errors.
     */
    public RobotFactory createRobotFactory(String name) {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot create RobotFactory with compiler errors");
        }
        return new RobotFactory(name, program, hardwareSpecification, maxProcessorSpeed, debugInfo);
    }

    /**
     * Get the Errors object.
     *
     * @return the Errors object.
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Check for errors.
     *
     * @return true if there are errors.
     */
    public boolean hasErrors() {
        return errors.hasErrors();
    }

    /**
     * Get the program code.
     *
     * @return the program code.
     * @throws IllegalStateException if there are compiler errors.
     */
    public Program getProgram() {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot get program with compiler errors");
        }
        return program;
    }

    /**
     * Get the message.
     *
     * @return the message.
     * @throws IllegalStateException if there are compiler errors.
     */
    public String getMessage() {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot get message with compiler errors");
        }
        return message;
    }

    /**
     * Get the hardware specification.
     *
     * @return the hardware specification.
     * @throws IllegalStateException if there are compiler errors.
     */
    public HardwareSpecification getHardwareSpecification() {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot get hardware specification with compiler errors");
        }
        return hardwareSpecification;
    }

    /**
     * Get the maximum desired processor speed.
     *
     * @return the maximum desired processor speed.
     * @throws IllegalStateException if there are compiler errors.
     */
    public int getMaxProcessorSpeed() {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot get max processor speed with compiler errors");
        }
        return maxProcessorSpeed;
    }

    /**
     * Get the debug info.
     *
     * @return the debug info.
     * @throws IllegalStateException if there are compiler errors.
     */
    public DebugInfo getDebugInfo() {
        if (hasErrors()) {
            throw new IllegalStateException("Cannot get debug info with compiler errors");
        }
        return debugInfo;
    }
}

// AtRobotCompilerOutput_0Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link AtRobotCompilerOutput}.
 * It contains ten unit test cases for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
 */
class AtRobotCompilerOutput_0Test {

    @Test
    void testCreateRobotFactoryWithNoErrors() {
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello, world!");
        RobotFactory factory = output.createRobotFactory("TestRobot");
        assertNotNull(factory);
    }

    @Test
    void testCreateRobotFactoryWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
    }

    @Test
    void testGetErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertEquals(errors, output.getErrors());
    }

    @Test
    void testHasErrorsWithNoErrors() {
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello, world!");
        assertFalse(output.hasErrors());
    }

    @Test
    void testHasErrorsWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertTrue(output.hasErrors());
    }

    @Test
    void testGetProgramWithNoErrors() {
        Program program = new Program();
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), program, new HardwareSpecification(), 100, new DebugInfo(), "Hello, world!");
        assertEquals(program, output.getProgram());
    }

    @Test
    void testGetProgramWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertThrows(IllegalStateException.class, output::getProgram);
    }

    @Test
    void testGetMessageWithNoErrors() {
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello, world!");
        assertEquals("Hello, world!", output.getMessage());
    }

    @Test
    void testGetMessageWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertThrows(IllegalStateException.class, output::getMessage);
    }

    @Test
    void testGetHardwareSpecificationWithNoErrors() {
        HardwareSpecification hardwareSpecification = new HardwareSpecification();
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), hardwareSpecification, 100, new DebugInfo(), "Hello, world!");
        assertEquals(hardwareSpecification, output.getHardwareSpecification());
    }

    @Test
    void testGetHardwareSpecificationWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertThrows(IllegalStateException.class, output::getHardwareSpecification);
    }

    @Test
    void testGetMaxProcessorSpeedWithNoErrors() {
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, new DebugInfo(), "Hello, world!");
        assertEquals(100, output.getMaxProcessorSpeed());
    }

    @Test
    void testGetMaxProcessorSpeedWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(errors, null, null, 0, null, "");
        assertThrows(IllegalStateException.class, output::getMaxProcessorSpeed);
    }

    @Test
    void testGetDebugInfoWithNoErrors() {
        DebugInfo debugInfo = new DebugInfo();
        AtRobotCompilerOutput output = new AtRobotCompilerOutput(new Errors(), new Program(), new HardwareSpecification(), 100, debugInfo, "Hello, world!");
        assertEquals(debugInfo, output.getDebugInfo());
    }

    @Test
    void testGetDebugInfoWithErrors() {
        Errors errors = new Errors();
        errors.addError("Syntax error on line 1");
        AtRobotCompilerOutput output = new