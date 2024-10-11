// Here is an example of how to test the deleteFile method of FTPClient class

@Test
void testDeleteFile() throws Exception {
    // Create a mock FTP server
    MockFTPServer server = new MockFTPServer();
    server.start();

    // Connect to the server
    FTPClient client = new FTPClient(server.getHost(), server.getPort(), "user", "pass", null);

    // Create a file on the server
    server.createFile("test.txt", "Hello World!");

    // Delete the file
    boolean result = client.deleteFile("test.txt");

    // Verify that the file was deleted
    assertFalse(server.fileExists("test.txt"));
    assertTrue(result);

    // Try to delete the file again (should return false)
    result = client.deleteFile("test.txt");
    assertFalse(result);

    // Disconnect from the server
    client.close();
    server.stop();
}