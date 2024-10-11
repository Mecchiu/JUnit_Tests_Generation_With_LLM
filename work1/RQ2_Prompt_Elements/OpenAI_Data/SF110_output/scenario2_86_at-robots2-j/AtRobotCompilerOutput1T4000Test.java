// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutputTest {

	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput2() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput3() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput4() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput5() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput6() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput7() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput8() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput9() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput10() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput11() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput12() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput13() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput14() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testHasErrors_ValidInput15() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors = new CompilerErrors();
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1, 1));
		output.errors.addError(new CompilerError("test", 1,