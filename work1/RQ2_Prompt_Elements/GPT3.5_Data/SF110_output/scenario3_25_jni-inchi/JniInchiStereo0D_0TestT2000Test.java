// Test case 1: Test with valid inputs and even parity
@Test
public void testCreateNewTetrahedralStereo0D_validInputs_evenParity() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNotNull(stereo0D);
}

// Test case 2: Test with valid inputs and odd parity
@Test
public void testCreateNewTetrahedralStereo0D_validInputs_oddParity() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_ODD);
    assertNotNull(stereo0D);
}

// Test case 3: Test with null central atom
@Test
public void testCreateNewTetrahedralStereo0D_nullCentralAtom() {
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(null, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    });
}

// Test case 4: Test with null neighbour atom 0
@Test
public void testCreateNewTetrahedralStereo0D_nullNeighbourAtom0() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, null, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    });
}

// Test case 5: Test with null neighbour atom 1
@Test
public void testCreateNewTetrahedralStereo0D_nullNeighbourAtom1() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, null, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    });
}

// Test case 6: Test with null neighbour atom 2
@Test
public void testCreateNewTetrahedralStereo0D_nullNeighbourAtom2() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, null, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    });
}

// Test case 7: Test with null neighbour atom 3
@Test
public void testCreateNewTetrahedralStereo0D_nullNeighbourAtom3() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, null, INCHI_PARITY.INCHI_PARITY_EVEN);
    });
}

// Test case 8: Test with invalid parity
@Test
public void testCreateNewTetrahedralStereo0D_invalidParity() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, null);
    });
}

// Test case 9: Test with less than 4 neighbour atoms
@Test
public void testCreateNewTetrahedralStereo0D_lessThan4NeighbourAtoms() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, null, null, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNull(stereo0D);
}

// Test case 10: Test with more than 4 neighbour atoms
@Test
public void testCreateNewTetrahedralStereo0D_moreThan4NeighbourAtoms() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiAtom at4 = new JniInchiAtom(6, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN, at4);
    });
}
}