// Here's an example implementation of the FTPClient_2Test class with ten unit test cases for the append() method:

class FTPClient_2Test {

    @Test
    void testAppendExistingFile() throws Exception {
        // Set up
        FTPClient client = new FTPClient();
        OutputStream outputStream = client.append("/path/to/file.txt");

        // Write to file
        String data = "Hello, world!";
        outputStream.write(data.getBytes());
        outputStream.close();

        // Verify file contents
        InputStream inputStream = client.retrieve("/path/to/file.txt");
        String result = new String(inputStream.readAllBytes());
        assertEquals(data, result);

        // Clean up
        client.delete("/path/to/file.txt");
    }

    @Test
    void testAppendNewFile() throws Exception {
        // Set up
        FTPClient client = new FTPClient();
        OutputStream outputStream = client.append("/path/to/newfile.txt");

        // Write to file
        String data = "Hello, world!";
        outputStream.write(data.getBytes());
        outputStream.close();

        // Verify file contents
        InputStream inputStream = client.retrieve("/path/to/newfile.txt");
        String result = new String(inputStream.readAllBytes());
        assertEquals(data, result);

        // Clean up
        client.delete("/path/to/newfile.txt");
    }

    @Test
    void testAppendExistingDirectory() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify exception is thrown
        assertThrows(FTPException.class, () -> {
            client.append("/path/to/directory/");
        });
    }

    @Test
    void testAppendInvalidPath() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify exception is thrown
        assertThrows(FTPException.class, () -> {
            client.append("/path/to/invalid/file.txt");
        });
    }

    @Test
    void testAppendNullPath() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify exception is thrown
        assertThrows(NullPointerException.class, () -> {
            client.append(null);
        });
    }

    @Test
    void testAppendEmptyPath() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify exception is thrown
        assertThrows(FTPException.class, () -> {
            client.append("");
        });
    }

    @Test
    void testAppendWhitespacePath() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify exception is thrown
        assertThrows(FTPException.class, () -> {
            client.append("   ");
        });
    }

    @Test
    void testAppendThreadSafety() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Start first file
        OutputStream outputStream1 = client.append("/path/to/file1.txt");
        String data1 = "Hello, world!";
        outputStream1.write(data1.getBytes());

        // Verify exception is thrown when starting second file
        assertThrows(FTPException.class, () -> {
            client.append("/path/to/file2.txt");
        });

        // Clean up
        outputStream1.close();
        client.delete("/path/to/file1.txt");
    }

    @Test
    void testAppendPasswordInClearText() throws Exception {
        // Set up
        FTPClient client = new FTPClient();

        // Verify warning is printed
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        client.append("/path/to/file.txt");
        assertTrue(outContent.toString().contains("password in clear text"));
    }

    @Test
    void testAppendLargeFile() throws Exception {
        // Set up
        FTPClient client = new FTPClient();
        OutputStream outputStream = client.append("/path/to/largefile.txt");

        // Write to file
        byte[] data = new byte[1024 * 1024 * 10]; // 10 MB
        new Random().nextBytes(data);
        outputStream.write(data);
        outputStream.close();

        // Verify file contents
        InputStream inputStream = client.retrieve("/path/to/largefile.txt");
        byte[] result = inputStream.readAllBytes();
        assertArrayEquals(data, result);

        // Clean up
        client.delete("/path/to/largefile.txt");
    }
}