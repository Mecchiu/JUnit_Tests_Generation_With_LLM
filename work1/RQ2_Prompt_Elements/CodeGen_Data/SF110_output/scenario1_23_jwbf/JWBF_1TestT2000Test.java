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
public static String getPartInfo(Class<?> clazz) {
			return "PartId: " + clazz.getName() + 
				" File: " + clazz.getClassLoader().getParent().toString(3) + "\n" +
				"ClassLoader: " + clazz.getClassLoader().getParent().toString(2) + "\n" +
				"MainLoader: " + clazz.getClassLoader().getParent().toString(1) + "\n" +
				"ClassLoader.getParent: " + clazz.getClassLoader().getParent().toString(1) + "\n";
		}
	}


// JWBF_2Test.java
public class JWBF_2Test {
	public static final String PATH_DIR_NAME = "jwbf";
	public static final String JAR_MANIFEST = "META-INF/MANIFEST.MF";
	public static final String JAR_FILE_NAME = "META-INF/MANIFEST.MF";
	public static final String MANIFEST_DIR_NAME = "META-INF/MANIFEST";
	public static final String SOURCE_DIR_NAME = "java";
    public static final String SOURCE_URL = "";
	public static final String JAR_FILE_URL = SOURCE_URL + "/jwbf.jar" + File.separator + PATH_DIR_NAME + File.separator + JAR_FILE_NAME;
	public static final String MANIFEST_FILE_URL = SOURCE_URL + "/META-INF/MANIFEST.MF";
	
    public static void testJAR_File() {
        final File JAR_FILE = new File(JAR_FILE_URL);

        assertTrue(JAR_FILE.isFile());
        assertTrue(JAR_FILE.canRead());
        assertFalse(JAR_FILE.isDirectory());
        assertTrue(JAR_FILE.exists());
        assertTrue(JAR_FILE.canRead());
        assertFalse(JAR_FILE.isDirectory());
        assertFalse(JAR_FILE.exists());
    }

    public static void testManifestFromJar() {
        final Manifest manifest;

        try (JarFile file = new JarFile(SOURCE_URL + File.separator + PATH_DIR_NAME + File.separator + MANIFEST_FILE_URL)) {
            manifest = file.getManifest();
        }

        assertNotNull(manifest);
        assertEquals(MANIFEST_DIR_NAME, manifest.getMainAttributes().getValue("Created-By"));
        assertEquals(JAR_FILE_URL, manifest.getMainAttributes().getValue("Jar-Manifest-Version-Main-Class"));
        assertEquals("META-INF/MANIFEST.MF", manifest.getMainAttributes().getValue("Manifest-Version"));
    }

    public static void testJWSchedule() {
        assertFalse(new JWSchedule().isScheduled());
        final URL URL = JWBF.class.getClassLoader().getParent().toURI().toURL();
        assertEquals(true, new JWSchedule().schedule(URL));
        assertFalse(new JWSchedule().isScheduled());

        Manifest manifest = null;
        try (JarFile file = new JarFile(SOURCE_URL + File.separator + PATH_DIR_NAME + File.separator + SOURCE_URL + File.separator + MANIFEST_FILE_URL)) {
            manifest = file.getManifest();
        }

        Manifest manifest2 = null;
        try (JarFile file = new JarFile(SOURCE_URL + File.separator + PATH_DIR_NAME + File.separator + SOURCE_URL + File.separator + MANIFEST_FILE_URL)) {
            manifest2 = file.getManifest();
        }

        assertTrue(new JWSchedule().schedule(MANIFEST_FILE_URL));

        File[] files = new File(SOURCE_URL + File.separator + PATH_DIR_NAME).listFiles(new FileFilter() {

            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });

        assertNotNull(files);
        assertEquals(1, files.length);
        assertEquals(SOURCE_URL, files[0].getAbsolutePath());
        assertNotNull(manifest);
        assertEquals(MANIFEST_DIR_NAME + "/META-INF/" + JAR_MANIFEST, manifest.getMainAttributes().getValue(JWBF.JWBF_URL, JWBF.JWBF_URL));

        files = new File(MANIFEST_DIR_NAME + "/META-INF/Manifest-Version").listFiles(new FileFilter() {

            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });

        assertNotNull(files);
        assertEquals(1, files.length);
        assertEquals("Manifest-Version", files[0].getName());
        assertNotNull(manifest2);
        assertEquals(MANIFEST_DIR_NAME + "/MANIFEST.MF", manifest2.getMainAttributes().getValue(JWBF.JWBF_URL, manifest2.getMainAttributes().getValue("Manifest-Version", "NO VERSION;")));
    }

/* JWBF_3Test.java */

    public static void testJWSchedule_withEmptyPath() {
        /*
        try {
            Manifest manifest = new Manifest();
            URL url = JWBF.class.getClassLoader().getParent().toURI().toURL();
            File jarFile = new File(url.toString() + File.separator + JWBF_FILE_URL);
            manifest.addMainAttributes("http://www.some.somewhere.com", "META-INF", "URL",
                    url.getHost() + File.separator + "META-INF" + File.separator + JAR_MANIFEST,
                    url.getHost() + File.separator + "META-INF" + File.separator + MANIFEST,
                    url.getHost() + File.separator + JAR_FILE_URL);

            new JWSchedule(jarFile.getAbsolutePath(), manifest);
        } catch (IOException ioe) {
            // TODO Auto-generated catch block
            ioe.printStackTrace();
        }
        */
    	JWBF.class.getClassLoader().getParent().getParentFile().mkdirs();
        assertFalse(new JWSchedule().schedule(JWBF_2Test.JWBF_2Test_jar_manifest_is_satisfied()