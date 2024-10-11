// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains ten unit test cases for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {

	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function.
	*/
	@Test
	public void testDecompileSimpleFunction() {
		String source = "function f() { return 1; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a parameter.
	*/
	@Test
	public void testDecompileSimpleFunctionWithParameter() {
		String source = "function f(a) { return a; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with two parameters.
	*/
	@Test
	public void testDecompileSimpleFunctionWithTwoParameters() {
		String source = "function f(a, b) { return a + b; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a parameter and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithParameterAndDefaultValue() {
		String source = "function f(a = 1) { return a; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with two parameters and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithTwoParametersAndDefaultValue() {
		String source = "function f(a, b = 1) { return a + b; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a parameter and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithParameterAndDefaultValue2() {
		String source = "function f(a = 1, b) { return a + b; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with two parameters and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithTwoParametersAndDefaultValue2() {
		String source = "function f(a = 1, b = 2) { return a + b; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a parameter and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithParameterAndDefaultValue3() {
		String source = "function f(a, b = 1, c) { return a + b + c; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with two parameters and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithTwoParametersAndDefaultValue3() {
		String source = "function f(a, b = 1, c = 2) { return a + b + c; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a parameter and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithParameterAndDefaultValue4() {
		String source = "function f(a = 1, b = 2, c) { return a + b + c; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with two parameters and a default value.
	*/
	@Test
	public void testDecompileSimpleFunctionWithTwoParametersAndDefaultValue4() {
		String source = "function f(a = 1, b = 2, c = 3) { return a + b + c; }";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
}

// ErrorReporter.java
package org.mozilla.javascript;

/**
 * This interface describes the access to the error reporter
 * for the JavaScript engine.
 *
 * @author Norris Boyd
 */

public interface ErrorReporter {

    /**
     * Report a warning.
     *
     * The implementing class may choose to ignore the warning
     * if it desires.
     *
     * @param message a String describing the warning
     * @param sourceName a String describing the JavaScript source where the
     *        warning occured; typically a filename or URL
     * @param lineno the line number associated with the warning
     * @param lineSource the text of the line (may be null)
     * @param lineOffset the offset into lineSource where problem was detected
     */
    public void warning(String message, String sourceName, int lineno,
                        String lineSource, int lineOffset);

    /**
     * Report an error.
     *
     * The implementing class is free to throw an exception if
     * it desires.
     *
     * If execution has not yet begun, the JavaScript engine is
     * free to find additional errors rather than terminating
     * the translation. It will not execute a script that had
     * errors, however.
     *
     * @param message a String describing the error
     * @param sourceName a String describing the JavaScript source where the
     *        error occured; typically a filename or URL
     * @param lineno the line number associated with the error
     * @param lineSource the text of the line (may be null)
     * @param lineOffset the offset into lineSource where problem was detected
     */
    public void error(String message, String sourceName, int lineno,
                      String lineSource, int lineOffset);

    /**
     * Creates an EvaluatorException that may be thrown.
     * runtimeErrors, unlike errors, will always terminate the
     * current script.
     *
     * @param message a String describing the error
     * @param sourceName a String describing the JavaScript source where the
     *        error occured; typically a filename or URL
     * @param lineno the line number associated with the error
     * @param lineSource the text of the line