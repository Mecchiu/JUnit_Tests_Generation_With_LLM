// Source code for JniInchiStereo0D_1Test.java

package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JniInchiStereo0D}.
 * It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
 */
class JniInchiStereo0D_1Test {

    @Test
    void testCreateNewDoublebondStereo0D() {
        JniInchiAtom at0 = new JniInchiAtom(1, "C");
        JniInchiAtom at1 = new JniInchiAtom(2, "C");
        JniInchiAtom at2 = new JniInchiAtom(3, "C");
        JniInchiAtom at3 = new JniInchiAtom(4, "C");

        // Test case 1
        JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo0D.getParity());

        // Test case 2
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.ODD, stereo0D.getParity());

        // Test case 3
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.NONE);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.NONE, stereo0D.getParity());

        // Test case 4
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, null);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.NONE, stereo0D.getParity());

        // Test case 5
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo0D.getParity());

        // Test case 6
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.ODD, stereo0D.getParity());

        // Test case 7
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.NONE);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.NONE, stereo0D.getParity());

        // Test case 8
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, null);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.NONE, stereo0D.getParity());

        // Test case 9
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo0D.getParity());

        // Test case 10
        at0 = new JniInchiAtom(1, "C");
        at1 = new JniInchiAtom(2, "C");
        at2 = new JniInchiAtom(3, "C");
        at3 = new JniInchiAtom(4, "C");
        stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertNotNull(stereo0D);
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo0D.getStereoType());
        assertEquals(INCHI_PARITY.ODD, stereo0D.getParity());
    }
}