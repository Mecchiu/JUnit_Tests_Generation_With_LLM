// OperatingSystem_3Test.java
package com.eteks.sweethome3d.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
 */
class OperatingSystem_3Test {

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.5.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_5() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.6.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_6() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.6");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.7.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_7() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.7");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.8.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_8() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.8");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.9.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_9() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.9");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.10.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_10() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.10");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.11.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_11() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.11");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.12.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_12() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.12");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns true for Mac OS X 10.13.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_13() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.13");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    /**
     * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
     * Tests that the method returns false for Mac OS X 10.4.
     */
    @Test
    void testIsMacOSXLeopardOrSuperior_10_4() {
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
    }
}