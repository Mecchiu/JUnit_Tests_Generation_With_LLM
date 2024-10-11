// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {
		public static final class UnitTest {
			atRobotCompiler compile(InputStream in) throws IOException {
				return null;
			}
		}
		public void testOf(UnitTest test) throws IOException {
			Object compiled = test.compile(new FileReader(test.getClass().getClassLoader().getResourceAsStream("FileReader")));
			assertNotNull(compiled);
		}
		@Test
		void test() throws IOException, ClassNotFoundException {
			assertNotNull(AtRobotCompiler.compile(new FileReader(new File("1.java"))));
			File file = new File("1.java");
			Object compiled = AtRobotCompiler.compile(file.getName(), new StringReader("1"), new LineNumberReader(file.getName()));
			assertNotNull(compiled);
		}
}