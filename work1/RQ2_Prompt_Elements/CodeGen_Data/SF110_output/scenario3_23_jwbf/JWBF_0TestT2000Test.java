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

    @Test
    public void getVersion() {
        assertNotNull(JWBF.getVersion(JWBF.JarFileTest));
    }
}

// JWBF_1Test.java
class JarFileTest {
	
    @Test
    public void test() throws IOException, URISyntaxException {
        JarFile jarFile1 = new JarFile();
        Manifest parsedManifest1 = jarFile1.getManifest();
        JarFile.putNameToEntryTable(parsedManifest1.getMainAttributes(), new ManifestEntryProvider<JarFile>(jarFile1));
        JarFile jarFile2 = manifestFileToJarFile("mapping/tests/2.1/Jar1.properties", parsedManifest1);
        JarFile.putNameToEntryTable(parsedManifest1.getMainAttributes(), new ManifestEntryProvider<JarFile>(jarFile2));
        assertNotNull(jarFile1);
        assertNotNull(jarFile2);
        
        String version = JWBF.getVersion(jarFile1);
        assertTrue(version, version.length() > 0);
        
        Manifest parsedManifest2 = jarFile2.getManifest();
        assertNotNull(parsedManifest2);

        assertNotNull(jarFile1);
        assertNotNull(jarFile2);
        
        // get the jar file
        JarFile jarFile3 = manifestFileToJarFile("mapping/tests/2.1/Jar2.properties", parsedManifest2);	
        assertNotNull(jarFile3);
        assertEquals("Wrong size of jar file", 3, jarFile3.list(new String[]{"__NAME-jB", "__NAME-fB"}).length);
        
    }
	
    @Test
    void manifestFileToJarFile(String path, Manifest manifest) throws IOException {
        assertNotNull(manifest.getMainAttributes().getValue(URLConnection.class));
        File outJar = createTestJarFile(manifest, path);
        assertNotNull(outJar);
        JarFile jarFile = new JarFile(outJar);
        Map<String,JarEntry> entryTbl = JarFileTestUtils.getNameToEntry(jarFile.getJarEntryTable());
        JarEntry entry = entryTbl.get("Jar1.properties");
        assertNotNull(entry);
        File outFile = outJar.getParentFile();
        manifest.getMainAttributes().putValue("JarVersion", "2.1");
        
        Manifest manifest2 = jarFile.getManifest();
        assertNotNull(manifest2.getMainAttributes().getValue(URLConnection.class));
        Manifest manifest3 = manifest.getMainAttributes().getValue(URLConnection.class);
        assertNotNull(manifest3.getMainAttributes().getValue(URLConnection.class));
        assertNotEquals("Unexpected number of entries in manifest.getMainAttributes().getValue(URLConnection.class)",3,ManifestTestUtils.getNameToEntry(manifest2.getMainAttributes()).size());
        assertNotEquals("Unexpected number of entries in manifest.getMainAttributes().getValue(URLConnection.class)",3,ManifestTestUtils.getNameToEntry(manifest3.getMainAttributes()).size());
    }

    private File createTestJarFile(Manifest manifest, String path) {
        File outJar = new File(path);
        outJar.getParentFile().mkdirs();
        boolean success = manifest.store(outJar);
        assertTrue("Failed to store " + manifest.getMainAttributes().getValue("JarVersion"), success);
        return outJar;
    }
}


// JWCF.java


class JWCF_0Test {

	@Test
	public void test_1() throws IOException, URISyntaxException {
		// File is in the name of the class path
		File jarFile = new File(System.getProperty("test.classes.directory")
				+ File.separator + "Jar1.jar");
		assertTrue("File isnt in the name of the class path", jarFile.exists());
		Manifest manifest = Manifest.read(new File(jarFile, "Jar1.properties"));
		JarFile jarFile2 = manifestFileToJarFile("mapping/tests/1/Jar1.properties", manifest);
		File outJar = createTestJarFile(jarFile2, "mapping/tests/1/Jar2.properties");
		assertNotNull(jarFile2);
		assertTest(jarFile2, outJar, JWBF.getVersion(jarFile2), true);
		jarFile2 = manifestFileToJarFile("mapping/tests/2/Jar1.properties", manifest);
		outJar = createTestJarFile(jarFile2, "mapping/tests/2/Jar2.properties");
		assertNotNull(jarFile2);
		assertTest(jarFile2, outJar, JWBF.getVersion(jarFile2), false);
		
		// get the jar file
		jarFile2 = manifestFileToJarFile("mapping/tests/2/Jar2.properties", manifest);
		assertNotNull(jarFile2);
		outJar = createTestJarFile(jarFile2,"mapping/tests/2/Jar2.properties");
		assertNotNull(outJar);
		assertNotEquals("Unexpected number of entries in manifest.getNameToEntry().get(__NAME-N) ", 3, ManifestTestUtils.getNameToEntry(manifest).size());
		
		// get the jar file
		jarFile2 = manifestFileToJarFile("mapping/tests/2/Jar2.properties", manifest);
		Manifest manifest2 = jarFile2.getManifest();
		assertNotNull(manifest2.getMainAttributes().getValue(URLConnection.class));
		JarFile jarFile3 = manifestFileToJarFile("mapping/tests/2/Jar2.properties", manifest);
		assertNotNull(jarFile3);
	}
	
	private File createTestJarFile(JarFile jarfile1, String path) throws IOException {
		return createTestFile(jarfile1, path);
	}
	
	private File createTestFile(JarFile jarfile1, String path) throws IOException {
		File outFile = new File(path);
		outFile.getParentFile().mkdirs();
		
	    // write the manifest to a file
		Manifest manifest = null;
		try {
			manifest = jarfile1.getManifest();
			
		} catch (IOException ioex) {
			throw new IOException("Error getting manifest");
		}
		ManifestTestUtils.writeTestFile(manifest, outFile);
		
		return outFile;
	}
	
}
	
// JWCF_2 Test:
//
// 1. getManifest -> getMainAttributes()
// 2. getMainAttributes -> getMainAttributes()
// 3