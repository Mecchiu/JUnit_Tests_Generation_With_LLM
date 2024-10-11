// Test case 1: Test renaming a file with only alphanumeric characters
@Test
void testRenameOnlyAlphanumeric() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test123.txt");
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 2: Test renaming a file with special characters
@Test
void testRenameWithSpecialCharacters() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&*().txt");
    File renamed = policy.rename(original);
    assertEquals("test.txt", renamed.getName());
}

// Test case 3: Test renaming a file with spaces
@Test
void testRenameWithSpaces() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test file.txt");
    File renamed = policy.rename(original);
    assertEquals("testfile.txt", renamed.getName());
}

// Test case 4: Test renaming a file with mixed alphanumeric and special characters
@Test
void testRenameWithMixedCharacters() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("test!@#$%^&*()123.txt");
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 5: Test renaming a file with only special characters
@Test
void testRenameOnlySpecialCharacters() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("!@#$%^&*().txt");
    File renamed = policy.rename(original);
    assertEquals(".txt", renamed.getName());
}

// Test case 6: Test renaming a file with only spaces
@Test
void testRenameOnlySpaces() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("   ");
    File renamed = policy.rename(original);
    assertEquals("", renamed.getName());
}

// Test case 7: Test renaming a file with a long name
@Test
void testRenameLongName() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("thisisaverylongfilenamethatneedstoberenamed.txt");
    File renamed = policy.rename(original);
    assertEquals("thisisaverylongfilenamethatneedstoberenamed.txt", renamed.getName());
}

// Test case 8: Test renaming a file with a single character name
@Test
void testRenameSingleCharacter() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("a.txt");
    File renamed = policy.rename(original);
    assertEquals("a.txt", renamed.getName());
}

// Test case 9: Test renaming a file with a null name
@Test
void testRenameNullName() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("");
    File renamed = policy.rename(original);
    assertEquals("", renamed.getName());
}

// Test case 10: Test renaming a file with a directory path
@Test
void testRenameDirectoryPath() {
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File original = new File("/path/to/directory/test.txt");
    File renamed = policy.rename(original);
    assertEquals("test.txt", renamed.getName());
}
}