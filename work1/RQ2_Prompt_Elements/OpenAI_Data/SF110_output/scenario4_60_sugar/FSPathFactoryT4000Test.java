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
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	public void testNewFSPath() {
		System.out.println("newFSPath");
		FSPath result = FSPathFactory.newFSPath();
		assertNotNull(result);
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	public void testNewFSPath_File() {
		System.out.println("newFSPath");
		File file = new File(".");
		FSPath result = FSPathFactory.newFSPath(file);
		assertNotNull(result);
	}

	/**
	 * Test of newFSPath method, of class FSPathFactory.
	 */
	@Test
	public void testNewFSPath_String() {
		System.out.println("newFSPath");
		String path = ".";
		FSPath result = FSPathFactory.newFSPath(path);
		assertNotNull(result);
	}
}

// FSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#getFile()} method.
*/
class FSPathTest {
		
	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile() {
		System.out.println("getFile");
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String() {
		System.out.println("getFile");
		String path = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8, ext9);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		String ext10 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8, ext9, ext10);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		String ext10 = ".";
		String ext11 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8, ext9, ext10, ext11);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		String ext10 = ".";
		String ext11 = ".";
		String ext12 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8, ext9, ext10, ext11, ext12);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		String ext10 = ".";
		String ext11 = ".";
		String ext12 = ".";
		String ext13 = ".";
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(".");
		File result = instance.getFile(path, name, ext, ext2, ext3, ext4, ext5, ext6, ext7, ext8, ext9, ext10, ext11, ext12, ext13);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile_String_String_String_String_String_String_String_String_String_String_String_String_String_String_String_String() {
		System.out.println("getFile");
		String path = ".";
		String name = ".";
		String ext = ".";
		String ext2 = ".";
		String ext3 = ".";
		String ext4 = ".";
		String ext5 = ".";
		String ext6 = ".";
		String ext7 = ".";
		String ext8 = ".";
		String ext9 = ".";
		String ext10 = ".";
		String ext11 = ".";
		String ext12 = ".";
		String ext13 = ".";
		String ext14 = "."