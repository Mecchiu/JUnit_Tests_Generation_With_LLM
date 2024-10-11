// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompilerTest {
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file is null.
		*/
		@Test
		void testCompile_NullSourceFile() {
				AtRobotCompiler compiler = new AtRobotCompiler();
				assertThrows(NullPointerException.class, () -> compiler.compile(null));
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file does not exist.
		*/
		@Test
		void testCompile_NonExistentSourceFile() {
				AtRobotCompiler compiler = new AtRobotCompiler();
				assertThrows(FileNotFoundException.class, () -> compiler.compile(new File("non-existent-file.txt")));
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file is a directory.
		*/
		@Test
		void testCompile_DirectorySourceFile() {
				AtRobotCompiler compiler = new AtRobotCompiler();
				assertThrows(FileNotFoundException.class, () -> compiler.compile(new File("src")));
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file is empty.
		*/
		@Test
		void testCompile_EmptySourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/empty.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(0, output.getCode().length);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code.
		*/
		@Test
		void testCompile_SingleLineSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a label.
		*/
		@Test
		void testCompile_SingleLineWithLabelSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-label.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a label and a comment.
		*/
		@Test
		void testCompile_SingleLineWithLabelAndCommentSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-label-and-comment.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a comment.
		*/
		@Test
		void testCompile_SingleLineWithCommentSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-comment.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a comment and a label.
		*/
		@Test
		void testCompile_SingleLineWithCommentAndLabelSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-comment-and-label.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a comment and a label.
		*/
		@Test
		void testCompile_SingleLineWithCommentAndLabelAndWhitespaceSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-comment-and-label-and-whitespace.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
		/**
		* Test case for the {@link AtRobotCompiler#compile(File)} method.
		* It tests the case where the source file contains a single line of code with a comment and a label.
		*/
		@Test
		void testCompile_SingleLineWithCommentAndLabelAndWhitespaceAndNewlineSourceFile() throws IOException {
				AtRobotCompiler compiler = new AtRobotCompiler();
				AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/single-line-with-comment-and-label-and-whitespace-and-newline.txt"));
				assertEquals(0, output.getErrors().size());
				assertEquals(0, output.getWarnings().size());
				assertEquals(1, output.getCode().length);
				assertEquals(0x1234, output.getCode()[0]);
		}
		
}