// FSPathFactoryTest.java
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactoryTest {
		
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns a non-null object.
	*/
	@Test
	void testNewFSPath() {
		FSPath path = FSPathFactory.newFSPath();
		assertNotNull(path);
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object of type {@link DefaultFSPath}.
	*/
	@Test
	void testNewFSPathReturnsDefaultFSPath() {
		FSPath path = FSPathFactory.newFSPath();
		assertTrue(path instanceof DefaultFSPath);
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns a non-null object.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithNonNullFile() {
		FSPath path = FSPathFactory.newFSPath();
		assertNotNull(path.getFile());
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object of type {@link File}.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFile() {
		FSPath path = FSPathFactory.newFSPath();
		assertTrue(path.getFile() instanceof File);
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getPath()} method returns a non-null string.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithNonNullPath() {
		FSPath path = FSPathFactory.newFSPath();
		assertNotNull(path.getFile().getPath());
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getPath()} method returns a non-empty string.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithNonEmptyPath() {
		FSPath path = FSPathFactory.newFSPath();
		assertFalse(path.getFile().getPath().isEmpty());
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getPath()} method returns a string that is equal to the value of the system property "user.dir".
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithPathEqualToUserDir() {
		FSPath path = FSPathFactory.newFSPath();
		assertEquals(path.getFile().getPath(), System.getProperty("user.dir"));
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getAbsolutePath()} method returns a non-null string.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithNonNullAbsolutePath() {
		FSPath path = FSPathFactory.newFSPath();
		assertNotNull(path.getFile().getAbsolutePath());
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getAbsolutePath()} method returns a non-empty string.
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithNonEmptyAbsolutePath() {
		FSPath path = FSPathFactory.newFSPath();
		assertFalse(path.getFile().getAbsolutePath().isEmpty());
	}
	
	/**
	* Test case for {@link FSPathFactory#newFSPath()}.
	* It tests that the method returns an object whose {@link FSPath#getFile()} method returns an object whose {@link File#getAbsolutePath()} method returns a string that is equal to the value of the system property "user.dir".
	*/
	@Test
	void testNewFSPathReturnsFSPathWithFileWithAbsolutePathEqualToUserDir() {
		FSPath path = FSPathFactory.newFSPath();
		assertEquals(path.getFile().getAbsolutePath(), System.getProperty("user.dir"));
	}
}