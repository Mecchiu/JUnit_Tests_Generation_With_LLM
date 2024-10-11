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
		private static final Map<String, String> PARTS = new HashMap<>();
	private JWBF_2Test(){
	}

    private static void init(Class<?> clazz);

    private static void registerModule(String artifactId, String version);

    private static void installJar(File jarfile, Class<?> clazz);

    private static void installPart(Class<?> clazz, String partId, String filePath);

    private static void installAll(String filePath);

    private static Manifest readMFManifest(String filePath) throws IOException;

    private static Map<String, Manifest> readMFPromisedManifestes(String filePath) throws IOException;

    private static Manifest readMFProductManifest(String filePath) throws IOException;

    private static Map<String, Manifest> readMFManifests(String filePath); //
    
    private Map<String, Manifest> readMFManifests(String filePath){
        System.out.println("start");
        try
        {
            return Collections.unmodifiableMap(readMFManifest(filePath));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Manifest> readMFManifests(String filePath, Manifest manifest) throws IOException {
        return Collections.unmodifiableMap(manifest.getEntries());
    }

    /**
     * Test of {@link JWBF#getVersion()} being {@link JWBF#getPartInfo()}.
     */
    @Test
    public void testGetPartInfo() throws Exception { //
        assertNotNull(JWBF.getVersion());
        assertEquals(PARTS.size(), JWBF.getPartInfo().size());
    }

    /**
     * Test of {@link JWBF#getPartInfo()}.
     */
    @Test
    public void testGetPartInfo_1() throws Exception {
        assertEquals(PARTS.size(), JWBF_2.getPartInfo().size());
    }

    /**
     * Test of {@link JWBF#getPartInfo()}
     */
    @Test
    public void testGetPartInfo_2() throws Exception { //
        assertEquals(Collections.EMPTY_MAP, JWBF_2.getPartInfo());
    }

    private void testMFIsJar(File jarfile, Class<?> clazz) {//
        assertNotNull(jarfile);
        Enumeration<JarEntry> entries = jarfile.entries();
        JarEntry entry = null;
        if (entries!= null) {
          while (entries.hasMoreElements()) {
             entry = entries.nextElement();
             System.out.println(jarfile.getName() + ": " + entry.getName() + " = " + JWBF.getMFVersion(jarfile, entry.getName()));
          }
        }

    }

    private Manifest readMFManifest(URL jarFile) throws IOException {
        Manifest manifest = null;
        JarFile jarFile1 = null;
        try {
            jarFile1 = new JarFile(jarFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            JarEntry manifestFile = jarFile1.getManifest();

            if (manifestFile == null) {
                System.out.println("No Manifest for " + jarFile);
                return null;
            }

            String version = jarFile1.getManifest().getMainAttributes().getValue("Manifest-Version");
            if (version.equals(manifestFile.getName())) {
                manifest = manifestFile.getManifest();
            } else manifest = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (manifest!= null) {
                manifest.openAttributes();
                manifest.getEntries();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return manifest;
    }

    private void testMFManifest(File jarfile, Manifest manifest) throws IOException {
        assertNotNull(manifest);
        System.out.println(jarfile.getName() + ": " + manifest.getMainAttributes().getValue("Manifest-Version"));
        assertEquals(manifest.getMainAttributes().getValue("Manifest-Version").toString(), JWBF.getMFVersion(jarfile, manifest.getMainAttributes().getValue("Main-Type").toString()));
}
}