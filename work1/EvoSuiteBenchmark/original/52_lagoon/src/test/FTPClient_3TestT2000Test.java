```java
    @Test
    void testAppend() {
        // Test case 1: Append a file without closing FTPClient
        try {
            FTPClient ftpClient = new FTPClient("ftp://example.com:21/user@example.com/test/", "password");
            OutputStream outputStream = ftpClient.append("file.txt", false);
            assertNotNull(outputStream);
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testAppend2() {
        // Test case 2: Append a file and close FTPClient after transfer
        try {
            FTPClient ftpClient = new FTPClient("ftp://example.com:21/user@example.com/test/", "password");
            OutputStream outputStream = ftpClient.append("file2.txt", true);
            assertNotNull(outputStream);
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Add more test cases for append method as needed
```
```