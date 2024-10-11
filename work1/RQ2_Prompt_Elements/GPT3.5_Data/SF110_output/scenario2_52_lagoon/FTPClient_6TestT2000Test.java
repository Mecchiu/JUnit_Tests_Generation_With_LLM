// Test case 1: Deleting an existing file should return true
@Test
void testDeleteFile_existingFile() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    boolean result = ftpClient.deleteFile("/path/to/file.txt");
    assertTrue(result);
    ftpClient.disconnect();
}

// Test case 2: Deleting a non-existing file should return false
@Test
void testDeleteFile_nonExistingFile() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    boolean result = ftpClient.deleteFile("/path/to/non-existing-file.txt");
    assertFalse(result);
    ftpClient.disconnect();
}

// Test case 3: Deleting a file in a non-existing directory should throw FTPException
@Test
void testDeleteFile_nonExistingDirectory() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    assertThrows(FTPException.class, () -> ftpClient.deleteFile("/non-existing-directory/file.txt"));
    ftpClient.disconnect();
}

// Test case 4: Deleting a file with invalid credentials should throw FTPException
@Test
void testDeleteFile_invalidCredentials() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    assertThrows(FTPException.class, () -> ftpClient.login("invalid-username", "invalid-password"));
    ftpClient.disconnect();
}

// Test case 5: Deleting a file when not connected should throw FTPException
@Test
void testDeleteFile_notConnected() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/file.txt"));
}

// Test case 6: Deleting a file when already in progress should throw FTPException
@Test
void testDeleteFile_inProgress() throws IOException, InterruptedException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    ftpClient.deleteFile("/path/to/file1.txt");
    assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/file2.txt"));
    ftpClient.disconnect();
}

// Test case 7: Deleting a file with a null pathname should throw NullPointerException
@Test
void testDeleteFile_nullPathname() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    assertThrows(NullPointerException.class, () -> ftpClient.deleteFile(null));
    ftpClient.disconnect();
}

// Test case 8: Deleting a file with an empty pathname should throw FTPException
@Test
void testDeleteFile_emptyPathname() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    assertThrows(FTPException.class, () -> ftpClient.deleteFile(""));
    ftpClient.disconnect();
}

// Test case 9: Deleting a file with a pathname containing spaces should throw FTPException
@Test
void testDeleteFile_pathnameWithSpaces() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/with spaces/file.txt"));
    ftpClient.disconnect();
}

// Test case 10: Deleting a file with a pathname containing non-ASCII characters should throw FTPException
@Test
void testDeleteFile_pathnameWithNonASCII() throws IOException {
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");
    assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/with-åäö/file.txt"));
    ftpClient.disconnect();
}