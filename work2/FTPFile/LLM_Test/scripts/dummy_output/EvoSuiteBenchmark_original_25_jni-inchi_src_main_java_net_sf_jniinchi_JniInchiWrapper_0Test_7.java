// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {
		
	class JniInchiOutputKey {
		String inchiKey;
		/**
		 * Instantiates a new string {@link JniInchiOutputKey}
		 *
		 * @param inchiKey {@link String} to initialize
		 */
		public JniInchiOutputKey(String s) {
			super();
			this.inchiKey = s;
		}
	}
	
	@Test
    public void testClassInitialization() throws ClassNotFoundException, JniInchiException {
        jniInchi = new JniInchiWrapper();
        String key = jniInchi.getInchiKey("this is a test");
        assertEquals(1, key.length());
        assertNotNull("JNInchi WrappedInChI Key",key);
        assertFalse("JNInchi WrappedInChI Key is empty", key.isEmpty());
        assertEquals("JNInchi WrappedInChI Key", key, "this is a test");
    }

    @Test
    public void testGetInchiKey() {
        String inchi = "this is a test";
        String key = jniInchi.getInchiKey(inchi);
        String result = jniInchi.getInchiKey(inchi);
        assertNotNull("JNInchi WrappedInChI Key is null", key);
        assertEquals("JNInchI WrappedInChI Key", inchi, inchi+"");
        assertEquals("getInchiKey", result, key);
    }

    @Test
    public void testGetInchiKeyMultiple() {
        String inchi = "this is a test";
        String key = jniInchi.getInchiKey(inchi);
        String result = jniInchi.getInchiKey(inchi);
        assertNotNull("JNInchi WrappedInChI Key is null", key);
        assertEquals("JNInchi WrappedInChI Key", inchi, ("" + key).substring(1));
        assertEquals("getInchiKey", result, key);
    }

    @Test
    public void testGetFullInchiKey() {
        String inchi = "this is a test";
        String key = jniInchi.getFullInchiKey(inchi);
        String result = jniInchi.getFullInchiKey(inchi);
        assertNotNull("JNInchi WrappedInChI Key is null", key);
        assertEquals("JNInchI WrappedInChI Key", inchi, ("" + key).substring(1));
        assertEquals("getFullInchiKey", result, key);
    }

    @Test
    public void testGetFullInchi() {
        String inchi = "this is a test.this is a test.test is a test.test";
        String key = jniInchi.getFullInchi(inchi);
        String outKey = "test";
        String outValue = ".test";
        String outPart1 = "test.test is a test.test";
        String outPart2 = inchi.substring(0, inchi.indexOf(outPart1)).substring(1);
        String out = jniInchi.getFullInchi(inchi, outKey, outPart1);
        String result = jniInchi.getFullInchi(inchi, outKey, outPart2);
        assertNotNull("JNInchi WrappedInChI Key is null", key);
        assertEquals("JNInchI WrappedInChI Key", okey, key+"");
        assertEquals("getFullInchi", result, out);
        assertTrue("getFullInchi", out.startsWith(outPart1) || out.startsWith(outPart2));
        assertEquals("getFullInchiKey", okey, key+"_"+ovalue);
    }

    @Test
    public void testAddAtom() {
    	String cA = "a B";
    	String cB = "b \"C\"";
    	
    	jniInchi.addAtom(cB);
    	List<String> result = jniInchi.getAtomKeys();
    	
    	String outValue = "a \"C\"";
    	String outPart1 = "a B";
    	char[] ovalue;
    	String okey;
    	
    	for (int i = 0; i < result.size(); i++) {
    	
    		result.set(i, result.get(i).replace("\"C\"", outValue));
    		okey = oresult.get(i);
    		okey = key.substring(0, key.indexOf(okey));
    		assertNull("getFullInchi", okey);
    		okey = okey.substring(okey.indexOf(result.get(i)));
    		assertEquals("getFullInchiKey", okey, result.get(i));
    	}
    	assertTrue("addAtom", result.size() == 1);
    	
    	// try this on next line
    	String inchi = "this is a test.test is a test.test";
    	
    	jniInchi.addAtom(cA);
    	result = jniInchi.getAtomKeys();
    	
    	okey = key.substring(0, key.indexOf(ovalue));
    	okey = key.substring(okey.indexOf(cA));
    	
    	assertNotNull("JNInchi WrappedInChI Key is null", key);
    	assertEquals("JNInchi WrappedInChI Key", key, inchi+"");
    	assertEquals("addAtom", result.size(), 1);
    	
    	result = jniInchi.getFullAtoms();
    	byte[] okeyBytes = okey.getBytes();
}
}