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
  
    /* Test */
    @Test
    public void test1() {
        assertTrue(new FSPathFactory().newFSPath() instanceof FSPathFactory);
    }
    
	/* Test 2 */
	@Test
	public void test2() {
		  File file1 = new FSPathFactory().newFSPath()
			.addFile(new FSPathTestFile(File.class)).expandPath(File.separatorChar);
	}
    
    /* Test 3 */
    @Test
    public void test3() {
        FSPathFactory factory = new FSPathFactory();
        File file1 = factory.newFSPath().addFile(new FSPathTestFile(File.class)).expandPath(File.separatorChar);
	}
    
    
	/* Test 4 */
	@Test
    public void test4() {
        FSPathFactory factory = new FSPathFactory();
        FSPath path = factory.newFSPath()
           .addFile(new FSPathTestFile(File.class))
           .expandPath(File.separatorChar);
	}
}
