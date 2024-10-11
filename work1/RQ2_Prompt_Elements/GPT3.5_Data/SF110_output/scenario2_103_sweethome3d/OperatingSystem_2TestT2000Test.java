Here's a possible implementation of the test class:

```
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem_2Test {

    @Test
    void testIsMacOSX() {
        // Test on a Mac OS X system
        System.setProperty("os.name", "Mac OS X");
        assertTrue(OperatingSystem.isMacOSX());

        // Test on a non-Mac system
        System.setProperty("os.name", "Windows 10");
        assertFalse(OperatingSystem.isMacOSX());

        // Test on a case-insensitive system
        System.setProperty("os.name", "mac os x");
        assertTrue(OperatingSystem.isMacOSX());

        // Test on a system with extra spaces
        System.setProperty("os.name", "  Mac OS X  ");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Null() {
        // Test with null system property
        System.clearProperty("os.name");
        assertFalse(OperatingSystem.isMacOSX());
    }
    
    @Test
    void testIsMacOSX_Empty() {
        // Test with empty system property
        System.setProperty("os.name", "");
        assertFalse(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Whitespace() {
        // Test with whitespace-only system property
        System.setProperty("os.name", "   ");
        assertFalse(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Prefix() {
        // Test with prefix of "Mac OS X"
        System.setProperty("os.name", "Mac OS X Server");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Suffix() {
        // Test with suffix of "Mac OS X"
        System.setProperty("os.name", "Server for Mac OS X");
        assertFalse(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Middle() {
        // Test with "Mac OS X" in the middle
        System.setProperty("os.name", "Server for Mac OS X and Windows");
        assertFalse(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Case() {
        // Test with different case
        System.setProperty("os.name", "mAc oS x");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_Unicode() {
        // Test with Unicode characters
        System.setProperty("os.name", "Mac OS X \u00E9dition fran\u00E7aise");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSX_UnicodeMismatch() {
        // Test with Unicode characters that don't match "Mac OS X"
        System.setProperty("os.name", "Mac OS \u00C7");
        assertFalse(OperatingSystem.isMacOSX());
    }
}
```

This test class contains ten test cases for the `isMacOSX()` method of the `OperatingSystem` class. The first test case checks that the method returns `true` when the system property "os.name" starts with "Mac OS X". The second test case checks that the method returns `false` when the system property "os.name" does not start with "Mac OS X". The remaining test cases cover various edge cases, such as null, empty, or whitespace-only system properties, different capitalization, and Unicode characters.