// Test case 1: Test if method returns an InputSource object
@Test
public void testFileToInputSourceReturnsInputSource() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertNotNull(inputSource);
}

// Test case 2: Test if method throws FileNotFoundException when file doesn't exist
@Test
public void testFileToInputSourceThrowsFileNotFoundExceptionWhenFileDoesNotExist() {
    File file = new File("nonexistent.xml");
    assertThrows(FileNotFoundException.class, () -> {
        TreeBuilder.fileToInputSource(file);
    });
}

// Test case 3: Test if method throws IOException when some I/O error occurs
@Test
public void testFileToInputSourceThrowsIOExceptionWhenIOErrorOccurs() {
    File file = new File("test.xml");
    file.setReadOnly();
    assertThrows(IOException.class, () -> {
        TreeBuilder.fileToInputSource(file);
    });
}

// Test case 4: Test if method sets the system ID of the InputSource to the absolute path of the file
@Test
public void testFileToInputSourceSetsSystemIDToAbsolutePathOfFile() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertEquals(file.getAbsolutePath(), inputSource.getSystemId());
}

// Test case 5: Test if method sets the byte stream of the InputSource to a FileInputStream of the file
@Test
public void testFileToInputSourceSetsByteStreamToFileInputStream() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertTrue(inputSource.getByteStream() instanceof FileInputStream);
}

// Test case 6: Test if method sets the character stream of the InputSource to null
@Test
public void testFileToInputSourceSetsCharacterStreamToNull() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertNull(inputSource.getCharacterStream());
}

// Test case 7: Test if method sets the public ID of the InputSource to null
@Test
public void testFileToInputSourceSetsPublicIDToNull() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertNull(inputSource.getPublicId());
}

// Test case 8: Test if method sets the encoding of the InputSource to null
@Test
public void testFileToInputSourceSetsEncodingToNull() throws FileNotFoundException, IOException {
    File file = new File("test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(file);
    assertNull(inputSource.getEncoding());
}

// Test case 9: Test if method sets the system ID of the InputSource to the URL of the file when file is a URL
@Test
public void testFileToInputSourceSetsSystemIDToURLOfFileWhenFileIsURL() throws FileNotFoundException, IOException {
    URL url = new URL("http://example.com/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(new File(url.getFile()));
    assertEquals(url.toString(), inputSource.getSystemId());
}

// Test case 10: Test if method sets the byte stream of the InputSource to a URLConnection.getInputStream() when file is a URL
@Test
public void testFileToInputSourceSetsByteStreamToURLConnectionInputStreamWhenFileIsURL() throws FileNotFoundException, IOException {
    URL url = new URL("http://example.com/test.xml");
    InputSource inputSource = TreeBuilder.fileToInputSource(new File(url.getFile()));
    assertTrue(inputSource.getByteStream() instanceof URLConnectionInputStream);
}
}