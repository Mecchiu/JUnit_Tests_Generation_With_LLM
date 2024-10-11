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
		private static FSPath factory = FSPathFactory.newFSPath();

		/**
		 * Method for the {@link #newFSPath(File)} method to test.
		 */
		@org.junit.jupiter.api.Test
		public void newFSPathTest() {
				String path = ".././a/b/c/d/e/f";
				File dir = new File("");
				assertTrue(factory.equals(dir.getAbsoluteFile()));
				assertFalse(factory.equals(new File(dir.getAbsolutePath())));
				assertTrue(factory.equals(new File("")));
		}
}