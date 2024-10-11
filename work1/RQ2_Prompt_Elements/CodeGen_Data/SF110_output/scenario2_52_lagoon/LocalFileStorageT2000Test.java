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
public String methodName;

		private final String file = "test";

		private File fileTest = new File("test");

		private File path;


		/**
		 * Constructor of LocalFileStorageTest.
		 * Checks the getPath method of this object, which returns the absolute path of the file when given the path of path.
		 */
        private LocalFileStorageTest(String path)
		{
			this.path = new File(path);
			if (this.path == this.fileTest)
				this.methodName = "fileTest";
			else
				this.methodName = "fileLastModified";
		}


		/**
		 * Return the path of this test.
		 * @return the path of this test
		 */
        private File getPath() {
			this.methodName = "";
			return this.path;
		}

		/**
		 * Returns the method name of this test
		 * @return the method name of this test
		 */
        private String getMethodName() {
			this.methodName = "localFileStorage";
			return this.methodName;
		}


		/**
		 * Creates a temporary file, which was expected via the constructor,
		 * then writes the content of the file to the file.
		 * @throws IOException if the temporary file does not exist at initialization.
		 */
		@Test
		void test() {
			this.methodName = "test";
			try {
				this.fileTest.createNewFile();
			}
			catch (IOException ex) {
				System.out.println("This is not expected.");
				ex.printStackTrace();
			}
			//TODO:
			assertNotNull(this.getPath());
			assertTrue(this.getPath().exists());
			assertTrue(this.getPath().isFile());
			//
			FileOutputStream fos = new FileOutputStream(this.getPath(), true);
			FileInputStream in = new FileInputStream(this.fileTest);
			byte[] buffer = new byte[1024];
			int r;
			while ((r = in.read())!= -1)
			//fos.write(buffer);
				fos.write(r);
		}


		@Test
		void close() {
			this.methodName = "testClose";
			this.fileTest.createNewFile();
			//TODO:
			assertNotNull(this.getPath());
			//fos.close();
			assertNotNull(this.getPath());
			//assertTrue(this.getPath().exists());
		}

		/**
		 * Asserts that the path of this file does not exist.
		 */
		@Test
		void checkExistence() {
			this.methodName = "checkExistence";
			try {
				this.path.createNewFile();
				fail("This test case should fail the creation of the file. It doesn't exist.");
			}
			catch (IOException expected) {
				System.out.println("This is expected.");
				expected.printStackTrace();
			}
		}


        /**
		 * Checks if when the path of this file does exists and when is it last modified.
		 */
        @Test
        void checkFileLastModified() {
            this.methodName = "checkFileLastModified1";
			fileTest.createNewFile();
			assertTrue(this.getPath().isFile());
			this.fileTest.lastModified();
		}

		/**
		 * Creates a LocalFile as a temporary file.
		 */
        @Test
        void createLocalFileAsTemp() {
            this.methodName = "createLocalFileAsTemp";
			try {
				this.fileTest.createNewFile();
				fail("Expecting RuntimeException");
			}
			catch (RuntimeException expected) {
				// expected
			}
			return;
		}
}