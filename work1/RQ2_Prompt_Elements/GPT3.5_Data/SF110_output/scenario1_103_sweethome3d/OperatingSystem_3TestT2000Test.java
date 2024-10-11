// OperatingSystem_3Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
 */
class OperatingSystem_3Test {

    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test with Mac OS X 10.5
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test with Mac OS X 10.6
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.6");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test with Mac OS X 10.4
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test with Mac OS X 10.3
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.3");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test with Windows
        System.setProperty("os.name", "Windows");
        System.setProperty("os.version", "10");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test with Linux
        System.setProperty("os.name", "Linux");
        System.setProperty("os.version", "4.15.0-29-generic");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
    }
}