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
		private AtRobotCompiler compiler;
		private AtRobotCompilerOutput compilerOutput;
		
		private StringBuffer sb;
				
		// ----------------------------------------------------------------------------------
		/**
     * @param compiler compiler which will be used for this test-case.
     * @param compilerOutput compiler output which will receive the result of this test-case.
     * @throws InputMismatchException of the {@link InputMismatchException} is thrown when compiling a new program.
     * @throws IOException of the {@link IOException} is thrown when attempting to read from a stream.
     *
     */
        public AtRobotCompiler_2Test(AtRobotCompiler compiler, AtRobotCompilerOutput compilerOutput) throws InputMismatchException, IOException {
        	this.compiler = compiler;
        	this.compilerOutput = compilerOutput;
        	sb = new StringBuffer();
        	
            sb.append("\n");
            sb.append("import net.virtualinfinity.test.TestClass0");
            sb.append("\n");
            sb.append("import " + TestClass0.class.getCanonicalName() + ";");
            sb.append("\n");
            sb.append("public class " + TestClass0_MainTest_1);
            sb.append(" {\n");
            sb.append("};\n");
            sb.append("\n");
            
            final File sourceFile = new File("atRobotCompiler_2Test.sgt");
            if (sourceFile.exists()) {
                try (Reader in = new FileReader(sourceFile)) {
                    compiler.compile(in);
                    compilerOutput.compiled = true;
                }
            } else {
                try (Reader in = new FileReader(new File("atRobotCompiler_2Test.sgt"))){
                    compiler.compile(in);
                    compilerOutput.compiled = true;
                }
            }
        }
    	
	}