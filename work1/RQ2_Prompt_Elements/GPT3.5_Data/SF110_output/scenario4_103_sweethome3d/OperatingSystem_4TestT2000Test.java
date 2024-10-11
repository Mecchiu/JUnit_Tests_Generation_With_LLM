// OperatingSystem_4Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link OperatingSystem}.
 * It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
 */
class OperatingSystem_4Test {

    /**
     * Test case to verify that the default application folder is not null.
     */
    @Test
    void testGetDefaultApplicationFolderNotNull() throws IOException {
        assertNotNull(OperatingSystem.getDefaultApplicationFolder());
    }

    /**
     * Test case to verify that the default application folder exists.
     */
    @Test
    void testGetDefaultApplicationFolderExists() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(defaultApplicationFolder.exists() && defaultApplicationFolder.isDirectory());
    }

    /**
     * Test case to verify that the default application folder is writable.
     */
    @Test
    void testGetDefaultApplicationFolderWritable() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(defaultApplicationFolder.canWrite());
    }

    /**
     * Test case to verify that the default application folder is not the root folder.
     */
    @Test
    void testGetDefaultApplicationFolderNotRoot() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder.getAbsolutePath().equals(File.separator));
    }

    /**
     * Test case to verify that the default application folder is not a file.
     */
    @Test
    void testGetDefaultApplicationFolderNotFile() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder.isFile());
    }

    /**
     * Test case to verify that the default application folder is not a temporary folder.
     */
    @Test
    void testGetDefaultApplicationFolderNotTemporary() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder.getAbsolutePath().contains("temp"));
    }

    /**
     * Test case to verify that the default application folder is not hidden.
     */
    @Test
    void testGetDefaultApplicationFolderNotHidden() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder.isHidden());
    }

    /**
     * Test case to verify that the default application folder is not a system folder.
     */
    @Test
    void testGetDefaultApplicationFolderNotSystem() throws IOException {
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder.getAbsolutePath().contains("System"));
    }

    /**
     * Test case to verify that the default application folder is unique for each user.
     */
    @Test
    void testGetDefaultApplicationFolderUnique() throws IOException {
        File defaultApplicationFolder1 = OperatingSystem.getDefaultApplicationFolder();
        File defaultApplicationFolder2 = OperatingSystem.getDefaultApplicationFolder();
        assertFalse(defaultApplicationFolder1.getAbsolutePath().equals(defaultApplicationFolder2.getAbsolutePath()));
    }

    /**
     * Test case to verify that the default application folder is the same for each call in the same session.
     */
    @Test
    void testGetDefaultApplicationFolderSameSession() throws IOException {
        File defaultApplicationFolder1 = OperatingSystem.getDefaultApplicationFolder();
        File defaultApplicationFolder2 = OperatingSystem.getDefaultApplicationFolder();
        assertEquals(defaultApplicationFolder1.getAbsolutePath(), defaultApplicationFolder2.getAbsolutePath());
    }
}