Here's the source code for the test class:

```
// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
 */
class OperatingSystem_2Test {

    @Test
    void testIsMacOSXReturnsTrueOnMacOSX() {
        // Arrange
        System.setProperty("os.name", "Mac OS X");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnWindows() {
        // Arrange
        System.setProperty("os.name", "Windows");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnLinux() {
        // Arrange
        System.setProperty("os.name", "Linux");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnSolaris() {
        // Arrange
        System.setProperty("os.name", "Solaris");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnFreeBSD() {
        // Arrange
        System.setProperty("os.name", "FreeBSD");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnOpenBSD() {
        // Arrange
        System.setProperty("os.name", "OpenBSD");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnNetBSD() {
        // Arrange
        System.setProperty("os.name", "NetBSD");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnDragonFlyBSD() {
        // Arrange
        System.setProperty("os.name", "DragonFlyBSD");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnHaiku() {
        // Arrange
        System.setProperty("os.name", "Haiku");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnUnknownOS() {
        // Arrange
        System.setProperty("os.name", "Unknown OS");

        // Act
        boolean result = OperatingSystem.isMacOSX();

        // Assert
        assertFalse(result);
    }
}
```