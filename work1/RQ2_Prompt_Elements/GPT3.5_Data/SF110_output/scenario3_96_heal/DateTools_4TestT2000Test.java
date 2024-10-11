@Test
void testValidDate() {
    assertTrue(DateTools.isValidDate("2021-01-01"));
    assertTrue(DateTools.isValidDate("2021-12-31"));
    assertTrue(DateTools.isValidDate("2021-02-28"));
    assertTrue(DateTools.isValidDate("2020-02-29"));
}

@Test
void testInvalidDate() {
    assertFalse(DateTools.isValidDate("2021-00-01"));
    assertFalse(DateTools.isValidDate("2021-13-31"));
    assertFalse(DateTools.isValidDate("2021-02-29"));
    assertFalse(DateTools.isValidDate("2021-02-30"));
    assertFalse(DateTools.isValidDate("2021-02-"));
    assertFalse(DateTools.isValidDate("2021-02-31"));
    assertFalse(DateTools.isValidDate("2021-02-31T12:00:00"));
    assertFalse(DateTools.isValidDate("2021-02-31 12:00:00"));
    assertFalse(DateTools.isValidDate("2021-02-31 12:00"));
} 
}