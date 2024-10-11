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
private File sourceFile;
		private
    public AtRobotCompiler_0Test(String fileNameAndPath) {
		this.sourceFile = Utils.getFile(fileNameAndPath);
    }
		/**
		 * @throws Exception if error occurred
		 */
		 @Test 
		 public void test() throws Exception {
			   File path = new File(sourceFile.getAbsolutePath());
			   assertTrue("File: does not exist.", path!= null) : "\n" + sourceFile.getAbsolutePath() + "\n" + "File:\n" + path;
			   OutputStream out;
			   OutputStream err;
			   out = new FileOutputStream(path + ".compiled.out");
			   err = new FileOutputStream(path + ".compiled.err");
			   assertThat("Can not write.",out,"compiled.out");
			   assertThat("Can not write.",err,"compiled.err");
			   assertThat("Can not write.",out,"compiled.out");
			   assertThat("Can not write.",err,"compiled.err");
			   Compiler.compile(sourceFile.getAbsolutePath() + ".c");
			   assertThat("Can not write.",out,"compiled.out");
			   assertThat("Can not write.",err,"compiled.err");
			   assertThat("Can not write.",out,"compiled.out");
			   assertThat("Can not write.",err,"compiled.err");
			   System.out.println("Cleaning up after test");
			   CoffeeCup.cleanup();
		 }
 }
// AtRobotCompiler
