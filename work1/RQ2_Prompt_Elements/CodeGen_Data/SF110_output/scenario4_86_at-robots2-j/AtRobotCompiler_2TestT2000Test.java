// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {
private final static String sourceString =
                "    //- - - \n"
                + "    //- - - - -\n"
                + "    //- - - - +\n"
                + "/*!\n"
                + " * @author    Thorsten S. Dalmaijer\n"
                + " * @version   1.0.*\n"
                + " *\n"
                + " *         Tested on: " + System.lineSeparator()
                + System.lineSeparator()
                + "  * @since    1.0.* \n"
                + "    * @testcase  testAtRobotCompiler2 \n"
                + "             * - - - --\n"
                + "             * - - - -\n"
                + "             * - - - - /\n"
                + "             * - - - -\n";

        AtRobotCompiler_2Test(StreamExprVisitor v) {
        }
        
        /**
         * Test the {@link #compile(Reader)} method.
         */
        @Test
        public void testAtRobotCompiler2() {
            FileWriter fw = null;
            try {
                AtRobotCompilerOutput cv = compile(sourceString, fw);
		       assertEquals("wrong output!", cv.read(), "The input string didn't compile correctly.\n", fw.getBuffer().toString());
                
                String buffer = new String(cv.buffer());
				assertEquals("wrong output!", buffer, "This is a sample code!\n", fw.getBuffer().toString());
		    fail("Expected RuntimeException, see above");
            } catch (IOException ioe) {
                String buffer = new String(cv.buffer());
				System.out.println("got the error: " + ioe);
				assertEquals("wrong output!", ioe,
				            "Expected Runtime Exception, see above");
			}
        }
}
