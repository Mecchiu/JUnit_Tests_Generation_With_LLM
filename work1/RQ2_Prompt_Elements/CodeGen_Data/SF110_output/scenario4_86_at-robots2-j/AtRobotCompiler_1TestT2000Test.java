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

    static final InputStream INPUT = new InputStream() {
        @Override
        public int read() throws IOException {
            throw new IOException();
        }
    };
    
    /**
    * Test case in which the unit test does not use a specific InputStream and uses the stream to read
    * the file itself.
    *
    * @throws IOException if there is an error reading from the file.
    */
    @Test
    public void test_input_stream_compile_stream()
        throws IOException {

		AtRobotCompiler Output = null;
		try {
			Output = new AtRobotCompiler() {
				
				/**
				 * Compile the file.
				 *
				 * @param in the InputStream
				 * @return a CompilerOutput object.
				 * @throws IOException if there is a problem reading from the stream.
				 */
				public AtRobotCompilerOutput compile(InputStream in) throws IOException;
				
			}
			
		} catch (AtRobotCompilerException e) {
			System.err.println(e.getMessage());
			if (false) return;
		}

		try {
			try {
				return new AtRobotCompiler() {
					
					/**
					 * Compile the file.
					 *
					 * @param in the InputStream
					 * @return a CompilerOutput object.
					 * @throws IOException if there is a problem reading from the stream.
					 */
					public AtRobotCompilerOutput compile(InputStream in) throws IOException;
					
				}
				
			} catch (AtRobotCompilerException e) {
				System.err.println(e.getMessage());
				TestUtilities.rethrowIfClosed(e);
			}
		} catch (IOException e) {
			System.err.println(e);
			TestUtilities.rethrowIfClosed(e);
		}

    }
}