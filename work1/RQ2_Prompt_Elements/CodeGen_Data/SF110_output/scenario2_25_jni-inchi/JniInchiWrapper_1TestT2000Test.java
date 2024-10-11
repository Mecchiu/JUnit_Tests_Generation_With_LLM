// JniInchiWrapper_1Test.java
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
* It contains one unit test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapper_1Test {
private final Lock lock = new Lock();

    @Test
    public void constructor() throws Exception {
        JniInchiWrapper wrapper = new JniInchiWrapper("InChI2InChI", null);
        assertNotNull(wrapper);
    }

    @Test
    public void checkInchi1() throws NativeCodeException {
        JniInchiWrapper wrapper = getWrapper();
        String inchi = getClass().getName().toString();
        assertInchi(inchi, true);
        try {
            assertINCHI(inchi, false);
            fail("Should have got an exception!");
        } catch (JniInchiException jniInchiException) {
        }
    }

    @Test
    public void checkInchi2() throws Exception {
        // get a reference of the wrapper and load data
        JniInchiWrapper wrapper = getWrapper();
        // load inchi values
        wrapper.getFileContents(InChI2InChI.class.getName().getBytes(NativeCode.ENCODING));
        JniInchiWrapper.INCHI_STATUS retStatus = wrapper.CheckINCHI(INCHI2INCHI);
        assertNotNull(retStatus);
        checkInchi2Status(retStatus);
        assertNull(getClass().getClassLoader().getResource("native.jar"));
    }

    @Test
    public void checkInchi3() throws Exception {
        assertTrue("Successfully loaded InChI version 3", getVersion().equals("3"));
        String inchi = "!<INCHI3>!";
        assertTrue("Successfully created InChI version 3" + inchi.substring(6, inchi.length()), getVersion().equals(inchi));
        assertInchi3Status(inchi);
        assertNull(getVersion());
    }

    @Test
    public void checkInchi2Status() throws Exception {
        assertNotNull("Successfully loaded InChI version 2", InChiVersion.getVersion(InChI2InChI.class.getName(), "2"));
        assertTrue("Successfully loaded InChI version 2" + InChiVersion.getVersion(InChI2InChI.class.getName(), "1"), InChiVersion.isVersion(InChI2InChI.class.getName(), "1"));
        assertFalse("Successfully loaded InChI version 1" + InChiVersion.getVersion(InChI2InChI.class.getName(), "2"), InChiVersion.isVersion(InChI2InChI.class.getName(), "2"));
        assertFalse("Successfully loaded InChI version 2" + InChiVersion.getVersion(InChI2InChI.class.getName(), "3"), InChiVersion.isVersion(InChI2InChI.class.getName(), "3"));
        assertFalse("Successfully loaded InChI version 3" + InChIVersion.getVersion(InChI2InChI.class.getName(), "3"), InChIVersion.isVersion(InChI2InChI.class.getName(), "3"));

        try {
            assertFalse("Should not load native.jar", getClass().getClassLoader().getResource("native.jar")!= null);
            fail("Successfully loaded native.jar");
        } catch (NativeCodeException jniInchiException) {
        }
    }

    @Test
    public void checkInchi2Status2() throws Exception {
        String inchi = "Not a valid InChI!2";
        assertFalse("Successfully loading invalid InChI" + inchi, getClass().getClassLoader().getResource("native.jar")!= null);
        
        try {
            assertNotNull("Successfully loaded native.jar", getClass().getClassLoader().getResource("native.jar"));
            fail("Successfully loaded native.jar");
        } catch (NativeCodeException jniInchiException) {
        }
        try {
            assertNotNull("Successfully loaded native.jar", getClass().getClassLoader().getResource("native.jar"));
            fail("Successfully loaded native.jar");
        } catch (NativeCodeException jniInchiException2) {
            assertTrue("Successfully loaded native.jar", jniInchiException2.getMessage().contains("in chie"))
                   .contains("Not a valid InChI: 2");
        }
    }

    @Test
    public void checkInchi2Status3() throws Exception {
        String inchi = "\"$INCHI3\"";
        assertFalse("Successfully loading incompatible InChI" + inchi, getClass().getClassLoader().getResource("native.jar")!= null);
        
        try {
            assertNotNull("Successfully loaded native.jar", getClass().getClassLoader().getResource("native.jar"));
            fail("Successfully loaded native.jar");
        } catch (NativeCodeException jniInchiException) {
        }
        try {
            assertNotNull("Successfully loaded native