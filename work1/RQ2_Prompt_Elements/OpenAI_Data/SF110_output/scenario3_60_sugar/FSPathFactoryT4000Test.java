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
    }

    /**
     * @param path
     * @returns String the path of the specified path.
     */
    public static String getPath(String path) {
        return new File(path).getPath();
    }

    /**
     * @param file
     * @returns String the path of the specified file.
     */
    public static String getPath(File file) {
        return file.getPath();
    }

    /**
     * @param path
     * @returns String the path of the specified path.
     */
    public static String getPath(FSPath path) {
        return path.getPath();
    }

    /**
     * @param path
     * @returns String the name of the specified path.
     */
    public static String getName(String path) {
        return new File(path).getName();
    }

    /**
     * @param file
     * @returns String the name of the specified file.
     */
    public static String getName(File file) {
        return file.getName();
    }

    /**
     * @param path
     * @returns String the name of the specified path.
     */
    public static String getName(FSPath path) {
        return path.getName();
    }

    /**
     * @param path
     * @returns FSPath the parent of the specified path.
     */
    public static FSPath getParent(String path) {
        return new DefaultFSPath(new File(path).getParent());
    }

    /**
     * @param file
     * @returns FSPath the parent of the specified file.
     */
    public static FSPath getParent(File file) {
        return new DefaultFSPath(file.getParent());
    }

    /**
     * @param path
     * @returns FSPath the parent of the specified path.
     */
    public static FSPath getParent(FSPath path) {
        return path.getParent();
    }

    /**
     * @param path
     * @returns List<FSPath> the children of the specified path.
     */
    public static List<FSPath> getChildren(String path) {
        List<FSPath> children = new ArrayList<FSPath>();
        for (File file : new File(path).listFiles()) {
            children.add(new DefaultFSPath(file));
        }
        return children;
    }

    /**
     * @param file
     * @returns List<FSPath> the children of the specified file.
     */
    public static List<FSPath> getChildren(File file) {
        List<FSPath> children = new ArrayList<FSPath>();
        for (File child : file.listFiles()) {
            children.add(new DefaultFSPath(child));
        }
        return children;
    }

    /**
     * @param path
     * @returns List<FSPath> the children of the specified path.
     */
    public static List<FSPath> getChildren(FSPath path) {
        return path.getChildren();
    }

    /**
     * @param path
     * @param name
     * @returns FSPath the child of the specified path with the specified name.
     */
    public static FSPath getChild(String path, String name) {
        return new DefaultFSPath(new File(path, name));
    }

    /**
     * @param file
     * @param name
     * @returns FSPath the child of the specified file with the specified name.
     */
    public static FSPath getChild(File file, String name) {
        return new DefaultFSPath(new File(file, name));
    }

    /**
     * @param path
     * @param name
     * @returns FSPath the child of the specified path with the specified name.
     */
    public static FSPath getChild(FSPath path, String name) {
        return path.getChild(name);
    }

    /**
     * @param path
     * @param name
     * @param extension
     * @returns FSPath the child of the specified path with the specified name and extension.
     */
    public static FSPath getChild(String path, String name, String extension) {
        return new DefaultFSPath(new File(path, name + "." + extension));
    }

    /**
     * @param file
     * @param name
     * @param extension
     * @returns FSPath the child of the specified file with the specified name and extension.
     */
    public static FSPath getChild(File file, String name, String extension) {
        return new DefaultFSPath(new File(file, name + "." + extension));
    }

    /**
     * @param path
     * @param name
     * @param extension
     * @returns FSPath the child of the specified path with the specified name and extension.
     */
    public static FSPath getChild(FSPath path, String name, String extension) {
        return path.getChild(name, extension);
    }

    /**
     * @param path
     * @param name
     * @param extension
     * @param separator
     * @returns FSPath the child of the specified path with the specified name, extension, and separator.
     */
    public static FSPath getChild(String path, String name, String extension, String separator) {
        return new DefaultFSPath(new File(path, name + separator + extension));
    }

    /**
     * @param file
     * @param name
     * @param extension
     * @param separator
     * @returns FSPath the child of the specified file with the specified name, extension, and separator.
     */
    public static FSPath getChild(File file, String name, String extension, String separator) {
        return new DefaultFSPath(new File(file, name + separator + extension));
    }

    /**
     * @param path
     * @param name
     * @param extension
     * @param separator
     * @returns FSPath the child of the specified path with the specified name, extension, and separator.
     */
    public static FSPath getChild(FSPath path, String name, String extension, String separator) {
        return path.getChild(name, extension, separator);
    }

    /**
     * @param path
     * @returns boolean true if the specified path exists.
     */
    public static boolean exists(String path) {
        return new File(path).exists();
    }

    /**
     * @param file
     * @returns boolean true if the specified file exists.
     */
    public static boolean exists(File file) {
        return file.exists();
    }

    /**
     * @param path
     * @returns boolean true if the specified path exists.
     */
    public static boolean exists(FSPath path) {
        return path.getFile().exists();
    }

    /**
     * @param path
     * @returns boolean true if the specified path is a directory.
     */
    public static boolean isDirectory(String path) {
        return new File(path).isDirectory();
    }

    /**
     * @param file
     * @returns boolean true if the specified file is a directory.
     */
    public static boolean isDirectory(File file) {
        return file.isDirectory();
    }

    /**
     * @param path
     * @returns boolean true if the specified path is a directory.
     */
    public static boolean isDirectory(FSPath path) {
        return path.getFile().isDirectory();
    }

    /**
     * @param path
     * @returns boolean true if the specified path is a file.
     */
    public static boolean isFile(String path) {
        return new File(path).isFile();
    }

    /**
     * @param file
     * @returns boolean true if the specified file is a file.
     */
    public static boolean isFile(File file) {
        return file.isFile();
    }

    /**
     * @param path
     * @returns boolean true if the specified path is a file.
     */
    public static boolean isFile