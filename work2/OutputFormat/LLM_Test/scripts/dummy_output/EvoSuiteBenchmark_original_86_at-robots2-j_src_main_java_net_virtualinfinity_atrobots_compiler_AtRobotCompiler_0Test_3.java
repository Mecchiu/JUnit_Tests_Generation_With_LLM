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
		public static class testFile {
			 @Test
            public void setFile(File file) {
				 assertNotNull("testFile", file);
                 }
		}
}

class AtRobotCompiler_1Test {
    public void setUp() throws Exception {
        // create dummy test file
        setUpForSource();
    }

    public void setUpForSource() throws IOException, ClassNotFoundException {
        InputStream source = getClass().getResourceAsStream("test1.atro") ;
        AtRobotCompilerOutput compile =
            new AtRobotCompiler<testFile>().compile(source) ;
        CompilerTestUtilities.displayCompilerResults("AtRobotCompiler_1.atro", compile);
        assertEquals("test1.atro", compile.fileName) ;
        assertEquals(0, compile.containsErrors) ;

    }
}