// Here's an implementation of the JniInchiStructure_3Test class with ten unit test cases for the getAtom() method.

class JniInchiStructure_3Test {

    @Test
    void testGetAtomReturnsCorrectAtom() {
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiAtom atom3 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        atomList.add(atom2);
        atomList.add(atom3);
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertEquals(atom1, structure.getAtom(0));
        assertEquals(atom2, structure.getAtom(1));
        assertEquals(atom3, structure.getAtom(2));
    }

    @Test
    void testGetAtomThrowsIndexOutOfBoundsExceptionWhenIndexIsNegative() {
        JniInchiAtom atom1 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getAtom(-1));
    }

    @Test
    void testGetAtomThrowsIndexOutOfBoundsExceptionWhenIndexIsGreaterThanSize() {
        JniInchiAtom atom1 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getAtom(1));
    }

    @Test
    void testGetAtomThrowsIndexOutOfBoundsExceptionWhenStructureIsEmpty() {
        List<JniInchiAtom> atomList = new ArrayList<>();
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertThrows(IndexOutOfBoundsException.class, () -> structure.getAtom(0));
    }

    @Test
    void testGetAtomThrowsNullPointerExceptionWhenStructureIsNull() {
        JniInchiStructure structure = null;
        assertThrows(NullPointerException.class, () -> structure.getAtom(0));
    }

    @Test
    void testGetAtomReturnsNullWhenAtomListIsNull() {
        JniInchiStructure structure = new JniInchiStructure(null);
        assertNull(structure.getAtom(0));
    }

    @Test
    void testGetAtomReturnsNullWhenIndexIsEqualToSize() {
        JniInchiAtom atom1 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertNull(structure.getAtom(1));
    }

    @Test
    void testGetAtomReturnsNullWhenIndexIsGreaterThanSize() {
        JniInchiAtom atom1 = new JniInchiAtom();
        List<JniInchiAtom> atomList = new ArrayList<>();
        atomList.add(atom1);
        JniInchiStructure structure = new JniInchiStructure(atomList);
        assertNull(structure.getAtom(2));
    }

    @Test
    void testGetAtomReturnsNullWhenIndexIsNegativeAndAtomListIsNull() {
        JniInchiStructure structure = new JniInchiStructure(null);
        assertNull(structure.getAtom(-1));
    }

    @Test
    void testGetAtomReturnsNullWhenIndexIsGreaterThanSizeAndAtomListIsNull() {
        JniInchiStructure structure = new JniInchiStructure(null);
        assertNull(structure.getAtom(1));
    }
}