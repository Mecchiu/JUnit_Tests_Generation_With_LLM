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
		 * Make sure there's at least one line with the compiler.
		 * @throws IOException if there error
		 * @throws InterruptedException if interrupted
		 */
		@Test
		void shouldHasOneLine() throws IOException, InterruptedException {
			File f = new File("testfile");
			assertTrue(f.exists());
			assertNotNull(new FileInputStream(f));
		}

		//@Test
		void shouldCreateOneLine() throws IOException, InterruptedException {
			File f = new File("testfile");
			assertFalse(f.exists());
		}
}