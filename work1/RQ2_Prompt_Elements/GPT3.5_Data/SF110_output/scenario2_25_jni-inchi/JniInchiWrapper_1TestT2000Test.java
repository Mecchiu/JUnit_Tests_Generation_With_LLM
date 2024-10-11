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
        inchi = inchi.replace("C", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INPUT, status);
    }

    @Test
    void testCheckInchi_UnknownStatus() {
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
    void testCheckInchi_StrictFalse() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.OKAY, status);
    }

    @Test
    void testCheckInchi_StrictTrue() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.VALID_STANDARD, status);
    }

    @Test
    void testCheckInchi_StrictTrue_InvalidInchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        inchi = inchi.replace("C", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INPUT, status);
    }

    @Test
    void testCheckInchi_StrictTrue_InvalidInchi2Inchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        inchi = inchi.replace("C", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INPUT, status);
    }

    @Test
    void testCheckInchi_StrictTrue_InvalidInchi2Inchi_FalseAlarm() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        inchi = inchi.replace("C", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INPUT, status);
    }

    @Test
    void testCheckInchi_StrictTrue_InvalidInchi2Inchi_ExactMatch() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        inchi = inchi.replace("C", "X");
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INVALID_INPUT, status);
    }

    @Test
    void testCheckInchi_StrictTrue_ValidInchi2Inchi() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6?/m1/s1";
        String inchi2 = JniInchiWrapper.getInchi2FromInchi(inchi);
        INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi2, true);
        assertEquals(INCHI_STATUS.VALID_STANDARD, status);
    }
}