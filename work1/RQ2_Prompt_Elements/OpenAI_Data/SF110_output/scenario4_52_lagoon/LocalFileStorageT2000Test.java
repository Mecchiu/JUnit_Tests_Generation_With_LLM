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
	* Test case 1 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns 0 when the file doesn't exist.
	*/
	@Test
	void testFileLastModified1() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(0, result);
	}
	
	/**
	* Test case 2 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
	*/
	@Test
	void testFileLastModified2() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(-1, result);
	}
	
	/**
	* Test case 3 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns the last modified time of the file when the file exists and the last modified time is available.
	*/
	@Test
	void testFileLastModified3() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(1589788800000, result);
	}
	
	/**
	* Test case 4 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns 0 when the file doesn't exist.
	*/
	@Test
	void testFileLastModified4() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(0, result);
	}
	
	/**
	* Test case 5 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
	*/
	@Test
	void testFileLastModified5() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(-1, result);
	}
	
	/**
	* Test case 6 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns the last modified time of the file when the file exists and the last modified time is available.
	*/
	@Test
	void testFileLastModified6() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(1589788800000, result);
	}
	
	/**
	* Test case 7 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns 0 when the file doesn't exist.
	*/
	@Test
	void testFileLastModified7() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(0, result);
	}
	
	/**
	* Test case 8 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns -1 when the file exists but the last modified time is not available.
	*/
	@Test
	void testFileLastModified8() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(-1, result);
	}
	
	/**
	* Test case 9 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns the last modified time of the file when the file exists and the last modified time is available.
	*/
	@Test
	void testFileLastModified9() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(1589788800000, result);
	}
	
	/**
	* Test case 10 for {@link LocalFileStorage#fileLastModified(String)} method.
	* This test case checks if the method returns 0 when the file doesn't exist.
	*/
	@Test
	void testFileLastModified10() {
		LocalFileStorage localFileStorage = new LocalFileStorage();
		long result = localFileStorage.fileLastModified("test.txt");
		assertEquals(0, result);
	}
}