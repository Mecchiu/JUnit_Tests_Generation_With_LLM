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
		AtRobotCompiler_1Test(){ }

		static InputStream is;

		String code;

		/**
		 * Set the input stream to the given object.
		 *
		 * @param stream The input stream.
		 */
		static void setInput(Input stream) {
			is = stream;
		}

		/**
		 * Compile the source read from the given reader.
		 *
		 * @param reader The reader.
		 * @return a CompilerOutput object.
		 * @throws IOException if there is a problem reading from the reader.
		 */
		AtRobotCompiler_1Test(Reader reader) throws IOException {
			code = readFrom(reader);
		}

		private static String readFrom(Reader reader) throws IOException {
			StringBuffer output = new StringBuffer(1000);
			
			CharStream channel = new CharStream(reader);
			channel.mark(0);
			
			int read = channel.read();
			while (read!= -1 && read!= CharStream.EOF_CHAR) {
				output.append((char)read);
				read = channel.read();
			}
			channel.reset();
			
			return output.toString();
		}
}