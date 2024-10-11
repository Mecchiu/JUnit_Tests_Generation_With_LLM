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
		
	private static String version;
	private static String title;
	
	
	/**
     * 
     * @throws IOException
     * 
     */
    @java.lang.SuppressWarnings("all")
    public final void testInitialization() throws IOException {
        try {
            version = readMFVersion(JWBF_testInitialization_aClassesVersionPropertyName());
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException");
        }

        try {
            title = readMFProductTitle(JWBF_testInitialization_aClassesPathPropertyName());
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException");
        }

        testGetPartId(JWBF_testInitialization_aClassesVersionPropertyName());
        testGetPartId(JWBF_testInitialization_aClassesPathPropertyName());
        testGetPartId(JWBF_testInitialization_aCompilePropertiesPathPropertyName());
        testGetPartId(JWBF_testInitialization_aClassesTestPropertyName());
        
        
    }
    

    /**
     * @throws IOException
     * 
     */
    @java.lang.SuppressWarnings("all")
    private final void testGetPartId(final String path) throws IOException{
        final String mfVersionStr = readMFVersion(path);
        if (mfVersionStr!=null) {
            final Map<String, Object> pVars = new HashMap<String, Object>();
			pVars.put(JWBF_aClassesVersionPropertyName(), JWBF.getVersion());
			pVars.put(JWBF_aClassesPathPropertyName(), path);
			new JWBF_aTestHelper(pVars).testGetPartId(true);
			
        } else {
            fail("IllegalArgumentException");
        }
	}

	@java.lang.SuppressWarnings("all")
	private final void testGetPartId(final String path, TestHelper testCases) throws IOException {
		
		String result = testCases.test(path);
    	final Map<String, String> pVars = new HashMap<String, String>();
    	pVars.put(JWBF_aClassesVersionPropertyName(), version);
    	pVars.put(JWBF_aClassesPathPropertyName(), path);

    	new JWBF_aTestHelper(pVars).testGetPartId(true);
	}
	
	
	private final String readMFVersion(final String path) throws IOException {
		Path.Segment seg = new Path.SegmentImpl(path);
        return "/" + seg.segmentationSeparator + "MFVer=" + seg.getSegmentData();
    }

    private final String readMFProductTitle(final String path) throws IOException {
        Path.Segment seg = new Path.SegmentImpl(path);
        return path.substring(0,path.indexOf("MFVer=")+7) + "-" + seg.getSegmentData();
    }

    @java.lang.SuppressWarnings({ "all", "unchecked" })
    @javax.annotation.ParametersAreNonnullByDefault
    private static final class JWBF_aTestHelper extends JWBF_1Test {

        /**
         * The aTestFinderTestClass.
         */
        @java.lang.SuppressWarnings("all")
        private final Class<?> aTestFinderTestClass;
        
        @java.lang.SuppressWarnings("all")
        protected JWBF_aTestHelper(final Map<String, Object> pAClassesVars) {
            super(pAClassesVars);
            try {
                Class.forName(pAClassesVars.get(JWBF_aClassesVersionPropertyName()).toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                errorInfo = false;
                e.printStackTrace();
            }
        }
        
        /**
         * The aClassesVars.
         * 
         * @return aClassesVars aClassesVars
         */
        public final Class<?> getaClassesVars() {
            return pClassesVars.get(JWBF_aClassesVersionPropertyName());
        }

        /**
         * Search for aClasses.
         * 
         * @return aClasses
         */
}
}