// Test case 1: Test if the method returns an InputSource object
@Test
void testFileToInputSourceReturnsInputSource() throws IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertTrue(inputSource instanceof InputSource);
}

// Test case 2: Test if the method throws FileNotFoundException when the file doesn't exist
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileDoesNotExist() {
    File file = new File("nonexistent.xml");
    assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
}

// Test case 3: Test if the method throws IOException when some I/O error occurs
@Test
void testFileToInputSourceThrowsIOExceptionWhenIOErrorOccurs() {
    File file = new File("test.xml");
    file.setReadOnly();
    assertThrows(IOException.class, () -> TreeBuilder.fileToInputSource(file));
}

// Test case 4: Test if the method returns an InputSource with the correct system ID
@Test
void testFileToInputSourceReturnsInputSourceWithCorrectSystemID() throws IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file://" + file.getCanonicalPath().replace(File.separatorChar, '/'), inputSource.getSystemId());
}

// Test case 5: Test if the method throws FileNotFoundException when the file is a directory
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileIsDirectory() {
    File file = new File(".");
    assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
}

// Test case 6: Test if the method throws FileNotFoundException when the file is a symbolic link to a non-existent file
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileIsSymbolicLinkToNonexistentFile() throws IOException {
    File file = new File("test.xml");
    Files.createSymbolicLink(file.toPath(), Paths.get("nonexistent.xml"));
    assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
    Files.delete(file.toPath());
}

// Test case 7: Test if the method throws FileNotFoundException when the file is a symbolic link to a directory
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileIsSymbolicLinkToDirectory() throws IOException {
    File file = new File("test.xml");
    Files.createSymbolicLink(file.toPath(), Paths.get("."));
    assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
    Files.delete(file.toPath());
}

// Test case 8: Test if the method throws FileNotFoundException when the file is a symbolic link to a file in a non-existent directory
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileIsSymbolicLinkToFileInNonexistentDirectory() throws IOException {
    File file = new File("test.xml");
    Files.createSymbolicLink(file.toPath(), Paths.get("nonexistent/test.xml"));
    assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
    Files.delete(file.toPath());
}

// Test case 9: Test if the method returns an InputSource with the correct system ID when the file path contains spaces
@Test
void testFileToInputSourceReturnsInputSourceWithCorrectSystemIDWhenFilePathContainsSpaces() throws IOException {
    File file = new File("test file.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file://" + file.getCanonicalPath().replace(File.separatorChar, '/'), inputSource.getSystemId());
}

// Test case 10: Test if the method returns an InputSource with the correct system ID when the file path contains non-ASCII characters
@Test
void testFileToInputSourceReturnsInputSourceWithCorrectSystemIDWhenFilePathContainsNonASCIICharacters() throws IOException {
    File file = new File("test-äöü.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file://" + file.getCanonicalPath().replace(File.separatorChar, '/'), inputSource.getSystemId());
}
}