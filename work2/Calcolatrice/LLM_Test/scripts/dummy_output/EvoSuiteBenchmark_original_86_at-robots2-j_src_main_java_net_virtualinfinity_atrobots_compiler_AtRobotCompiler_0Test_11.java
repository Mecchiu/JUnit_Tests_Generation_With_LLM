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
     * Test the behavior of the "no-source" method.
     *
     * @throws IOException if something goes wrong.
     * @throws IllegalArgumentException if "no-source" is true or not on the command line.
     * @throws IOException if a problem with compiling the file occurs.
     */
    @Test
    public void testNoSource() throws IOException {
        try {
            new AtRobotCompiler(true).compile(null);
            fail("Exception expected but not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("--no-source", e.getMessage());
        }
    }
    
    /**
     * Test the behavior of the "no-source" method.
     *
     * @throws IOException if something goes wrong.
     * @throws IllegalArgumentException if "no-source" is true or not on the command line.
     * @throws IOException if a problem with compiling the file occurs.
     */
    @Test
    public void testNoSourceAndArgs() throws IOException {
        File file = new File("./test_source_no_args.java");
        try {
            new AtRobotCompiler(true).compile(file);
            fail("Exception expected but not thrown");
        } catch (IllegalArgumentException e) {
            assertNull(e.getMessage());
        }
    }
        
    /**
     * Test the behavior of the "no-args" method.
     *
     * @throws IOException if something goes wrong.
     * @throws IOException if a problem with compiling the file occurs.
     * @throws SecurityException if access to the file fails.
     */
    @Test
    public void testNoArgs() throws IOException {
        try {
            new AtRobotCompiler().compile(null);
            fail("Exception expected but not thrown");
        } catch (SecurityException e) {
            assertNull(e.getMessage());
        }
    }
    
    @SuppressWarnings("null")
	@Test
    public void testNoArgsAndArgs() throws IOException {
        try {
            new AtRobotCompiler(true).compile(null);
             fail("Exception expected but not thrown");
        } catch (IOException e) {
             assertEquals("--no-args", e.getMessage());
        }
    }
    
    /**
     * Test the behavior of the "no-args" method.
     *
     * @throws IOException if something goes wrong.
     * @throws IOException if a problem with compiling the file occurs.
     * @throws SecurityException if access to the file fails.
     */
    @Test
    public void testNoArgsAndArgsAndArgs() throws IOException {
        try {
            new AtRobotCompiler(true).compile(null, "src");
            fail("Exception expected but not thrown");
        } catch (SecurityException e) {
            assertNull(e.getMessage());
        }
    }

    /**
     * Test the behavior of the "no-args" method.
     *
     * @throws IOException if something goes wrong.
     * @throws IOException if a problem with compiling the file occurs.
     * @throws SecurityException if access to the file fails.
     */
    @Test
    public void testNoArgsAndArgsAndArgs() throws IOException {
        try {
            new AtRobotCompiler(true).compile(null, "src", null);
            fail("Exception expected but not thrown");
        } catch (SecurityException e) {
           assertEquals("--no-args --source --no-args", e.getMessage());
        }
    }

}