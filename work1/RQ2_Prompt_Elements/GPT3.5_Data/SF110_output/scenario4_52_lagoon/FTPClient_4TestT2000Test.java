// Here is an example of how to test the FTPClient class using JUnit 5

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownHostException;

public class FTPClientTest {

    private static final String HOST = "ftp.example.com";
    private static final int PORT = 21;
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";
    private static final String PATH = "/test/";

    @Test
    public void testStoreUnique() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithLast() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("test.txt", true);
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
    }

    @Test
    public void testStoreUniqueWithEmptyPath() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, "");
        OutputStream out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithSlashPath() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, "/");
        OutputStream out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithSubdirectory() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("subdir/test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithNonexistentDirectory() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("nonexistent/test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithExistingFile() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.write("Hello again!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithExistingFileInSubdirectory() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("subdir/test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        out = client.storeUnique("subdir/test.txt");
        assertNotNull(out);
        out.write("Hello again!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithEmptyFile() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("test.txt");
        assertNotNull(out);
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueWithEmptyFileInSubdirectory() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique("subdir/test.txt");
        assertNotNull(out);
        out.close();
        client.close();
    }
}