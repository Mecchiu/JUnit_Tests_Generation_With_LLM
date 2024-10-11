// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains one unit test case for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		// =====================================================================

	private final FileStorageTestHelper storageHelper = new FileStorageTestHelper();

	private FileStorage storage;

	@Test
	 void fileLastModifiedReturnsCorrectValue() throws Exception {
		final Object lock = new Object();
		synchronized(lock) {
			final long time = storageHelper.lastModified(path);
			assertEquals(time, (long)lock.get());
		}
	}

	@Test
	 void closeDoesNothing() throws Exception {
		storage = new LocalFileStorage();
		storage.close();
	}

	// ======================================================================
}