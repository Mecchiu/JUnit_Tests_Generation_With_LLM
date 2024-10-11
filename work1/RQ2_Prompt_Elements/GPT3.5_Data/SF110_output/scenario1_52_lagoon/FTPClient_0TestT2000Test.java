// FTPClient.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;

/**
 * An FTP client. See RFC-959.
 *
 * Pathnames must be specified using '/' for directory separator.
 * Passive mode will be used for all transfers.
 * <em>Not</em> thread-safe, i.e. you cannot start a new file while another one is in
 * progress.
 *
 * <strong>Note:</strong> This class will transmit password in clear text over
 * the network.
 */
public class FTPClient {

    /**
     * Stores a file on the FTP server.
     * 
     * @param pathname the pathname of the file to store
     * @return an OutputStream to write the file contents to
     * @throws FTPException if an error occurs during the FTP operation
     * @throws IOException if an I/O error occurs
     */
    public OutputStream store(String pathname) throws FTPException, IOException {
        return store(pathname, false);
    }
}

// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FTPClient}.
 * It contains ten unit test cases for the {@link FTPClient#store(String)} method.
 */
class FTPClient_0Test {
    
    /**
     * Test storing a file with a valid pathname.
     */
    @Test
    void testStoreValidPathname() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/to/file.txt");
            assertNotNull(outputStream);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a null pathname.
     */
    @Test
    void testStoreNullPathname() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store(null);
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Invalid pathname", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with an empty pathname.
     */
    @Test
    void testStoreEmptyPathname() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("");
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Invalid pathname", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname containing spaces.
     */
    @Test
    void testStorePathnameWithSpaces() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/with spaces/file.txt");
            assertNotNull(outputStream);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname containing special characters.
     */
    @Test
    void testStorePathnameWithSpecialCharacters() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/with!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/file.txt");
            assertNotNull(outputStream);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname that exceeds the maximum length.
     */
    @Test
    void testStorePathnameMaxLength() {
        try {
            FTPClient ftpClient = new FTPClient();
            String pathname = "/path/" + "a".repeat(255) + "/file.txt";
            OutputStream outputStream = ftpClient.store(pathname);
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Pathname too long", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname that exceeds the maximum length when URL-encoded.
     */
    @Test
    void testStorePathnameMaxLengthURLEncoded() {
        try {
            FTPClient ftpClient = new FTPClient();
            String pathname = "/path/" + URLEncoder.encode("a".repeat(255), "UTF-8") + "/file.txt";
            OutputStream outputStream = ftpClient.store(pathname);
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Pathname too long", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname that contains a directory traversal attack.
     */
    @Test
    void testStorePathnameDirectoryTraversal() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/../file.txt");
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Invalid pathname", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname that contains a null byte.
     */
    @Test
    void testStorePathnameNullByte() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/\0/file.txt");
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Invalid pathname", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
    
    /**
     * Test storing a file with a pathname that contains a newline character.
     */
    @Test
    void testStorePathnameNewline() {
        try {
            FTPClient ftpClient = new FTPClient();
            OutputStream outputStream = ftpClient.store("/path/\n/file.txt");
            fail("Expected FTPException not thrown");
        } catch (FTPException e) {
            assertEquals("Invalid pathname", e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}