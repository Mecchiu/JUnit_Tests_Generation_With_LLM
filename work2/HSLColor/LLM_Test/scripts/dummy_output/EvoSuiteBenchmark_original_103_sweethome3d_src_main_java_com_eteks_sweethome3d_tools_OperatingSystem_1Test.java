package com.eteks.sweethome3d.tools;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem_1Test {

    @Test
    void testIsWindows_ReturnsTrue_WhenOSNameStartsWithWindows() {
        // Test case 1
        System.setProperty("os.name", "Windows 10");
        assertTrue(OperatingSystem.isWindows());

        // Test case 2
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindows_ReturnsFalse_WhenOSNameDoesNotStartWithWindows() {
        // Test case 1
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isWindows());

        // Test case 2
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isWindows());
    }
}
