// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment() throws IOException {
		String sourceCode = "; This is a single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_2() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_3() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_4() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_5() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_6() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_7() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_8() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_9() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_10() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
}

// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_3Test {
		
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment() throws IOException {
		String sourceCode = "; This is a single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_2() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_3() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_4() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_5() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_6() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_7() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_8() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
		assertFalse(output.hasErrors());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* The test case tests the compilation of a source code with a single line comment.
	* The test case expects the compiler to compile the source code without any errors.
	*/
	@Test
	void testCompile_SingleLineComment_9() throws IOException {
		String sourceCode = "; This is a single line comment.\n; This is another single line comment.\n; This is yet another single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.\n; This is the last single line comment.";
