// Test case 1: Test appending to an existing file
@Test
void testAppendExistingFile() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a file on the server
    OutputStream outputStream = ftpClient.append("/path/to/file.txt", false);

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Append more data to the file
    outputStream = ftpClient.append("/path/to/file.txt", false);
    String moreData = "This is some more data.";
    outputStream.write(moreData.getBytes());
    outputStream.close();

    // Verify that the file contains all the data
    InputStream inputStream = ftpClient.download("/path/to/file.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data + moreData, fileContent);

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 2: Test creating a new file
@Test
void testAppendNewFile() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a new file on the server
    OutputStream outputStream = ftpClient.append("/path/to/newfile.txt", false);

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Verify that the file contains the data
    InputStream inputStream = ftpClient.download("/path/to/newfile.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data, fileContent);

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 3: Test creating a new file in a new directory
@Test
void testAppendNewFileInNewDirectory() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a new directory on the server
    ftpClient.mkdir("/path/to/newdir");

    // Create a new file in the new directory
    OutputStream outputStream = ftpClient.append("/path/to/newdir/newfile.txt", false);

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Verify that the file contains the data
    InputStream inputStream = ftpClient.download("/path/to/newdir/newfile.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data, fileContent);

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 4: Test appending to a file and closing the FTPClient
@Test
void testAppendAndClose() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a file on the server
    OutputStream outputStream = ftpClient.append("/path/to/file.txt", true);

    // Write some data to the file
    String data = "Hello, world!";
    outputStream.write(data.getBytes());
    outputStream.close();

    // Verify that the file contains the data
    InputStream inputStream = ftpClient.download("/path/to/file.txt");
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    String fileContent = new String(buffer, 0, bytesRead);
    assertEquals(data, fileContent);

    // Verify that the FTPClient is closed
    assertTrue(ftpClient.isClosed());

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 5: Test appending to a file with an empty path
@Test
void testAppendEmptyPath() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Attempt to append to a file with an empty path
    assertThrows(FTPException.class, () -> {
        ftpClient.append("", false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 6: Test appending to a file with a null path
@Test
void testAppendNullPath() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Attempt to append to a file with a null path
    assertThrows(NullPointerException.class, () -> {
        ftpClient.append(null, false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 7: Test appending to a file with a path that does not exist
@Test
void testAppendNonexistentPath() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Attempt to append to a file with a path that does not exist
    assertThrows(FTPException.class, () -> {
        ftpClient.append("/path/to/nonexistent/file.txt", false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 8: Test appending to a file with a path that is a directory
@Test
void testAppendDirectoryPath() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a directory on the server
    ftpClient.mkdir("/path/to/newdir");

    // Attempt to append to the directory
    assertThrows(FTPException.class, () -> {
        ftpClient.append("/path/to/newdir", false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 9: Test appending to a file with a path that is a file and a directory
@Test
void testAppendFilePathAndDirectoryPath() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a directory on the server
    ftpClient.mkdir("/path/to/newdir");

    // Create a file in the directory
    OutputStream outputStream = ftpClient.append("/path/to/newdir/newfile.txt", false);
    outputStream.close();

    // Attempt to append to the file and the directory
    assertThrows(FTPException.class, () -> {
        ftpClient.append("/path/to/newdir/newfile.txt/newdir", false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}

// Test case 10: Test appending to a file with a path that is a file and a directory with the same name
@Test
void testAppendFilePathAndDirectoryPathSameName() throws IOException, FTPException {
    // Connect to FTP server
    FTPClient ftpClient = new FTPClient();
    ftpClient.connect("ftp.example.com");
    ftpClient.login("username", "password");

    // Create a directory on the server
    ftpClient.mkdir("/path/to/newdir");

    // Create a file in the directory
    OutputStream outputStream = ftpClient.append("/path/to/newdir/newfile.txt", false);
    outputStream.close();

    // Attempt to append to the file and the directory with the same name
    assertThrows(FTPException.class, () -> {
        ftpClient.append("/path/to/newdir/newfile.txt/newfile.txt", false);
    });

    // Disconnect from FTP server
    ftpClient.disconnect();
}
}