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
		
    @Test
    public void test() throws Exception {
        AtRobotCompiler atRobotCompiler = new AtRobotCompiler();

        StringWriter os = new StringWriter();
        PrintWriter writer = new PrintWriter(os);
		
        // run the runCompiler command for the given source file  for compilation
        if(atRobotCompiler.compile(new File("test.txt"))!= null) {
            fail("Error when compiling test.txt.");
        }
		
        try (PrintWriter writer2) {
            writer2.println("OK");
        }
		
        // read all the lines by reading a writer	
        StringReader reader1 = new StringReader(os.toString());
		
        try (Scanner scanner2 = new Scanner(reader1)) {
            String line = scanner2.nextLine();
            assertNotNull(line);
    		
            assertNotNull("No file was marked as empty, no error. "+
                "Compiled test.txt.", line);
        }
		
        try (Scanner scanner2 = new Scanner(new FileReader(new File("test.txt")));) {
            String line = scanner2.nextLine();
            assertNotNull("Error when reading test.txt.", line);
    		
            assertNotNull(line);
            assertTrue(line.equals("OK"));
        }
        assertTrue(os.toString().equals("OK\n"));
    }
	
}