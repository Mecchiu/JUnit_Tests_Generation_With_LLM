// AtRobotCompilerOutput_1Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutput_1Test {

	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrors_1() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertTrue(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrors_2() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertFalse(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrors_3() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertTrue(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrors_4() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertFalse(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrors_5() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertTrue(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrors_6() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertFalse(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrors_7() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertTrue(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrors_8() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertFalse(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrors_9() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertTrue(atRobotCompilerOutput.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrors_10() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertFalse(atRobotCompilerOutput.hasErrors());
	}
	
}

// AtRobotCompilerOutput_2Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#getErrors()} method.
*/
class AtRobotCompilerOutput_2Test {
		
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetErrors_1() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are no errors.
	*/
	@Test
	void testGetErrors_2() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetErrors_3() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are no errors