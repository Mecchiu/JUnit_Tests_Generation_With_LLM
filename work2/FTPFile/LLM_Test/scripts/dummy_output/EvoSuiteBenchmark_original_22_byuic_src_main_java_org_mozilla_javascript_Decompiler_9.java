// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		/**
		* @test
		*/
		@Test
		public void testDecompile() {
			// create string to be decompiled
			String source = "123\n234\n\n";
			// generate code to run during test
			String expected = "123";
			String decoded = DecompilerTest.decompile(source, Decompiler.ONLY_BODY_FLAG, System.undefined);
			assertEquals(expected, decoded);
		}


	}