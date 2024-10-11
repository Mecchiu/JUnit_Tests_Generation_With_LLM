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
		// The test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.	
    @Test
    void test_1() {
        InputStream is = new ByteArrayInputStream("This is a test".getBytes());
        LineNumberReader reader = new LineNumberReader(is);
        AtRobotCompilerOutput output = AtRobotCompiler.compile(reader);
                
        assertEquals(27, output.getCommentCount());
        assertEquals(27, output.getTotalCompilerOutputSize());
        assertEquals("This is a test", output.getCommentByIndex(0).getText());
        assertEquals("This is a test", output.getCommentByIndex(1).getText());
        assertEquals("This is a test", output.getCommentByIndex(2).getText());
        assertEquals("This is a test", output.getCommentByIndex(0).getText());
        assertEquals("This is a test", output.getCommentValue(0).getValue());
    }
}