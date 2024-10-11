// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		
	/**
	 * Test of getLocationFSPath.
	 * @throws SecurityException 
	 */
	@Test
	public void testGetLocationFSPath() throws SecurityException {
		FSPath path = AbstractFSPath.getLocationFSPath("/tmp");
		assertNotNull(path);
		assertEquals("/tmp", path.locationFilePath());
	}
	
	/**
	 * Test of getAllFSPathList.
	 * @throws SecurityException 
	 */
	@Test
	public void testGetAllFSPathList() throws SecurityException {
}
}