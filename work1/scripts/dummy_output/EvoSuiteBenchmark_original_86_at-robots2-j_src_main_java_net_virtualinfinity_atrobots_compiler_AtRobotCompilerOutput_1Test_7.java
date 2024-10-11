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
		/**
		* Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when the number
		* of compiler errors is 0.
		*/
	@Test
	void should_have_errors() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		assertFalse(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when the compiler
	 * errors are produced by the hardware specification.
	 */
	@Test
	void should_have_errors_with_hardware_specification() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		o.getHardwareSpecification();
		assertTrue(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when the compiler errors
	 * are produced by all the processors in a single process cycle.
	 */
	@Test
	void should_have_compiled_with_cpu_2_procs_logically() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getHardwareSpecification();
		assertFalse(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when it is called with
	 * program with two different processors or not.
	 */
	@Test
	void should_have_errors_when_multiple_procs() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		Program program = new Program(4);
		
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getHardwareSpecification();
		assertTrue(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when it is called with
	 * program with two processors and not.
	 */
	@Test
	void should_have_errors_when_not_all_procs_are_compiled() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		Program program = new Program(6);
		
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getHardwareSpecification();
		assertFalse(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#hasErrors()} method when it is called multiple
	 * times on the same computer at the same speed.
	 */
	@Test
	void should_have_errors_when_program_logically_differs() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		Program program = new Program(4);
		
		o.getMaxProcessorSpeed();
		
		o.getProgram();
		
		o.getHardwareSpecification();
		assertTrue(o.hasErrors());
		
		o.getProgram();
		
		o.getHardwareSpecification();
		assertTrue(o.hasErrors());
	}
	
	/**
	 * Test the unit test for the {@link AtRobotCompilerOutput#getErrors()} method when compiler errors are
	 * produced by hardware specification and that no exception is thrown. Assert errors should not return
	 * an exception during this operation.
	 */
	@Test
	void should_not_have_errors_in_debug_info_while_compiling() {
		AtRobotCompilerOutput o = new AtRobotCompilerOutput();
		o.getMaxProcessorSpeed();
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getMaxProcessorSpeed();
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getMaxProcessorSpeed();
		o.getHardwareSpecification();
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getMaxProcessorSpeed();
		o.getHardwareSpecification();
		
		o.getMaxProcessorSpeed();
		o.getProgram();
		o.getProgram();
		
		o.getHardwareSpecification();
		
		// assertNotThrown(e);
		assertTrue(o.hasErrors());
	}
}