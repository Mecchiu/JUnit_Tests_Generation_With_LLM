// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		

	private String source =
		"function foo() {this.c = 1;}\n" +
		"function bar() {return 1;}\n" +
		"function qux() {return 1+3-2+5-this.c;}\n" +
		"function boo() {return 4;}\n" +
		"function func() {}\n";

	static DecompilerTest oneUnitTestCase() {
		DecompilerTest test = new DecompilerTest();
		test.runDecompile(source, TO_SOURCE_FLAG, UintMap.EMPTY);
		return test;
	}

	private void runDecompile(String input, int flags, UintMap properties) {
	    DecompilerTest test = oneUnitTestCase();
	    assertEquals(input, test.decompile(input, flags, properties).length());
	}

	private void runDecompile(String input) {
		runDecompile(input, TO_SOURCE_FLAG | INITIAL_INDENT_PROP | CASE_GAP_PROP, UintMap.EMPTY);
	}

	/**
	 * Check that the proper offsets are set when decoding
	 * an encoded source string.
	 */
	@Test
	void testOffset() {
		assertEquals(DECOMPILE_UNENCODED_SOURCE_OFFSET,
				Decompiler.decompile(source, DECOMPILE_UNENCODED_SOURCE_OFFSET, UintMap.EMPTY).length());
		assertEquals((DECOMPILE_UNENCODED_SOURCE_OFFSET >>> 8) + 1,
				Decompiler.decompile(source, (DECOMPILE_UNENCODED_SOURCE_OFFSET << 16) | 0x4, UintMap.EMPTY).length());
		assertEquals(DECOMPILE_UNENCODED_SOURCE_OFFSET,
				Decompiler.decompile(source, (DECOMPILE_UNENCODED_SOURCE_OFFSET << 8) | DECOMPILE_UNENCODED_SOURCE_OFFSET, UintMap.EMPTY));
		assertEquals(0, Decompiler.decompile(source, DECOMPILE_UNENCODED_SOURCE_OFFSET | DECOMPILE_UNENCODED_SOURCE_OFFSET, UintMap.EMPTY).length());
	}

	/**
	 * Check that the proper offsets are set when decoding an encoded source string.
	 */
	@Test
	void testOffset2() {
		int min = 10;
		int max = 20;
		int originalLength = (max - min) + (max - 10);
		char [] charArray = source.toCharArray();
}
}