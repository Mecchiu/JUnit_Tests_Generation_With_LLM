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

	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = null</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase0() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = null;
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = ""</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase1() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = " "</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase2() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = " ";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "a"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase3() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "a";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "abcdefghijklmnopqrstuvwxyz"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase4() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "abcdefghijklmnopqrstuvwxyz";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase5() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "0123456789"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase6() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "0123456789";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase7() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"</li>
	* </ul>
	* and the following expected output.
	* <ul>
	* <li>exception = NullPointerException</li>
	* </ul>
	*/
	@Test
	void testCase8() {
		// Given
		Errors errors = null;
		Program program = null;
		HardwareSpecification hardwareSpecification = null;
		int maxProcessorSpeed = 0;
		DebugInfo debugInfo = null;
		String message = null;
		AtRobotCompilerOutput atRobotCompilerOutput = new AtRobotCompilerOutput(errors, program, hardwareSpecification, maxProcessorSpeed, debugInfo, message);
		String name = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		
		// When
		Throwable exception = assertThrows(NullPointerException.class, () -> atRobotCompilerOutput.createRobotFactory(name));
		
		// Then
		assertEquals("errors must not be null", exception.getMessage());
	}
	
	/**
	* Test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
	* This test case tests the method with the following inputs.
	* <ul>
	* <li>errors = null</li>
	* <li>program = null</li>
	* <li>hardwareSpecification = null</li>
	* <li>maxProcessorSpeed = 0</li>
	* <li>debugInfo = null</li>
	* <li>message = null</li>
	* <li>name = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123