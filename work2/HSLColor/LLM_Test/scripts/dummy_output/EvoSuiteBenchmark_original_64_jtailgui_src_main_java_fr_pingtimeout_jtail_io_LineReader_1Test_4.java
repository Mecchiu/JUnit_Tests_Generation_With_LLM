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
		 * Test method, for {@link java.io.ReadOnlyFailedException#ReadOnlyFailedException(int)} for {@link java.io.FileNotFoundException#ReadOnlyFailedException()}
		 * @throws FileNotFoundException if a file for this test cannot be found, or if the test fails
		 * @throws IOException  if an I/O error occurs (on average) during reading
		 */
		@Test
		public void testReadOnlyFailedException() throws FileNotFoundException, IOException {
    assertDoesNotThrow(() -> {
      new LineReader("test/src/test/resources/data/test1.txt", new FileIndex() {
        @Override public List<String> getIndex() throws FileNotFoundException { return null; }
      });
    }, new FileNotFoundException("file_not_found"));
    assertThrows(IOException.class, () -> {
      new LineReader("test/src/test/resources/data/test1.txt", new FileIndex() {
        @Override public List<String> getIndex() throws IOException { return null; }
      });
    });
		}
		
		/**
		 * Test method, for {@link java.io.FileNotFoundException#FileNotFoundException()} for {@link java.io.ReadOnlyFailedException#FileNotFoundException()}
		 * @throws FileNotFoundException on average if a file not existing or on one of the following exceptions
		 * @throws IOException             if an I/O operation error occurs
		 */
		@Test
		public void testFileNotFoundException() throws FileNotFoundException, IOException {
			assertDoesNotThrow(() -> {
				File file = new File("nonexistent/file");

			}, new IOException("no such file"));
			assertDoesNotThrow(() -> {
				File file = new File("some/other/file");

			}, new IOException("no such file"));
			assertDoesNotThrow(() -> {
				File file = new File("non existing file");

			}, new IOException("no such file"));
			assertThrows(FileNotFoundException.class, () -> {
				new LineReader("nonexistent/file", new FileIndex() {
					@Override public List<String> getIndex() throws IOException { return null; }
				});
			});
		}
		
		/**
		 * Test method, for {@link java.io.RandomAccessFile#RandomAccessFile(java.lang.String, java.lang.String, java.lang.String...)} for {@link FileIndex}
		 * @throws IOException              if an I/O error occurs
		 * @throws FileNotFoundException    if a file not existing or on one of the following exceptions
		 * @throws IndexOutOfBoundsException if the file/index is incorrect
		 * @throws FileNotFoundException    if a {@link FileIndex#getIndex()}/a given
		 *                                      {@link FileIndex#getIndex()} is inaccessible
		 * @throws FileNotFoundException    if a {@link FileIndex#getIndex()}/a given
		 *                                      {@link FileIndex#getIndex()} is inaccessible
		 */
		@Test
		public void testRandomAccessFile() throws IOException, FileNotFoundException {
    assertDoesNotThrow(() -> {
      new LineReader("test/src/test/resources/data/test1.txt", new IndexFileIndex(new int[] {1,2,3}) {
        @Override public List<String> getIndex() throws FileNotFoundException { return null; }
       });
    }, new FileNotFoundException("file_not_found"));
    assertThrows(FileNotFoundException.class, () -> {
      new LineReader("test/src/test/resources/data/test1.txt", new IndexFileIndex(new int[] {1,2,3}) {
        @Override public List<String> getIndex() throws FileNotFoundException { return null; }
       });
    });
		}

}