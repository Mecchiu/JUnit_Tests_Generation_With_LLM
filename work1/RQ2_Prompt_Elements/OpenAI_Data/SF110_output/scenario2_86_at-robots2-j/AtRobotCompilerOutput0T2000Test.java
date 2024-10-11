// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutputTest {

	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method throws an IllegalStateException when the compiler output has errors.
	*/
	@Test
	void testCreateRobotFactory_hasErrors() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(true);
		assertThrows(IllegalStateException.class, () -> compilerOutput.createRobotFactory("test"));
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct name.
	*/
	@Test
	void testCreateRobotFactory_name() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertEquals("test", compilerOutput.createRobotFactory("test").getName());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct program.
	*/
	@Test
	void testCreateRobotFactory_program() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		Program program = new Program();
		compilerOutput.setProgram(program);
		assertEquals(program, compilerOutput.createRobotFactory("test").getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct hardware specification.
	*/
	@Test
	void testCreateRobotFactory_hardwareSpecification() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		HardwareSpecification hardwareSpecification = new HardwareSpecification();
		compilerOutput.setHardwareSpecification(hardwareSpecification);
		assertEquals(hardwareSpecification, compilerOutput.createRobotFactory("test").getHardwareSpecification());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct debug info.
	*/
	@Test
	void testCreateRobotFactory_debugInfo() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		DebugInfo debugInfo = new DebugInfo();
		compilerOutput.setDebugInfo(debugInfo);
		assertEquals(debugInfo, compilerOutput.createRobotFactory("test").getDebugInfo());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct max processor speed.
	*/
	@Test
	void testCreateRobotFactory_maxProcessorSpeed() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		compilerOutput.setMaxProcessorSpeed(100);
		assertEquals(100, compilerOutput.createRobotFactory("test").getMaxProcessorSpeed());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct message.
	*/
	@Test
	void testCreateRobotFactory_message() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		compilerOutput.setMessage("test");
		assertEquals("test", compilerOutput.createRobotFactory("test").getMessage());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct name when the name is null.
	*/
	@Test
	void testCreateRobotFactory_nameNull() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertEquals("", compilerOutput.createRobotFactory(null).getName());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct program when the program is null.
	*/
	@Test
	void testCreateRobotFactory_programNull() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertNull(compilerOutput.createRobotFactory("test").getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct hardware specification when the hardware specification is null.
	*/
	@Test
	void testCreateRobotFactory_hardwareSpecificationNull() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertNull(compilerOutput.createRobotFactory("test").getHardwareSpecification());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct debug info when the debug info is null.
	*/
	@Test
	void testCreateRobotFactory_debugInfoNull() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertNull(compilerOutput.createRobotFactory("test").getDebugInfo());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case checks if the method returns a RobotFactory with the correct message when the message is null.
	*/
	@Test
	void testCreateRobotFactory_messageNull() {
		AtRobotCompilerOutput compilerOutput = new AtRobotCompilerOutput();
		compilerOutput.setHasErrors(false);
		assertNull(compilerOutput.createRobotFactory("test").getMessage());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a compiler output with the correct program.
	*/
	@Test
	void testCompile_program() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		Program program = new Program();
		compiler.setProgram(program);
		assertEquals(program, compiler.compile("test").getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns