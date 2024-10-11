@Test
void testValidDate() {
    assertTrue(DateTools.isValidDate("2021-05-20", "yyyy-MM-dd"));
}

@Test
void testInvalidDate() {
    assertFalse(DateTools.isValidDate("2021-13-01", "yyyy-MM-dd"));
}

@Test
void testInvalidFormat() {
    assertFalse(DateTools.isValidDate("2021/05/20", "yyyy-MM-dd"));
}

@Test
void testNullDate() {
    assertFalse(DateTools.isValidDate(null, "yyyy-MM-dd"));
}

@Test
void testNullFormat() {
    assertFalse(DateTools.isValidDate("2021-05-20", null));
}

@Test
void testEmptyDate() {
    assertFalse(DateTools.isValidDate("", "yyyy-MM-dd"));
}

@Test
void testEmptyFormat() {
    assertFalse(DateTools.isValidDate("2021-05-20", ""));
}

@Test
void testInvalidDateAndFormat() {
    assertFalse(DateTools.isValidDate("2021/13/01", "yyyy-MM-dd"));
}

@Test
void testValidDateAndFormat() {
    assertTrue(DateTools.isValidDate("2021/05/20", "yyyy/MM/dd"));
}

@Test
void testValidDateAndFormatWithTime() {
    assertTrue(DateTools.isValidDate("2021-05-20 12:30:45", "yyyy-MM-dd HH:mm:ss"));
}
}