// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {
		private final AtRobotCompiler compiler = AtRobotCompiler.atRobotCompile("atrobot.txt");
			
		private final File path = new File("src/atrobot.txt");

		@Test
		void test1() throws Exception {
			assertFileExists("src/atrobot.txt", "Atrobot.java");
			assertFileExists("src/test/resources/source/"+path.getAbsolutePath(), "test/resources/source/atrobot.txt");
			compiler.compile(path, -1);
			assertFileExists("test/resources/source/atrobot.txt", "Atrobo.java");
			assertFileExists("test/resources/source/test/resources/source/"+path.getAbsolutePath(), "test/resources/source/test/resources/atrobo.java");
		}

		@Test
		void test2() throws Exception {
			assertFileExists("test/resources/source/atrobot.txt", "Atrobo.java");
			assertFileExists("test/resources/source/test/resources/source/"+path.getAbsolutePath(), "test/resources/source/atrobo.java");
			compiler.compile(path, -1);
			assertFileExists("test/resources/source/atrobo.txt", "Atrobo.java");
			assertFileExists("test/resources/source/test/resources/test/resources/source/"+path.getAbsolutePath(), "test/resources/source/test/resources/atrobo.java");
		}
}