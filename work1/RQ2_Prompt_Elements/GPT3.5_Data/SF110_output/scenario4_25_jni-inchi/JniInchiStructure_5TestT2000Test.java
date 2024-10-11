// Test case 1: Test if getNumStereo0D() returns correct number of stereo parities
@Test
void testGetNumStereo0D() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    structure.addStereo0D(stereo2);
    assertEquals(2, structure.getNumStereo0D());
}

// Test case 2: Test if adding a stereo parity returns the correct parity
@Test
void testAddStereo0D() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo = new JniInchiStereo0D();
    JniInchiStereo0D addedStereo = structure.addStereo0D(stereo);
    assertEquals(stereo, addedStereo);
}

// Test case 3: Test if getting an atom at a valid index returns the correct atom
@Test
void testGetStereo0DValidIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    structure.addStereo0D(stereo2);
    assertEquals(stereo2, structure.getStereo0D(1));
}

// Test case 4: Test if getting an atom at an invalid index throws an IndexOutOfBoundsException
@Test
void testGetStereo0DInvalidIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    assertThrows(IndexOutOfBoundsException.class, () -> {
        structure.getStereo0D(0);
    });
}

// Test case 5: Test if setting the structure to a new structure updates the stereo parities
@Test
void testSetStructure() {
    JniInchiStructure structure1 = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    structure1.addStereo0D(stereo1);
    
    JniInchiStructure structure2 = new JniInchiStructure();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    structure2.addStereo0D(stereo2);
    
    structure1.setStructure(structure2);
    assertEquals(stereo2, structure1.getStereo0D(0));
}

// Test case 6: Test if getAtomIndex() returns the correct index of an atom
@Test
void testGetStereo0DIndex() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    structure.addStereo0D(stereo2);
    assertEquals(1, structure.getStereo0DIndex(stereo2));
}

// Test case 7: Test if getAtomIndex() returns -1 for an atom not in the structure
@Test
void testGetStereo0DIndexNotFound() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    assertEquals(-1, structure.getStereo0DIndex(stereo2));
}

// Test case 8: Test if adding multiple stereo parities using addStereo0D() adds all the parities
@Test
void testAddMultipleStereo0D() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    JniInchiStereo0D stereo3 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    structure.addStereo0D(stereo2);
    structure.addStereo0D(stereo3);
    assertEquals(3, structure.getNumStereo0D());
}

// Test case 9: Test if adding multiple stereo parities using addStereo0D() adds the correct parities
@Test
void testAddMultipleStereo0DCorrect() {
    JniInchiStructure structure = new JniInchiStructure();
    JniInchiStereo0D stereo1 = new JniInchiStereo0D();
    JniInchiStereo0D stereo2 = new JniInchiStereo0D();
    JniInchiStereo0D stereo3 = new JniInchiStereo0D();
    structure.addStereo0D(stereo1);
    structure.addStereo0D(stereo2);
    structure.addStereo0D(stereo3);
    assertEquals(stereo1, structure.getStereo0D(0));
    assertEquals(stereo2, structure.getStereo0D(1));
    assertEquals(stereo3, structure.getStereo0D(2));
}

// Test case 10: Test if adding an empty list of stereo parities does not change the number of stereo parities
@Test
void testAddEmptyStereo0DList() {
    JniInchiStructure structure = new JniInchiStructure();
    List<JniInchiStereo0D> stereoList = new ArrayList<>();
    structure.addStereo0D(stereoList.toArray(new JniInchiStereo0D[0]));
    assertEquals(0, structure.getNumStereo0D());
}