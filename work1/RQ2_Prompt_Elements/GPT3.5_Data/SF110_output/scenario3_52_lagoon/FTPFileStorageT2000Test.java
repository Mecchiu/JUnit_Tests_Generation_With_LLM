// Here's an example implementation of the FTPFileStorage class and its test class:

// FTPFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;

/**
 * A FileStorage which transfers files to a remote site using FTP.
 *
 * <strong>Note:</strong> This class will transmit password in clear text over
 * the network.
 */
public class FTPFileStorage extends RemoteFileStorage {

    private String hostname;
    private String username;
    private String password;
    private FTPClient ftpClient;

    /**
     * Create a new FTPFileStorage instance.
     *
     * @param hostname the FTP server hostname
     * @param username the FTP server username
     * @param password the FTP server password
     */
    public FTPFileStorage(String hostname, String username, String password) {
        this.hostname = hostname;
        this.username = username;
        this.password = password;
        this.ftpClient = new FTPClient();
    }

    /**
     * Connect to the FTP server.
     *
     * @throws IOException if an I/O error occurs
     */
    private void connect() throws IOException {
        ftpClient.connect(hostname);
        ftpClient.login(username, password);
        ftpClient.enterLocalPassiveMode();
    }

    /**
     * Disconnect from the FTP server.
     *
     * @throws IOException if an I/O error occurs
     */
    private void disconnect() throws IOException {
        ftpClient.logout();
        ftpClient.disconnect();
    }

    /**
     * Create a new file, or overwrite an existing file.
     *
     * @param pathname path to the file
     */
    public OutputHandler createFile(String pathname) throws IOException {
        connect();
        OutputStream outputStream = ftpClient.storeFileStream(pathname);
        return new RemoteOutputHandler(outputStream) {
            @Override
            public void close() throws IOException {
                super.close();
                ftpClient.completePendingCommand();
                disconnect();
            }
        };
    }
}

// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {

    private static final String HOSTNAME = "ftp.example.com";
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    @Test
    void testCreateFile() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        OutputHandler outputHandler = fileStorage.createFile("/path/to/file.txt");
        assertNotNull(outputHandler);
        outputHandler.close();
    }

    @Test
    void testCreateFileWithInvalidPath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/invalid/path/file.txt");
        });
    }

    @Test
    void testCreateFileWithNullPath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        assertThrows(NullPointerException.class, () -> {
            fileStorage.createFile(null);
        });
    }

    @Test
    void testCreateFileWithEmptyPath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("");
        });
    }

    @Test
    void testCreateFileWithDirectoryPath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/path/to/directory/");
        });
    }

    @Test
    void testCreateFileWithExistingFile() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        OutputHandler outputHandler1 = fileStorage.createFile("/path/to/file.txt");
        assertNotNull(outputHandler1);
        outputHandler1.close();
        OutputHandler outputHandler2 = fileStorage.createFile("/path/to/file.txt");
        assertNotNull(outputHandler2);
        outputHandler2.close();
    }

    @Test
    void testCreateFileWithInvalidCredentials() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, "invalid", "invalid");
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/path/to/file.txt");
        });
    }

    @Test
    void testCreateFileWithClosedConnection() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        fileStorage.createFile("/path/to/file.txt").close();
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/path/to/file.txt");
        });
    }

    @Test
    void testCreateFileWithNullOutputStream() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        FTPClient ftpClient = fileStorage.getFTPClient();
        ftpClient.disconnect();
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/path/to/file.txt");
        });
    }

    @Test
    void testCreateFileWithIOException() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage(HOSTNAME, USERNAME, PASSWORD);
        FTPClient ftpClient = fileStorage.getFTPClient();
        ftpClient.disconnect();
        assertThrows(IOException.class, () -> {
            fileStorage.createFile("/path/to/file.txt").close();
        });
    }
}