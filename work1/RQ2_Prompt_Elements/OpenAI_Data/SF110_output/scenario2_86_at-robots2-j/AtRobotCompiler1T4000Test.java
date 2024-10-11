// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream is null.
	*/
	@Test
	void testCompile_NullInputStream() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		assertThrows(NullPointerException.class, () -> compiler.compile(null));
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream is empty.
	*/
	@Test
	void testCompile_EmptyInputStream() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream(new byte[0]));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code.
	*/
	@Test
	void testCompile_SingleLineOfCode() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithComment() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewline() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabel() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndComment() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewline() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespaceAndLabel() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\nlabel2:".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespaceAndLabelAndWhitespace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\nlabel2:\t\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndComment() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\nlabel2:\t\n; comment".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewline() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\nlabel2:\t\n; comment\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespaceAndLabelAndWhitespaceAndCommentAndNewlineAndWhitespace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\n\t\nlabel:\t\n; comment\n\t\nlabel2:\t\n; comment\n\t\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x89, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.comp