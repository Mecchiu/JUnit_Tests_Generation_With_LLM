// JWBF_2Test.java
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
* It contains one unit test case for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {
		
	/** Test of the getVersion() method. */
	@Test
    public void testGetVersion() throws IOException {
        System.err.println("getVersion");
        for (String key : PARTS.keySet()) {
            System.err.println("    parameter [ " + key + "] = [" + PARTS.get(key) + "]");
            String string = PARTS.get(key);
            if (key.contains(version)) {
                if (!version.equals(string)) {
                    File f = new File(string);
                    assertEquals("getVersion() must return the same value for a different", string, f.getName());
                    String version2 = getVersion(f);
                    assertTrue("getVersion() must return the same value", string!= version2);
                }
            } else {
                fail("getVersion: " + key + " is not expected to be part of the Manifest");
            }
        }
    }

	/** Test of the getVersion() method using the Jar File. */
	@Test
    public void testGetVersionWhenHasJNLP_JARFile() throws IOException {
		File parent = new File(JWBF_2Test.class.getProtectionDomain().getCodeSource().getLocation().toURI());
		File file = new File(parent, "../jni/jni-1.4.jar");
		System.err.println("path = " + toString(parent.toURI()));
        try {
            Manifest manifest = new Manifest();
            JarFile jf = new JarFile(file);
            Manifest m = jf.getManifest();
            Enumeration<JarEntry> filesInJarEntries = jf.entries();
            while (filesInJarEntries.hasMoreElements()) {
                JarEntry je = filesInJarEntries.nextElement();
                checkJarEntry(je.getName(), je.getDirectory(), "JNI header", je.getComment(),"1.4", MANIFEST,m, je);
            }
            file.delete();
        } catch (MalformedURLException | IOException e) {
            fail("Error in File for version checking. ", e);
        }
    }

	/** Test of the getVersion() method using the Jar File. */
	@Test
    public void testGetVersionWhenManifestHasEntriesJAR_JARFile() throws IOException {
		File parent = new File(JWBF_2Test.class.getProtectionDomain().getCodeSource().getLocation().toURI());
		File file = new File(parent, "../jni/jni-1.4.jar");
        try {
            Manifest manifest = new Manifest();
            JarFile jf = new JarFile(file);
            Manifest m = jf.getMainAttributes().getMainAttributes();
            Enumeration<JarEntry> filesInJarEntries = jf.entries();
            while (filesInJarEntries.hasMoreElements()) {
                JarEntry je = filesInJarEntries.nextElement();
                checkJarEntry(je.getName(), je.getDirectory(), "JNI header", je.getComment(),"1.4", MANIFEST,m, je);
            }
            file.delete();
        } catch (MalformedURLException | IOException e) {
            fail("Error in File for version checking. ", e);
        }
    }

	/** Test of the getVersion() method using the Jar File. */
	@Test
    public void testGetVersionWhenManifestHasFile_JNLP_file() throws IOException {
		File parent = new File(JWBF_2Test.class.getProtectionDomain().getCodeSource().getLocation().toURI());
		File file = new File(parent, "../jni/jni-1.4.jnlp");
        try {
            JarFile jf = new JarFile(file);
            Manifest m = jf.getManifest();
            Enumeration<JarEntry> filesInJarEntries = jf.entries();
            while (filesInJarEntries.hasMoreElements()) {
                JarEntry je = filesInJarEntries.nextElement();
                checkJarEntry(je.getName(), je.getDirectory(), "JNI header", je.getComment(),"1.4", MANIFEST,m, je);
            }
            file.delete();
        } catch (MalformedURLException | IOException e) {
            fail("Error in File for version checking. ", e);
        }
    }

	/** Test of the getVersion() method using the Jar File. */
	@Test
	public void testGetVersionWhenJarIsManifestEntry() throws IOException {
		File parent = new File(JWBF_2Test.class.getProtectionDomain().getCodeSource().getLocation().toURI());
}
}