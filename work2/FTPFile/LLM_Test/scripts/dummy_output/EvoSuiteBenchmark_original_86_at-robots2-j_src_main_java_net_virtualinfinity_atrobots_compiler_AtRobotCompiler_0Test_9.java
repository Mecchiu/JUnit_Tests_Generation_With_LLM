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
     * Test method for
     * {@link net.virtualinfinity.atrobots.compiler.AtRobotCompiler#compile(File)}
     *.
     */
    @Test
    public void testCompileFromFile() throws IOException {
    	AtRobotCompiler_0 c = new AtRobotCompiler_0();
    	File sourceFile = new File("test/testdata/AtRobotCompiler_0Test/input/test1.txt");
    	AtRobotCompilerOutput output = c.compile(sourceFile);
    	assertNotNull(output);
    	assertNotNull(output.getName());
    	assertTrue(sourceFile.exists());
    	FileInputStream stream = new FileInputStream(sourceFile);
    	AtRobotCompiler_0 test = new AtRobotCompiler_0();
    	for (int x = 0; ; x++) {
    		int a = stream.read();
    		a &= 255;
    		if (a == -1)
    			break;
    		byte b = (byte)stream.read();
    		b &= 1;
    		if (b == -1)
    			break;
    		stream.close();
    	}
    	// assertEquals(0,(int)test.getNumErrors());
    	assertEquals(0,(int)test.getNumWarnings());
    }

    /**
     * Test static method of
     * {@link net.virtualinfinity.atrobots.compiler.AtRobotCompiler#buildClassifier(net.virtualinfinity.atrobots.protos.compiler.AtRobotCompiler)}.
     */
    @Test
    public void testBuildClassifier() {

    }

}