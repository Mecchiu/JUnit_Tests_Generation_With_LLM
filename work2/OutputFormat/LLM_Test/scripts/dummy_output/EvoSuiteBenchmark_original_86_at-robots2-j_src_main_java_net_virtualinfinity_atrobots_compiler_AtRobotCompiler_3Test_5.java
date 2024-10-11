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
		
    @Test
    public void test() {
        AtRobotCompilerCompiler.compile(LineNumberReader.class);
        AtRobotCompilerOutput output = AtRobotCompiler.compile(LineNumberReader.class);

        assertNotNull("Compiled output", output);
    }
	

}