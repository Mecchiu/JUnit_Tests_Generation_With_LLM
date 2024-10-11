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
		
	/**
	 * Test method for {@link AtRobotCompiler#compile(LineNumberReader)}
	 * The test checks a correct parse of the file.
	 */
	@Test
	void compile1() throws IOException {
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		AtRobotCompilerOutput atRobotCompilerOutput = atRobotCompiler.compile(null);
		FileOutputStream out = new FileOutputStream(atRobotCompilerOutput.file);
        byte data[] = atRobotCompilerOutput.data;
        assertNotnull(data);
        
	}

	public void test2() throws IOException {
		
		AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
		AtRobotCompilerOutput atRobotCompilerOutput = atRobotCompiler.compile(null, new StringReader("LineNumberReaderTest"));
		FileOutputStream out = new FileOutputStream(atRobotCompilerOutput.file);
        byte data[] = atRobotCompilerOutput.data;
        assertNotnull(data);
        
	}


}