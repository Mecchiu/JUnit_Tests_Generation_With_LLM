// Here's an example implementation of the FTPClient_5Test class:

class FTPClient_5Test {

    @Test
    void testStoreUnique() throws Exception {
        // Set up a mock FTP server
        MockFtpServer ftpServer = new MockFtpServer();
        ftpServer.setServerControlPort(0); // Use a random port
        ftpServer.addUserAccount(new UsernamePasswordAuthentication("user", "password"));
        ftpServer.start();

        // Connect to the mock FTP server
        int port = ftpServer.getServerControlPort();
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("localhost", port);
        ftpClient.login("user", "password");

        // Test storing a file
        String path = "/test/";
        boolean last = true;
        OutputStream outputStream = ftpClient.storeUnique(path, last);
        assertNotNull(outputStream);
        outputStream.write("Hello, world!".getBytes());
        outputStream.close();

        // Verify that the file was stored
        FTPFile[] files = ftpClient.listFiles(path);
        assertEquals(1, files.length);
        assertEquals("Hello, world!", readFully(ftpClient.retrieveFileStream(files[0].getName())));

        // Clean up
        ftpClient.logout();
        ftpClient.disconnect();
        ftpServer.stop();
    }

    private static String readFully(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        return outputStream.toString("UTF-8");
    }

}