// Test case 1: Test if the method returns an InputSource object
@Test
void testFileToInputSourceReturnsInputSource() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertNotNull(inputSource);
}

// Test case 2: Test if the method throws FileNotFoundException for a non-existent file
@Test
void testFileToInputSourceThrowsFileNotFoundException() {
    File file = new File("non-existent.xml");
    assertThrows(FileNotFoundException.class, () -> {
        TreeBuilder.fileToInputSource(file);
    });
}

// Test case 3: Test if the method throws IOException for a directory
@Test
void testFileToInputSourceThrowsIOExceptionForDirectory() {
    File file = new File(".");
    assertThrows(IOException.class, () -> {
        TreeBuilder.fileToInputSource(file);
    });
}

// Test case 4: Test if the method sets the systemId correctly for a file in the root directory
@Test
void testFileToInputSourceSetsSystemIdForRootFile() throws FileNotFoundException, IOException {
    File file = new File("/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///test.xml", inputSource.getSystemId());
}

// Test case 5: Test if the method sets the systemId correctly for a file in a subdirectory
@Test
void testFileToInputSourceSetsSystemIdForSubdirectoryFile() throws FileNotFoundException, IOException {
    File file = new File("src/test/resources/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///src/test/resources/test.xml", inputSource.getSystemId());
}

// Test case 6: Test if the method sets the systemId correctly for a file with spaces in the path
@Test
void testFileToInputSourceSetsSystemIdForFileWithSpaces() throws FileNotFoundException, IOException {
    File file = new File("test folder/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///test%20folder/test.xml", inputSource.getSystemId());
}

// Test case 7: Test if the method sets the systemId correctly for a file with special characters in the path
@Test
void testFileToInputSourceSetsSystemIdForFileWithSpecialCharacters() throws FileNotFoundException, IOException {
    File file = new File("test&file.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///test%26file.xml", inputSource.getSystemId());
}

// Test case 8: Test if the method sets the systemId correctly for a file with a relative path
@Test
void testFileToInputSourceSetsSystemIdForRelativePath() throws FileNotFoundException, IOException {
    File file = new File("src/test/resources/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///src/test/resources/test.xml", inputSource.getSystemId());
}

// Test case 9: Test if the method sets the systemId correctly for a file with an absolute path
@Test
void testFileToInputSourceSetsSystemIdForAbsolutePath() throws FileNotFoundException, IOException {
    File file = new File("/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals("file:///test.xml", inputSource.getSystemId());
}

// Test case 10: Test if the method throws FileNotFoundException for a directory with a trailing slash
@Test
void testFileToInputSourceThrowsFileNotFoundExceptionForDirectoryWithTrailingSlash() {
    File file = new File(".");
    assertThrows(FileNotFoundException.class, () -> {
        TreeBuilder.fileToInputSource(new File(file.getAbsolutePath() + File.separator));
    });
}