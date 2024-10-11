// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		private boolean testPassed = true;
		private String source;
		private int sourceLength;
		private Decompiler d;

		@Test
		public void testDecompileString() {
			this.testPassed = false;
			String source = "function foo(arg0) {\n return arg0;\n}\n";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(source, sourceLength); // the encoded source does no longer represent the original source
			assertEquals(1, d.getSourceTop());
			testPassed = true;
		}

		@Test
		public void testDecompileEmptyString() {
			this.testPassed = false;
			String source = "";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(sourceLength, d.getSourceTop());
			testPassed = true;
		}

		@Test
		public void testDecompileFunctionBody() {
			this.testPassed = false;
			String source = "function foo() { return 1; }";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(sourceLength, d.getSourceTop());
			testPassed = true;
		}

		@Test
		public void testDecompileFunctionEnd() {
			this.testPassed = false;
			String source = "function foo() {\n return 1;\n}\n";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(sourceLength, d.getSourceTop());
			testPassed = true;
		}

		@Test
		public void testDecompileCase() {
			this.testPassed = false;
			String source = "case 1\n:\n x();\n\n\ncase 2\n:\n y();\n:\n z();\n\n\np();\n;\nend\nend\nvar x = 2; x++;";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(sourceLength, d.getSourceTop());
			testPassed = true;
		}

		@Test
		public void testDecompileDefault() {
			this.testPassed = false;
			String source = "1,\n\n\n";
			d = Decompiler.decompile(source, 0, null);
			assertEquals(source, d.getEncodedSource());
			assertEquals(sourceLength, d.getSourceTop());
			testPassed = true;
		}

        @Test
        public void testDecompileCaseClosed() {
            this.testPassed = false;
}
}