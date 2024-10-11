// JniInchiWrapper_1Test.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JniInchiWrapper}.
 * It contains ten unit test cases for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
 */
class JniInchiWrapper_1Test {

    @Test
    void testCheckInchi_NullInchi() {
        assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.checkInchi(null, true));
    }

    @Test
    void testCheckInchi_ValidInchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.VALID_STANDARD, status);
    }

    @Test
    void testCheckInchi_InvalidInchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        inchi = inchi.replace("?", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INCHI, status);
    }

    @Test
    void testCheckInchi_UnknownStatus() throws JniInchiException {
        JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
        wrapper.getLock();
        try {
            int ret = wrapper.CheckINCHI("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1", true);
            INCHI_STATUS status = INCHI_STATUS.getValue(ret);
            assertNull(status);
        } finally {
            wrapper.releaseLock();
        }
    }

    @Test
    void testCheckInchi_Timeout() {
        assertThrows(TimeoutException.class, () -> {
            JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
            wrapper.getLock();
            try {
                wrapper.CheckINCHI("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1", true, 1, TimeUnit.MILLISECONDS);
            } finally {
                wrapper.releaseLock();
            }
        });
    }

    @Test
    void testCheckInchi_NativeCodeException() {
        assertThrows(JniInchiException.class, () -> {
            JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
            wrapper.getLock();
            try {
                wrapper.CheckINCHI("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1", true);
            } finally {
                wrapper.releaseLock();
            }
        });
    }

    @Test
    void testCheckInchi_NativeLibraryLoaderException() {
        assertThrows(JniInchiException.class, () -> {
            NativeLibraryLoader.setLibraryPath("invalid/path");
            JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
            wrapper.getLock();
            try {
                wrapper.CheckINCHI("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1", true);
            } finally {
                wrapper.releaseLock();
            }
        });
    }

    @Test
    void testCheckInchi_MultipleThreads() throws InterruptedException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        Thread t1 = new Thread(() -> {
            try {
                INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
                assertEquals(INCHI_STATUS.VALID_STANDARD, status);
            } catch (JniInchiException e) {
                fail(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
                assertEquals(INCHI_STATUS.VALID_STANDARD, status);
            } catch (JniInchiException e) {
                fail(e);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    @Test
    void testCheckInchi_SingleThread() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.VALID_STANDARD, status);
    }

    @Test
    void testCheckInchi_ReleaseLock() throws JniInchiException {
        JniInchiWrapper wrapper = JniInchiWrapper.getWrapper();
        wrapper.getLock();
        wrapper.releaseLock();
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.VALID_STANDARD, status);
    }

    @Test
    void testCheckInchi_GetWrapper() {
        JniInchiWrapper wrapper1 = JniInchiWrapper.getWrapper();
        JniInchiWrapper wrapper2 = JniInchiWrapper.getWrapper();
        assertSame(wrapper1, wrapper2);
    }

}