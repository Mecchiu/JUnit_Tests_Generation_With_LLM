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
		public static void main(String[] args) throws Exception {
			InputStream input = new FileInputStream(new File("../test_data/atrobots/atrobots/compiler/my_first_project.atrobots"))
				{
				@Override 
				public int read() throws IOException {
					try {
						return read();
					} catch (IOException e) {
						e.printStackTrace();
						System.exit(0);
					}
				}
                };
			AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
			CompilerCompiler compiler = atRobotCompiler.compile(input);
			AtRobotCompiler_1Test.main(null);
		}
}