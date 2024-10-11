// OperatingSystem_1Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
 */
class OperatingSystem_1Test {

    @Test
    void testIsWindowsReturnsTrueForWindows() {
        // Test that isWindows() returns true for Windows operating system
        System.setProperty("os.name", "Windows 10");
        assertTrue(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForMac() {
        // Test that isWindows() returns false for Mac operating system
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForLinux() {
        // Test that isWindows() returns false for Linux operating system
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForUnix() {
        // Test that isWindows() returns false for Unix operating system
        System.setProperty("os.name", "Unix");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForSolaris() {
        // Test that isWindows() returns false for Solaris operating system
        System.setProperty("os.name", "Solaris");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForFreeBSD() {
        // Test that isWindows() returns false for FreeBSD operating system
        System.setProperty("os.name", "FreeBSD");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForOpenBSD() {
        // Test that isWindows() returns false for OpenBSD operating system
        System.setProperty("os.name", "OpenBSD");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForNetBSD() {
        // Test that isWindows() returns false for NetBSD operating system
        System.setProperty("os.name", "NetBSD");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForDragonFlyBSD() {
        // Test that isWindows() returns false for DragonFlyBSD operating system
        System.setProperty("os.name", "DragonFlyBSD");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsWindowsReturnsFalseForUnknownOS() {
        // Test that isWindows() returns false for unknown operating system
        System.setProperty("os.name", "Unknown OS");
        assertFalse(OperatingSystem.isWindows());
    }
}