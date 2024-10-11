// Here's an example of how you can write unit tests for the ResourceService class:

@Test
void testGetInputStream_validPath() {
    // Test that a valid path returns a non-null InputStream
    InputStream inputStream = ResourceService.getInputStream("/images/test.png");
    assertNotNull(inputStream);
}

@Test
void testGetInputStream_invalidPath() {
    // Test that an invalid path throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("/invalid/path.png");
    });
}

@Test
void testGetInputStream_nullPath() {
    // Test that a null path throws a NullPointerException
    assertThrows(NullPointerException.class, () -> {
        ResourceService.getInputStream(null);
    });
}

@Test
void testGetInputStream_emptyPath() {
    // Test that an empty path throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("");
    });
}

@Test
void testGetInputStream_nonexistentFile() {
    // Test that a path to a nonexistent file throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("/images/nonexistent.png");
    });
}

@Test
void testGetInputStream_directory() {
    // Test that a path to a directory throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("/images/");
    });
}

@Test
void testGetInputStream_fileInDirectory() {
    // Test that a path to a file in a directory returns a non-null InputStream
    InputStream inputStream = ResourceService.getInputStream("/images/subdirectory/test.png");
    assertNotNull(inputStream);
}

@Test
void testGetInputStream_absolutePath() {
    // Test that an absolute path throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("C:/images/test.png");
    });
}

@Test
void testGetInputStream_relativePath() {
    // Test that a relative path throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("../images/test.png");
    });
}

@Test
void testGetInputStream_whitespacePath() {
    // Test that a path with whitespace throws an IllegalArgumentException
    assertThrows(IllegalArgumentException.class, () -> {
        ResourceService.getInputStream("/images/white space.png");
    });
}