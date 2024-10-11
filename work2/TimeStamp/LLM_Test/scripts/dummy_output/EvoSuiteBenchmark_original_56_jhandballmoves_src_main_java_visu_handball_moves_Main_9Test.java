java
package visu.handball.moves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Main}.
 * It contains ten unit test cases for the {@link Main#getVersion()} method.
 */
class Main_9Test {

    @Test
    void testGetVersion_WhenCalled_ReturnsVersionString() {
        // Arrange
        String expectedVersion = "1.0.5";

        // Act
        String actualVersion = Main.getVersion();

        // Assert
        assertEquals(expectedVersion, actualVersion);
    }

    @Test
    void testGetVersion_WhenCalledTwice_ReturnsSameVersionString() {
        // Arrange
        String version1 = Main.getVersion();

        // Act
        String version2 = Main.getVersion();

        // Assert
        assertSame(version1, version2);
    }

    @Test
    void testGetVersion_WhenVersionIsNotEmpty_ReturnsNonEmptyString() {
        // Act
        String version = Main.getVersion();

        // Assert
        assertFalse(version.isEmpty());
    }

    @Test
    void testGetVersion_WhenVersionIsNotNull_ReturnsNonNullString() {
        // Act
        String version = Main.getVersion();

        // Assert
        assertNotNull(version);
    }

    @Test
    void testGetVersion_WhenVersionHasCorrectFormat_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        String[] versionParts = version.split("\\.");

        // Assert
        assertEquals(3, versionParts.length);
        for (String part : versionParts) {
            assertTrue(part.matches("\\d+"));
        }
    }

    @Test
    void testGetVersion_WhenVersionIsCorrectLength_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        int versionLength = version.length();

        // Assert
        assertEquals(5, versionLength);
    }

    @Test
    void testGetVersion_WhenVersionContainsOnlyDigitsAndDots_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        boolean isValid = version.matches("[\\d.]+");

        // Assert
        assertTrue(isValid);
    }

    @Test
    void testGetVersion_WhenVersionStartsWithDigit_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        char firstChar = version.charAt(0);

        // Assert
        assertTrue(Character.isDigit(firstChar));
    }

    @Test
    void testGetVersion_WhenVersionEndsWithDigit_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        char lastChar = version.charAt(version.length() - 1);

        // Assert
        assertTrue(Character.isDigit(lastChar));
    }

    @Test
    void testGetVersion_WhenVersionHasCorrectDelimiter_ReturnsValidVersionString() {
        // Arrange
        String version = Main.getVersion();

        // Act
        boolean hasCorrectDelimiter = version.contains(".");

        // Assert
        assertTrue(hasCorrectDelimiter);
    }
}
