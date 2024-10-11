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
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getPartId(Class)}.
	 * @throws Exception 
	 */
	@Test
	void testGetPartId() throws Exception {
		assertEquals("No Module for net.sourceforge.jwbf.JWBF", JWBF.getPartId(JWBF.class));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest", JWBF.getPartId(JWBFTest.class));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$1", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$2", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$3", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$4", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$5", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$6", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$7", JWBF.getPartId(new JWBFTest().getClass()));
		assertEquals("No Module for net.sourceforge.jwbf.JWBFTest$8", JWBF.getPartId(new JWBFTest().getClass()));
	}
}