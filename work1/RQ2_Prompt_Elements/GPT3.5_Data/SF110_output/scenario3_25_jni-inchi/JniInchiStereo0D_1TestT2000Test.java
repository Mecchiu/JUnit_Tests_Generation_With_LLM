// Test case 1: Test with valid input parameters
@Test
void testCreateNewDoublebondStereo0D_validInput() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNotNull(stereo0D);
}

// Test case 2: Test with null input parameters
@Test
void testCreateNewDoublebondStereo0D_nullInput() {
    JniInchiAtom at0 = null;
    JniInchiAtom at1 = null;
    JniInchiAtom at2 = null;
    JniInchiAtom at3 = null;
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNull(stereo0D);
}

// Test case 3: Test with invalid parity
@Test
void testCreateNewDoublebondStereo0D_invalidParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, null);
    assertNull(stereo0D);
}

// Test case 4: Test with invalid input atoms
@Test
void testCreateNewDoublebondStereo0D_invalidAtoms() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNull(stereo0D);
}

// Test case 5: Test with valid input parameters and odd parity
@Test
void testCreateNewDoublebondStereo0D_validInput_oddParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_ODD);
    assertNotNull(stereo0D);
}

// Test case 6: Test with valid input parameters and even parity
@Test
void testCreateNewDoublebondStereo0D_validInput_evenParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNotNull(stereo0D);
}

// Test case 7: Test with valid input parameters and unknown parity
@Test
void testCreateNewDoublebondStereo0D_validInput_unknownParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_UNKNOWN);
    assertNotNull(stereo0D);
}

// Test case 8: Test with valid input parameters and null parity
@Test
void testCreateNewDoublebondStereo0D_validInput_nullParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, null);
    assertNull(stereo0D);
}

// Test case 9: Test with valid input parameters and empty atoms
@Test
void testCreateNewDoublebondStereo0D_validInput_emptyAtoms() {
    JniInchiAtom at0 = new JniInchiAtom(1, "");
    JniInchiAtom at1 = new JniInchiAtom(2, "");
    JniInchiAtom at2 = new JniInchiAtom(3, "");
    JniInchiAtom at3 = new JniInchiAtom(4, "");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNull(stereo0D);
}

// Test case 10: Test with valid input parameters and same atoms
@Test
void testCreateNewDoublebondStereo0D_validInput_sameAtoms() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(1, "C");
    JniInchiAtom at2 = new JniInchiAtom(1, "C");
    JniInchiAtom at3 = new JniInchiAtom(1, "C");
    JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
    assertNull(stereo0D);
}
}