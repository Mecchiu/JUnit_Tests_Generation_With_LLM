@Test
void testValidDate() throws ParseException {
    String dateString = "2021-05-20";
    String format = "yyyy-MM-dd";
    assertTrue(DateTools.isValidDate(dateString, format));
}

@Test
void testInvalidDate() throws ParseException {
    String dateString = "2021-05-32";
    String format = "yyyy-MM-dd";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testInvalidFormat() throws ParseException {
    String dateString = "2021-05-20";
    String format = "dd-MM-yyyy";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testNullDate() throws ParseException {
    String dateString = null;
    String format = "yyyy-MM-dd";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testNullFormat() throws ParseException {
    String dateString = "2021-05-20";
    String format = null;
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testEmptyDate() throws ParseException {
    String dateString = "";
    String format = "yyyy-MM-dd";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testEmptyFormat() throws ParseException {
    String dateString = "2021-05-20";
    String format = "";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testInvalidDateAndFormat() throws ParseException {
    String dateString = "2021-05-32";
    String format = "dd-MM-yyyy";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testValidDateAndInvalidFormat() throws ParseException {
    String dateString = "2021-05-20";
    String format = "dd-MM-yyyy";
    assertFalse(DateTools.isValidDate(dateString, format));
}

@Test
void testInvalidDateAndValidFormat() throws ParseException {
    String dateString = "2021-05-32";
    String format = "yyyy-MM-dd";
    assertFalse(DateTools.isValidDate(dateString, format));
}

}