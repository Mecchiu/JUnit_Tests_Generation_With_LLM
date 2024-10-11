Here's a possible implementation of the test class:

```
// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 */
class OperatingSystem_2Test {

    @Test
    void testIsMacOSXReturnsTrueOnMacOSX() {
        // Given
        OperatingSystemStub.setOsName("Mac OS X");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertTrue(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnWindows() {
        // Given
        OperatingSystemStub.setOsName("Windows");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnLinux() {
        // Given
        OperatingSystemStub.setOsName("Linux");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnSolaris() {
        // Given
        OperatingSystemStub.setOsName("Solaris");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnFreeBSD() {
        // Given
        OperatingSystemStub.setOsName("FreeBSD");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnOpenBSD() {
        // Given
        OperatingSystemStub.setOsName("OpenBSD");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnNetBSD() {
        // Given
        OperatingSystemStub.setOsName("NetBSD");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnDragonFlyBSD() {
        // Given
        OperatingSystemStub.setOsName("DragonFlyBSD");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnHaiku() {
        // Given
        OperatingSystemStub.setOsName("Haiku");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    @Test
    void testIsMacOSXReturnsFalseOnUnknownOS() {
        // Given
        OperatingSystemStub.setOsName("Unknown OS");

        // When
        boolean result = OperatingSystem.isMacOSX();

        // Then
        assertFalse(result);
    }

    /**
     * A stub class that allows to set the value returned by {@link System#getProperty(String)} for the "os.name" key.
     */
    private static class OperatingSystemStub extends SecurityManager {
        private static final RuntimePermission GET_PROPERTY_PERMISSION = new RuntimePermission("getenv.*");

        private static String osName;

        public static void setOsName(String osName) {
            OperatingSystemStub.osName = osName;
        }

        @Override
        public void checkPermission(java.security.Permission perm) {
            if (perm.equals(GET_PROPERTY_PERMISSION)) {
                return;
            }
            super.checkPermission(perm);
        }

        @Override
        public String getSystemProperty(String key) {
            if ("os.name".equals(key)) {
                return osName;
            }
            return super.getSystemProperty(key);
        }
    }
}
```

This test class uses a stub class called `OperatingSystemStub` to simulate different operating systems by setting the value returned by `System.getProperty("os.name")`. The `OperatingSystemStub` class extends `SecurityManager` to intercept the call to `System.getProperty()` and return the desired value. The `OperatingSystem_2Test` class contains ten test methods that cover different scenarios for the `isMacOSX()` method. Each test method sets the `os.name` property to a specific value using the `OperatingSystemStub` class, calls the `isMacOSX()` method, and asserts the expected result using the `assertTrue()` or `assertFalse()` methods.