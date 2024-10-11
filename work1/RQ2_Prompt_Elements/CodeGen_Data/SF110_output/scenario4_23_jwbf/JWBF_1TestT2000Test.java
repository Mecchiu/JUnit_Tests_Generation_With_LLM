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
    public void test1() throws Exception {
    	if (errorInfo) {
    		fail("This class can't be run inside JWBF.");
    	}

        assertNull("No part id", getPartId(Part_1.class));

        assertNotNull("Part id is 0!", getPartId(Part_1.class));

        assertNotNull("Manifest is 0!", manifest);

        assertEquals("Manifest is 0!", manifest.getMainAttributes(),
                FileMatchingAttributes.getJarAttributes(
                        new URL("file", "manifest.txt"), ""+ separatorChar));

        assertNull("Jar file is 0?", getJarFile(jarFileIndex+"0.jar"));

        assertNull("Manifest index is 0?", getManifest(jarFileIndex+"0.0.MF"));

        assertNotNull("Manifest index is not 0?", getManifest(jarFileIndex+"1.0.MF"));

        if (!getManifest(jarFileIndex+"1.0.MF").getMainAttributes().getValue("Bundle-Manifest-Version").toString().endsWith("-1.0")) {
            fail("No manifest found with the same manifest as the last one!!!");
        }

        try {
            assertNotNull("Manifest manifest is not 0?", getManifest(jarFileIndex+"1.0.MF"));
        } catch (NotFoundException e) {
            // no manifest, but that doesn't mean that manifest isn't in the index!
            //
            // FIXME : should this check against some other manifest?
            assertNull("Manifest Manifest-Version is not 0?", getManifest(jarFileIndex+"1.0.MF"));

        }

        File jarFileC1 = getJarFile(jarFileIndex+"1.0.jar");
        assertTrue("JarFile created a file with the wrong name", jarFileC1.exists());

        // check its manifest
        Manifest manifest = getManifest(jarFileIndex+"1.0.MF");
        assertEquals("Manifest is not 1.", getManifest(jarFileIndex+"1.0.MF").getMainAttributes(), manifest.getMainAttributes());

        manifest = getManifest(jarFileIndex+"1.0.MF");

        assertTrue("Manifest manifest_1.0 is not 1.", manifest.getMainAttributes().getValue("Bundle-Manifest-Version").toString().endsWith("-1.0"));

    }

    private static File getJarFile(String path) throws IOException {
        File resPath = new File(System.getProperty("java.io.tmpdir"));
        File res = new File(resPath, path);
        res.mkdir();
        try (JarFile jf = new JarFile(res)) {
            Enumeration<? extends JarEntry> entries = jf.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                File resEntry = new File(res, entry.getName());
                resEntry.createNewFile();
            }
        }
        return res;
    }
    
    private static Manifest getManifest(String path) throws IOException {
        File f = getJarFile(path);
        try (JarFile jf = new JarFile(f)) {
            return jf.getManifest();
        } catch (IOException x) {
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static Manifest getManifest(String path, String version) throws IOException {
        assertNotNull("Part path is not correct (null).", partPath(path));
        return getManifest(partPath(path), version);
    }
    
    private static File partPath(String path) {
    	int i = path.indexOf("!");
        String part = path.substring(i+1);
        return new File(part);
    }
    
    private static Manifest getManifest(File file, String version) throws IOException {
        Manifest manifest = new Manifest();
        Enumeration<JarEntry> entries = manifest.findEntries("Bundled-UnManifested-Version", version, null);
        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (entry.getName().startsWith("Bundled-UnManifested-")) {
                Manifest manifestEntry = new Manifest();
                Manifest m = manifest.getEntries(entry.getName());
                mapManifestEntry(
                        jarFileIndex,
                        manifestEntry,
                        m,
                        entry.getName().substring(7),
                        entry.getMethod(),
                        entry.getFile());
            }
        }
        return manifest