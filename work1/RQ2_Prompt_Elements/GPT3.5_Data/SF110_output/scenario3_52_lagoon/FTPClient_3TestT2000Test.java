// Test case 1: Test if append method returns an OutputStream
@Test
void testAppendReturnsOutputStream() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.append("test.txt", true);
    assertNotNull(outputStream);
}

// Test case 2: Test if append method creates a new file
@Test
void testAppendCreatesNewFile() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.append("test.txt", true);
    outputStream.write("Hello World".getBytes());
    outputStream.close();

    // Check if file exists
    URL url = new URL("ftp://localhost/test.txt");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    assertNotNull(inputStream);
}

// Test case 3: Test if append method appends to an existing file
@Test
void testAppendAppendsToExistingFile() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.append("test.txt", true);
    outputStream.write("Hello World".getBytes());
    outputStream.close();

    // Append to the same file
    outputStream = ftpClient.append("test.txt", true);
    outputStream.write("Hello Again".getBytes());
    outputStream.close();

    // Check if file contains both strings
    URL url = new URL("ftp://localhost/test.txt");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    String line = reader.readLine();
    assertTrue(line.contains("Hello World"));
    assertTrue(line.contains("Hello Again"));
}

// Test case 4: Test if append method creates directories if necessary
@Test
void testAppendCreatesDirectories() throws FTPException, IOException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.append("dir1/dir2/test.txt", true);
    outputStream.write("Hello World".getBytes());
    outputStream.close();

    // Check if directories and file exist
    URL url = new URL("ftp://localhost/dir1/dir2/test.txt");
    URLConnection connection = url.openConnection();
    InputStream inputStream = connection.getInputStream();
    assertNotNull(inputStream);
}

// Test case 5: Test if append method throws FTPException when file cannot be created
@Test
void testAppendThrowsFTPExceptionWhenFileCannotBeCreated() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.append("test.txt", true));
}

// Test case 6: Test if append method throws IOException when connection fails
@Test
void testAppendThrowsIOExceptionWhenConnectionFails() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IOException.class, () -> ftpClient.append("test.txt", true));
}

// Test case 7: Test if append method throws FTPException when file cannot be appended to
@Test
void testAppendThrowsFTPExceptionWhenFileCannotBeAppendedTo() throws IOException {
    // Create a read-only file
    URL url = new URL("ftp://localhost/test.txt");
    URLConnection connection = url.openConnection();
    connection.setDoOutput(true);
    OutputStream outputStream = connection.getOutputStream();
    outputStream.write("Hello World".getBytes());
    outputStream.close();
    connection.setReadOnly();

    // Try to append to the read-only file
    FTPClient ftpClient = new FTPClient();
    assertThrows(FTPException.class, () -> ftpClient.append("test.txt", true));
}

// Test case 8: Test if append method throws IOException when writing to OutputStream fails
@Test
void testAppendThrowsIOExceptionWhenWritingFails() throws FTPException {
    FTPClient ftpClient = new FTPClient();
    OutputStream outputStream = ftpClient.append("test.txt", true);
    outputStream.close();
    assertThrows(IOException.class, () -> outputStream.write("Hello World".getBytes()));
}

// Test case 9: Test if append method throws NullPointerException when pathname is null
@Test
void testAppendThrowsNullPointerExceptionWhenPathnameIsNull() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(NullPointerException.class, () -> ftpClient.append(null, true));
}

// Test case 10: Test if append method throws IllegalArgumentException when pathname is empty
@Test
void testAppendThrowsIllegalArgumentExceptionWhenPathnameIsEmpty() {
    FTPClient ftpClient = new FTPClient();
    assertThrows(IllegalArgumentException.class, () -> ftpClient.append("", true));
}