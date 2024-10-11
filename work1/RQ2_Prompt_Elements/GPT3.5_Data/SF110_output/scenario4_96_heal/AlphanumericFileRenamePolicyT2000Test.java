// Test case 1: Test if the method returns the same file if it contains only alphanumeric characters.
@Test
public void testRenameWithAlphanumericFilename() {
    File original = new File("test123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals(original, renamed);
}

// Test case 2: Test if the method removes non-alphanumeric characters from the filename.
@Test
public void testRenameWithNonAlphanumericFilename() {
    File original = new File("test#123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 3: Test if the method removes spaces from the filename.
@Test
public void testRenameWithSpaceInFilename() {
    File original = new File("test 123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 4: Test if the method removes underscores from the filename.
@Test
public void testRenameWithUnderscoreInFilename() {
    File original = new File("test_123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 5: Test if the method removes dots from the filename.
@Test
public void testRenameWithDotInFilename() {
    File original = new File("test.123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 6: Test if the method removes multiple non-alphanumeric characters from the filename.
@Test
public void testRenameWithMultipleNonAlphanumericCharactersInFilename() {
    File original = new File("test#1_2.3.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertEquals("test123.txt", renamed.getName());
}

// Test case 7: Test if the method returns a unique filename if the original filename already exists.
@Test
public void testRenameWithExistingFilename() {
    File original = new File("test123.txt");
    File existing = new File("test123.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertNotEquals(existing, renamed);
}

// Test case 8: Test if the method returns a unique filename if the original filename already exists with a different extension.
@Test
public void testRenameWithExistingFilenameAndDifferentExtension() {
    File original = new File("test123.txt");
    File existing = new File("test123.jpg");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertNotEquals(existing, renamed);
}

// Test case 9: Test if the method returns a unique filename if the original filename already exists with a different name.
@Test
public void testRenameWithExistingFilenameAndDifferentName() {
    File original = new File("test123.txt");
    File existing = new File("test456.txt");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertNotEquals(existing, renamed);
}

// Test case 10: Test if the method returns a unique filename if the original filename already exists with a different name and extension.
@Test
public void testRenameWithExistingFilenameAndDifferentNameAndExtension() {
    File original = new File("test123.txt");
    File existing = new File("test456.jpg");
    AlphanumericFileRenamePolicy policy = new AlphanumericFileRenamePolicy();
    File renamed = policy.rename(original);
    assertNotEquals(existing, renamed);
}
}