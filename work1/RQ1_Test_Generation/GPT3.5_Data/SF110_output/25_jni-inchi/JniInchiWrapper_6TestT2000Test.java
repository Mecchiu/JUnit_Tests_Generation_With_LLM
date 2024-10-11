@Test
void testCheckInchi_NullInchi() {
    assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.checkInchi(null, true));
}

@Test
void testCheckInchi_EmptyInchi() {
    assertThrows(JniInchiException.class, () -> JniInchiWrapper.checkInchi("", true));
}

@Test
void testCheckInchi_ValidInchi_StrictTrue() {
    assertEquals(INCHI_STATUS.VALID, JniInchiWrapper.checkInchi("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12/h3-5,7-10H,1-2H2,(H,11,12)", true));
}

@Test
void testCheckInchi_ValidInchi_StrictFalse() {
    assertEquals(INCHI_STATUS.VALID, JniInchiWrapper.checkInchi("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12/h3-5,7-10H,1-2H2,(H,11,12)", false));
}

@Test
void testCheckInchi_InvalidInchi_StrictTrue() {
    assertEquals(INCHI_STATUS.INVALID, JniInchiWrapper.checkInchi("InvalidInChI", true));
}

@Test
void testCheckInchi_InvalidInchi_StrictFalse() {
    assertEquals(INCHI_STATUS.INVALID, JniInchiWrapper.checkInchi("InvalidInChI", false));
}

@Test
void testCheckInchi_UnknownInchi_StrictTrue() {
    assertEquals(INCHI_STATUS.UNKNOWN, JniInchiWrapper.checkInchi("UnknownInChI", true));
}

@Test
void testCheckInchi_UnknownInchi_StrictFalse() {
    assertEquals(INCHI_STATUS.UNKNOWN, JniInchiWrapper.checkInchi("UnknownInChI", false));
}

@Test
void testCheckInchi_NullInchi_StrictTrue() {
    assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.checkInchi(null, true));
}

@Test
void testCheckInchi_NullInchi_StrictFalse() {
    assertThrows(IllegalArgumentException.class, () -> JniInchiWrapper.checkInchi(null, false));
}