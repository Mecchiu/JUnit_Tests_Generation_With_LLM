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
		void testCompileSourceFileText() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				atRobotCompiler.compile(new File("file.txt"));
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileTextWithInputStream() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				InputStream in = new FileInputStream("file.txt");
				atRobotCompiler.compile(in);
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileTextWithReader() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("file.txt")));
				atRobotCompiler.compile(reader);
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileReaderText() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				atRobotCompiler.compile(new FileReader("file.txt"), new FileReader("file.txt") );
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileReaderTextWithInputStream() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				InputStream in = new FileInputStream("file.txt");
				LineNumberReader reader = new LineNumberReader(new InputStreamReader(in));
				atRobotCompiler.compile(reader, in);
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileReaderTextWithReader() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileReader("file.txt")));
				atRobotCompiler.compile(reader, new FileReader("file.txt") );
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

		@Test
		void testCompileSourceFileReaderTextWithInputStream() throws IOException {
				AtRobotCompiler atRobotCompiler = new AtRobotCompiler();
				LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileReader("file.txt")));
				atRobotCompiler.compile(reader, new FileReader("file.txt") );
				assertTrue("Source file not compiled", atRobotCompiler.compiled == true);
		}

}