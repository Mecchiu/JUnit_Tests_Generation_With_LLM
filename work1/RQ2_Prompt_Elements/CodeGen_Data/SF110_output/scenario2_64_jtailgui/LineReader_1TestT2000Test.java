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

			private boolean testWrite = true;
			
	@Test
	void test_readBlock() throws IOException {
		final int nbLines = 2000;
		try (File f = new File("/tmp/line")) {
			f.deleteOnExit();
			List<String> data = new ArrayList<>();
			// Test that the line reader starts at the expected size of 2 : size + 1
			for (int i = 1; i < nbLines; i++) {
				data.add(this.randomAccess.readLine());
			}
			final FileIndex index = new FileIndex();
			f.deleteOnExit();

			final List<String> expected = new ArrayList<>();
			// Test that the line reader ends with the next line
			expected.add(data.remove(data.size() - 1));
			expected.add(data.remove(data.size() - 1));
			// Test that the line reader starts at the first line, while the expected line has a different start
			final List<String> currentLine = new ArrayList<>();
			f.deleteOnExit();
			for (int i = 1; i < this.randomAccess.length(); i++) {
				currentLine.add(this.randomAccess.readLine());
			}
			assertEquals(expected, currentLine, NbTests.DISTANCE);
			// Delete file if empty
			if (f.delete() == false) {
				JTailLogger.warning( "Error during file deletion, unable to delete File: " + f);
			}
			
			// Write line reader in the file
			final List<String> lines = this.readBlock(0, nbLines);
			assertEquals(lines, nbLines, nbLines);

			f.deleteOnExit();
			// Delete the writer in the file
			f.delete();
			f.delete();
			
			// Test that the line reader ends with the next line
			currentLine = new ArrayList<>();
			currentLine.add(data.remove(data.size() - 1));
			int actual = data.remove(data.size() - 1);

			assertEquals(data.size(), actual);
			assertEquals(lines, currentLine);

			expected = data;
			// Check that the LineReader has all the files as expected
			expected.toArray(new String[0]);
			List<String> read = this.readBlock(0, nbLines + 1);

			assertEquals(expected, read);

			read = this.readBlock(0, nbLines);

			for (String line : lines) {
				assertTrue(read.contains(line));
			}

			assertEquals(nbLines, lines.size());
			
		}			
	}
}