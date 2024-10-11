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

// Test case 4: Test if getVersion() returns a String with length greater than 0
@Test
void testGetVersionLength() {
    assertTrue(Main.getVersion().length() > 0);
}

// Test case 5: Test if getVersion() returns a String with length less than or equal to 10
@Test
void testGetVersionMaxLength() {
    assertTrue(Main.getVersion().length() <= 10);
}

// Test case 6: Test if getVersion() returns the expected version number
@Test
void testGetVersionExpectedValue() {
    assertEquals("1.0.5", Main.getVersion());
}

// Test case 7: Test if getVersion() returns a String with no leading or trailing whitespaces
@Test
void testGetVersionNoWhitespace() {
    assertEquals(Main.getVersion().trim(), Main.getVersion());
}

// Test case 8: Test if getVersion() returns a String in the correct format
@Test
void testGetVersionFormat() {
    assertTrue(Main.getVersion().matches("\\d+\\.\\d+\\.\\d+"));
}

// Test case 9: Test if getVersion() returns a String with no leading zeros in each version number
@Test
void testGetVersionNoLeadingZeros() {
    String[] versionNumbers = Main.getVersion().split("\\.");
    for (String number : versionNumbers) {
        assertFalse(number.matches("^0\\d+"));
    }
}

// Test case 10: Test if getVersion() returns a String with only digits and dots
@Test
void testGetVersionOnlyDigitsAndDots() {
    assertTrue(Main.getVersion().matches("[\\d\\.]+"));
}