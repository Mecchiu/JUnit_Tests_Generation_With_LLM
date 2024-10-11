// Here is an example of how to test the FTPClient class using JUnit 5:

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
    public void testStore() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.store("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreLast() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.store("test.txt", true);
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
    }

    @Test
    public void testAppend() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.append("test.txt");
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testAppendLast() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.append("test.txt", true);
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
    }

    @Test
    public void testStoreUnique() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique(PATH);
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
        client.close();
    }

    @Test
    public void testStoreUniqueLast() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        OutputStream out = client.storeUnique(PATH, true);
        assertNotNull(out);
        out.write("Hello, world!".getBytes());
        out.close();
    }

    @Test
    public void testDeleteFile() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        assertTrue(client.deleteFile("test.txt"));
        client.close();
    }

    @Test
    public void testChdir() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        assertTrue(client.chdir("/"));
        client.close();
    }

    @Test
    public void testCdup() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        assertTrue(client.cdup());
        client.close();
    }

    @Test
    public void testMkdir() throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
        FTPClient client = new FTPClient(HOST, PORT, USERNAME, PASSWORD, PATH);
        assertTrue(client.mkdir("newdir"));
        client.close();
    }
}