// Here's the source code for the OperatingSystem_1Test class:

package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
 */
class OperatingSystem_1Test {

    @Test
    void testIsWindows() {
        // Test if the method returns true on a Windows system
        System.setProperty("os.name", "Windows 10");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns false on a non-Windows system
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isWindows());

        // Test if the method returns false on a Linux system
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isWindows());

        // Test if the method returns false on an unknown system
        System.setProperty("os.name", "Unknown");
        assertFalse(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows Server system
        System.setProperty("os.name", "Windows Server 2019");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows XP system
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows 7 system
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows 8 system
        System.setProperty("os.name", "Windows 8");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows 8.1 system
        System.setProperty("os.name", "Windows 8.1");
        assertTrue(OperatingSystem.isWindows());

        // Test if the method returns true on a Windows Vista system
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
    }
}