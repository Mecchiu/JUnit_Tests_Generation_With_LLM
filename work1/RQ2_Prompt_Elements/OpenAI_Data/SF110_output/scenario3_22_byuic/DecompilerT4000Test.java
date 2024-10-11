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
	* It tests the decompilation of a simple function with a comment.
	*/
	@Test
	public void testDecompileSimpleFunctionWithComment() {
		String source = "function f() { return 1; } // comment";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline() {
		String source = "function f() { return 1; } // comment\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline2() {
		String source = "function f() { return 1; } // comment\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline3() {
		String source = "function f() { return 1; } // comment\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline4() {
		String source = "function f() { return 1; } // comment\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline5() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline6() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline7() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline8() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline9() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a newline.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewline10() {
		String source = "function f() { return 1; } // comment\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
}

// ErrorReporter.java
package org.mozilla.javascript;

/**
 * This interface describes the access to the error reporter for
 * the JavaScript engine.
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
     * runtimeError reports an error in the sequence of statements
     * that make up the script.
     *
     * @param message a String describing the error
     * @param sourceName a String describing the JavaScript source where the
     *        error occured; typically a filename or URL
     * @param lineno the line number associated with the error
     * @param lineSource the text of the line (may be null)
     * @param lineOffset the offset into lineSource where problem was detected
     */
    public EvaluatorException runtimeError(String message, String sourceName,
                                           int lineno, String lineSource,
                                           int lineOffset);
}

// Evaluator.java
package org.mozilla.javascript;

/**
 * This is the interface that is used to implement custom
 * JavaScript execution.
 * <p>
 * This interface is typically used to implement host
 * environments for JavaScript.
 *
 * @author Norris Boyd
 */

public interface Evaluator {

    /**
     * Compile a JavaScript function.
     *
     * <p>The top-level script compiler will reset its internal
     * data structures between compiles.
     *
     * @param source the source string
     * @param securityDomain an arbitrary object that specifies security
     *        information about the origin or owner of the script. For
     *        implementations that don't care about security, this value
     *        may be null.
     * @param debugInformationCollector collects debug information
     * @param compilerEnv the compiler environment object
     * @return a Function object that may be called to execute the
     *         function.
     * @exception EvaluatorException if the compile fails
     */
    public Function compile(String source, Object securityDomain,
                            Debugger debugInformationCollector,
                            CompilerEnvirons compilerEnv)
        throws EvaluatorException;

    /**
     * Compile a JavaScript function.
     *
     * <p>The top-level script compiler will reset its internal
     * data structures between compiles.
     *
     * @param source the source string
     * @param securityDomain an arbitrary object that specifies security
     *        information about the origin or owner of the script. For
     *        implementations that don't care about security, this value
     *        may be null.
     * @param debugInformationCollector collects debug information
     * @param compilerEnv the compiler environment object
     * @param sourceName the name of the source
     * @param lineno the starting line number of the source
     * @return a Function object that may be called to execute the
     *         function.
     * @exception EvaluatorException if the compile fails
     */
    public Function compile(String source, Object securityDomain,
                            Debugger debugInformationCollector,
                            CompilerEnvirons compilerEnv,
                            String sourceName, int lineno)
        throws EvaluatorException;

    /**
     * Compile a JavaScript function.
     *
     * <p>The top-level script compiler will reset its internal
     * data structures between compiles.
     *
     * @param source the source string
     * @param securityDomain an arbitrary object that specifies security
     *        information about the origin or owner of the script. For
     *        implementations that don't care about security, this value
     *        may be null.
     * @param debugInformationCollector collects debug information
     * @param compilerEnv the compiler environment object
     * @param sourceName the name of the source
     * @param lineno the starting line number of the source
     * @param securityDomain the security domain to use for the generated
     *        class.
     * @return a Function object that may be called to execute the
     *         function.
     * @exception EvaluatorException if the compile fails
     */
    public Function compile(String source, Object securityDomain,
                            Debugger debugInformationCollector,
                            CompilerEnvirons compilerEnv,
                            String sourceName, int lineno,
                            Object securityDomain)
        throws EvaluatorException;

    /**
     * Execute a precompiled script.
     *
     * @param script the precompiled script
     * @param cx the current Context for this thread
     * @param scope the scope to execute the script in
     * @return the result of executing the specified script.
     */
    public Object execute(Script script, Context cx, Scriptable scope);

    /**
     * Execute a precompiled function.
     *
     * @param fun the precompiled function
     * @param cx the current Context for this thread
     * @param scope the scope to execute the function in
     * @param thisObj the JavaScript <code>this</code> object
     * @param args the array of arguments
     * @return the result of executing the specified function.
     */
    public Object call(Function fun, Context cx, Scriptable scope,
                       Scriptable thisObj, Object[] args);
}

// EvaluatorException.java
package org.mozilla.javascript;

/**
 * This class implements the JavaScript exception object.
 * See ECMA 15.11.
 * @author Norris Boyd
 */
public class EvaluatorException extends RhinoException {

    static final long serialVersionUID = -8743165472774725921L;

    /**
     * Create an exception with the specified detail message.
     *
     * Errors internal to the JavaScript engine will simply throw a
     * RuntimeException.
     *
     * @param detail the error message
     */
    public EvaluatorException(String detail) {
        super(detail);
    }

    /**
     * Create an exception with the specified detail message and
     * source text.
     *
     * Errors internal to the JavaScript engine will simply throw a
     * RuntimeException.
     *
     * @param detail the error message
     * @param sourceName the name of the source reponsible for the error
     * @param lineNumber the line number of the source
     * @param lineSource the source text containing the error
     * @param columnNumber the columnNumber of the source (currently ignored)
     */
    public EvaluatorException(String detail, String sourceName,
                              int lineNumber, String lineSource,
                              int columnNumber)
    {
        super(detail, sourceName, lineNumber, lineSource, columnNumber);
    }

    /**
     * Create an exception with the specified detail message and
     * JavaScript exception type.
     *
     * Errors internal to the JavaScript engine will simply throw a
     * RuntimeException.
     *
     * @param detail the error message
     * @param type the JavaScript exception type
     */
    public EvaluatorException(String detail, String type) {
        super(detail, type);
    }

    /**
     * Create an exception with the specified detail message,
     * source text, and JavaScript exception type.
     *
     * Errors internal to the JavaScript engine will simply throw a
     * RuntimeException.
     *
     * @param detail the error message
     * @param sourceName the name of the source reponsible for the error
     * @param lineNumber the line number of the source
     * @param lineSource the source text containing the error
     * @param columnNumber the columnNumber of the source (currently ignored)
     * @param type the JavaScript exception type
     */
    public EvaluatorException(String detail, String sourceName,
                              int lineNumber, String lineSource,
                              int columnNumber, String type)
    {
        super(detail, sourceName, lineNumber, lineSource, columnNumber, type);
    }

    /**
     * Create an exception with the specified detail message,
     * JavaScript exception type, and exception object.
     *
     * Errors internal to the JavaScript engine will simply throw a
     * RuntimeException.
     *
     * @param detail the error message
     * @param type the JavaScript exception type
     * @param exception the JavaScript exception object
     */
    public EvaluatorException(String detail, String type,
                              Scriptable exception)
    {
        super(detail,