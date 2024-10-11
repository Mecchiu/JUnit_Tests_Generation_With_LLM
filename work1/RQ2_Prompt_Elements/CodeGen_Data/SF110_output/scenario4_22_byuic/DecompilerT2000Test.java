// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
DecompilerTest() {
			System.out.println("DecompilerTest()");
			System.out.flush();
		}
	@Test
	void testDecompile() {


		// initial values
		int flags = 1 << 0;
		int sourceFileOffset = 0;
		int sourceLineOffset = 0;

		// input representation
		String source =
			"function X\n" +
			"     declare\n" +
			"X();\n" +
			"{\n" +
			"       use();\n" +
			"     }\n" +
			"X();\n" +
			"{\n" +
			"       use();\n" +
			"    }\n" +
			"";

		// parameters
		String regexp = "/\\/\\/\\/\\/";    // only one pattern for now
				// this has no effect and will lead to the same behavior
		String numProperties = null;
		String flagsProperties = null;

		String output =
			"X = function X(){}\n" +
			"X.doIt();\n";
		assertEquals(
			"X.prototype.prototype$getNext\n",
			output,
			Decompiler.decompile(source, flags | flagsProperties | numProperties, properties(flagsProperties), sourceFileOffset, sourceLineOffset));


	}
}
