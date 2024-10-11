// Test case 1: Test if an empty path throws an IllegalArgumentException
@Test
void testEmptyPath() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IllegalArgumentException.class, () -> ftpClient.storeUnique("", true));
}

// Test case 2: Test if a path with no directory separator throws an IllegalArgumentException
@Test
void testNoDirectorySeparator() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IllegalArgumentException.class, () -> ftpClient.storeUnique("filename.txt", true));
}

// Test case 3: Test if a path with multiple consecutive directory separators throws an IllegalArgumentException
@Test
void testMultipleConsecutiveDirectorySeparators() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IllegalArgumentException.class, () -> ftpClient.storeUnique("dir1//dir2/filename.txt", true));
}

// Test case 4: Test if a path with a trailing directory separator throws an IllegalArgumentException
@Test
void testTrailingDirectorySeparator() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IllegalArgumentException.class, () -> ftpClient.storeUnique("dir1/dir2/", true));
}

// Test case 5: Test if a path with a non-existent directory throws an FTPException
@Test
void testNonExistentDirectory() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("nonexistent/dir/filename.txt", true));
}

// Test case 6: Test if a path with an existing directory but no write permission throws an FTPException
@Test
void testNoWritePermission() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("readonly/filename.txt", true));
}

// Test case 7: Test if a path with an existing directory and write permission returns a non-null OutputStream
@Test
void testValidPath() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("valid/dir/filename.txt", true);
    assertNotNull(outputStream);
}

// Test case 8: Test if calling storeUnique twice without closing the first OutputStream throws an IOException
@Test
void testConcurrentUploads() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream1 = ftpClient.storeUnique("concurrent/filename1.txt", false);
    assertThrows(IOException.class, () -> ftpClient.storeUnique("concurrent/filename2.txt", true));
    outputStream1.close();
}

// Test case 9: Test if calling storeUnique with last=true closes the FTPClient
@Test
void testLastTrue() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("last/filename.txt", true);
    assertTrue(ftpClient.isClosed());
    outputStream.close();
}

// Test case 10: Test if calling storeUnique with last=false does not close the FTPClient
@Test
void testLastFalse() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("notlast/filename.txt", false);
    assertFalse(ftpClient.isClosed());
    outputStream.close();
}
}