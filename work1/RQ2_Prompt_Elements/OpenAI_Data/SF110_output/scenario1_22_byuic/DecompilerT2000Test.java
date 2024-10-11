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
		void testDecompileSimpleFunction() {
				String source = "function f() { return 1; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a parameter.
		*/
		@Test
		void testDecompileFunctionWithParameter() {
				String source = "function f(x) { return x; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with two parameters.
		*/
		@Test
		void testDecompileFunctionWithTwoParameters() {
				String source = "function f(x, y) { return x + y; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement.
		*/
		@Test
		void testDecompileFunctionWithReturnStatement() {
				String source = "function f() { return 1; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and a parameter.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndParameter() {
				String source = "function f(x) { return x; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and two parameters.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndTwoParameters() {
				String source = "function f(x, y) { return x + y; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and a variable.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndVariable() {
				String source = "function f() { var x = 1; return x; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and a variable and a parameter.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndVariableAndParameter() {
				String source = "function f(x) { var y = 1; return x + y; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and two variables.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndTwoVariables() {
				String source = "function f() { var x = 1; var y = 2; return x + y; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and two variables and a parameter.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndTwoVariablesAndParameter() {
				String source = "function f(x) { var y = 1; var z = 2; return x + y + z; }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and a variable and a parameter and a function call.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndVariableAndParameterAndFunctionCall() {
				String source = "function f(x) { var y = 1; return x + y + g(x); }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
		/**
		* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
		* It tests the decompilation of a function with a return statement and a variable and a parameter and a function call and a function call with a parameter.
		*/
		@Test
		void testDecompileFunctionWithReturnStatementAndVariableAndParameterAndFunctionCallAndFunctionCallWithParameter() {
				String source = "function f(x) { var y = 1; return x + y + g(x) + h(x, y); }";
				String decompiled = Decompiler.decompile(source, 0, new UintMap());
				assertEquals(source, decompiled);
		}
		
}

// ErrorReporter.java
package org.mozilla.javascript;

/**
 * This interface describes the access to the error reporter for the
 * JavaScript engine.
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
     * @param line the line number associated with the warning
     * @param lineSource the text of the line (may be null)
     * @param lineOffset the offset into lineSource where problem was detected
     */
   