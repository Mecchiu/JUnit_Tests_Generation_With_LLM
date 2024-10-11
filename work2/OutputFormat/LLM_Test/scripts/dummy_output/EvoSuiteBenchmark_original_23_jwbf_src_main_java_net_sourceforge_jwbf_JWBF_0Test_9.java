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
		 /**
		  * Tests the {@link JWBF#getVersion(Class)} method with
		  * several inputs.
		*/
		@Test
    public final void test01() throws FileNotFoundException, MalformedURLException, URISyntaxException, IOException {
        testReadMF();
        testSearchMF();
        testSearchMFfromJar();
    }
    /**
    * Tests the {@link JWBF#getVersion(Class)} method with a specific version.
		 */
    protected final void testReadMF() throws IOException  {
        assertEquals(version,JWBF.getVersion("JWBF"));
    }
     /**
     */
    protected final void testSearchMF() throws IOException {
        testReadMFfromJar();
        testSearchMFfromManifest();
                }

	/**
	* Tests the {@link JWBF#getManifest(Class)} method with a specific version.
@param f input File
@return the manifest file
*/
    private final static boolean testGetManifest(File f) throws IOException {
        File manifestFile = new File(f,"META-INF/MANIFEST.MF");
        if (!manifestFile.exists())
            return false;
        Manifest manifest = new Manifest();
        manifest.read(new FileInputStream(manifestFile));
        return true;
    }

	/**
	* Tests the {@link JWBF#getJarFile(File)} method with a specific version.
@param f input File
@return the jarFile
*/
    private final static JarFile testGetJarFile(File f) throws IOException {
        File jarFile = new File(f,"lib.jar");
        if (!jarFile.exists())
            return null;
        JarFile jarFileRead = new JarFile(jarFile);
        Manifest manifestFile = jarFileRead.getManifest();
        assertNotNull(manifestFile);
        Map<String, String> contents = new HashMap<String, String>();
        assertNotNull(null/* manifest.read(..) */);
        if (f!= null) {
            try (JarEntry je = jarFileRead.getJarEntry("META-INF/"+ manifestFile.getMainAttributes().getValue("/") )) {
                int c = -1;
                byte[] buf = new byte[c];
                while (c >= -1) {
                    c = je.read(buf);
                    if (c >= 0)
                        contents.put(manifestFile.getMainAttributes().getValue("/")+'/'+manifestFile.getMainAttributes().getValue(".class"),new String(buf));
                }
            }

        }
        return jarFileRead;
    }
	/**
@param args
@return Manifest.
*/
	protected final static Manifest testGetManifestFromJarFile() {
        try  {
            this.manifest = new Manifest();
            URL url = this.getClass().getResource("lib.jar.MF");
            Class<?> clazz = Class.forName(url.getFile(), true, JWBF.class.getClassLoader());
            return ((url == null || url.getFile() == null)     ? null : (Manifest)clazz.newInstance().read(new FileInputStream((new File(url.getFile()).getAbsoluteFile())
        				+separatorChar + clazz.getPackage().getName().replace('.', separatorChar)+".MF")));
        }
        catch (InstantiationException|IllegalAccessException | ClassNotFoundException | IOException | ClassCastException  | SecurityException exc) {
            return null;
        }
 	}
	/**
	* Tests the  {@link JWBF#searchMF(File)} method with a specific version.
@param f
@return the parsed MF
@throws IOException
	*/
	protected final static Manifest testSearchMFfromJarFile(String f) throws IOException {
		if (f == null)
			return null;
		if (f.indexOf("META-INF/MANIFEST.MF") < 0)
            return null;
        Manifest manifestMF = null;
		boolean readMF = testGetManifestFromJarFile();
   	if(readMF) {
            Manifest manifest  = null;
        	if (ManifestParser.class.isAssignableFrom(Manifest.class))
            	manifest = testGetManifest(new File[] { new File(f)
            	}
            	);
        	else
        		manifest = testGetManifestFromJarFile();
		}
		else
            manifestMF = (Manifest) testGetManifestFromJarFile().read(testGetManifestFromJarFile("-1.MF"));
		if(manifest == null)
			return null;
}
}