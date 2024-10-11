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
		private static String FILE_DIR = new File(".").getAbsolutePath();
		private static String PATH_FILES = "test" + File.separator + "fspath-test-files.txt";
		
		/**
		 *  Creates a new instance of FSPathFactoryTest
		 */
		FSPathFactoryTest() {

		}
		
		/**
		 *  Test default Constructor of FSPathFactory
		 */
		@Test
		public void test_defaultConstructor() {
			FSPathFactory factory = FSPathFactory.newFSPath();
			assertNull(factory.getRootDirectory());
			assertFalse(factory.isReadOnly());
		}
		
		/**
		 *  Test Constructor of FSPathFactory
		 *  
		 *  All three parameters passed to the constructor should be a File object 
		 */
		@Test
		public void test_nonNullFileArg() {
		    File file;
		    assertNull(newFSPath(file));
		    File path = new File(PATH_FILES);
		    
		    path.mkdir();
		    
		    file = new File(path, "test" + File.separator + "fspath-test-files.txt");
		    assertNotNull(file);
		    
		    assertTrue(file.exists());
		    assertTrue(file.isFile());
		}

	}