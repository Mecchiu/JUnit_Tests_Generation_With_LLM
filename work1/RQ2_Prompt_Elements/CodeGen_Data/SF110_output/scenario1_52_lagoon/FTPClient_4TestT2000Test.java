// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {

    @Test
    void test() throws Exception {
        String targetPath = "/home/foo.gz";
        String clientPath = "/home/foo";

        // create fake FTP client
        String fcp = "fcp " + clientId();
        
        // perform operation
        int clientResult = FTPClient_4Test.run(fcp, clientPath, targetPath, true);
        
        // verify operation succeeded
        assertEquals("Called FTP server does not return a CWD", clientResult, 0);
        
        assertEquals("Wrong target path returned", targetPath, "/");
    }

    /**
     * @param fcp FTP command.
     * @param clientPath FTP client directory.
     * @param targetPath Target path.
     * @param expectFail if true, the operation fails if the connection is
     *  invalidated with the incorrect password.
     * @return clientResult (0 or 1)
     * @throws IOException on communication error or connection error.
     */
    private int run(String fcp, String clientPath, String targetPath, boolean expectFail)
            throws IOException, FTPException {
        int clientResult = FTPClient.CMD = ftpcmd.command(fcp);
        if (expectFail) {
            clientResult = clientResult * 0;
        }
        assertTrue(clientResult > 0);

        if (targetPath!= null) {
            String dstDir = targetPath.substring("/".length());
            String fileName = clientPath.substring(dstDir.length() + 1);

            String serverFTP = "/home/";

            String filenameCopy = dstDir + fileName;

            clientResult = FTPClient.CMD = ftpcmd.command("Rename", filenameCopy);
            if (expectFail) {
                clientResult = clientResult * 0;
            }
            assertTrue(clientResult > 0);
            clientResult = FTPClient.CMD = ftpcmd.extcmd("FAIL");
            if (expectFail) {
                clientResult = clientResult * 0;
            }
            assertTrue(clientResult == FTPClient.CMD);
            clientResult = FTPClient.CMD = ftpcmd.command("Rename", clientPath);
            if (expectFail) {
                clientResult = clientResult * 0;
            }    
            assertTrue(clientResult == FTPClient.CMD);

            // create another server FTP client
            clientResult = FTPClient_4Test.run(fcp, clientPath, targetPath, true);

            assertEquals("Called FTP server does not return a CWD", clientResult, 1);
        }
        return clientResult;
    }

    /**
     * Creates a FTP client as test case for {@link #FTPClient_4Test#FTPClient_4Test()}.
     */
    private static void createFTPClientTestCase() {
        int port = 21;
        int retry = 0;

        String protocol = "imap";
        String targetPath = "/home/";
        String clientPath = "/home/";
        int maxRetries = 10;
        boolean expectPasswd = true;

        try {
            FTPProtocol protocol = create(port, protocol);
            FTPClient client = new FTPClient(protocol, targetPath);
            client.connect("localhost", port);
            // create new client to test FTPClient_4Test.run
            client.login(protocol, client.getPasswd());
            if (!client.isConnected()) {
                throw new IOException("Connection does not exist");
            }

            while (retry <= maxRetries) {
                // create new client to test FTPClient_4Test.run
                client = new FTPClient(protocol, serverPath());
                client.connect("localhost", port);
                client.login(protocol, retry > 0? client.getPasswd() : null);
                if (client.isConnected()) {
                    retry++;
                } else {
                    break;
                }
            }

            client.close();
            // if failed, close only on expected failure
            if (!expectFail) {
                serverFTP = "/";
            } else {
                serverFTP = targetPath + "/";
            }
            client = new FTPClient(protocol, serverFTP, clientPath);

            if (!client.isConnected()) {
                throw new IOException("Could not connect to FTP server");
            }

            client.connect("localhost", port);
            server = client;
            client.login(protocol, server.getPasswd());
            // verify
            assertTrue(client.isConnected());
            assertTrue(client.isTransferSocketActive());

        } catch (FTPException e) {
            System.err.println("test for FTPClient_4Test failed: " + e);
            e.printStackTrace();
            // if not expected exception and retries > 0
            if (retry == 0) {
                throw e;
            }

        }
    }
    
    private static FTPClient client = null;
    private static FTPClient server;
    private static String serverPath = null;
    private static String clientPath = null;
    private static boolean expectFail = true;
    private static String targetPath = null;    

    private static void verifyFTPClient() {
        if (expectFail) {
            return;
        }

        FTPClient client = server;
        while (client!= null) {
            client.close();
            client = null;
            server = null;

            if (getServerConnectionException(client, false)) {
                return;
            }

            try {
                client = create(client.getPort(), client.getProtocol());
                client.login(client.getPasswd(), client.getPasswd());
            } catch (IOException err) {
                // if not expected exception
            }
        }             
        assertTrue("Connection is not active",
            getServerConnectionException(server, false));
        targetPath = "/";
    }

    public static boolean getServerConnectionException(FTPClient _client, boolean isExpectFail) { 
        int retry = 0;
        boolean clientConnected = _client.isConnected();
        boolean serverConnected = server!= null? server.isConnected() : true;

        while (retry <= maxRetries) {
            // create new client as test case for {@link #createFTPClientTestCase()}
            FTPClient_4Test client = new FTPClient_4Test();
            _client = create(client.getPort(), client.getProtocol());
            client.connect("localhost", client.getPort());

            // verify
            assertTrue("Could not connect to FTP server", client.isConnected());

            // server connection failure
            if (server!= null &&!serverConnected) {
                try {
                    _client.login(client.getPasswd(), client.getPasswd());
                } catch (IOException err) {
                    assertTrue("Could not login to FTP server", false);
                }
            } else {
                client.isTransferSocketActive();
            }

            // connect
            server = _client;
            client.connect("localhost", client.getPort());

            // verify

            if (isExpectFail || (server!= null &&!serverConnected)) {
                assertTrue("The connection is not allowed to fail", client.isTransferSocketActive());
                assertTrue("Connection failed",
                    client.