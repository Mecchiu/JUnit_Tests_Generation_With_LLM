// Test case 1: Test if storeUnique method returns a non-null OutputStream
@Test
void testStoreUniqueReturnsNonNull() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/");
    assertNotNull(outputStream);
}

// Test case 2: Test if storeUnique method creates a new file
@Test
void testStoreUniqueCreatesNewFile() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test.txt");
    outputStream.write("test".getBytes());
    outputStream.close();

    // Check if file exists
    URL url = new URL("ftp://localhost/test.txt");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    assertNotNull(inputStream);
}

// Test case 3: Test if storeUnique method creates directories as necessary
@Test
void testStoreUniqueCreatesDirectories() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/dir1/dir2/test.txt");
    outputStream.write("test".getBytes());
    outputStream.close();

    // Check if directories and file exist
    URL url = new URL("ftp://localhost/dir1/dir2/test.txt");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    assertNotNull(inputStream);
}

// Test case 4: Test if storeUnique method throws FTPException when path does not end with '/'
@Test
void testStoreUniqueThrowsFTPExceptionWhenPathDoesNotEndWithSlash() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test"));
}

// Test case 5: Test if storeUnique method throws FTPException when file already exists
@Test
void testStoreUniqueThrowsFTPExceptionWhenFileExists() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream1 = ftpClient.storeUnique("/test.txt");
    outputStream1.write("test".getBytes());
    outputStream1.close();

    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test.txt"));
}

// Test case 6: Test if storeUnique method throws IOException when unable to write to OutputStream
@Test
void testStoreUniqueThrowsIOExceptionWhenUnableToWrite() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test.txt");
    outputStream.write("test".getBytes());
    outputStream.close();

    assertThrows(IOException.class, () -> outputStream.write("test".getBytes()));
}

// Test case 7: Test if storeUnique method throws IOException when unable to close OutputStream
@Test
void testStoreUniqueThrowsIOExceptionWhenUnableToClose() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test.txt");
    outputStream.write("test".getBytes());

    assertThrows(IOException.class, () -> outputStream.close());
}

// Test case 8: Test if storeUnique method throws FTPException when unable to connect to FTP server
@Test
void testStoreUniqueThrowsFTPExceptionWhenUnableToConnect() {
    FTPClient ftpClient = new FTPClient();
    ftpClient = new FTPClient("invalid.host.com", 21, "username", "password");
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test.txt"));
}

// Test case 9: Test if storeUnique method throws FTPException when unable to login to FTP server
@Test
void testStoreUniqueThrowsFTPExceptionWhenUnableToLogin() {
    FTPClient ftpClient = new FTPClient();
    ftpClient = new FTPClient("localhost", 21, "invalid_username", "invalid_password");
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/test.txt"));
}

// Test case 10: Test if storeUnique method throws FTPException when unable to change working directory
@Test
void testStoreUniqueThrowsFTPExceptionWhenUnableToChangeWorkingDirectory() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.storeUnique("/test.txt");
    outputStream.write("test".getBytes());
    outputStream.close();

    ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.storeUnique("/invalid_dir/test.txt"));
}