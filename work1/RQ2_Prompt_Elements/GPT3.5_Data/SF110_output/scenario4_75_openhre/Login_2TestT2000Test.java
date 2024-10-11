// Login_2Test.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {
    
    /**
     * Test case to check if the security log file path is not null.
     */
    @Test
    void testGetSecurityLogFilePathNotNull() {
        assertNotNull(Login.getSecurityLogFilePath());
    }
    
    /**
     * Test case to check if the security log file path is a string.
     */
    @Test
    void testGetSecurityLogFilePathIsString() {
        assertTrue(Login.getSecurityLogFilePath() instanceof String);
    }
    
    /**
     * Test case to check if the security log file path is not empty.
     */
    @Test
    void testGetSecurityLogFilePathNotEmpty() {
        assertFalse(Login.getSecurityLogFilePath().isEmpty());
    }
    
    /**
     * Test case to check if the security log file path contains the correct file name.
     */
    @Test
    void testGetSecurityLogFilePathContainsFileName() {
        assertTrue(Login.getSecurityLogFilePath().contains("security.log"));
    }
    
    /**
     * Test case to check if the security log file path contains the correct directory path.
     */
    @Test
    void testGetSecurityLogFilePathContainsDirectoryPath() {
        assertTrue(Login.getSecurityLogFilePath().contains("/var/log/aacs/"));
    }
    
    /**
     * Test case to check if the security log file path ends with the correct file name.
     */
    @Test
    void testGetSecurityLogFilePathEndsWithFileName() {
        assertTrue(Login.getSecurityLogFilePath().endsWith("security.log"));
    }
    
    /**
     * Test case to check if the security log file path ends with a forward slash.
     */
    @Test
    void testGetSecurityLogFilePathEndsWithForwardSlash() {
        assertTrue(Login.getSecurityLogFilePath().endsWith("/"));
    }
    
    /**
     * Test case to check if the security log file path starts with the correct directory path.
     */
    @Test
    void testGetSecurityLogFilePathStartsWithDirectoryPath() {
        assertTrue(Login.getSecurityLogFilePath().startsWith("/var/log/aacs/"));
    }
    
    /**
     * Test case to check if the security log file path starts with a forward slash.
     */
    @Test
    void testGetSecurityLogFilePathStartsWithForwardSlash() {
        assertTrue(Login.getSecurityLogFilePath().startsWith("/"));
    }
    
    /**
     * Test case to check if the security log file path is a valid file path.
     */
    @Test
    void testGetSecurityLogFilePathIsValidFilePath() {
        assertTrue(new File(Login.getSecurityLogFilePath()).isFile());
    }
}