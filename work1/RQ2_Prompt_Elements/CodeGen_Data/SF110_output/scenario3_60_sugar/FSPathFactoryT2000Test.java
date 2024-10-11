// FSPathFactoryTest.java
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains one unit test case for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactoryTest {

	/**
		* Test for {@link FSPathFactory#newFSPath()} method.
		*/
	@Test
	public void testNewFSPath() {
		// Test 0-th path of the FSPathFactory class.
		try {
			FSPath path = FSPathFactory.newFSPath();
			assertTrue(path.exists());
			assertTrue(2==path.toString().count("//"));
			assertTrue(path.isDirectory() && path.getAbsoluteAbsolutePath().count("//") == 2);
			assertEquals(2, path.getAbsoluteAbsolutePath().count(".//"));
			assertEquals("//", path.getAbsoluteFile().getFullPath());
		}catch(Exception f){
			fail("File error from FSPathFactory."+f.getMessage());
		}
		
		// Test 1-th path of the FSPathFactory.
		try {
			FSPath path = FSPathFactory.newFSPath("test");
			assertTrue(path.exists());
			assertTrue(2==path.toString().count("//"));
			assertTrue(path.isDirectory() && path.getAbsoluteAbsolutePath().count("//") == 2);
			assertEquals(2, path.getAbsoluteAbsolutePath().count(".//"));
			assertEquals("//", path.getAbsoluteFile().getFullPath());
		}catch(Exception f){
			fail("File error from FSPathFactory.2");
		}
		
		//Test 2-th path of the FSPathFactory.
		try {
			FSPath path = FSPathFactory.newFSPath("test2");
			assertTrue(path.exists());
			assertTrue(2==path.toString().count("//"));
			assertTrue(path.isDirectory() && path.getAbsoluteAbsolutePath().count("//") == 2);
			assertEquals(2, path.getAbsoluteAbsolutePath().count(".//"));
			assertEquals("//", path.getAbsoluteFile().getFullPath());
		}catch(Exception f){
			fail("File error from FSPathFactory.3");
		}
		
		//Test 3-th path of the FSPathFactory.
		try {
			FSPath path = FSPathFactory.newFSPath("//myName//");
			assertTrue(2==path.toString().count("myName"));
			assertTrue(path.isDirectory() && path.getAbsoluteAbsolutePath().count("//myName") == 2);
			assertEquals("myName", path.getAbsoluteFile().getFullPath());
		}catch(Exception f){
			fail("File error from FSPathFactory.3");
		}
		
	} // end of test
	
}
