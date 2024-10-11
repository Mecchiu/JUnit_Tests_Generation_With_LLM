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
    public void test() {
        try {
            System.out.println("Testing the JWBF.");
            // We could check if JWBF is able to load a class from
            // our class path. But, we have no way to know. So, we just try
            // to create (in this case) a folder.
            ClassDir.getInstance().create("JWBF-0Test", true, null);
            System.out.println("JWBF-0Test loaded.");
            
            // First do the test
            String version = getVersion(JWBF.class);
            System.out.println("JWBF-0Test's Version " + version);
            assertEquals("JWBF-0Test's  Version should be " + version,
                     version, getVersion(Version.class));
            
        } catch (IOException | URISyntaxException e) {
            fail(e.getMessage());
        }
    }
		
}