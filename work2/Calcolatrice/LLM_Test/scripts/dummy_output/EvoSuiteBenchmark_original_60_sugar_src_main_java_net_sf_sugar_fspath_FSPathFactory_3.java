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
	 * Test the {@link FSPathFactory#newFSPath()} method.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath()} method creates a new {@link File} instance given.
	 */
	@Test
	public void testConstructor1() {
		assertNotNull("The return value of the NewFSPath() method must not be null.", FSPathFactory.newFSPath());
	}

	/**
	 * Test the {@link FSPathFactory#newFSPath(String) newFSPath(String)} method.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method returns the value of the specified {@link FSPath} instance when called with no parameter.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method uses the current user's directory to search from without passing file objects.
	 */
	@Test
	public void testConstructor2() {
		assertNotNull("The return value of the NewFSPath() method must not be null.", FSPathFactory.newFSPath(new NullFSPath()));
	}

	/**
	 * Test the {@link FSPathFactory#newFSPath(String) newFSPath(String)} method.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method returns the value of the specified {@link FSPath} instance when called with no parameter.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method uses the the specified {@link FSPath} instance as directory to search from.
	 */
	@Test
	public void testConstructor3() {
		assertNotNull("The return value of the NewFSPath() method must not be null.", FSPathFactory.newFSPath(new File("/")));
	}

	/**
	 * Test the {@link FSPathFactory#newFSPath(String) newFSPath(String)} method.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method returns the value of the specified {@link FSPath} instance when called with no parameter.
	 * <p/>
	 * The {@link FSPathFactory#newFSPath(String)} method uses the current user's directory to search from without passing file objects.
	 */
	@Test
	public void testConstructor4() {
		assertNotNull("The return value of the NewFSPath() method must not be null.", FSPathFactory.newFSPath(new File("/me")));
	}
}