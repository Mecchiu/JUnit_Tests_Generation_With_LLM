// Test case 1: Test getting the first atom in an empty structure
@Test
void testGetAtomEmpty() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getAtom(0);
    });
}

// Test case 2: Test getting an atom at an invalid index in a non-empty structure
@Test
void testGetAtomInvalidIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom = new JniInchiAtom();
    structure.addAtom(atom);
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getAtom(1);
    });
}

// Test case 3: Test getting the first atom in a structure with one atom
@Test
void testGetAtomOneAtom() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom = new JniInchiAtom();
    structure.addAtom(atom);
    assertEquals(atom, structure.getAtom(0));
}

// Test case 4: Test getting the last atom in a structure with multiple atoms
@Test
void testGetAtomLast() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtom(atom1);
    structure.addAtom(atom2);
    structure.addAtom(atom3);
    assertEquals(atom3, structure.getAtom(2));
}

// Test case 5: Test getting the first atom in a structure with multiple atoms
@Test
void testGetAtomFirst() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtom(atom1);
    structure.addAtom(atom2);
    structure.addAtom(atom3);
    assertEquals(atom1, structure.getAtom(0));
}

// Test case 6: Test getting an atom in the middle of a structure with multiple atoms
@Test
void testGetAtomMiddle() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtom(atom1);
    structure.addAtom(atom2);
    structure.addAtom(atom3);
    assertEquals(atom2, structure.getAtom(1));
}

// Test case 7: Test getting an atom from a structure with only one atom added using addAtoms method
@Test
void testGetAtomAddAtomsOneAtom() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom = new JniInchiAtom();
    structure.addAtoms(atom);
    assertEquals(atom, structure.getAtom(0));
}

// Test case 8: Test getting atoms from a structure with multiple atoms added using addAtoms method
@Test
void testGetAtomAddAtomsMultipleAtoms() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtoms(atom1, atom2, atom3);
    assertEquals(atom1, structure.getAtom(0));
    assertEquals(atom2, structure.getAtom(1));
    assertEquals(atom3, structure.getAtom(2));
}

// Test case 9: Test getting an atom from a structure with atoms added using both addAtom and addAtoms methods
@Test
void testGetAtomMixedAddMethods() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtom(atom1);
    structure.addAtoms(atom2, atom3);
    assertEquals(atom1, structure.getAtom(0));
    assertEquals(atom2, structure.getAtom(1));
    assertEquals(atom3, structure.getAtom(2));
}

// Test case 10: Test getting an atom from a structure with atoms added using both addAtom and addAtoms methods, in reverse order
@Test
void testGetAtomMixedAddMethodsReverse() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom();
    JniInchiAtom atom2 = new JniInchiAtom();
    JniInchiAtom atom3 = new JniInchiAtom();
    structure.addAtoms(atom2, atom3);
    structure.addAtom(atom1);
    assertEquals(atom2, structure.getAtom(0));
    assertEquals(atom3, structure.getAtom(1));
    assertEquals(atom1, structure.getAtom(2));
}