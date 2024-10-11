// OperatingSystem_0Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
 */
class OperatingSystem_0Test {
    
    @Test
    void testIsLinuxReturnsTrueForLinux() {
        // Test that isLinux() returns true when os.name starts with "Linux"
        System.setProperty("os.name", "Linux 4.4.0-18362-Microsoft");
        assertTrue(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForWindows() {
        // Test that isLinux() returns false when os.name starts with "Windows"
        System.setProperty("os.name", "Windows 10");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForMac() {
        // Test that isLinux() returns false when os.name starts with "Mac"
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForSolaris() {
        // Test that isLinux() returns false when os.name starts with "SunOS"
        System.setProperty("os.name", "SunOS 5.11");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForFreeBSD() {
        // Test that isLinux() returns false when os.name starts with "FreeBSD"
        System.setProperty("os.name", "FreeBSD 12.1-RELEASE");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForOpenBSD() {
        // Test that isLinux() returns false when os.name starts with "OpenBSD"
        System.setProperty("os.name", "OpenBSD 6.7");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForNetBSD() {
        // Test that isLinux() returns false when os.name starts with "NetBSD"
        System.setProperty("os.name", "NetBSD 9.1");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForDragonFlyBSD() {
        // Test that isLinux() returns false when os.name starts with "DragonFly"
        System.setProperty("os.name", "DragonFly BSD 5.8.3");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseForUnknownOS() {
        // Test that isLinux() returns false when os.name is an unknown value
        System.setProperty("os.name", "Unknown OS");
        assertFalse(OperatingSystem.isLinux());
    }
    
    @Test
    void testIsLinuxReturnsFalseWhenSecurityExceptionIsThrown() {
        // Test that isLinux() returns false when a SecurityException is thrown
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPropertyAccess(String key) {
                throw new SecurityException();
            }
        });
        assertFalse(OperatingSystem.isLinux());
    }
}