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
		 * Compile the specific "Test1.java".
		 *
		 * @throws IOException if there is a problem reading from the file.
		 * @throws TokenNotFoundException if the token could not be successfully retrieved from the file.
		 */
        @Test
        public void compile_1() throws IOException, TokenNotFoundException {
        	final File temp = File.createTempFile("atrobots-", ".java");
        	try {
  	    		String content = "package net.virtualinfinity.atrobots.compiler.test1;\n"
  	    				+ "\n"
  	    				+ "import net.virtualinfinity.atrobots.compiler.lib";
	    	    final OutputStream out = new BufferedOutputStream(new FileOutputStream(temp));
	    		try {
		    		new CompilerWriterImpl(content)
		    		.compile(new FileInputStream(temp));
	    		} finally {
	    			out.close();
	    		}

//   				final BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(temp)));
//   				try {
//   				final String line = in.readLine();
//   				if (line == null){
//   					System.out.println("line is null");
//   					return;
//   				}else{
//   					System.out.println(line);
//   				}
//   				} finally {
//   				in.close();
//   				}

        	} finally {
        		temp.delete();
        	}
        }
}