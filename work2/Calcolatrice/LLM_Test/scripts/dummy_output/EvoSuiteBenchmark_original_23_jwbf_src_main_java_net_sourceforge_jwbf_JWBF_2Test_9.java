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
		private static final String baseDir = "testdata"; //$NON-NLS-1$	

    @Test
    public void test_getVersion() throws IOException {
        assertEquals("JWBF-2", JWBF.getVersion());
    }

    @Test
    public void test_readMFProductName() throws IOException {
        if (!JWBF.errorInfo) {

            assertNull(JWBF.readMFProductName(null));

            JWBF.readMFProductName("file:");
            try {
                Class.forName("net.sourceforge.jwbf.JWBF");
                fail(); // no problem for a file
            } catch (ClassNotFoundException ex) {}

            assertNull(JWBF.readMFProductName("invalid"));

            JWBF.readMFProductTitle("File:");
            assertEquals("File", JWBF.readMFProductTitle(baseDir, "manifest-invalid.mf2")); //$NON-NLS-1$  
        } else {
            assertNull(JWBF.readMFProductName(null));
            assertNull(JWBF.readMFProductTitle(null));
        }
    }

    @Test
    public void test_readMFVersionId() throws IOException {
        assertNull(JWBF.readMFVersionId(null));	
        assertEquals(null, JWBF.readMFVersionId("invalid"));
    }

    @Test
    public void test_readMFProductId() throws IOException {
        assertNull(JWBF.readMFProductId(null));		
        assertEquals(null, JWBF.readMFProductId("invalid"));
    }

    @Test
    public void test_readMFVersion() throws IOException {
        JWBFVersion ver = JWBF.readMFVersion(baseDir);
        assertEquals("JWBF-2", ver.toString());
        String val = ver.getValue();
        String[] parts = ver.getParts();
        assertTrue(parts.length > 0);
        for (String part : parts) {
            assertTrue(part!= null);
            PartVersion partVal = ver.getPartVersion(part);
            assertTrue(partVal!= null);
            assertTrue(String.valueOf(partVal.getPartId()).equals("JWBF-2-1")        //$NON-NLS-1$
                    ||
                    String.valueOf(partVal.getPartId()).equals("JWBF-2-1-1")                         //$NON-NLS-1$
                    ||
                    String.valueOf(partVal.getPartId()).equals("JWBF-2-1-a1")                         //$NON-NLS-1$
                    || partVal.equals(JWBF.getVersion()));
        }
        Map<String, String> valMap = ver.getValues();
        String valHash = valMap.entrySet().stream()
               .filter(e -> e.getKey()!= null)
               .map(Map.Entry::getKey)
               .collect(GroupingHashmap());
        valMap = valHash.entrySet().stream
               .filter(e -> e.getKey()!= null)
               .map(Map.Entry::getKey)
               .collect(GroupingHashMap());
        ver = ver.getPartVersion(getPartId("jar:file:file.jar"));//$NON-NLS-1$
        String partVal = ver.getPartVersion(getPartId("JWBF-2-1"));//$NON-NLS-1$
        assertEquals(String.valueOf(partVal.split("\\.")[1]) //$NON-NLS-1$
           .concat("-1"), ver); //$NON-NLS-1$
        //assertTrue(valMap.get("1-1")!=null);
        //assertTrue(valMap.get("1-2")!=null);
        ver = ver.getPartVersion(getPartId("2-1"));//$NON-NLS-1$
        partVal = ver.getPartVersion(getPartId("JWBF2-1-1"));//$NON-NLS-1$
        //assertTrue("1-1".equals("2-1"));
        assertTrue(partVal.equals("")); //$NON-NLS-1$
        assertTrue(ver.equals(JWBF.getVersion()));
        assertFalse(ver.equals(getVersion())); 
}
}