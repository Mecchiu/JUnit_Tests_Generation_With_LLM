@Test
void testValidDate() throws ParseException {
    assertTrue(DateTools.isValidDate("2021-01-01"));
    assertTrue(DateTools.isValidDate("01/01/2021"));
    assertTrue(DateTools.isValidDate("2021/01/01"));
    assertTrue(DateTools.isValidDate("01-01-2021"));
    assertTrue(DateTools.isValidDate("2021-01-01T00:00:00Z"));
    assertTrue(DateTools.isValidDate("2021-01-01T00:00:00.000Z"));
}

@Test
void testInvalidDate() throws ParseException {
    assertFalse(DateTools.isValidDate("2021-13-01"));
    assertFalse(DateTools.isValidDate("2021/13/01"));
    assertFalse(DateTools.isValidDate("2021-01-32"));
    assertFalse(DateTools.isValidDate("2021/01/32"));
    assertFalse(DateTools.isValidDate("2021-01-01T24:00:00Z"));
    assertFalse(DateTools.isValidDate("2021-01-01T00:60:00Z"));
    assertFalse(DateTools.isValidDate("2021-01-01T00:00:60Z"));
    assertFalse(DateTools.isValidDate("not a date"));
    assertFalse(DateTools.isValidDate(null));
}
}