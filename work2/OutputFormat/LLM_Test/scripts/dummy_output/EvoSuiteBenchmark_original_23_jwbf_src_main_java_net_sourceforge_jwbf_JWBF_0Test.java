package net.sourceforge.jwbf;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JWBF_0Test {

    @Test
    void testGetVersion() {
        // Test case 1
        assertEquals("1.0", JWBF.getVersion(JWBF.class));

        // Test case 2
        assertEquals("1.0", JWBF.getVersion(JWBF_0Test.class));

        // Test case 3
        assertEquals("Version Unknown", JWBF.getVersion(String.class));

        // Test case 4
        assertEquals("Version Unknown", JWBF.getVersion(File.class));

        // Test case 5
        assertEquals("Version Unknown", JWBF.getVersion(Map.class));

        // Test case 6
        assertEquals("Version Unknown", JWBF.getVersion(Manifest.class));

        // Test case 7
        assertEquals("Version Unknown", JWBF.getVersion(URL.class));

        // Test case 8
        assertEquals("Version Unknown", JWBF.getVersion(FileFilter.class));

        // Test case 9
        assertEquals("Version Unknown", JWBF.getVersion(URISyntaxException.class));

        // Test case 10
        assertEquals("Version Unknown", JWBF.getVersion(JarEntry.class));
    }

}
