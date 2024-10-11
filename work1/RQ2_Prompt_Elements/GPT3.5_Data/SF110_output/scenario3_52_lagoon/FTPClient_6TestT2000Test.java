// Test case 1: Deleting an existing file should return true
@Test
void testDeleteFile_existingFile_returnsTrue() throws FTPException, IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/existing/file.txt";
    
    // Act
    boolean result = ftpClient.deleteFile(pathname);
    
    // Assert
    assertTrue(result);
}

// Test case 2: Deleting a non-existing file should return false
@Test
void testDeleteFile_nonExistingFile_returnsFalse() throws FTPException, IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/non/existing/file.txt";
    
    // Act
    boolean result = ftpClient.deleteFile(pathname);
    
    // Assert
    assertFalse(result);
}

// Test case 3: Deleting a file with invalid pathname should throw FTPException
@Test
void testDeleteFile_invalidPathname_throwsFTPException() throws IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "invalid/pathname";
    
    // Act & Assert
    assertThrows(FTPException.class, () -> ftpClient.deleteFile(pathname));
}

// Test case 4: Deleting a file with null pathname should throw NullPointerException
@Test
void testDeleteFile_nullPathname_throwsNullPointerException() throws IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = null;
    
    // Act & Assert
    assertThrows(NullPointerException.class, () -> ftpClient.deleteFile(pathname));
}

// Test case 5: Deleting a file with empty pathname should throw FTPException
@Test
void testDeleteFile_emptyPathname_throwsFTPException() throws IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "";
    
    // Act & Assert
    assertThrows(FTPException.class, () -> ftpClient.deleteFile(pathname));
}

// Test case 6: Deleting a file with whitespace-only pathname should throw FTPException
@Test
void testDeleteFile_whitespacePathname_throwsFTPException() throws IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "   ";
    
    // Act & Assert
    assertThrows(FTPException.class, () -> ftpClient.deleteFile(pathname));
}

// Test case 7: Deleting a file with special characters in pathname should not throw exception
@Test
void testDeleteFile_specialCharactersInPathname_doesNotThrowException() throws FTPException, IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/file with spaces & special characters.txt";
    
    // Act & Assert
    assertDoesNotThrow(() -> ftpClient.deleteFile(pathname));
}

// Test case 8: Deleting a file with non-ASCII characters in pathname should not throw exception
@Test
void testDeleteFile_nonASCIICharactersInPathname_doesNotThrowException() throws FTPException, IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/文件.txt";
    
    // Act & Assert
    assertDoesNotThrow(() -> ftpClient.deleteFile(pathname));
}

// Test case 9: Deleting a file with long pathname should not throw exception
@Test
void testDeleteFile_longPathname_doesNotThrowException() throws FTPException, IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/" + "a".repeat(255) + ".txt";
    
    // Act & Assert
    assertDoesNotThrow(() -> ftpClient.deleteFile(pathname));
}

// Test case 10: Deleting a file with very long pathname should throw FTPException
@Test
void testDeleteFile_veryLongPathname_throwsFTPException() throws IOException {
    // Arrange
    FTPClient ftpClient = new FTPClient();
    String pathname = "/path/to/" + "a".repeat(256) + ".txt";
    
    // Act & Assert
    assertThrows(FTPException.class, () -> ftpClient.deleteFile(pathname));
}