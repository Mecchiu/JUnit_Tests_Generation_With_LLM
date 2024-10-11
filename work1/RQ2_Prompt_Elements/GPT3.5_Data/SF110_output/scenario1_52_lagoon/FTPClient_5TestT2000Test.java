// Test case 1: Test if method returns an OutputStream object
@Test
void testStoreUniqueReturnsOutputStream() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test", true);
    assertNotNull(outputStream);
}

// Test case 2: Test if method throws FTPException when path is null
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathIsNull() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique(null, true));
}

// Test case 3: Test if method throws FTPException when path is empty
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathIsEmpty() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("", true));
}

// Test case 4: Test if method throws FTPException when path contains spaces
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathContainsSpaces() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test folder", true));
}

// Test case 5: Test if method throws FTPException when path contains backslashes
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathContainsBackslashes() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("\\test", true));
}

// Test case 6: Test if method throws FTPException when path contains special characters
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathContainsSpecialCharacters() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test#file", true));
}

// Test case 7: Test if method throws FTPException when path does not exist
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathDoesNotExist() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/nonexistent/path", true));
}

// Test case 8: Test if method throws IOException when connection is lost
@Test
void testStoreUniqueThrowsIOExceptionWhenConnectionIsLost() throws FTPException {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IOException.class, () -> ftpClient.storeUnique("/test", true));
}

// Test case 9: Test if method returns an OutputStream object when last parameter is false
@Test
void testStoreUniqueReturnsOutputStreamWhenLastIsFalse() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test", false);
    assertNotNull(outputStream);
}

// Test case 10: Test if method returns an OutputStream object when path is root
@Test
void testStoreUniqueReturnsOutputStreamWhenPathIsRoot() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/", true);
    assertNotNull(outputStream);
}