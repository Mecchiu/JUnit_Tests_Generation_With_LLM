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
    public void compile() throws IOException {
        assertThat(compile("ATRobotCompiler/ATRobotCompiler.java"), isCompiled("ATRobotCompiler/ATRobotCompiler.java"));
    }
}