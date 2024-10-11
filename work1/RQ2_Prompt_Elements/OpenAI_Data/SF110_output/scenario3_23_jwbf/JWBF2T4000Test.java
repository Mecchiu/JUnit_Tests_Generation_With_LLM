// JWBFTest.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getVersion()}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		// Test case 1:
		// Test if the version is not null.
		assertNotNull(JWBF.getVersion());
		
		// Test case 2:
		// Test if the version is not empty.
		assertFalse(JWBF.getVersion().isEmpty());
		
		// Test case 3:
		// Test if the version contains the key "Implementation-Version".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Version"));
		
		// Test case 4:
		// Test if the version contains the key "Implementation-Build".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Build"));
		
		// Test case 5:
		// Test if the version contains the key "Implementation-Vendor".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor"));
		
		// Test case 6:
		// Test if the version contains the key "Implementation-Title".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Title"));
		
		// Test case 7:
		// Test if the version contains the key "Implementation-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-URL"));
		
		// Test case 8:
		// Test if the version contains the key "Implementation-Vendor-Id".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-Id"));
		
		// Test case 9:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
		// Test case 10:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
	}
}

// JWBF.java
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

/**
 * @author Thomas Stock
 */
public final class JWBF {

    /**
     * @return the JWBF Version.
     */
    public static Map<String, String> getVersion() {
        Map<String, String> version = new HashMap<String, String>();
        try {
            Enumeration<URL> resources = JWBF.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                Manifest manifest = new Manifest(url.openStream());
                version.putAll(Collections.list(manifest.getMainAttributes().keys()).stream()
                        .collect(HashMap::new, (m, k) -> m.put(k.toString(), manifest.getMainAttributes().getValue(k)), HashMap::putAll));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return version;
    }
}

// JWBFTest.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		// Test case 1:
		// Test if the version is not null.
		assertNotNull(JWBF.getVersion());
		
		// Test case 2:
		// Test if the version is not empty.
		assertFalse(JWBF.getVersion().isEmpty());
		
		// Test case 3:
		// Test if the version contains the key "Implementation-Version".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Version"));
		
		// Test case 4:
		// Test if the version contains the key "Implementation-Build".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Build"));
		
		// Test case 5:
		// Test if the version contains the key "Implementation-Vendor".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor"));
		
		// Test case 6:
		// Test if the version contains the key "Implementation-Title".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Title"));
		
		// Test case 7:
		// Test if the version contains the key "Implementation-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-URL"));
		
		// Test case 8:
		// Test if the version contains the key "Implementation-Vendor-Id".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-Id"));
		
		// Test case 9:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
		// Test case 10:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
	}
}

// JWBF.java
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

/**
 * @author Thomas Stock
 */
public final class JWBF {

    /**
     * @return the JWBF Version.
     */
    public static Map<String, String> getVersion() {
        Map<String, String> version = new HashMap<String, String>();
        try {
            Enumeration<URL> resources = JWBF.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                Manifest manifest = new Manifest(url.openStream());
                version.putAll(Collections.list(manifest.getMainAttributes().keys()).stream()
                        .collect(HashMap::new, (m, k) -> m.put(k.toString(), manifest.getMainAttributes().getValue(k)), HashMap::putAll));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return version;
    }
}

// JWBFTest.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		// Test case 1:
		// Test if the version is not null.
		assertNotNull(JWBF.getVersion());
		
		// Test case 2:
		// Test if the version is not empty.
		assertFalse(JWBF.getVersion().isEmpty());
		
		// Test case 3:
		// Test if the version contains the key "Implementation-Version".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Version"));
		
		// Test case 4:
		// Test if the version contains the key "Implementation-Build".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Build"));
		
		// Test case 5:
		// Test if the version contains the key "Implementation-Vendor".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor"));
		
		// Test case 6:
		// Test if the version contains the key "Implementation-Title".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Title"));
		
		// Test case 7:
		// Test if the version contains the key "Implementation-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-URL"));
		
		// Test case 8:
		// Test if the version contains the key "Implementation-Vendor-Id".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-Id"));
		
		// Test case 9:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
		// Test case 10:
		// Test if the version contains the key "Implementation-Vendor-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-URL"));
		
	}
}

// JWBF.java
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

/**
 * @author Thomas Stock
 */
public final class JWBF {

    /**
     * @return the JWBF Version.
     */
    public static Map<String, String> getVersion() {
        Map<String, String> version = new HashMap<String, String>();
        try {
            Enumeration<URL> resources = JWBF.class.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                Manifest manifest = new Manifest(url.openStream());
                version.putAll(Collections.list(manifest.getMainAttributes().keys()).stream()
                        .collect(HashMap::new, (m, k) -> m.put(k.toString(), manifest.getMainAttributes().getValue(k)), HashMap::putAll));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return version;
    }
}

// JWBFTest.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		// Test case 1:
		// Test if the version is not null.
		assertNotNull(JWBF.getVersion());
		
		// Test case 2:
		// Test if the version is not empty.
		assertFalse(JWBF.getVersion().isEmpty());
		
		// Test case 3:
		// Test if the version contains the key "Implementation-Version".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Version"));
		
		// Test case 4:
		// Test if the version contains the key "Implementation-Build".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Build"));
		
		// Test case 5:
		// Test if the version contains the key "Implementation-Vendor".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor"));
		
		// Test case 6:
		// Test if the version contains the key "Implementation-Title".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Title"));
		
		// Test case 7:
		// Test if the version contains the key "Implementation-URL".
		assertTrue(JWBF.getVersion().containsKey("Implementation-URL"));
		
		// Test case 8:
		// Test if the version contains the key "Implementation-Vendor-Id".
		assertTrue(JWBF.getVersion().containsKey("Implementation-Vendor-Id"));
		
		// Test case 9:
		// Test if the version contains the key "