// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {
		 /**
		 * Compile a file with a specific content string.
		 */
	@Test
	void compile_Test() {
		try {
			System.out.println("=== start");
			File sourceFile = new File("testdata/atrobots/compiler/simple.cs");
			AtRobotCompiler_0Test.compile(sourceFile);
			assertTrue("The file '" + sourceFile + "' has not been compiled correctly",
					sourceFile.exists()? true : false);
//			assertTrue(line + "Expected:\n" +
//					"\n" +
//					"\tExpected:\t" +
//					"\n" +
//					"\tActual:\t" +
//					"\n" +
//					"\n" +
//					"Expected: " +
//					((line.isBlank())? "(no content)" : line),	
			System.out.println("=== end");
		} catch (IOException io) {
			System.err.println(io.getMessage());
		}
	}
	@Test
	void compile_Test_Exception() {
		try {
			try {
				new File("testdata/atrobots/compiler/simple.cs");
			} catch (java.io.IOException ioe) {
				System.out.println("Expected exception was thrown");
				assertTrue(ioe instanceof IOException);
				assertEquals("The content of file /testdata/atrobots/compiler/simple.cs does not match the content in the source",
						ioe.getMessage());
				System.err.println("Got exception " + ioe.getStackTrace()[0].getMessage());
			}
			System.out.println("=== start");
			File sourceFile = new File("testdata/atrobots/compiler/simple.cs");
			File sourceFile_empty = new File("testdata/atrobots/compiler/empty.cs");
			AtRobotCompiler_0Test.compile(sourceFile);
			System.out.println("=== end");
			assertEquals("The content of file /testdata/atrobots/compiler/simple.cs does not match the expected content, is this correct?",
					sourceFile.getAbsolutePath(),
					sourceFile_empty.getAbsolutePath());
		} catch (IOException io) {
			System.err.println(io.getMessage());
		}
	}
}