// Test case 1: Test with all atoms null
@Test
public void testCreateNewTetrahedralStereo0D_NullAtoms() {
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(null, null, null, null, null, INCHI_PARITY.EVEN);
    assertNull(stereo);
}

// Test case 2: Test with central atom null
@Test
public void testCreateNewTetrahedralStereo0D_NullCentralAtom() {
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(null, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertNull(stereo);
}

// Test case 3: Test with all neighbour atoms null
@Test
public void testCreateNewTetrahedralStereo0D_NullNeighbourAtoms() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, null, null, null, null, INCHI_PARITY.EVEN);
    assertNull(stereo);
}

// Test case 4: Test with parity null
@Test
public void testCreateNewTetrahedralStereo0D_NullParity() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, null);
    assertNull(stereo);
}

// Test case 5: Test with valid inputs and even parity
@Test
public void testCreateNewTetrahedralStereo0D_EvenParity() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
    assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
    assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
}

// Test case 6: Test with valid inputs and odd parity
@Test
public void testCreateNewTetrahedralStereo0D_OddParity() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
    assertNotNull(stereo);
    assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
    assertEquals(INCHI_PARITY.ODD, stereo.getParity());
}

// Test case 7: Test with valid inputs and unknown parity
@Test
public void testCreateNewTetrahedralStereo0D_UnknownParity() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
    assertNotNull(stereo);
    assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
    assertEquals(INCHI_PARITY.UNKNOWN, stereo.getParity());
}

// Test case 8: Test with valid inputs and null stereo type
@Test
public void testCreateNewTetrahedralStereo0D_NullStereoType() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = new JniInchiStereo0D(atC, at0, at1, at2, at3, null, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
    assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
    assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
}

// Test case 9: Test with valid inputs and invalid stereo type
@Test
public void testCreateNewTetrahedralStereo0D_InvalidStereoType() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = new JniInchiStereo0D(atC, at0, at1, at2, at3, INCHI_STEREOTYPE.DOUBLEBOND, INCHI_PARITY.EVEN);
    assertNull(stereo);
}

// Test case 10: Test with valid inputs and null parity
@Test
public void testCreateNewTetrahedralStereo0D_NullParity2() {
    JniInchiAtom atC = new JniInchiAtom();
    JniInchiAtom at0 = new JniInchiAtom();
    JniInchiAtom at1 = new JniInchiAtom();
    JniInchiAtom at2 = new JniInchiAtom();
    JniInchiAtom at3 = new JniInchiAtom();
    JniInchiStereo0D stereo = new JniInchiStereo0D(atC, at0, at1, at2, at3, INCHI_STEREOTYPE.TETRAHEDRAL, null);
    assertNull(stereo);
}
}