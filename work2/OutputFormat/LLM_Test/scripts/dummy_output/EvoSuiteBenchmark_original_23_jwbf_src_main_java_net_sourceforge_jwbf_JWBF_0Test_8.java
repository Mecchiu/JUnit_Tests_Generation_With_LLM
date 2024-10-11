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
		
	public static void main(String[] args) {
		new JWBF_0Test().runTest();
	}

	@Test
	public void testSimpleJAR() throws ClassNotFoundException, IOException {
		File file = File.createTempFile("test-MF-", ".jar");
		FileFilter filter = new FileFilter() {
			/*
			 * A temporary file is used so that the JAR file can be deleted and restored.
			 * We do not do anything of our own. This is just so the VM can keep it clean.
			 * 
			 * The code in this test is only good for testing purposes but will not be executed in normal unit tests.
			 */
			private static final String TEST_FILE_PATH = "/tmp/test-MF-";
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(TEST_FILE_PATH);
			}
			
		};
		filter.addAll(new File("src/test/resources/org/jwbf/jwbf/jwbf/jwbf.jar"));
		
		JarFile jarFile = new Manifest().getJar(filter).getJarFile();
		JarEntry tempEntry;
		boolean done = false;
		try {
			while (!done) {
				tempEntry = jarFile.getNextJarEntry();
				if (tempEntry == null)
					break;

				final String name = tempEntry.getName();
				assertTrue("Name of the JAR file should be of type /tmp", name.startsWith(JWBF_0Test.TEST_FILE_PATH));
				jarFile.close();
				jarFile = new Manifest().getJar(filter);
				done = true;
			}
			
			final String versionText = getVersion(MFMaven.class);
			assertEquals("Version should be the same", versionText, readMFVersion(TEST_FILE_PATH));
			
			final Map<String, String> parts = new HashMap<String, String>(3);
			final Manifest manifest = jarFile.getManifest();
			final Enumeration<JarEntry> entries = manifest.getEntries("");
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				parts.put(entry.getName(), getPartId(classFromEntryOrTestClassName(entry)));
			}
			
			assertEquals("Parts size should be 3", 3, parts.size());
			
	        for (Map.Entry<String, String> part: parts.entrySet()) {
	        	for(Map.Entry<String, String> entry: getPartInfo(classFromEntryOrTestClassName(manifest.getEntry(part.getKey(), part.getValue()))).entrySet()) {
	        		assertTrue("Unmatching part information for: " + part.getKey()
	        				+ " with "+ entry.getKey(), entry.getKey().endsWith(separatorChar + part.getValue()));
	        	}
	        }
		    
		} catch (Exception e) {
		    StringWriter out = new StringWriter();
		    e.printStackTrace(new PrintWriter(out));
			
			// TODO Test a better output.
			fail("Unable to retrieve JAR information for the JAR test");
		}
	}
}