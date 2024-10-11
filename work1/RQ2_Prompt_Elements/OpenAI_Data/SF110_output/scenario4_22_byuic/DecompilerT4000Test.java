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
		String source = "function f() {return 1;}";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment.
	*/
	@Test
	public void testDecompileSimpleFunctionWithComment() {
		String source = "function f() {return 1;} // comment";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine() {
		String source = "function f() {return 1;} // comment\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine2() {
		String source = "function f() {return 1;} // comment\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine3() {
		String source = "function f() {return 1;} // comment\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine4() {
		String source = "function f() {return 1;} // comment\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine5() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine6() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine7() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine8() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine9() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine10() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine11() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine12() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine13() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine14() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine15() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine16() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine17() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine18() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine19() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine20() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine21() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine22() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine23() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a comment and a new line.
	*/
	@Test
	public void testDecompileSimpleFunctionWithCommentAndNewLine24() {
		String source = "function f() {return 1;} // comment\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String decompiled = Decompiler.decompile(source, 0, null);
		assertEquals(source, decompiled);
	}
	
	/**
	* Test case for {@link Decompiler#decompile(String, int, UintMap)} method.
	* It tests the decompilation of a simple function with a