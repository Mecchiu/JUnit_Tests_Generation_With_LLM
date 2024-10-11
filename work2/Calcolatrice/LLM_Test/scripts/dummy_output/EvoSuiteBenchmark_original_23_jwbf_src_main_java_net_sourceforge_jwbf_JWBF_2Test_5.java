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
		
    public JWBF_2Test() {
		
    }

    @Test
    void getVersion_1() throws IOException {
        assertEquals(JWBF_2.getVersion(), JWBF.getVersion());
    }

    @Test
    void getVersion_2() {
    }

	@Test
    void testSetVersion() {		
    }

    @Test
    void testAddModule() {
		assertTrue("Test doesn't work", false);

	}

    @Test
    void testRemoveModule() {		
		assertTrue("Test doesn't work", false);

	}

	@Test
	void testAddModule_1() {
		
    }

	@Test
    void testRemoveModule_1() {		
    }

	@Test
    void testAddModule_2() {
		
    }

	@Test
    void testRemoveModule_2() {		
    }
    
	
	public static void testReadMFversion(String path) throws IOException, URISyntaxException {
		assertEquals(JWBF_2.readMFversion(path), JWBF.readMFVersion(path));
		assertEquals(JWBF_2.readMFversion(path).length(), JWBF.readMFVersion(path).length());
    }
    
    @Test
    void testReadMFversion_1() throws IOException, URISyntaxException {
    	assertTrue("Test doesn't work", false);
        assertEquals(JWBF_2.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF_Version.MF"), JWBF.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF_Version.MF"));
        assertEquals(JWBF_2.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF_Version.MF-1"), JWBF.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF_Version.MF"));
    }

    @Test
    void testReadMFversion_2() throws IOException, URISyntaxException {
    	assertTrue("Test doesn't work", false);
        assertEquals(JWBF_2.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF1.MF"), JWBF.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF+1.MF"));
        assertEquals(JWBF_2.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF2.MF"), JWBF.readMFVersion(JWBF_2Test.class.getCanonicalPath() + "/" + "JWBF+2.MF"));
    }
    
    @Test
    void testIsModuleIndexForEntry() {
    	assertTrue("Test doesn't work", false);
    }
    
    @Test
    void testReadFromManifest() throws FileNotFoundException, IOException {
    	assertTrue("Test doesn't work", false);
    }
    
    @Test
    void testReadManifest() {
    	assertTrue("Test doesn't work", false);
    }
    
    @Test
    public void testIsVersionValid() {
    	assertTrue("Test doesn't work", false);
    }
     
    @Test
    public void testIsVersionInvalid() {
    	assertTrue("Test doesn't work", false);
    	
    	try {
    		JWBF_2.getVersion();
    		throw new Exception("expected exception" + version);
    	}
    	catch (Exception e) {
    		
    	}
    	
    }
    
	@Test
    void testReadJarEntry() throws IOException, URISyntaxException, URISyntaxException {
		assertTrue("Test doesn't work", false);
		
		File f = new File(JWBF_2Test.class.getCanonicalPath() + "/JWBF_2Test.jar");
		JarFile jf = new JarFile(f);
		try {
			assertTrue("Couldn't read the jar", jf.getEntry("Manifest.MF")!= null);
			jf.close();
			return;
		}
    	finally {
    		jf.close();
    	}
    }
    
    @Test
    void testManifestManifest() throws IOException, URISyntaxException {
}
}