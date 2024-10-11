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
		 * Test method for {@link net.sf.sugar.fspath.FSPathFactory#newFSPath(java.io.File)}.
		 */
		@Test
		public void testNewFSPath_File() {
			File file = new File("C:\\Users\\kbishop\\Documents\\sap\\jnap\\netzkontaktas-rp-fop-test\\data\\example.conf");
			FSPath fspath = FSPathFactory.newFSPath(file);
			assertEquals("C:\\Users\\kbishop\\Documents\\sap\\jnap\\netzkontaktas-rp-fop-test\\data\\example.conf", fspath.path());
			assertNotNull(fspath.lastSlash());
		}

		/**
		 * Test method for {@link net.sf.sugar.fspath.FSPathFactory#newFSPath(java.lang.String)}.
		 */
		@Test
		public void testNewFSPath_String() {
			assertThrows(IllegalArgumentException.class, () -> FSPathFactory.newFSPath(null));
			assertThrows(IllegalArgumentException.class, () -> FSPathFactory.newFSPath().path());
		}
	}