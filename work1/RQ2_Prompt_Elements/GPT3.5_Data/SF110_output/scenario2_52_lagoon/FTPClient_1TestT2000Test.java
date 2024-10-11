// Here is an example of how you can write unit tests for the FTPClient class

@Test
void testStoreNewFile() throws IOException, FTPException {
    // Create a mock FTP server
    MockFTPServer server = new MockFTPServer();
    server.start();

    // Create a new FTP client and connect to the mock server
    FTPClient client = new FTPClient();
    client.connect("localhost", server.getPort());
    client.login("user", "password");

    // Create a new file to upload
    File file = new File("test.txt");
    FileWriter writer = new FileWriter(file);
    writer.write("Hello, world!");
    writer.close();

    // Upload the file to the server
    OutputStream out = client.store("/test.txt", true);
    FileInputStream in = new FileInputStream(file);
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = in.read(buffer)) != -1) {
        out.write(buffer, 0, bytesRead);
    }
    in.close();
    out.close();

    // Verify that the file was uploaded correctly
    assertTrue(server.fileExists("/test.txt"));
    assertEquals("Hello, world!", server.readFile("/test.txt"));

    // Disconnect from the server
    client.disconnect();
    server.stop();
}

@Test
void testStoreExistingFile() throws IOException, FTPException {
    // Create a mock FTP server with an existing file
    MockFTPServer server = new MockFTPServer();
    server.createFile("/test.txt", "Hello, world!");
    server.start();

    // Create a new FTP client and connect to the mock server
    FTPClient client = new FTPClient();
    client.connect("localhost", server.getPort());
    client.login("user", "password");

    // Create a new file to upload
    File file = new File("test.txt");
    FileWriter writer = new FileWriter(file);
    writer.write("Goodbye, world!");
    writer.close();

    // Upload the file to the server, overwriting the existing file
    OutputStream out = client.store("/test.txt", true);
    FileInputStream in = new FileInputStream(file);
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = in.read(buffer)) != -1) {
        out.write(buffer, 0, bytesRead);
    }
    in.close();
    out.close();

    // Verify that the file was uploaded correctly
    assertTrue(server.fileExists("/test.txt"));
    assertEquals("Goodbye, world!", server.readFile("/test.txt"));

    // Disconnect from the server
    client.disconnect();
    server.stop();
}

// Add more test cases for different scenarios, such as uploading to a non-existent directory, 
// uploading a large file, and handling FTP protocol errors.