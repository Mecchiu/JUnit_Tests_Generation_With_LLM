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
		assertTrue(result instanceof DefaultFSPath);
		assertEquals(new File(System.getProperty("user.dir")), result.getFile());
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
 * It contains ten unit test cases for the {@link FSPath#getFile()}, {@link FSPath#getPath()}, {@link FSPath#getName()}, {@link FSPath#getParent()}, {@link FSPath#getChildren()}, {@link FSPath#getChild(String)}, {@link FSPath#getChild(FSPath)}, {@link FSPath#getChild(File)}, {@link FSPath#getChild(String, String)}, and {@link FSPath#getChild(String, String, String)} methods.
 */
class FSPathTest {

	/**
	 * Test of getFile method, of class FSPath.
	 */
	@Test
	public void testGetFile() {
		System.out.println("getFile");
		FSPath instance = FSPathFactory.newFSPath();
		File expResult = new File(System.getProperty("user.dir"));
		File result = instance.getFile();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPath method, of class FSPath.
	 */
	@Test
	public void testGetPath() {
		System.out.println("getPath");
		FSPath instance = FSPathFactory.newFSPath();
		String expResult = System.getProperty("user.dir");
		String result = instance.getPath();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getName method, of class FSPath.
	 */
	@Test
	public void testGetName() {
		System.out.println("getName");
		FSPath instance = FSPathFactory.newFSPath();
		String expResult = new File(System.getProperty("user.dir")).getName();
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getParent method, of class FSPath.
	 */
	@Test
	public void testGetParent() {
		System.out.println("getParent");
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = FSPathFactory.newFSPath(new File(System.getProperty("user.dir")).getParent());
		FSPath result = instance.getParent();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChildren method, of class FSPath.
	 */
	@Test
	public void testGetChildren() {
		System.out.println("getChildren");
		FSPath instance = FSPathFactory.newFSPath();
		List<FSPath> expResult = new ArrayList<FSPath>();
		for (File file : new File(System.getProperty("user.dir")).listFiles()) {
			expResult.add(FSPathFactory.newFSPath(file));
		}
		List<FSPath> result = instance.getChildren();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChild method, of class FSPath.
	 */
	@Test
	public void testGetChild_String() {
		System.out.println("getChild");
		String name = "";
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = null;
		FSPath result = instance.getChild(name);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChild method, of class FSPath.
	 */
	@Test
	public void testGetChild_FSPath() {
		System.out.println("getChild");
		FSPath path = null;
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = null;
		FSPath result = instance.getChild(path);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChild method, of class FSPath.
	 */
	@Test
	public void testGetChild_File() {
		System.out.println("getChild");
		File file = null;
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = null;
		FSPath result = instance.getChild(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChild method, of class FSPath.
	 */
	@Test
	public void testGetChild_String_String() {
		System.out.println("getChild");
		String name = "";
		String extension = "";
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = null;
		FSPath result = instance.getChild(name, extension);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getChild method, of class FSPath.
	 */
	@Test
	public void testGetChild_String_String_String() {
		System.out.println("getChild");
		String name = "";
		String extension = "";
		String separator = "";
		FSPath instance = FSPathFactory.newFSPath();
		FSPath expResult = null;
		FSPath result = instance.getChild(name, extension, separator);
		assertEquals(expResult, result);
	}
}

// FSPathUtil.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kbishop
 */
public class FSPathUtil {

    /**
     * @param path
     * @returns FSPath a new FSPath instance which uses the specified path to search from.
     */
    public static FSPath newFSPath(String path) {
        return new DefaultFSPath(path);
    }

    /**
     * @param file
     * @returns FSPath a new FSPath instance which uses the specified file to search from.
     */
    public static FSPath newFSPath(File file) {
        return new DefaultFSPath(file);
    }

    /**
     * @param path
     * @returns File a new File instance which uses the specified path to search from.
     */
    public static File newFile(String path) {
        return new File(path);
    }

    /**
     * @param file
     * @returns File a new File instance which uses the specified file to search from.
     */
    public static File newFile(File file) {
        return new File(file.getPath());
    }

    /**
     * @param path
     * @returns File a new File instance which uses the specified path to search from.
     */
    public static File newFile(FSPath path) {
        return new File(path.getPath());
   