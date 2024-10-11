// Test case 1: Test appending to an existing file
@Test
void testAppendExistingFile() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Create a file to append to
    client.sendCommand("SITE MKDIR /path/to/directory");
    OutputStream outputStream = client.append("/path/to/directory/file.txt");

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Verify that the data was appended to the file
    InputStream inputStream = client.retrieve("/path/to/directory/file.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data, fileContent);

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 2: Test creating a new file
@Test
void testAppendNewFile() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Create a new file to append to
    OutputStream outputStream = client.append("/path/to/new/file.txt");

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Verify that the data was written to the file
    InputStream inputStream = client.retrieve("/path/to/new/file.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data, fileContent);

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 3: Test creating a new file in a non-existent directory
@Test
void testAppendNewFileInNonExistentDirectory() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Attempt to create a new file in a non-existent directory
    assertThrows(FTPException.class, () -> {
        client.append("/path/to/non/existent/directory/file.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 4: Test appending to a read-only file
@Test
void testAppendReadOnlyFile() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Create a read-only file to append to
    client.sendCommand("SITE MKDIR /path/to/directory");
    client.sendCommand("SITE CHMOD 444 /path/to/directory/file.txt");
    assertThrows(FTPException.class, () -> {
        client.append("/path/to/directory/file.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 5: Test appending to a file with insufficient permissions
@Test
void testAppendInsufficientPermissions() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Create a file to append to with insufficient permissions
    client.sendCommand("SITE MKDIR /path/to/directory");
    client.sendCommand("SITE CHMOD 200 /path/to/directory/file.txt");
    assertThrows(FTPException.class, () -> {
        client.append("/path/to/directory/file.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 6: Test appending to a file with invalid characters in the pathname
@Test
void testAppendInvalidPathname() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Attempt to append to a file with an invalid pathname
    assertThrows(FTPException.class, () -> {
        client.append("/path/with\\invalid/characters/file.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 7: Test appending to a file with a null pathname
@Test
void testAppendNullPathname() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Attempt to append to a file with a null pathname
    assertThrows(NullPointerException.class, () -> {
        client.append(null);
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 8: Test appending to a file with an empty pathname
@Test
void testAppendEmptyPathname() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Attempt to append to a file with an empty pathname
    assertThrows(FTPException.class, () -> {
        client.append("");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 9: Test appending to a file while another file transfer is in progress
@Test
void testAppendWhileTransferInProgress() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Start a file transfer
    OutputStream outputStream1 = client.append("/path/to/directory/file1.txt");

    // Attempt to start another file transfer while the first one is in progress
    assertThrows(FTPException.class, () -> {
        client.append("/path/to/directory/file2.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}

// Test case 10: Test appending to a file with a non-existent parent directory
@Test
void testAppendNonExistentParentDirectory() throws FTPException, IOException {
    // Connect to FTP server
    FTPClient client = new FTPClient();
    client.connect("ftp.example.com");
    client.login("username", "password");

    // Attempt to append to a file with a non-existent parent directory
    assertThrows(FTPException.class, () -> {
        client.append("/path/to/non/existent/directory/file.txt");
    });

    // Disconnect from FTP server
    client.disconnect();
}
}