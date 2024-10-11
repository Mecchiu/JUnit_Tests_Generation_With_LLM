package net.sf.jniinchi;
java
class JniInchiStereo0D_2Test {

    @Test
    void testCreateNewDoublebondStereo0D() {
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("H");
        JniInchiAtom at2 = new JniInchiAtom("H");
        JniInchiAtom at3 = new JniInchiAtom("O");

        JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);

        assertEquals(null, stereo.getCentralAtom());
        assertEquals(at0, stereo.getNeighbor(0));
        assertEquals(at1, stereo.getNeighbor(1));
        assertEquals(at2, stereo.getNeighbor(2));
        assertEquals(at3, stereo.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
    }
}
