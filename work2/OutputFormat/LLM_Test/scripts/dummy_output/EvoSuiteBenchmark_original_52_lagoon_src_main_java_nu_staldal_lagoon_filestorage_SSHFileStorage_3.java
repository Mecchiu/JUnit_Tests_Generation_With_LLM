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
		
    // Static test members
    SSHFileStorage _storage;
    RemoteFileStorage _remote;

    String _remoteUri;
    File _file;

    /*
     * Create the storage for testing.
     */
    @Test
    public void testCreateFile() throws IOException, MalformedURLException {

        FileStorage storage = new RemoteFileStorage();

        System.err.println("testCreateFile");

        // make the remote file
        String s = "Test file";
		_remote = FileServer.newStorage("remote1", s);
		assertNotNull(_remote);

        _remoteUri = "remote1/" + s;

        // create the storage
        File storageFile = storage.createFile(_remoteUri);

		System.out.println("Remote uri: " + storageFile.getAbsolutePath());

		assertNotNull(_remote.getFile(_remoteUri));

        _file = storageFile.getAbsoluteFile();

        assertNotNull(storageFile);
        assertNull(_storage.getFile(_remoteUri));
    }


    /*
     * Test that we can get a URI to a file or an alias.
     */
    @Test(expected = IOException.class)
    public void testNoFile() throws IOException, MalformedURLException {

        FileStorage storage = new RemoteFileStorage();

        System.err.println("testNoFile");

        // create the storage
        FileStorage storageFile = storage.createFile("uri");

        assertNotNull(storageFile);
        assertNull(storageFile.getFile("uri"));

        // create the storage
        String s = "Test";
        _remote = FileServer.newStorage("remote1", s);
        _remoteUri = "remote1/" + s;

        storageFile = storage.createFile(_remoteUri);

		Assert.assertTrue(_storage.getFile(_remoteUri).equals(storageFile));

        storageFile = storage.createFile("remote2/"+s);

		assertTrue(_remoteUri.startsWith("remote1/") || _remoteUri.startsWith("remote2/"));
        assertEquals(_remoteUri, storageFile.getAbsolutePath());


        // no storage exists 

        assertNotNull(storageFile);
        assertNull(_storage.getFile(_remoteUri));

    }

    /**
	 * Test that we can get a URI to a file (and not a remote file) and return
	 * an OutputStream.
	 */
    @Test(expected = IOException.class)
    public void testGetFileStream() throws IOException {

        SSHFileStorage s = new SSHFileStorage();
        File temp = Files.createTempFile("file", "test");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[10];
        new FileInputStream(temp).read(buffer);
        bao.write(buffer);
        
        // create the storage
        s = s.createFile("uri", baos);

        assertNotNull(s.getFile("uri"));
        OutputStream fout = s.getFileStream("uri");

        int i;

        while ((i = baos.read())!= -1) {
            bao.write(i);
        }

        assertFalse(fout.available());
        OutputStream fout2 = s.getFileStream("uri");
    }

    /**
	 * Test that we can read an InputStream from a file using SSH
	 */
    @Test
    public void testGetStream() throws IOException {

		SSHFileStorage s = new SSHFileStorage();
        InputStream in = null;
        
        File temp = Files.createTempFile("file", "test");

        in = s.getFileStream("uri");

        byte[] b = new byte[10];
        int i = 0;

        while ((i = in.read(b))!= -1) {
            System.out.print(new String(b));
            System.out.print("\t");
            bao.write(b);
        }

        assertEquals(9, bao.size());

        assertFalse(in.available());

        System.out.println("File size: " + temp.length());		

        // store the size of the file
        assertTrue(temp.length() > 0);

        in = s.getFileStream("uri");

        FileOutputStream fos = new FileOutputStream(temp.getAbsoluteFile());

        int i2 = 0;

        while ((i2 = in.read(b))!= -1) {
            bao.write(b);
        }

        fos.close();

        System.err.println("Read " + temp.length() + " bytes");

        assertTrue(temp.length() > 0);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[4];
        while ((i2 = in.read(buffer))!= -1) {
            bao.write(buffer, 0, i2);
        }
        assertTrue(temp.length() > 0);

        assertEquals(buffer[1], bao.toByteArray()[1]);
        //System.out.println(baos.toByteArray());
        try {
            FileOutputStream fos2 = s.getFileStream("uri");
            fos2.write(temp.getAbsoluteFile().getAbsolutePath(), buffer);
            fos = new FileOutputStream(temp.getAbsoluteFile());
            assertEquals(temp.length() + 4, fos.length());
            fos.write(buffer, 0, 4);
            fos.close();
        }
        catch (IOException x) {
            assertTrue(false);
        }
    }

}