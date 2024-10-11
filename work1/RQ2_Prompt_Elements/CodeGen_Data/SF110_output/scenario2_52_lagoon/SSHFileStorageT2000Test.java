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
// SSHFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;

/**
 * A FileStorage which transfers files to a remote site using SSH.
 */
public class SSHFileStorage extends RemoteFileStorage {

    /**
     * Create a new file, or overwrite an existing file.
     * Use close() on the returned OutputStream when finished
     * writing to the file, and then commitFile() or discardFile()
     * on the FileStorage.
     *
     * @param path path to the file
     * @return an OutputStream to write to
     * @see #commitFile
     * @see #discardFile
     */
    public OutputHandler createFile(String path) throws java.io.IOException {
        String currentPath = path;
        String s = rootPath + path;
        int i = s.lastIndexOf('/');
        String dir = (i < 0)? "." : s.substring(0, i);
        if (DEBUG)
            System.out.println("dir: " + dir);
        Process currentProc = runSSH(new String[] { "mkdir", "-p", dir, "&&", "rm", "-f", rootPath + path, "&&", "cat", ">" + rootPath + path });
        return new SSHOutputHandler(currentPath, currentProc, currentProc.getOutputStream());
    }
}

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
		private final RemoteFileStorage rfs = new RemoteFileStorage();
		private final File tmpDir;

	/**
	* Creates a new SSHFileStorageTest.
	*
	* @param temporaryDirectory used for temporary files
	* @throws MalformedURLException if the temporary directory cannot be parsed
	* @throws IOException if the temporary file cannot be created
	*/
	SSHFileStorageTest(String temporaryDirectory) throws MalformedURLException, IOException {
		tmpDir = FileStorage.getTempDir(temporaryDirectory);
		if (!LagoonContext.isContextCreated(tmpDir)) {
			LagoonContext.setContext(new LagoonContext(null, tmpDir));
		} else {
			assertTrue("Context already created", LagoonContext.isContextCreated(tmpDir));
		}
	}

	/**
	* Tests a successful execution via the command line.
	* The "-" flag is interpreted as a path to a temporary file and is used to create the remote temporary file.
	* @throws java.io.IOException if the remote temporary file could not be created
	*/
	@Test
	void successfulCmdNoTemp() throws IOException {
		// create a temporary file
		rfs.createFile("_tmp/file.txt");

		// invoke createFile(tmpDir), passing in the temporary file
		OutputHandler stdout = rfs.createFile("_tmp/file.txt");
		OutputHandler stderr = rfs.createFile("_tmp/file.txt");
		OutputHandler stderr2 = rfs.createFile("_tmp/file.txt");

		// test the output stream, if anything
		assertTrue("CommandOutputHandler.getOutputStream() returned a stream", rfs.getOutputStream() instanceof FSOutputStream);

		try {
			stdout.write("this is a test");
			stdout.close();
			assertEquals("Test", String.valueOf(stdout.getResult()), "this is a test");
		} catch (IOException expected) {
			assertFalse("CommandOutputHandler.getResult() throws an I/OException", true);
			// should never happen
			expected.printStackTrace();
		}

		// run ssh, and check the result of the process
		rfs.runSSH(new String[]{
				"ssh",
				"-o",
				"Password=secret",
				tmpDir + "/file.txt",
				"-v"

		});

		assertEquals("There should be 1 file in the remote filesystem", 1, rfs.getRemoteFile(tmpDir + "/file.txt").list().length);
		RemoteFileStorage.copy(new File(rfs.openRemoteFile(tmpDir + "/file.txt").getURL().toExternalForm()), tmpDir + "/temp/file.txt", stdout);

		assertEquals("Test",String.valueOf(stdout.getResult()), "this is a test\n");
		rfs.removeRemoteFile(tmpDir + "/file.txt", stderr);
		rfs.removeRemoteFile(tmpDir + "/temp/file.txt", stderr2);
	}


	/**
	 * Unit tests for {@link SSHFileStorage#createFile(String)}
	 */

	@Test
	void createFile_string() {
		assertNotNull(new SSHFileStorage().createFile(tmpDir + "/file.txt"));
	}

	@Test
	void createFile_badParameter() {
		try {
			new SSHFileStorage().createFile("file-does-not-exist");
			fail("Should throw an exception");
		} catch (FileNotFoundException expected) {}
	}
}

class SSHOutputHandler implements OutputHandler {
	String remotePath;
	Process proc;
	BufferedReader stdout;
	BufferedReader stderr;
	
	public SSHOutputHandler(String remotePath, Process proc, OutputStream os) {
		this.remotePath = remotePath;
		this.proc = proc;
		this.stdout = new BufferedReader(new InputStreamReader(os));
		this.stderr = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
	}
	
	public BufferedReader getStdoutReader() {
		return stdout;
	}
	
	public BufferedReader getStderrReader() {
		return stderr;
	}
	
	public int getResult() throws IOException {
		return this.proc.waitFor();
	}
	
	public void writeResult(int result) {
		try {
			this.proc.destroy();
			this.remotePath = null;
		} catch (Exception x) {
			x.printStackTrace();
		}
	}
	
	@Override
	public void write(String s) throws IOException {
		proc.destroy();
		stdout.write(s);
		stdout.flush();
	}

	@Override
	public void write(int n) throws IOException {
		proc.destroy();
		stderr.write(n);
		stderr.flush();
	}
	
	public OutputStream getOutputStream() {
		return new BufferedOutputStream(stdout.getOutputStream());
	}

	public InputStream getInputStream() {
		return new BufferedInputStream(stderr.getInputStream());
	}

	@Override
	public void flush() throws IOException {
		
	}

	@Override
	public void close() throws IOException {
	}

	@Override
	public void error(String s) {
		this.proc.destroy();
		this.remotePath = null;
	}
}
