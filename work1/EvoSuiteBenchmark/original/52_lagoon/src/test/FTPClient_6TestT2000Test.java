```java
    @Test
    void testDeleteFile_Success() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile("/path/to/file.txt");
        assertTrue(result);
    }

    @Test
    void testDeleteFile_FileNotExist() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile("/path/to/nonexistent.txt");
        assertFalse(result);
    }

    @Test
    void testDeleteFile_FTPServerNotAvailable() {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/file.txt"));
    }

    @Test
    void testDeleteFile_ErrorInFileTransfer() {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/error.txt"));
    }

    @Test
    void testDeleteFile_UnexpectedResponse() {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/unexpected.txt"));
    }

    @Test
    void testDeleteFile_InvalidPath() {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/invalid/path"));
    }

    @Test
    void testDeleteFile_EmptyPath() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile("");
        assertFalse(result);
    }

    @Test
    void testDeleteFile_NullPath() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile(null);
        assertFalse(result);
    }

    @Test
    void testDeleteFile_SuccessWithDirectory() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile("/path/to/directory/");
        assertTrue(result);
    }

    @Test
    void testDeleteFile_SuccessWithRootDirectory() {
        FTPClient ftpClient = new FTPClient();
        boolean result = ftpClient.deleteFile("/");
        assertTrue(result);
    }
```
