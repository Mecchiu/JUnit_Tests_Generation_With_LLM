@Test
void testParseNull() {
    assertNull(DateTools.parse(null));
}

@Test
void testParseEmptyString() {
    assertNull(DateTools.parse(""));
}

@Test
void testParseInvalidFormat() {
    assertNull(DateTools.parse("2021-13-01"));
}

@Test
void testParseValidFormat1() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date expected = formatter.parse("2021-01-01");
    assertEquals(expected, DateTools.parse("2021-01-01"));
}

@Test
void testParseValidFormat2() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date expected = formatter.parse("01/01/2021");
    assertEquals(expected, DateTools.parse("01/01/2021"));
}

@Test
void testParseValidFormat3() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date expected = formatter.parse("01/01/2021");
    assertEquals(expected, DateTools.parse("01/01/2021"));
}

@Test
void testParseValidFormat4() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    Date expected = formatter.parse("2021-01-01T12:00:00.000-0500");
    assertEquals(expected, DateTools.parse("2021-01-01T12:00:00.000-0500"));
}

@Test
void testParseValidFormat5() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    Date expected = formatter.parse("2021-01-01T12:00:00.000Z");
    assertEquals(expected, DateTools.parse("2021-01-01T12:00:00.000Z"));
}

@Test
void testParseValidFormat6() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
    Date expected = formatter.parse("Fri, 01 Jan 2021 12:00:00 GMT");
    assertEquals(expected, DateTools.parse("Fri, 01 Jan 2021 12:00:00 GMT"));
}

@Test
void testParseValidFormat7() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    Date expected = formatter.parse("2021-01-01T12:00:00.000");
    assertEquals(expected, DateTools.parse("2021-01-01T12:00:00.000"));
}

@Test
void testParseValidFormat8() throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    Date expected = formatter.parse("2021-01-01T12:00:00");
    assertEquals(expected, DateTools.parse("2021-01-01T12:00:00"));
}
}