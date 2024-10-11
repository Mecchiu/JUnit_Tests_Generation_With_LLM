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
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		assertNotNull(JWBF.getVersion());
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion2() {
		assertNotNull(JWBF.getVersion().get("version"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion3() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion4() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion5() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion6() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion7() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion8() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion9() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
	
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion10() {
		assertNotNull(JWBF.getVersion().get("build"));
	}
}