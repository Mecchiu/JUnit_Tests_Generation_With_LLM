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
		assertEquals(0x88, output.getCode()[0]);
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
		assertEquals(0x88, output.getCode()[0]);
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
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturn() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeed() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeed() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTab() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLine() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparator() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparatorAndParagraphSeparator() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028\u2029".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparatorAndParagraphSeparatorAndSpace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028\u2029 ".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparatorAndParagraphSeparatorAndSpaceAndNoBreakSpace() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028\u2029 \u00A0".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparatorAndParagraphSeparatorAndSpaceAndNoBreakSpaceAndOghamSpaceMark() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028\u2029 \u00A0\u1680".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* It tests the case where the input stream contains a single line of code with a comment and a newline.
	*/
	@Test
	void testCompile_SingleLineOfCodeWithCommentAndNewlineAndCarriageReturnAndLineFeedAndFormFeedAndVerticalTabAndNextLineAndLineSeparatorAndParagraphSeparatorAndSpaceAndNoBreakSpaceAndOghamSpaceMarkAndEnQuad() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new ByteArrayInputStream("mov ax, bx ; comment\r\n\f\u000B\u0085\u2028\u2029 \u00A0\u1680\u2000".getBytes()));
		assertNotNull(output);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(2, output.getCode().length);
		assertEquals(0x88, output.getCode()[0]);
		assertEquals(0xC3, output.getCode()[1]);