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
     * Test case for {@link AtRobotCompiler#compile(LineNumberReader)}.
     */
    @Test
    public void test_compile() {
        //System.out.println("test_compile");

        String expected = "\ntest_compile\n\n";

        assertEquals(expected, compile.compile("").toString());

        expected = "\ntest_compile\n\n";

        assertEquals(expected, compile.compile("\tabc\n\n").toString());
    }
}


