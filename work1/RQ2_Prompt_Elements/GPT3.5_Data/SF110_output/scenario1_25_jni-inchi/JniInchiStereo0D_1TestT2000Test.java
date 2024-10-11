// Test case 1: Test if the method returns a non-null object
@Test
public void testCreateNewDoublebondStereo0DNotNull() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertNotNull(stereo);
}

// Test case 2: Test if the method returns an object of type JniInchiStereo0D
@Test
public void testCreateNewDoublebondStereo0DType() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertTrue(stereo instanceof JniInchiStereo0D);
}

// Test case 3: Test if the method sets the at0 atom correctly
@Test
public void testCreateNewDoublebondStereo0DAt0() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(at0, stereo.getAtom0());
}

// Test case 4: Test if the method sets the at1 atom correctly
@Test
public void testCreateNewDoublebondStereo0DAt1() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(at1, stereo.getAtom1());
}

// Test case 5: Test if the method sets the at2 atom correctly
@Test
public void testCreateNewDoublebondStereo0DAt2() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(at2, stereo.getAtom2());
}

// Test case 6: Test if the method sets the at3 atom correctly
@Test
public void testCreateNewDoublebondStereo0DAt3() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(at3, stereo.getAtom3());
}

// Test case 7: Test if the method sets the stereo type correctly
@Test
public void testCreateNewDoublebondStereo0DStereoType() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
}

// Test case 8: Test if the method sets the parity correctly
@Test
public void testCreateNewDoublebondStereo0DParity() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
}

// Test case 9: Test if the method throws an exception when at0 is null
@Test
public void testCreateNewDoublebondStereo0DAt0Null() {
    JniInchiAtom at0 = null;
    JniInchiAtom at1 = new JniInchiAtom(2, "C");
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    });
}

// Test case 10: Test if the method throws an exception when at1 is null
@Test
public void testCreateNewDoublebondStereo0DAt1Null() {
    JniInchiAtom at0 = new JniInchiAtom(1, "C");
    JniInchiAtom at1 = null;
    JniInchiAtom at2 = new JniInchiAtom(3, "C");
    JniInchiAtom at3 = new JniInchiAtom(4, "C");
    assertThrows(NullPointerException.class, () -> {
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
    });
}
}