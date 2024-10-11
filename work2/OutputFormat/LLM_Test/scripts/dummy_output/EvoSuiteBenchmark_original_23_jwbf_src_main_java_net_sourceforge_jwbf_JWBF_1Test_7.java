// JWBF_1Test.java
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
* It contains one unit test case for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {
		/**
		* tests the getPartId(Class) method.
		*/
		@Test
		public void getPartId() {
			Assertions.assertEquals("Part 1 should have been registered", null, getPartId(null));
			final String p1 = "p1";
			//
			// First case -- it is the same as the default part
			Assertions.assertEquals("Part 2 should have been registered", p1, getPartId(p1));
			//
			final String p2 = "p2";
			//
			// Second part
			//
			Assertions.assertEquals("Part 3 should have been registered", p2, getPartId(p2));
		}

		/**
		* Tests the getPartInfo() method.
		*/
		@Test
		public void getPartInfo() {
			//
			// check for null
			{
			Assertions.assertNotNull(getPartInfo(null));
			//
			for (final Map.Entry<String, String> entry : PARTS.entrySet()) {
			//
			Assertions.assertEquals(getPartInfo(entry.getKey()), entry.getValue());
			//
			}
			//
			// check for empty map
			{
			//
			try {
			getPartInfo(new HashMap<String, String>());
			Assertions.assertFalse("Should return null", true);
			Assertions.assertNull("Should return null", getPartInfo(new HashMap<String, String>()));
			//
			// empty map
			} catch (final NoSuchElementException ignore) {}
			}
			//
			final Map<String, String> emptyMap = new HashMap<String, String>();
			//
			// Test that hashmap is a Map
			{
			final Map<String, String> map = new HashMap<String, String>();
			final Map<String, String> empty = Collections.emptyMap();
			Assertions.assertNotNull("Hashmap should not return null", map);
			Assertions.assertNotNull("Map should not return null", emptyMap);
			Assertions.assertNotSame("Not same hashmap", emptyMap, map);
			}
		}

		/**
		* Tests the readMFVersion(String) method.
		*
		* @throws IOException
		*             if path invalid
		*/
}
}