// Source code for JniInchiStereo0D_0Test.java

package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JniInchiStereo0D}.
 * It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
 */
class JniInchiStereo0D_0Test {

    @Test
    void testCreateNewTetrahedralStereo0D_1() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertNotNull(stereo);
        assertEquals(atC, stereo.getCentralAtom());
        assertArrayEquals(new JniInchiAtom[]{at0, at1, at2, at3}, stereo.getNeighbors());
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
    }

    @Test
    void testCreateNewTetrahedralStereo0D_2() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertNotNull(stereo);
        assertEquals(atC, stereo.getCentralAtom());
        assertArrayEquals(new JniInchiAtom[]{at0, at1, at2, at3}, stereo.getNeighbors());
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
        assertEquals(INCHI_PARITY.ODD, stereo.getParity());
    }

    @Test
    void testCreateNewTetrahedralStereo0D_3() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
        assertNotNull(stereo);
        assertEquals(atC, stereo.getCentralAtom());
        assertArrayEquals(new JniInchiAtom[]{at0, at1, at2, at3}, stereo.getNeighbors());
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
        assertEquals(INCHI_PARITY.UNKNOWN, stereo.getParity());
    }

    @Test
    void testCreateNewTetrahedralStereo0D_4() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, null);
        });
    }

    @Test
    void testCreateNewTetrahedralStereo0D_5() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(null, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        });
    }

    @Test
    void testCreateNewTetrahedralStereo0D_6() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(atC, null, at1, at2, at3, INCHI_PARITY.EVEN);
        });
    }

    @Test
    void testCreateNewTetrahedralStereo0D_7() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, null, at2, at3, INCHI_PARITY.EVEN);
        });
    }

    @Test
    void testCreateNewTetrahedralStereo0D_8() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, null, at3, INCHI_PARITY.EVEN);
        });
    }

    @Test
    void testCreateNewTetrahedralStereo0D_9() {
        JniInchiAtom atC = new JniInchiAtom(1, "C");
        JniInchiAtom at0 = new JniInchiAtom(2, "H");
        JniInchiAtom at1 = new JniInchiAtom(3, "H");
        JniInchiAtom at2 = new JniInchiAtom(4, "H");
        JniInchiAtom at3 = new JniInchiAtom(5, "H");
        assertThrows(IllegalArgumentException.class, () -> {
            JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, null, INCHI_PARITY.EVEN);
        });
    }
}