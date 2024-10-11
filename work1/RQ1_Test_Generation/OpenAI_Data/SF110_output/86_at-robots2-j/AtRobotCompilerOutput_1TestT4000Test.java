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
	* This test case checks if the method returns the correct value when there are no errors.
	*/
	@Test
	void testGetErrors_4() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetErrors_5() {
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
	void testGetErrors_6() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetErrors_7() {
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
	void testGetErrors_8() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getErrors()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetErrors_9() {
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
	void testGetErrors_10() {
		Errors errors = new Errors();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertEquals(errors, atRobotCompilerOutput.getErrors());
	}
	
}

// AtRobotCompilerOutput_3Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#getProgram()} method.
*/
class AtRobotCompilerOutput_3Test {
		
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetProgram_1() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are no errors.
	*/
	@Test
	void testGetProgram_2() {
		Errors errors = new Errors();
		Program program = new Program();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, null, 0, null, null);
		assertEquals(program, atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetProgram_3() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are no errors.
	*/
	@Test
	void testGetProgram_4() {
		Errors errors = new Errors();
		Program program = new Program();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, null, 0, null, null);
		assertEquals(program, atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are errors.
	*/
	@Test
	void testGetProgram_5() {
		Errors errors = new Errors();
		errors.addError(new Error("error"));
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, null, null, 0, null, null);
		assertThrows(IllegalStateException.class, () -> atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method.
	* This test case checks if the method returns the correct value when there are no errors.
	*/
	@Test
	void testGetProgram_6() {
		Errors errors = new Errors();
		Program program = new Program();
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, null, 0, null, null);
		assertEquals(program, atRobotCompilerOutput.getProgram());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#getProgram()} method