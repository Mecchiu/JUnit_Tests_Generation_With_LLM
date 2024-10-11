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
		
	@Test
	void getPartId(Class<?> clazz) throws IOException, URISyntaxException {
		// The first parameter must be {@link File} and the result must be a String
		assertEquals("File", getPartId(pathToFile(clazz)));
	}

	@Test
	void readMFVersion(Class<?> clazz) throws IOException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));
		// It must be a File based manifest
		assertEquals(true, getVersion(PathUtils.parse(clazz.getProtectionDomain().getCodeSource().getLocation()))
				.contains("META-INF/MANIFEST.MF"));
		// Check that a file named 'META-INF/MANIFEST.MF' can be searched
		assertEquals("META-INF/MANIFEST.MF", PathUtils.split(PathUtils.parse(PathUtils.getFile(clazz, "META-INF/MANIFEST.MF")))[0]);
	}

	@Test
	void readMFTitle(Class<?> clazz) throws IOException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));
		// It must be a file named 'META-INF/MANIFEST.MF'
		assertEquals("META-INF/MANIFEST.MF", FileUtils.fileName(PathUtils.split(PathUtils.getFile(clazz, "META-INF/MANIFEST.MF")))[0]);
	}

	@Test
	void readMFContent(Class<?> clazz) throws IOException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));


		try {
			getContent(clazz);
			fail("It must have failed if given an instance of Class 'File'");
		} catch (ClassCastException e) {
			System.out.println("Expecting: a jar file can contains a manifest");
		}
	}

	@Test
	void getMFManifest(Class<?> clazz) throws IOException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));

		try {
			Manifest manifest = getMFManifest(clazz);
			fail("It must have failed if given an instance of Class 'File'");
		} catch (ClassCastException e) {
			System.out.println("Expecting: a manifest can contain a manifest");
		}
		assertEquals(true, getVersion(PathUtils.parse(clazz.getProtectionDomain().getCodeSource().getLocation()))
				.contains("META-INF/MANIFEST.MF"));
	}

	@Test
	void getMFManifest(Class<?> clazz,File filter) throws IOException, URISyntaxException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));


		Manifest manifest = getMFManifest(clazz);
		// It must not be empty
		assertNotNull(manifest);
		// It must contain a single entry
		assertEquals(filter, manifest.getMainAttributes().getEntry(manifest.getMainAttributes().getPrimary()));
	}

	@Test
	void getMFManifest(Class<?> clazz,FileFilter filter) throws IOException, URISyntaxException {
		// It must be an instance of Class 'File'
		assertEquals("File", getPartId(pathToFile(clazz)));


		Manifest manifest = getMFManifest(clazz);
		// It must not be empty
		assertNotNull(manifest);
		// It must contain a single entry
		assertEquals(filter, manifest.getMainAttributes().getEntry(manifest.getMainAttributes().getPrimary()));
	}

	@Test
	void getMFManifest(Class<?> clazz) throws IOException {

		JarFile jf = new JarFile(fileToJar(clazz));
	 	JarEntry je = jf.getJarEntry("META-INF/MANIFEST.MF");

		// It must be a jar file
		assertNotNull(je);

		String jfVersion = getMFVersion(je);
		String jfContent = getMFContent(je);

}
}