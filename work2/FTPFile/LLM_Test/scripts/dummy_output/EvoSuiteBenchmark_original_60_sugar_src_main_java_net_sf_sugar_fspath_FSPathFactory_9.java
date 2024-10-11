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
		
	private static final String FILE = "";
	private static final String PLAIN_PATH = ".";
	private static final String TEST_PATH = "./test/";
    private static final String SYS_PATH = System.getProperty("user.dir") +
            File.separator + "Test";

    private static final File TEST_FOLDER = new File(SYS_PATH + File.separator
        + TestFSPathFactory.class.getPackage().getImplementationClass());
    
    //private static final File TEST_FOLDER = TEST_PATH;
  
    private FSPathFactory factory;
  
    private FSPathFactory create(File path) {
        return new FSPathFactory();
    }


    @Test
    public void testNewFSPath() {
        assertEquals(newFSPath(FILE), null);
        assertEquals(newFSPath(PLAIN_PATH), newFSPath(TestFSPathFactory.class));
        assertEquals(newFSPath(PLAIN_PATH),
                     newFSPath(factory.newFSPath(FILE)));
                
        assertEquals(newFSPath(SYS_PATH), null);
        assertEquals(newFSPath(TEST_FOLDER.getParentFile() + File.separator
            + "Test"));
        assertEquals(newFSPath(TEST_FOLDER), newFSPath(factory.newFSPath(TEST_FOLDER)));
        assertEquals(newFSPath(factory.newFSPath(TEST_FOLDER)),
                 newFSPath(factory.newFSPath(factory.newFSPath(TEST_FOLDER))));
            
        assertEquals(newFSPath(TEST_FOLDER.getPath() + File.separator + "test"),
                 newFSPath(factory.newFSPath(TEST_FOLDER
                       .getPath() + File.separator + "test")));
            
    }
}