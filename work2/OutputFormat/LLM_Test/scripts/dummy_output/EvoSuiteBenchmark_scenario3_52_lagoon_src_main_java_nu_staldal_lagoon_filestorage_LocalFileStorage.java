// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	@Test
	void testFileLastModified() {
		LocalFileStorage storage = new LocalFileStorage();
		assertEquals(0, storage.fileLastModified("/tmp/foo.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/bar.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/baz.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuux.txt"));
		assertEquals(0, storage.fileLastModified("/tmp/quuuuuuuux.txt"));
	}
}