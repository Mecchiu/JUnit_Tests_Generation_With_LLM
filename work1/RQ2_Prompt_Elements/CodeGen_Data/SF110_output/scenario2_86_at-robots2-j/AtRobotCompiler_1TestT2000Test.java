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
    public void test() throws IOException {
        AtRobotCompilerOutput result = new AtRobotCompilerOutput();
        InputStreamReader reader = new InputStreamReader( new ByteArrayInputStream( "Hello World: ".getBytes()) );

        result.compile(reader);

        System.out.println(result);

        reader.close();
    }

    @Test
    public void runTest() throws IOException {
        File f = new File("tests/robot.txt");
        assertFalse(f.exists());
        AtRobotCompilerOutput result = AtRobotCompiler.compile(new FileInputStream(f));

        assertTrue(f.length() > 0);

        assertEquals(f.length(), result.size());
    }
}
