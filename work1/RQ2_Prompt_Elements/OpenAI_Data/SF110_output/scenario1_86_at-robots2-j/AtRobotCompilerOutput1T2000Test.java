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
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns false when there are no errors.
		*/
		@Test
		void testHasErrorsFalse() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				assertFalse(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue2() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue3() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue4() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue5() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue6() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue7() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue8() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				assertTrue(output.hasErrors());
		}
		
		/**
		* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
		* This test case checks if the method returns true when there are errors.
		*/
		@Test
		void testHasErrorsTrue9() {
				AtRobotCompilerOutput output = new AtRobotCompilerOutput();
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(new CompilerError("test", 0, 0));
				output.errors.addError(