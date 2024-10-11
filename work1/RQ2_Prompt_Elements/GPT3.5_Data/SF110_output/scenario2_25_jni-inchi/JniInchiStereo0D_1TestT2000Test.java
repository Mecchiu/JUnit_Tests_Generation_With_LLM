// Test case 1: Test with valid input parameters
@Test
void testCreateNewDoublebondStereo0D_validInput() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
}

// Test case 2: Test with null input parameters
@Test
void testCreateNewDoublebondStereo0D_nullInput() {
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewDoublebondStereo0D(null, null, null, null, null);
    });
}

// Test case 3: Test with invalid parity
@Test
void testCreateNewDoublebondStereo0D_invalidParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, null);
    });
}

// Test case 4: Test with invalid neighbour atoms
@Test
void testCreateNewDoublebondStereo0D_invalidNeighbourAtoms() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, null, INCHI_PARITY.EVEN);
    });
}

// Test case 5: Test with invalid stereo type
@Test
void testCreateNewDoublebondStereo0D_invalidStereoType() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = new JniInchiStereo0D(null, at0, at1, at2, at3, null, INCHI_PARITY.EVEN);
    });
}

// Test case 6: Test with invalid central atom
@Test
void testCreateNewDoublebondStereo0D_invalidCentralAtom() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = new JniInchiStereo0D(at0, at0, at1, at2, at3, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    });
}

// Test case 7: Test with invalid neighbour atom count
@Test
void testCreateNewDoublebondStereo0D_invalidNeighbourAtomCount() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = new JniInchiStereo0D(null, at0, at1, at2, null, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    });
}

// Test case 8: Test with invalid neighbour atom order
@Test
void testCreateNewDoublebondStereo0D_invalidNeighbourAtomOrder() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = new JniInchiStereo0D(null, at0, at2, at1, at3, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    });
}

// Test case 9: Test with invalid neighbour atom types
@Test
void testCreateNewDoublebondStereo0D_invalidNeighbourAtomType() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = new JniInchiStereo0D(null, at0, at1, at2, at3, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    });
}

// Test case 10: Test with valid input parameters and null central atom
@Test
void testCreateNewDoublebondStereo0D_nullCentralAtom() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = new JniInchiStereo0D(null, at0, at1, at2, at3, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
}
}