package net.sf.jniinchi;
java
class JniInchiStructure_4Test {

    @Test
    void testGetBond() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiBond bond1 = new JniInchiBond(atom1, atom2, 1);
        JniInchiBond bond2 = new JniInchiBond(atom2, atom1, 2);
        structure.addBond(bond1);
        structure.addBond(bond2);

        assertEquals(bond1, structure.getBond(0));
        assertEquals(bond2, structure.getBond(1));
    }

    // Add more test cases for the getBond method if needed

}
