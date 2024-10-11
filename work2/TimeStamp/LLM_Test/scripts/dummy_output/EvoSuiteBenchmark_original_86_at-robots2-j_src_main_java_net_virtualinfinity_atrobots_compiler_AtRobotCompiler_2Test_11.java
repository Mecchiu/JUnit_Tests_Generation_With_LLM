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
		public AtRobotCompiler_2Test() {
		}

		/**
		 * Compile the source.
		 *
		 * @param sourceFile the source file.
		 * @return a CompilerOutput object.
		 * @throws IOException if there is a problem reading from the file.
		 */
		public AtRobotCompilerOutput compile(File sourceFile) throws IOException {
			return null;
		}

		/**
		 * Compile the source read from the stream.
		 *
		 * @param in the stream.
		 * @return a CompilerOutput object.
		 * @throws IOException if there is a problem reading from the stream.
		 */
		public AtRobotCompilerOutput compile(InputStream in) throws IOException {
			return null;
		}

		/**
		 * Compile the source read from the given reader.
		 *
		 * @param reader the reader
		 * @return a CompilerOutput object.
		 * @throws IOException if there is a problem reading from the reader.
		 */
		public AtRobotCompilerOutput compile(Reader reader) throws IOException {
			return null;
		}

		/**
		 * Compile the source read from the given reader.
		 *
		 * @param reader the reader
		 * @return a CompilerOutput object.
		 * @throws IOException if there is a problem reading from the reader.
		 */
		public AtRobotCompilerOutput compile(LineNumberReader reader) throws IOException {
			return null;
		}
}

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_Test extends AtRobotCompiler_2Test {

	public AtRobotCompiler_Test(String sourceFile) {
		super(sourceFile);
	}
}


/**
 * Test class for {@link AtRobotCompilerOutput}: read the source by reader.
 */
class AtRobotCompilerTest_2_2 extends AtRobotCompiler_2Test {

	/**
	 * Creates an instance of the test class.
	 */
	public AtRobotCompilerTest_2_2() {
	}

	/**
	 * @return the instance of the test class.
	 */
	public AtRobotCompilerTest_2_1 getObject() {
		return new AtRobotCompilerTest_2_1();
	}

	/**
	 * @return the instance of the test class.
	 */
	public AtRobotCompilerTest_2_2 getObject() {
		return new AtRobotCompilerTest_2_2();
	}
}