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
     *  @returns FSPath a new DefaultFSPath instance which uses the user directory (user/tests/) to search from.
     */
    static FSPath newFSPath(File file) {
        assertNotNull("File cannot be null", file);
        return (FSPath) new FSPathFactory().newFSPath(file);
    }
	
    /**
     *  @returns FSPath a new DefaultFSPath instance which uses the user directory (user/tests/) to search from.
     */
    static FSPath newFSPath(String path) {
        assertNotNull("String cannot be null", path);
        return (FSPath) new FSPathFactory().newFSPath(path);
    }
	
    @Test
    public void testNewFSPath() {
        assertNotNull("New path cannot be null", new FSPathFactory().newFSPath(null));
    }

    @Test
    public void testNewFSPath1() {
        assertEquals("FSPath(String) should return FSPath with the same name if both a user/directory and a path are provided.",
                    new FSPath("dir/test/path"),
                    new FSPathFactory().newFSPath(null));
        
    }

}