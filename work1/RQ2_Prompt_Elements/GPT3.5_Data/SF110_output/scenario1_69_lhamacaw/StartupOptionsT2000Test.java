@Test
void testUseDemo() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setUseDemo(false);
    assertFalse(options.useDemo()); // Test setting value to false
}

@Test
void testUseDemoMultipleTimes() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    assertTrue(options.useDemo()); // Test getting value multiple times

    options.setUseDemo(false);
    assertFalse(options.useDemo()); // Test setting value to false

    assertFalse(options.useDemo()); // Test getting value multiple times
}

@Test
void testUseDemoWithOtherOptions() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setUseDemo(false);
    assertFalse(options.useDemo()); // Test setting value to false

    // Test other options
    options.setOption1("value1");
    assertEquals("value1", options.getOption1());

    options.setOption2("value2");
    assertEquals("value2", options.getOption2());
}

@Test
void testUseDemoWithNullOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setOption1(null);
    assertNull(options.getOption1()); // Test setting null value
}

@Test
void testUseDemoWithEmptyOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setOption1("");
    assertEquals("", options.getOption1()); // Test setting empty value
}

@Test
void testUseDemoWithWhitespaceOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setOption1("   ");
    assertEquals("   ", options.getOption1()); // Test setting whitespace value
}

@Test
void testUseDemoWithLongOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    String longOption = "abcdefghijklmnopqrstuvwxyz";
    options.setOption1(longOption);
    assertEquals(longOption, options.getOption1()); // Test setting long value
}

@Test
void testUseDemoWithSpecialCharacterOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    String specialOption = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";
    options.setOption1(specialOption);
    assertEquals(specialOption, options.getOption1()); // Test setting special character value
}

@Test
void testUseDemoWithUnicodeOption() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    String unicodeOption = "こんにちは世界";
    options.setOption1(unicodeOption);
    assertEquals(unicodeOption, options.getOption1()); // Test setting unicode value
}

@Test
void testUseDemoWithMultipleOptions() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo()); // Test default value

    options.setUseDemo(true);
    assertTrue(options.useDemo()); // Test setting value to true

    options.setOption1("value1");
    assertEquals("value1", options.getOption1()); // Test setting option1

    options.setOption2("value2");
    assertEquals("value2", options.getOption2()); // Test setting option2
}
}