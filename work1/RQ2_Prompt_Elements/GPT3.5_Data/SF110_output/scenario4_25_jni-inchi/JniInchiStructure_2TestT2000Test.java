// Test case 1: Adding a null stereo parity should throw an exception
@Test
void testAddStereo0D_Null() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(NullPointerException.class, () -> {
        structure.addStereo0D(null);
    });
}

// Test case 2: Adding a valid stereo parity should return the same parity
@Test
void testAddStereo0D_Valid() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiStereo0D addedParity = structure.addStereo0D(parity);
    assertEquals(parity, addedParity);
}

// Test case 3: Adding a stereo parity with a null central atom should throw an exception
@Test
void testAddStereo0D_NullCentralAtom() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    parity.setCentralAtom(null);
    assertThrows(NullPointerException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 4: Adding a stereo parity with less than 2 ligands should throw an exception
@Test
void testAddStereo0D_LessThan2Ligands() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    ligands.add(new JniInchiAtom());
    parity.setLigands(ligands);
    assertThrows(IllegalArgumentException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 5: Adding a stereo parity with more than 4 ligands should throw an exception
@Test
void testAddStereo0D_MoreThan4Ligands() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
        ligands.add(new JniInchiAtom());
    }
    parity.setLigands(ligands);
    assertThrows(IllegalArgumentException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 6: Adding a stereo parity with duplicate ligands should throw an exception
@Test
void testAddStereo0D_DuplicateLigands() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    JniInchiAtom ligand = new JniInchiAtom();
    ligands.add(ligand);
    ligands.add(ligand);
    parity.setLigands(ligands);
    assertThrows(IllegalArgumentException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 7: Adding a stereo parity with a null ligand should throw an exception
@Test
void testAddStereo0D_NullLigand() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    ligands.add(null);
    parity.setLigands(ligands);
    assertThrows(NullPointerException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 8: Adding a stereo parity with a null stereo element should throw an exception
@Test
void testAddStereo0D_NullStereoElement() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    ligands.add(new JniInchiAtom());
    parity.setLigands(ligands);
    parity.setStereoElement(null);
    assertThrows(NullPointerException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 9: Adding a stereo parity with a null stereo type should throw an exception
@Test
void testAddStereo0D_NullStereoType() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    ligands.add(new JniInchiAtom());
    parity.setLigands(ligands);
    parity.setStereoType(null);
    assertThrows(NullPointerException.class, () -> {
        structure.addStereo0D(parity);
    });
}

// Test case 10: Adding a stereo parity with a valid stereo parity should return the same parity
@Test
void testAddStereo0D_ValidParity() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D parity = new JniInchiStereo0D();
    JniInchiAtom centralAtom = new JniInchiAtom();
    parity.setCentralAtom(centralAtom);
    List<JniInchiAtom> ligands = new ArrayList<>();
    ligands.add(new JniInchiAtom());
    ligands.add(new JniInchiAtom());
    parity.setLigands(ligands);
    parity.setStereoElement("test");
    parity.setStereoType(JniInchiStereo0D.STEREO_TYPE_DOUBLE_ANTICLOCKWISE);
    JniInchiStereo0D addedParity = structure.addStereo0D(parity);
    assertEquals(parity, addedParity);
}