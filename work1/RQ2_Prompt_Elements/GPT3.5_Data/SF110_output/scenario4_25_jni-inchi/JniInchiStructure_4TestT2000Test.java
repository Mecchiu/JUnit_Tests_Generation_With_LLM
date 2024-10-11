// Test case 1: Test getBond method with valid index
@Test
void testGetBondValidIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom(1, "C");
    JniInchiAtom atom2 = new JniInchiAtom(2, "O");
    JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
    structure.addBond(bond);
    assertEquals(bond, structure.getBond(0));
}

// Test case 2: Test getBond method with invalid index
@Test
void testGetBondInvalidIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getBond(0);
    });
}

// Test case 3: Test getBond method with empty bond list
@Test
void testGetBondEmptyList() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getBond(0);
    });
}

// Test case 4: Test getBond method with multiple bonds
@Test
void testGetBondMultipleBonds() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom(1, "C");
    JniInchiAtom atom2 = new JniInchiAtom(2, "O");
    JniInchiAtom atom3 = new JniInchiAtom(3, "N");
    JniInchiBond bond1 = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
    JniInchiBond bond2 = new JniInchiBond(atom2, atom3, JniInchiBond.BondType.DOUBLE);
    structure.addBond(bond1);
    structure.addBond(bond2);
    assertEquals(bond1, structure.getBond(0));
    assertEquals(bond2, structure.getBond(1));
}

// Test case 5: Test getBond method with null bond list
@Test
void testGetBondNullList() {
    JniInchiStructure structure = new JniInchiStructure();
    structure.bondList = null;
    assertThrows(NullPointerException.class, () -> {
        structure.getBond(0);
    });
}

// Test case 6: Test getBond method with negative index
@Test
void testGetBondNegativeIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getBond(-1);
    });
}

// Test case 7: Test getBond method with index greater than size of bond list
@Test
void testGetBondIndexGreaterThanSize() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiAtom atom1 = new JniInchiAtom(1, "C");
    JniInchiAtom atom2 = new JniInchiAtom(2, "O");
    JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
    structure.addBond(bond);
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getBond(1);
    });
}

// Test case 8: Test getBond method with null bond
@Test
void testGetBondNullBond() {
    JniInchiStructure structure = new JniInchiStructure();
    structure.bondList.add(null);
    assertThrows(NullPointerException.class, () -> {
        structure.getBond(0);
    });
}

// Test case 9: Test getBond method with multiple null bonds
@Test
void testGetBondMultipleNullBonds() {
    JniInchiStructure structure = new JniInchiStructure();
    structure.bondList.add(null);
    structure.bondList.add(null);
    assertThrows(NullPointerException.class, () -> {
        structure.getBond(0);
    });
}

// Test case 10: Test getBond method with non-bond object in bond list
@Test
void testGetBondNonBondObject() {
    JniInchiStructure structure = new JniInchiStructure();
    structure.bondList.add(new Object());
    assertThrows(ClassCastException.class, () -> {
        structure.getBond(0);
    });
}