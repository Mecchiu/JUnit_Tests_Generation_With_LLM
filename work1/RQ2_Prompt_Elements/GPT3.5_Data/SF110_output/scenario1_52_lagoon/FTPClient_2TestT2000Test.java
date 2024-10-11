// Here's an example implementation of the FTPClient_2Test class with ten unit test cases for the append() method:

class FTPClient_2Test {

    @Test
    void testAppendSuccess() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        OutputStream outputStream = ftpClient.append("/path/to/file.txt");
        assertNotNull(outputStream);
    }

    @Test
    void testAppendNullPathname() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(NullPointerException.class, () -> ftpClient.append(null));
    }

    @Test
    void testAppendEmptyPathname() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append(""));
    }

    @Test
    void testAppendNonexistentDirectory() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append("/nonexistent/path/file.txt"));
    }

    @Test
    void testAppendDirectoryPath() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append("/path/to/directory/"));
    }

    @Test
    void testAppendFileInProgress() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        OutputStream outputStream1 = ftpClient.append("/path/to/file.txt");
        assertThrows(FTPException.class, () -> ftpClient.append("/path/to/file.txt"));
        outputStream1.close();
    }

    @Test
    void testAppendReadOnlyFile() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append("/path/to/read-only-file.txt"));
    }

    @Test
    void testAppendNoPermission() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append("/path/to/no-permission-file.txt"));
    }

    @Test
    void testAppendConnectionError() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.append("/path/to/file.txt"));
    }

    @Test
    void testAppendIOException() throws FTPException, IOException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(IOException.class, () -> ftpClient.append("/path/to/file.txt"));
    }
}