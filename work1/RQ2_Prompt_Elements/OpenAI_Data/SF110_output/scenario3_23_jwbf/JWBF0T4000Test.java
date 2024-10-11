// JWBFTest.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getVersion(Class)}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		// test case 1
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 2
		assertEquals("0.0.0", JWBF.getVersion(JWBFTest.class));
		
		// test case 3
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 4
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 5
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 6
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 7
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 8
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 9
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
		// test case 10
		assertEquals("0.0.0", JWBF.getVersion(JWBF.class));
		
	}
}