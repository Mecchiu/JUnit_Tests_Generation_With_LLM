```java
class FileUserPreferences_3Test {

    @Test
    void testFurnitureLibraryExists_WhenLibraryExists_ReturnsTrue() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String libraryName = "existingLibrary.sh3f";

        // When
        boolean result = fileUserPreferences.furnitureLibraryExists(libraryName);

        // Then
        assertTrue(result);
    }

    @Test
    void testFurnitureLibraryExists_WhenLibraryDoesNotExist_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String libraryName = "nonExistingLibrary.sh3f";

        // When
        boolean result = fileUserPreferences.furnitureLibraryExists(libraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testFurnitureLibraryExists_WhenLibraryNameIsNull_ThrowsException() {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String libraryName = null;

        // When, Then
        assertThrows(RecorderException.class, () -> {
            fileUserPreferences.furnitureLibraryExists(libraryName);
        });
    }

    @Test
    void testFurnitureLibraryExists_WhenLibraryNameIsEmpty_ThrowsException() {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String libraryName = "";

        // When, Then
        assertThrows(RecorderException.class, () -> {
            fileUserPreferences.furnitureLibraryExists(libraryName);
        });
    }
}
```

This code snippet contains unit test cases for the `furnitureLibraryExists` method in the `FileUserPreferences` class. The tests cover scenarios where the library exists, does not exist, the library name is null, and the library name is empty.