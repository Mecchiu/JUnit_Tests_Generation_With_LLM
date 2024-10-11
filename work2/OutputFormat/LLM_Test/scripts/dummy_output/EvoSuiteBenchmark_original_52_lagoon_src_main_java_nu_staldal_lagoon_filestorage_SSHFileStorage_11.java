// SSHFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHFileStorage}.
* It contains one unit test case for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorageTest {
		
    /**
     * Test the createFile("file") method of {@link SSHFileStorage}.
     * @throws java.io.IOException If there was a problem during the execution
     * of the script,
     * @see #createFile(String)
     */
    @Test
    public void createFile() throws java.io.IOException {
        SSHServer server = new SSHServer();
        SSHServer.Port port = server.createPort();
        String path = "/test";
        SSHTemporaryFileDestination tempfs = new SSHTemporaryFileDestination();
        SSHTemporaryFileDestination tempfd = tempfs.createFailedTempFile("tempfs", null);
        assertNotNull(tempfd);
        SSHFileStorage ssfs = new SSHFileStorage("test", new File("target"), port, ssfsClient());

        SSHSelfInfo info = new SSHSelfInfo(tempfd);
        ssfs.deleteFile("/a");
        final OutputProcessAdapter processor = new OutputProcessAdapter(
                new java.io.PrintStream(new java.io.BufferedOutputStream(tempfs.getOutputStream())));
        ssfs.deleteFile("/a", processor);
        File output = sshfs.uploadFile(new File("/a"), path);
        assertTrue(output.exists());
        assertTrue(output.isFile());
        assertTrue(output.getAbsolutePath().endsWith("/myfile"));
        tempfs.delete(tempfd);

        SSHFileStorage ssfs2 = new SSHFileStorage("test", output, port, ssfsClient());
        SSHTemporaryFileDestination tempfs2 = new SSHTemporaryFileDestination();
        try (SSHFileStorage ssfs3 = new SSHFileStorage("test", new File("/b"), port, ssfsClient())) {
             assertEquals(ssfs2.getFile().getAbsolutePath(), ssfs3.getFile().getAbsolutePath());
        }
    }
    
    /**
     * Constructor of SSHFileStorageTest.
     * @param path path to the remote site
     * @throws java.io.IOException If there was a problem during the execution
     * of the script,
     * @see #SSHTempFileDestination
     * @see #createFile
     */
    SSHFileStorageTest(String path) throws IOException {
        SSHTemporaryFileDestination tempfd = new SSHTemporaryFileDestination("/tempfs",null,null);
		SSHSelfInfo info = new SSHSelfInfo(tempfd);
		SSHFileStorage ssfs = new SSHFileStorage("localhost", new File("file"),  new SSHServer().findPort(), ssfsClient());
		SSHTemporaryFileDestination tempfs = new SSHTemporaryFileDestination();
        new SSHTemporaryFileDestination("/remote", new File("remote"), ssfsClient());
		SSHFileStorage ssfs2 = new SSHFileStorage("test", new File("/remote"),  new SSHServer().findPort(), ssfsClient());
		InputProcessAdapter inputProcessAdapter = new InputProcessAdapter(
				 new java.io.Reader(new java.io.BufferedReader(new BufferedReader(new InputStreamReader())))) ;
		SSHTemporaryFileDestination tempfs2 = new SSHTemporaryFileDestination();
        SSHFileStorage ssfs3 = new SSHFileStorage("test", new File("/b"),  new SSHServer().findPort(), ssfsClient());
        SSHTemporaryFileDestination tempfs3 = new SSHTemporaryFileDestination();

        int sslPort = ssfs.getSSLPort();
        int port = ssfs2.getSSLPort();
        SSHFileStorage ssfs4 = new SSHFileStorage("test", new File("remote"), ssfsClient());

        String protocol = ssfs3.getProtocol();
        boolean localProtocol = ssfs3.getProtocol() == protocol;
        assertNotNull(localProtocol);

        String sslkeypassword = ssfs4.getSSLKeyPassword();
        boolean localSSLKeyPassword = ssfs4.getSSLKeyPassword()!= null;
        assertNotNull(localSSLKeyPassword);

        SSHURL url = ssfs4.getUrl();
        assertNotNull(url);

        SSHServer sshs = new SSHServer();

        SSHDestroy destroy = sshs.getDestruction();
        SSHDestroy fdDestroy = ssfs.getFileDestruction();
        SSHFileStorage ssfs5 = new SSHFileStorage("file", new File("remote"), port, ssfsClient());

        String content = "Content  " + sslPort;
        if(path.startsWith("remote")) {
        	content=path;
        }
        try (SSHPacket pkt1 = new SSHPacket(new InputStream(new StringReader("Content   " + port)), content.getBytes())) {
        	//create file
        	SSHFileStorage ssfs6 = new SSHFileStorage("remote", new File("remote"), port, ssfsClient());

            OutputProcessAdapter outputProcessAdapter6 = new OutputProcessAdapter(
                    new java.io.PrintStream(new StringWriter()), new java.io.PrintStream(new OutputStreamWriter(new File(path).path(), ssfsClient().getCharset())));
            SSHFileStorage ssfs7 = new SSHFileStorage("testlocal", outputProcessAdapter7, port, ssfsClient());

            FileOutputStream file = ssfs.uploadFile(new File(path));
            file.write(ssfs6.getFile().getBytes());
            ssfs6.uploadDone(fdDestroy);
            ssfs7.uploadFile(new File(path), file);

            ssfs.uploadFile(new File(path), file);
            ssfs.uploadFile(new File(path), file);

	        ssfs.uploadFile(new File(path), file);
			ssfs.uploadFile(new File(path), new File("remote"));
			ssfs.uploadFile(new File(path), new File("remote"));
            if(!ssfs.deleteFile(new File(path))) {
                sshs.deletFile(new File(path));
                return;
            }
        }
        
        
        SSHAuditorSession session = sshs.newSession();

        InputProcessAdapter inputProcessAdapter2 = new InputProcessAdapter(
                new java.io.StreamReader(new StringReader(path)), new java.io.PrintStream(new OutputStream(new java.io.FileOutputStream(file.getAbsolutePath()), ssfsClient().getCharset())));

        SSHFileStorage ssfs8 = new SSHFileStorage("testlocal", file, session, ssfsClient());
        sshs.uploadFile(file);
}
}