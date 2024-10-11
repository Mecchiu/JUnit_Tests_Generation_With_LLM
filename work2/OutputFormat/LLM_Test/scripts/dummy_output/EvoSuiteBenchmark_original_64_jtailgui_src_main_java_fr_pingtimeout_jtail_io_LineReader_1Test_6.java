// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
		/**
		 * Test of readBlock method, of LineReader class.
		 * Note: the number of parameter must be the same.
		 * @throws IOException exception thrown from <b>readBlock</b> method invocation
		 * @see LineReader#readBlock(int, int)
		 */
		@Test
		public void testReadBlock() throws IOException {
			String testData = "";
			int expectedSize = 0;
			String outputfile = "";

			expectedSize = new FileIndex().getIndexSize();
			outputfile = outputfile + "-out.txt";

			testData = "Hello javaworld\n";
			String line = "";

			expectedSize += 6;

			List<String> output = new ArrayList<>(expectedSize);

			line = line + testData + "\n";
			expectedSize += 6 + testData.length();

			line = line + "\n"+ "World";
			expectedSize++;

			line = line + "\n"+ "Goodbye world\n";
			expectedSize += 3;

			line = line + line + "\n";
			file = new File(outputfile);
			output = readBlock(file, expectedSize - 1 /* nb of lines expected */);
			assertEquals(expectedSize, output.size());
			assertEquals(output.toString(), output.toString());
			final String message = output.stream().collect(Collectors.joining(System.lineSeparator()));
			assertTrue(message.startsWith("Hello"));
			assertTrue(message.startsWith("World"));
			assertTrue(line.equals(message));
			assertTrue(file.exists());
		}
	}