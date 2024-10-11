// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		
	private static String script;
	//private static List<ErrorRecoveryData> recoveryData;

	static {
		script = "// Test decompilation\n"+
        "var source = [\n    [\"abc\", 3], [\"abd\", 4], [\"wxyz\", 5],\n    [\"wxyz\", 6],\n    [\"abc\", 7], [\"abd\", 8],\n    [\"wxyz\", 9],\n    [\"abc\", 10],\n    [\"abd\", 11],\n    [\"wxyz\", 12],\n    [\"abc\", 123], [\"abc\", 234],\n    [\"abc\", 235],\n    \"abc\"\n  ]\n";
	}

	private static void testDecompile() {
		try {
			Decompiler d = new Decompiler();
			String compressedSource = d.decompile(script, FORMAT_INT_TO_CHARS);
			fail("IllegalStateException expected");
		} catch (IllegalStateException e) {
			String decompiledSource = e.getMessage();
			assertStringEquals("[\"abc\", 3], [\"abc\", 4], [\"wxyz\", 5],\n    [\"wxyz\", 6],\n    [\"abc\", 7], [\"abc\", 8],\n    [\"abc\", 9],\n    [\"abc\", 10],\n    [\"abc\", 11],\n    [\"abc\", 3], [\"abc\", 4], [\"abc\", 5],\n    [\"abc\", 6],\n    [\"abc\", 7],\n    [\"abc\", 8],\n    [\"abc\", 9],\n    [\"abc\", 10],\n    [\"abc\", 11],\n    [\"abc\", 6],\n    \"abc\"]", decompiledSource);
		}
	}

	@Test
	public void testDecompile() {
		testDecompile();
		DecompilerTest.recoveryData = decompiler.recoveryData;
	}

	/**
	 * @return source encoded as a javascript string
	 */
	public static String getEncodedSource() {
		return decompilerTest.sourceToString(0);
	}

	/**
	 * @return the next source byte position in the source
	 */
	public static int getNext(String source) {
		return getNext(source, source.length(), 0);
	}

	/**
	 * @return byte position of the first byte after all code-units in source, which may be past the end (usually 0)
	 */
	public static int getSourceStringEnd(String source) {
		return getSourceStringEnd(source, 0);
	}

	/**
	 * @return the byte position of the first byte of a UTF-8 encoded string
	 */
	public static int getSourceStringStart(String source) {
		return getSourceStringEnd(source, -1);
	}

	/**
	 * @return position of the last byte of a UTF-8 encoded string,
	 *         0 if no UTF-8 encoded string
	 */
	public static int getSourceStringEnd(String source) {
		return getSourceStringEnd(source, -1);
	}

}