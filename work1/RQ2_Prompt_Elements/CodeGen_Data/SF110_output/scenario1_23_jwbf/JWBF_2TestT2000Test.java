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

    @Test
    public void getVersion() throws IOException, URISyntaxException {
        Map<String, String> version = new HashMap<>();
        version.put("version", "java version is " + " 2.0b.");
        String test = getClass().getPackage().getImplementationVersion();

        if(!test.startsWith("java version")) {
            throw new IOException().initCause(new IllegalArgumentException("Test class doest not start with java version"));
        } else if(test.isEmpty()) {
            throw new IllegalArgumentException();
        }

        JWBF sut = new JWBF(new File(test)).getVersion();

        sut.debug("version="+sut.getVersion());
        sut.add(new File(getFile("Test/Test/Test/Test/Test/Version.JAR.txt")), version);
        
        sut.validateJarFile();
    }

    @Test
    public void version() {
        JWBF sut = new JWBF(new File("f.jar"));

        System.out.println("version="+sut.getVersion());
    }

    public static File newFile(String f) throws IOException {
        assertTrue("New file does not exist", new File("f.out").exists());
        assertTrue("New file does not exist", new File("f.out").isFile());
        
        File f2 = new File("f.out");
        assertTrue("File is not a File object", f2.isFile());
        return (f2);
    }

    public void validateJarFile() throws IOException {
    	validateJarFile("f.jar");
    }

    public void validateJarFile(String jarFile) throws IOException {
        Map<String, String> versionParts = null;
        
        try {
            JarFile jarFileObj = new JarFile(jarFile);
            Enumeration<JarEntry> en = jarFileObj.entries();
            while(en.hasMoreElements()) {
                JarEntry entry = en.nextElement();
                assertTrue("File " + jarFile + " should be a file", new File(jarFile).isFile());
                if(!"Version-info.class".equals(entry.getName())) {
                    String versionName = this.getClass().getPackage().getImplementationVersion();
                    assertTrue("File " + jarFile + " should be a version.n.file", entry.isFile());
                    if(versionName.startsWith("java version is ")) {
                        String version = versionName.substring("java version is ".length());
                        versionParts = new HashMap<>(PARTS);
                        versionParts.put(version, version);
                    }
                }
            }
        } catch(IOException exc) {
            throw exc;
        } finally {
            // remove the created files and release resources
            jarFileObj.close();
            delete(jarFile);
        }

        // ensure that the jar file is a proper test case
        if(versionPart(versionParts) == null) {
            throw new AssertionError("The test version part was not found!");
        }

        assertEquals("Correct version parts size!", PARTS.size(), versionParts.size());

        for(String aVersion:versionParts.keySet()) {
            // assert version part is contained in the test version
            assertEquals("version part does not contain the test version", versionParts.get(aVersion), VERSION);
        }
    }

    public static void delete(String jarFile) {
        if(jarFile!=null) {
            JarFile jarFileObj = new JarFile(jarFile);
            try {
                jarFileObj.close();
            } catch(IOException exc) {
                throw exc;
            }
        }
    }

    public static Map<String, String> PARTS = Collections.unmodifiableMap(
        new HashMap<>(Collections.<String, String>emptyMap()));

    public static String getFile(String name) throws IOException {
        return newFile(getClass().getPackage().getSpecificationVersion()
                           + File.separator + getClass().getPackage().getImplementationVersion() + File.separator + "lib"
                           + File.separator + name + ".jar").getPath()+File.separator+name;
    }
    
//    public static Map<String, String> getVersion() throws IOException, URISyntaxException {
//    	return Collections.unmodifiableMap(PARTS);
//    }

    public static final String VERSION = "2.0b.";

    public Map<String, String> PARTS;

    public static final Map<String, String> PARTS_UNDEFINED = Collections.emptyMap();

    public static final String VERSION_UNDEFINED = String.format("java version is unknown. %s", VERSION);
	
}
