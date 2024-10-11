// Source code for FTPClient_6Test.java

package nu.staldal.ftp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

/**
 * Test class of {@link FTPClient}.
 * It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
 */
class FTPClient_6Test {

    /**
     * Test deleting a file that exists.
     */
    @Test
    void testDeleteFileExists() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        ftpClient.login("username", "password");
        boolean result = ftpClient.deleteFile("/path/to/file.txt");
        assertTrue(result);
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file that does not exist.
     */
    @Test
    void testDeleteFileNotExists() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        ftpClient.login("username", "password");
        boolean result = ftpClient.deleteFile("/path/to/nonexistent.txt");
        assertFalse(result);
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid path.
     */
    @Test
    void testDeleteFileInvalidPath() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        ftpClient.login("username", "password");
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("invalid/path/file.txt"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid filename.
     */
    @Test
    void testDeleteFileInvalidFilename() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        ftpClient.login("username", "password");
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/invalidfile"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid username.
     */
    @Test
    void testDeleteFileInvalidUsername() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        assertThrows(FTPException.class, () -> ftpClient.login("invalidusername", "password"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid password.
     */
    @Test
    void testDeleteFileInvalidPassword() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        assertThrows(FTPException.class, () -> ftpClient.login("username", "invalidpassword"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid hostname.
     */
    @Test
    void testDeleteFileInvalidHostname() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(UnknownHostException.class, () -> ftpClient.connect("invalidhostname"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file with an invalid port number.
     */
    @Test
    void testDeleteFileInvalidPort() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        assertThrows(FTPException.class, () -> ftpClient.connect("ftp.example.com", 12345));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file while not logged in.
     */
    @Test
    void testDeleteFileNotLoggedIn() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/file.txt"));
        ftpClient.disconnect();
    }

    /**
     * Test deleting a file while already deleting another file.
     */
    @Test
    void testDeleteFileAlreadyDeleting() throws IOException, FTPException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("ftp.example.com");
        ftpClient.login("username", "password");
        ftpClient.deleteFile("/path/to/file1.txt");
        assertThrows(FTPException.class, () -> ftpClient.deleteFile("/path/to/file2.txt"));
        ftpClient.disconnect();
    }
}