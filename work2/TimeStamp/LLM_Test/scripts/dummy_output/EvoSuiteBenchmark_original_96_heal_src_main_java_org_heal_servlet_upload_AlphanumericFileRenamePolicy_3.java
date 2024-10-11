// AlphanumericFileRenamePolicyTest.java
package org.heal.servlet.upload;

import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AlphanumericFileRenamePolicy}.
* It contains one unit test case for the {@link AlphanumericFileRenamePolicy#rename(File)} method.
*/
class AlphanumericFileRenamePolicyTest {
		/**
		 * Tests the behavior with the normal case.
		 *
		 * @throws Exception If failed to test the normal case. Null case reference.
		 */
		@Test
		public void normalCase() throws Exception {
			File file = new File("testFiles/AlphanumericFileRenamePolicy.txt");
			final File reference = assertExpectedStrippedness(file);
			assertEquals(reference.getName(), "AlphanumericFileRenamePolicy.txt");

			// test when we provide a new name for an existing one
			final Object name = new Object();
			final File newName = assertExpectedStrippedness(file, name);

			assertEquals(reference.getName(), newName.getName());
		}

		/**
		 * Tests the behavior with one test case that has a bad name.
		 *
		 * @throws Exception If failed to test the bad name reference. Null case reference.
		 */
		@Test
		public void badName() throws Exception {
			File file = new File("testFiles/IllegalFileName01.txt");
			final File reference = assertExpectedStrippedness(file);

			assertEquals(reference.getName(), "IllegalFileName01.txt");
		}

		/**
		 * Tests the behavior with the wrong case to {@link defaultFileRenamePolicy}.
		 *
		 * @throws Exception If failed to test the bad case reference. Null case reference.
		 */
		@Test
		public void rightCaseDifferentNameCase() throws Exception {
			File file = new File("testFiles/AlphanumericFileRenamePolicy.txt");
			final File reference = assertExpectedStrippedness(file);
			file = assertExpectedStrippedness(new File("testFiles/IllegalFileName01.txt"));

			assertEquals(reference.getName(), "IllegalFileName01.txt");
		}

		/**
		 * Tests the behavior with one test case with an existing name.
		 *
		 * @throws Exception If failed to test the existing name. Null reference.
		 */
		@Test
		public void existingName() throws Exception {
			File file = new File("testFiles/AlphanumericFileRenamePolicy.txt");
			final File reference = assertExpectedStrippedness(file);
			checkReferenceEqual(file, reference);

			file = assertExpectedStrippedness(new File("testFiles/BadFileName.txt"));

			assertNull(reference);
		}

		/**
		 * Tests the behaviour with a new name that does not already exist.
		 *
		 * @throws Exception If failed to test the new name. Null reference.
		 */
		@Test
		public void newNonExistingName() throws Exception {
			File file = new File("testFiles/AlphanumericFileRenamePolicy.txt");
			final File reference = assertExpectedStrippedness(file);
			checkReferenceNotExist(file, false);

			file = assertExpectedStrippedness(new File("testFiles/BadFileName.txt"));

			assertNull(reference);
		}

		private void checkReferenceEqual(File reference, File referenceName) throws Exception {
			assertEquals(referenceName, reference);
		}

		/**
		 * Tests the behavior with one test case that does not exist.
		 *
		 * @throws Exception If failed to test the existing one. Null reference.
		 */
		@Test
		public void existingOneNonExistingName() throws Exception {
			File file = new File("testFiles/AlphanumericFileRenamePolicy.txt");
			final File reference = assertExpectedStrippedness(file);
			checkReferenceNotExist(file, false);

			file = assertExpectedStrippedness(new File("testFiles/UnimportantFileName01.txt"));

			assertNull(reference);
		}

		private void checkReferenceNotExist(File reference, boolean isExisting) throws Exception {
			// test empty file
			if (reference.isFile() &&!isExisting) {
				assertEquals(reference.getName(), "");
			} else {
				assertThrowsIfError(() -> reference.delete());
			}
		}

		private File assertExpectedStrippedness(File file) {
			assertNotNull(file);
			assertEquals(file.getName(), file.getName());
			return file;
		}

		private File assertExpectedStrippedness(FileReference reference) {
			File resolved = reference.getFile();
			if (resolved == null) {
				assertNull(resolved);
			} else {
				throw new AssertionError(reference.getFile().getName());
			}
		}
}