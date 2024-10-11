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
		
	@Test
	void test1() throws IOException {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		
		AtRobotCompilerOutput compilerOutput = atRobotCompiler.compile(new FileReader(new File("test")).read());
		
		assertNotNull(compilerOutput);
		assertTrue(compilerOutput.isCompiled());
	}

	@Test
	void test() throws IOException {
		InputStream in = new FileInputStream(new File("test"));
		
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		com.sun.tools.javac.Main.main(new String[] {"test"});
		
		assertTrue(TestSystem.isCompiled());
		assertTrue(in.available() < 10);
	}

}