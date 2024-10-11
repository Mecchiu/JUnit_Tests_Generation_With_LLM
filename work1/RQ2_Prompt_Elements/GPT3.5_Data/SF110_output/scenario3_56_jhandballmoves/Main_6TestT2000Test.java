// Test case 1: Test if getVersion() returns a non-null value
@Test
void testGetVersionNotNull() {
    assertNotNull(Main.getVersion());
}

// Test case 2: Test if getVersion() returns a String
@Test
void testGetVersionReturnType() {
    assertTrue(Main.getVersion() instanceof String);
}

// Test case 3: Test if getVersion() returns a non-empty String
@Test
void testGetVersionNotEmpty() {
    assertFalse(Main.getVersion().isEmpty());
}

// Test case 4: Test if getVersion() returns a String with at least one digit
@Test
void testGetVersionContainsDigit() {
    assertTrue(Main.getVersion().matches(".*\\d+.*"));
}

// Test case 5: Test if getVersion() returns a String with the correct format (x.y.z)
@Test
void testGetVersionFormat() {
    assertTrue(Main.getVersion().matches("\\d+\\.\\d+\\.\\d+"));
}

// Test case 6: Test if getVersion() returns the correct version number (1.0.0)
@Test
void testGetVersionCorrectVersion() {
    assertEquals("1.0.0", Main.getVersion());
}

// Test case 7: Test if getVersion() returns a String with no leading or trailing spaces
@Test
void testGetVersionNoSpaces() {
    assertEquals(Main.getVersion().trim(), Main.getVersion());
}

// Test case 8: Test if getVersion() returns a String with no leading zeros in each number
@Test
void testGetVersionNoLeadingZeros() {
    assertFalse(Main.getVersion().matches("\\d+\\.0\\d+\\.0\\d+"));
}

// Test case 9: Test if getVersion() returns a String with no more than one dot between each number
@Test
void testGetVersionOneDotBetweenNumbers() {
    assertFalse(Main.getVersion().matches("\\d+\\.\\d+\\.\\d+\\.\\d+"));
}

// Test case 10: Test if getVersion() returns a String with no letters or special characters
@Test
void testGetVersionNoLettersOrSpecialCharacters() {
    assertTrue(Main.getVersion().matches("\\d+\\.\\d+\\.\\d+"));
}