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
    void test1() throws IOException {
        // test 1: read the contents of a file
        
        File file = new File("/tmp/file.txt");
        InputStream in = new FileInputStream(file);
        
        // The test file is not readable by any system and will be converted to UTF-8 in the file's parent.
//            String encoding = System.getProperty("file.encoding"); // Get the java standard encoding.
        
        AtRobotCompilerOutput aot = AtRobotCompiler.compile(in);
        // read the source file.
        String line = null;
        try {line=new BufferedReader(new InputStreamReader(in, "UTF-8"))
				.readLine();}
        catch (Exception ex){ex.printStackTrace();}
//        try {System.out.println("file.getAbsolutePath(): "+file.getAbsolutePath());}
//        catch (Exception ex){ex.printStackTrace();}
        assertEquals("line 1 in the file.txt.txt content is a line with the string 'hello', expected value is 'hi there'",
                LineNumberReader.readFromLineNumber(line, 0l, false), "line 1 in the file.txt.txt ");
		// test 2: get the compiled file
        int length = line.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<length;i++){
              final char c = line.charAt(i);
              sb.append(c);
	    }
		// the file has the same content of the file it was compiled to.
		assertEquals(sb.toString(), file.getAbsolutePath());

    }
	
}