// Test case 1: Test renaming a file with only alphanumeric characters
@Test
void testRenameOnlyAlphanumeric() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test123.txt");
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 2: Test renaming a file with non-alphanumeric characters
@Test
void testRenameWithNonAlphanumeric() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&*()_+-=[]{}|;':\",./<>?.txt");
    File renamed = policy.rename(original);
    assertEquals("test_+.txt", renamed.getName());
}

// Test case 3: Test renaming a file with spaces
@Test
void testRenameWithSpaces() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test file.txt");
    File renamed = policy.rename(original);
    assertEquals("test_file.txt", renamed.getName());
}

// Test case 4: Test renaming a file with dots
@Test
void testRenameWithDots() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test.file.txt");
    File renamed = policy.rename(original);
    assertEquals("test.file.txt", renamed.getName());
}

// Test case 5: Test renaming a file with underscores
@Test
void testRenameWithUnderscores() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test_file.txt");
    File renamed = policy.rename(original);
    assertEquals("test_file.txt", renamed.getName());
}

// Test case 6: Test renaming a file with a mix of alphanumeric and non-alphanumeric characters
@Test
void testRenameWithMix() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&*()_+-=[]{}|;':\",./<>?123.txt");
    File renamed = policy.rename(original);
    assertEquals("test_+.123.txt", renamed.getName());
}

// Test case 7: Test renaming a file with a long name
@Test
void testRenameWithLongName() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("this_is_a_very_long_file_name_with_lots_of_characters_and_numbers_1234567890.txt");
    File renamed = policy.rename(original);
    assertEquals("this_is_a_very_long_file_name_with_lots_of_characters_and_numbers_1234567890.txt", renamed.getName());
}

// Test case 8: Test renaming a file with a single character name
@Test
void testRenameWithSingleCharacter() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("a.txt");
    File renamed = policy.rename(original);
    assertEquals("a.txt", renamed.getName());
}

// Test case 9: Test renaming a file with no extension
@Test
void testRenameWithNoExtension() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("testfile");
    File renamed = policy.rename(original);
    assertEquals("testfile", renamed.getName());
}

// Test case 10: Test renaming a file with multiple dots in the name
@Test
void testRenameWithMultipleDots() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test.file.name.txt");
    File renamed = policy.rename(original);
    assertEquals("test.file.name.txt", renamed.getName());
}
}