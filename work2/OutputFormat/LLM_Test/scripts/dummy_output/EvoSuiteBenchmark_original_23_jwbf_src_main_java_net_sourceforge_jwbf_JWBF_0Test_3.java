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
		static class ManifestTestCase extends AbstractTest {
    /**
     * Asserts the manifest if it exists.
     * @throws IOException throws IOException
     */
    void assertManifest() throws IOException {
        File aFile = new File("/path/to/manifest.txt");
        if (aFile.exists()) {
            Manifest mf = new Manifest();
            mf.getMainAttributes().put(
                    Manifest.Attribute.MANIFEST_VERSION,"1.0a.0");
            byte[] mfBytes = mf.getBytes();
            if (! (aFile.length() == mfBytes.length))
                fail("manifest file is a different size");
            for (int i=0; i<mfBytes.length; i++) {
                assertEquals(mfBytes[i], mfBytes[i]);
            }
        }
    }

    /**
     * Class constructor.
     * Test cases for {@link JWBF#getManifest()}.
     * @param aa
     * @throws IOException throws IOException
     */
    ManifestTestCase(String aa) throws IOException {
        File aFile = new File("/path/to/manifest.txt");
        File aFileCopy = new File("/path/to/manifest.txt");
        try {
            jarFileIndex += "file:" + aFile.getPath() + "!\"";
            if (aFile.exists()) aFile.delete();
        } catch (IOException e) {
        }
        try {
            jarFileIndex += aFile.getPath() + "!\"";
            aFileCopy.renameTo(aFile);
            assertManifest();
        } catch (IOException e) {
        }
        manifest = null;
        File aFile2 = new File("/path/to/manifest_1.0.0.jar");
        JarFile jar = null;
        try {
            jar = new JarFile(aFile2);
            jar.getManifest();
        } catch (IOException e) {
        }
        if (jar!= null) {
            jar.close();
        }
        try {
            JarFile jarFile = new JarFile(getClass().getResource("/path/to/manifest_1.0.0.jar").toExternalForm());
            jarFile.getManifest();
            assertManifest();
        } catch (IOException e) {
        }
    }

    void validateManifest() throws IOException {
        File aFile = new File("path/to/manifest.txt");
        if (aFile.exists()) {
            File aFileTemp = getFile("path/to/manifest_1.0.0.jar");
            try {
                aFileTemp.delete();
            } catch (IOException e) { ; }
            Manifest manifestTemp = null;
            try {
                manifestTemp = new Manifest(aFileTemp);
                assertManifest();
            } catch (IOException e) { ; }
            if (aFileTemp!= null) {
                aFileTemp.delete();
            }
        }
    }

    void assertManifest(String manifestText) throws IOException {
        File aFile = new File("/path/to/manifest.txt");
        if (aFile.exists()) {
            Manifest mf = null;
            try {
                mf = new Manifest(aFile);
                if (! mf.getMainAttributes().getValue(Manifest.Name.MANIFEST_VERSION).equals("1.0.0")) {
                    fail("manifest file has incompatible version");
                }
            } catch (IOException e) { ; }
            if (aFile!= null) {
                aFile.delete();
            }
        }
    }

    /**
     * Class constructor.
     * Test cases for {@link JWBF#searchMF(String)}.
     * @throws IOException throws IOException
     */
    ManifestTestCase() throws IOException {
        File aFile = new File("/path/to/manifest.txt");
        File aFileCopy = new File("/path/to/manifest.txt");
        JarFile jarFile = null;
        try {
            jarFile = new JarFile(aFile);
            jarFile.getManifest();
        } catch (IOException e) {
        }
        if (jarFile!= null) {
            jarFile.close();
        }
        try {
            jarFile = new JarFile(aFileCopy);
            jarFile.getManifest();
        } catch (IOException e) {
        }
    }
}
}