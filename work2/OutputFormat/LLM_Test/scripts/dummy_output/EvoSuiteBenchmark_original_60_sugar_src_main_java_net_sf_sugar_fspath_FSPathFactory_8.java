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
		
	@Test
	void newFSPath() {
		final String filename = "FSPathFactoryTest.testNewFSPath";
		File file = new File("./src/FSPathFactoryTest");
		FSPath fspath = FSPathFactory.newFSPath(filename);

		assertNotNull(fspath);
	}
	
	@Test
	void newFSPath(String path) {
		final String filename = "FSPathFactoryTest.testNewFSPath";
		File file = new File("./src/FSPathFactoryTest/"+path);
		FSPath fspath = FSPathFactory.newFSPath(filename);

		assertNotNull(fspath);
	}
}