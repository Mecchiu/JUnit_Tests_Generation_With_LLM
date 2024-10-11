// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		java
    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("H");
        JniInchiAtom at1 = new JniInchiAtom("H");
        JniInchiAtom at2 = new JniInchiAtom("H");
        JniInchiAtom at3 = new JniInchiAtom("H");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        
        assertEquals(atC, stereo.getCentralAtom());
        assertEquals(at0, stereo.getNeighbor(0));
        assertEquals(at1, stereo.getNeighbor(1));
        assertEquals(at2, stereo.getNeighbor(2));
        assertEquals(at3, stereo.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
    }
    
    @Test
    void testCreateNewTetrahedralStereo0D_NullCentralAtom() {
        JniInchiAtom at0 = new JniInchiAtom("H");
        JniInchiAtom at1 = new JniInchiAtom("H");
        JniInchiAtom at2 = new JniInchiAtom("H");
        JniInchiAtom at3 = new JniInchiAtom("H");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(null, at0, at1, at2, at3, INCHI_PARITY.ODD);
        
        assertNull(stereo.getCentralAtom());
        assertEquals(at0, stereo.getNeighbor(0));
        assertEquals(at1, stereo.getNeighbor(1));
        assertEquals(at2, stereo.getNeighbor(2));
        assertEquals(at3, stereo.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
        assertEquals(INCHI_PARITY.ODD, stereo.getParity());
    }
    
    // Add more test cases as needed
}