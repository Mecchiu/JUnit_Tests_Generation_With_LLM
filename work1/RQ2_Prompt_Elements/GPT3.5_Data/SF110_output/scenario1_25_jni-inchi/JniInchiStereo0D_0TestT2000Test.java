// Test case 1: Test if the method returns a non-null object
@Test
public void testCreateNewTetrahedralStereo0DNotNull() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
}

// Test case 2: Test if the method returns an object of type JniInchiStereo0D
@Test
public void testCreateNewTetrahedralStereo0DType() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertTrue(stereo instanceof JniInchiStereo0D);
}

// Test case 3: Test if the method sets the correct atom properties
@Test
public void testCreateNewTetrahedralStereo0DAtomProperties() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(atC, stereo.getCentralAtom());
    assertEquals(at0, stereo.getNeighbor(0));
    assertEquals(at1, stereo.getNeighbor(1));
    assertEquals(at2, stereo.getNeighbor(2));
    assertEquals(at3, stereo.getNeighbor(3));
}

// Test case 4: Test if the method sets the correct stereo type
@Test
public void testCreateNewTetrahedralStereo0DStereoType() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
}

// Test case 5: Test if the method sets the correct parity
@Test
public void testCreateNewTetrahedralStereo0DParity() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
}

// Test case 6: Test if the method throws an exception when the central atom is null
@Test
public void testCreateNewTetrahedralStereo0DCentralAtomNull() {
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(null, at0, at1, at2, at3, INCHI_PARITY.EVEN);
    });
}

// Test case 7: Test if the method throws an exception when any of the neighbor atoms is null
@Test
public void testCreateNewTetrahedralStereo0DNeighborAtomNull() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, null, at1, at2, at3, INCHI_PARITY.EVEN);
    });
}

// Test case 8: Test if the method throws an exception when the number of neighbor atoms is not 4
@Test
public void testCreateNewTetrahedralStereo0DNeighborAtomCount() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, at3, INCHI_PARITY.EVEN);
    });
}

// Test case 9: Test if the method throws an exception when the parity is null
@Test
public void testCreateNewTetrahedralStereo0DParityNull() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "H");
    JniInchiAtom at3 = new JniInchiAtom(5, "H");
    assertThrows(IllegalArgumentException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, null);
    });
}

// Test case 10: Test if the method throws an exception when the stereo type is not tetrahedral
@Test
public void testCreateNewTetrahedralStereo0DStereoTypeNotTetrahedral() {
    JniInchiAtom atC = new JniInchiAtom(1, "C");
    JniInchiAtom at0 = new JniInchiAtom(2, "H");
    JniInchiAtom at1 = new JniInchiAtom(3, "H");
    JniInchiAtom at2 = new JniInchiAtom(4, "