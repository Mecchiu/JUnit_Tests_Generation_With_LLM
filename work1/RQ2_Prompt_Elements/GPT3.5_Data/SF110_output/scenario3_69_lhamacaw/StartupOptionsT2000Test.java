@Test
void testUseDemoReturnsTrue() {
    StartupOptions options = new StartupOptions();
    assertTrue(options.useDemo());
}

@Test
void testUseDemoReturnsFalse() {
    StartupOptions options = new StartupOptions();
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsTrueWhenSetToTrue() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo(true);
    assertTrue(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToFalse() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo(false);
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToNull() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo(null);
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToEmptyString() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo("");
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToWhitespaceString() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo("   ");
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsTrueWhenSetToTrueString() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo("true");
    assertTrue(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToFalseString() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo("false");
    assertFalse(options.useDemo());
}

@Test
void testUseDemoReturnsFalseWhenSetToInvalidString() {
    StartupOptions options = new StartupOptions();
    options.setUseDemo("invalid");
    assertFalse(options.useDemo());
}
}