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
		private final Core core;

		private final File file;

	/**
	 * Instantiates a new LocalFileStorageTest.
	 *
	 * @param c core
	 * @param f file
	 */
	public LocalFileStorageTest(Core c, File f) {
		core = c;
		file = f;
	}

	/**
	 * Test of fileLastModified().
	 *
	 * @throws java.security.NoSuchAlgorithmException
	 */
	@Test
	public void testFileLastModified() throws NoSuchAlgorithmException {
		// Given
		File f = new FileResource(file);
		long l1 = f.lastModified();

		// When
		assertNotEquals(-1, l1);

		// Then
		assertGreaterThanOrEqualTo(0, l1);
	}
}