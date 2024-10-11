@Test
void testEmptyString() {
    assertEquals(0, Strlen.strlen(""));
}

@Test
void testSingleCharacterString() {
    assertEquals(1, Strlen.strlen("a"));
}

@Test
void testMultipleCharacterString() {
    assertEquals(5, Strlen.strlen("hello"));
}

@Test
void testStringWithSpaces() {
    assertEquals(11, Strlen.strlen("hello world"));
}

@Test
void testStringWithSpecialCharacters() {
    assertEquals(7, Strlen.strlen("héllo!"));
}

@Test
void testStringWithNumbers() {
    assertEquals(4, Strlen.strlen("1234"));
}

@Test
void testStringWithTabs() {
    assertEquals(8, Strlen.strlen("hello\tworld"));
}

@Test
void testStringWithNewLines() {
    assertEquals(12, Strlen.strlen("hello\nworld\n"));
}

@Test
void testStringWithNull() {
    assertThrows(NullPointerException.class, () -> Strlen.strlen(null));
}

@Test
void testStringWithMaxLength() {
    String maxString = new String(new char[Integer.MAX_VALUE - 1]).replace('\0', 'a');
    assertEquals(Integer.MAX_VALUE - 1, Strlen.strlen(maxString));
}
}