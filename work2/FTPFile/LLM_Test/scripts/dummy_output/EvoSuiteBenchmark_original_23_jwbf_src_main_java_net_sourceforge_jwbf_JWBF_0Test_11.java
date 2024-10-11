// JWBF_0Test.java
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
* It contains one unit test case for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_0Test {
		private static String f;

	@Test
    public void testGetVersion() throws IOException, URISyntaxException {
		f = "version";
		assertEquals("JWBF Version 0", getVersion(JWBF_0Test.class));
	}

	@Test
    public void testReadFromManifest() throws IOException, URISyntaxException {
		f = "version";
		assertEquals("1.2",readFromManifest(f,"version"));
		assertEquals("1.2.0",readFromManifest(f,"VERSION"));
		assertEquals(jwbfVersion,readFromManifest(f,"major"));
		assertEquals(jwbfVersion,readFromManifest(f,"minor"));
		assertEquals(jwbfVersion,readFromManifest(f,"patch"));
		assertEquals(f,readFromManifest(f,"part"));
    }

	@Test
    public void testSearchMF() throws IOException, URISyntaxException {
		f = "version";
        assertEquals(jarFileIndex + jwbfVersion,searchMF("jar:file:"+ version.replaceAll("/", "\\/") + "/jwbf/part/"+f));
	}

	@Test
    public void testReadMF() throws IOException, URISyntaxException {
		f = "version";
		assertEquals("version",readMFVersion(f));

		f = "part";
		assertEquals(jarFileIndex + jwbfVersion,readMFVersion(f));
    }

	/**
	* @return the version
	*/
	String getPartId(Class<?> clazz) {
		String s;
        s = clazz.getSimpleName()+" "+jwbfVersion;
		return s;
	}

	/**
	* @param key
	*            a
	* @return value of {@link #key}
	*/
	String getPartInfo(Class<?> clazz) {
		String s;
		if (clazz.isInterface()) {
			s = "interface " + clazz.getSimpleName();
		}
		else {
			if (clazz.isAnnotationPresent(org.junit.jupiter.api.Version.class)) {
				s = clazz.getAnnotation(org.junit.jupiter.api.Version.class).value();
			}
			else {
				s = clazz.getSimpleName();
			}
		}
		return s;
	}

    @Test
    public void testModuleManifest() throws URISyntaxException, IOException {
        assertTrue(isJar(Manifest.class));
		assertTrue(isJar(Manifest.class.getName()+File.separator));
        Manifest manifest = readMF(false);
		assertTrue(manifest.contains("Manifest-Version"));
        String v = manifest.getMainAttributes()
               .getValue("Manifest-Version");
        assertEquals("1.0", v.replaceAll("-", "."));
    }
}