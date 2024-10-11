```java
class FileUserPreferences_4Test {

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryExists_ReturnsTrue() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "existingTexturesLibrary.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertTrue(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryDoesNotExist_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "nonExistingTexturesLibrary.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameIsNull_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = null;

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameIsEmpty_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameContainsPath_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "path/to/texturesLibrary.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameContainsSpecialCharacters_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "texturesLibrary@#$%.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameContainsSpaces_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "textures Library.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameIsLong_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "veryLongTexturesLibraryNameThatExceedsTheMaximumAllowedCharactersLimit.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }

    @Test
    void testTexturesLibraryExists_WhenTexturesLibraryNameIsMalformed_ReturnsFalse() throws RecorderException {
        // Given
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        String texturesLibraryName = "malformedTexturesLibraryName.sh3t";

        // When
        boolean result = fileUserPreferences.texturesLibraryExists(texturesLibraryName);

        // Then
        assertFalse(result);
    }
}
```