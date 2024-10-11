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