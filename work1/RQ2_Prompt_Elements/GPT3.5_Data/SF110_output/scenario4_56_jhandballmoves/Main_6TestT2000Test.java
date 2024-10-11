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

// Test case 6: Test if getVersion() returns the correct version number
@Test
void testGetVersionCorrectVersion() {
    assertEquals("1.0.0", Main.getVersion());
}

// Test case 7: Test if getVersion() returns the same value when called multiple times
@Test
void testGetVersionConsistency() {
    String version1 = Main.getVersion();
    String version2 = Main.getVersion();
    assertEquals(version1, version2);
}

// Test case 8: Test if getVersion() returns a String with no leading or trailing spaces
@Test
void testGetVersionNoSpaces() {
    assertFalse(Main.getVersion().startsWith(" "));
    assertFalse(Main.getVersion().endsWith(" "));
}

// Test case 9: Test if getVersion() returns a String with no leading or trailing tabs
@Test
void testGetVersionNoTabs() {
    assertFalse(Main.getVersion().startsWith("\t"));
    assertFalse(Main.getVersion().endsWith("\t"));
}

// Test case 10: Test if getVersion() returns a String with no leading or trailing newlines
@Test
void testGetVersionNoNewlines() {
    assertFalse(Main.getVersion().startsWith("\n"));
    assertFalse(Main.getVersion().endsWith("\n"));
}