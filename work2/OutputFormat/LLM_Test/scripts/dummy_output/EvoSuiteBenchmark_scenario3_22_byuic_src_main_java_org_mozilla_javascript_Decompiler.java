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