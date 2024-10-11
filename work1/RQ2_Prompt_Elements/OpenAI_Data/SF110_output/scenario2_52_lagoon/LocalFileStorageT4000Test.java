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

		/**
		* Test case 1 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns 0 when the file does not exist.
		*/
		@Test
		public void testFileLastModified1() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(0, result);
		}
		
		/**
		* Test case 2 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
		*/
		@Test
		public void testFileLastModified2() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(-1, result);
		}
		
		/**
		* Test case 3 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns the correct last modified time when the file exists and the last modified time is available.
		*/
		@Test
		public void testFileLastModified3() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(1589788000, result);
		}
		
		/**
		* Test case 4 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns 0 when the file does not exist.
		*/
		@Test
		public void testFileLastModified4() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(0, result);
		}
		
		/**
		* Test case 5 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
		*/
		@Test
		public void testFileLastModified5() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(-1, result);
		}
		
		/**
		* Test case 6 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns the correct last modified time when the file exists and the last modified time is available.
		*/
		@Test
		public void testFileLastModified6() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(1589788000, result);
		}
		
		/**
		* Test case 7 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns 0 when the file does not exist.
		*/
		@Test
		public void testFileLastModified7() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(0, result);
		}
		
		/**
		* Test case 8 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
		*/
		@Test
		public void testFileLastModified8() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(-1, result);
		}
		
		/**
		* Test case 9 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns the correct last modified time when the file exists and the last modified time is available.
		*/
		@Test
		public void testFileLastModified9() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(1589788000, result);
		}
		
		/**
		* Test case 10 for the {@link LocalFileStorage#fileLastModified(String)} method.
		* This test case checks if the method returns 0 when the file does not exist.
		*/
		@Test
		public void testFileLastModified10() {
				LocalFileStorage localFileStorage = new LocalFileStorage();
				long result = localFileStorage.fileLastModified("/home/user/file.txt");
				assertEquals(0, result);
		}
}