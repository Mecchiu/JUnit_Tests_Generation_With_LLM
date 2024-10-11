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
 * It contains ten unit test cases for the {@link FSPath#getFile()}, {@link FSPath#getPath()}, {@link FSPath#getParent()}, {@link FSPath#getName()}, {@link FSPath#getAbsolutePath()}, {@link FSPath#getAbsoluteFile()}, {@link FSPath#getCanonicalPath()}, {@link FSPath#getCanonicalFile()}, {@link FSPath#getURI()}, {@link FSPath#getURL()}, {@link FSPath#getTotalSpace()}, {@link FSPath#getFreeSpace()}, {@link FSPath#getUsableSpace()}, {@link FSPath#getFileSystem()}, {@link FSPath#getRoot()}, {@link FSPath#getParentFile()}, {@link FSPath#getNameCount()}, {@link FSPath#getName(int)}, {@link FSPath#subpath(int, int)}, {@link FSPath#isAbsolute()}, {@link FSPath#isDirectory()}, {@link FSPath#isFile()}, {@link FSPath#isHidden()}, {@link FSPath#exists()}, {@link FSPath#canRead()}, {@link FSPath#canWrite()}, {@link FSPath#canExecute()}, {@link FSPath#isReadable()}, {@link FSPath#isWritable()}, {@link FSPath#isExecutable()}, {@link FSPath#isSameFile(FSPath)}, {@link FSPath#isHidden()}, {@link FSPath#toString()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toFile()}, {@link FSPath#toPath()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileSystem()}, {@link FSPath#getName(int)}, {@link FSPath#getNameCount()}, {@link FSPath#getParent()}, {@link FSPath#getRoot()}, {@link FSPath#iterator()}, {@link FSPath#subpath(int, int)}, {@link FSPath#compareTo(FSPath)}, {@link FSPath#endsWith(FSPath)}, {@link FSPath#startsWith(FSPath)}, {@link FSPath#normalize()}, {@link FSPath#resolve(FSPath)}, {@link FSPath#resolveSibling(FSPath)}, {@link FSPath#relativize(FSPath)}, {@link FSPath#toUri()}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toFile()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileName()}, {@link FSPath#getParent()}, {@link FSPath#getRoot()}, {@link FSPath#iterator()}, {@link FSPath#compareTo(FSPath)}, {@link FSPath#endsWith(FSPath)}, {@link FSPath#startsWith(FSPath)}, {@link FSPath#normalize()}, {@link FSPath#resolve(FSPath)}, {@link FSPath#resolveSibling(FSPath)}, {@link FSPath#relativize(FSPath)}, {@link FSPath#toUri()}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toFile()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileName()}, {@link FSPath#getParent()}, {@link FSPath#getRoot()}, {@link FSPath#iterator()}, {@link FSPath#compareTo(FSPath)}, {@link FSPath#endsWith(FSPath)}, {@link FSPath#startsWith(FSPath)}, {@link FSPath#normalize()}, {@link FSPath#resolve(FSPath)}, {@link FSPath#resolveSibling(FSPath)}, {@link FSPath#relativize(FSPath)}, {@link FSPath#toUri()}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toFile()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileName()}, {@link FSPath#getParent()}, {@link FSPath#getRoot()}, {@link FSPath#iterator()}, {@link FSPath#compareTo(FSPath)}, {@link FSPath#endsWith(FSPath)}, {@link FSPath#startsWith(FSPath)}, {@link FSPath#normalize()}, {@link FSPath#resolve(FSPath)}, {@link FSPath#resolveSibling(FSPath)}, {@link FSPath#relativize(FSPath)}, {@link FSPath#toUri()}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toFile()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileName()}, {@link FSPath#getParent()}, {@link FSPath#getRoot()}, {@link FSPath#iterator()}, {@link FSPath#compareTo(FSPath)}, {@link FSPath#endsWith(FSPath)}, {@link FSPath#startsWith(FSPath)}, {@link FSPath#normalize()}, {@link FSPath#resolve(FSPath)}, {@link FSPath#resolveSibling(FSPath)}, {@link FSPath#relativize(FSPath)}, {@link FSPath#toUri()}, {@link FSPath#toAbsolutePath()}, {@link FSPath#toRealPath(LinkOption...)}, {@link FSPath#toFile()}, {@link FSPath#register(WatchService, WatchEvent.Kind[], WatchEvent.Modifier...)}, {@link FSPath#register(WatchService, WatchEvent.Kind[])}, {@link FSPath#getFileName()}, {@link F