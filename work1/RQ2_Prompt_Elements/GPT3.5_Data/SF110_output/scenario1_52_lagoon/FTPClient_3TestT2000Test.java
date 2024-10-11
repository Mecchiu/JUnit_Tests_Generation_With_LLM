// Here is an example of how you can write unit tests for the FTPClient class:

@Test
void testAppend() throws FTPException, IOException {
    // Set up a mock FTP server
    MockFTPServer server = new MockFTPServer();
    server.start();

    // Connect to the server
    FTPClient client = new FTPClient();
    client.connect("localhost", server.getPort());
    client.login("user", "password");

    // Create a file on the server
    server.createFile("/path/to/file.txt", "Hello, world!");

    // Append to the file
    OutputStream out = client.append("/path/to/file.txt", false);
    out.write("This is a test".getBytes());
    out.close();

    // Verify that the file was appended to
    String contents = server.getFileContents("/path/to/file.txt");
    assertEquals("Hello, world!This is a test", contents);

    // Disconnect from the server
    client.disconnect();
    server.stop();
}