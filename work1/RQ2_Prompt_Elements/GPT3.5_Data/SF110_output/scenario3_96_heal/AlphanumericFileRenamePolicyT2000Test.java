// Test case 1: Test renaming a file with only alphanumeric characters
@Test
public void testRenameAlphanumeric() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test123.txt");
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 2: Test renaming a file with non-alphanumeric characters
@Test
public void testRenameNonAlphanumeric() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&.txt");
    File renamed = policy.rename(original);
    assertEquals("test.txt", renamed.getName());
}

// Test case 3: Test renaming a file with spaces
@Test
public void testRenameSpaces() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test file.txt");
    File renamed = policy.rename(original);
    assertEquals("test_file.txt", renamed.getName());
}

// Test case 4: Test renaming a file with underscores
@Test
public void testRenameUnderscores() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test_file.txt");
    File renamed = policy.rename(original);
    assertEquals("test_file.txt", renamed.getName());
}

// Test case 5: Test renaming a file with dots
@Test
public void testRenameDots() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test.file.txt");
    File renamed = policy.rename(original);
    assertEquals("test.file.txt", renamed.getName());
}

// Test case 6: Test renaming a file with mixed alphanumeric and non-alphanumeric characters
@Test
public void testRenameMixed() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&123.txt");
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 7: Test renaming a file with no extension
@Test
public void testRenameNoExtension() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test");
    File renamed = policy.rename(original);
    assertEquals("test", renamed.getName());
}

// Test case 8: Test renaming a file with multiple extensions
@Test
public void testRenameMultipleExtensions() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test.file.txt.jpg");
    File renamed = policy.rename(original);
    assertEquals("test.file.txt.jpg", renamed.getName());
}

// Test case 9: Test renaming a file with a long name
@Test
public void testRenameLongName() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("this_is_a_very_long_file_name_with_lots_of_characters_and_numbers_1234567890.txt");
    File renamed = policy.rename(original);
    assertEquals("this_is_a_very_long_file_name_with_lots_of_characters_and_numbers_1234567890.txt", renamed.getName());
}

// Test case 10: Test renaming a file with a single character name
@Test
public void testRenameSingleCharacter() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("a");
    File renamed = policy.rename(original);
    assertEquals("a", renamed.getName());
}
}