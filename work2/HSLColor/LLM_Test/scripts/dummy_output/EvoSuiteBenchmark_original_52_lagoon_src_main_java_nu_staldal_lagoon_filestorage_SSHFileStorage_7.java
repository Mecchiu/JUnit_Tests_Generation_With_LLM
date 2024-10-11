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
		SSHFileStorageTest() {
		}
		
	@Test
	public void testSSHFileStorage() throws java.io.IOException {
		RemoteFileStorage path = null;
		RemoteFileStorage path2 = null;
		String remoteHostname = LagoonContext.getSystemContext().getRemoteHost() == null? "null" : LagoonContext.getSystemContext().remoteHost() == null? "" : LagoonContext.getSystemContext().remoteHost();
		String remoteHostname2 = LagoonContext.getSystemContext().getRemoteHost() == null? "/" : LagoonContext.getSystemContext().remoteHost() == null? "" : LagoonContext.getSystemContext().remoteHost() + "/";
		
		String remoteName = remoteHostname;
		remoteName += (System.currentTimeMillis() / 1000 % 10000).toString() + 1;

		Object[] args = new Object[] { remoteName };

		try {
			RemoteFileStorage result = RemoteFileStorage.getInstance(remoteName, true);
			assertNotNull(result);

			assertTrue("remote hostname is null", result.getRemoteInfo().getHostname()!= null);
		} catch(Exception e) {
			fail(e.getMessage());
		}
		
		RemoteFileStorage result2 = RemoteFileStorage.getInstance(remoteName, false);
		assertNotNull(result2);

		assertTrue("remote hostname is null", result2.getRemoteInfo().getHostname()!= null);
		
		Object[] args2 = new Object[] { remoteName };
		try {
			result2.saveFile(new FileOutputStream("remote2host.txt"));
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		//assertEquals("Remote file 1", "remote1file.txt", ((RemoteFileStorage) result).getName());

		//createFile("remote2host.txt");
		
		RemoteFileStorage result3 = RemoteFileStorage.getInstance(remoteName+".bck", true);
		assertNotNull(result3);

		assertTrue("remote hostname is null", result3.getRemoteInfo().getHostname()!= null);
		
		Object[] args3 = new Object[] { remoteName };
		
		FileOutputStream fos = new FileOutputStream("remote3host.txt");
		try {
			//result3.saveFile(fos);
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		try {
			assertTrue("remote hostname is ", result3.getRemoteInfo().getHostname().equalsIgnoreCase(remoteHostname)? true : false);
			assertTrue("Remote file 2", fileExists("remote2host.txt"));
			assertFalse("Temp file exists", fileExists("remote2host.txt"));
		} catch ( MalformedURLException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		Object[] args4 = new Object[] {};
		result3.saveFile(fos);
		try {
			assertTrue("Remote file 3", fileExists("remote3host.txt"));
			assertFalse("Temp file exists", fileExists("remote3host.txt"));
		} catch ( MalformedURLException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		try {
			result2.saveFile(fos);
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		try {
			result3.getRemoteInfo().toURI();
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		// try to save remote file
		
		try {
			result3.saveFile(fos);
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		try {
			assertTrue("Remote file 4", fileExists("remote4host.txt"));
		} catch ( MalformedURLException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
		RemoteFileStorage remoteFile = RemoteFileStorage.getInstance("remote4host.txt", false);
		assertNotNull(remoteFile);
		assertEquals("remote4file.txt", remoteFile.getName());
		assertFileExists("remote4file.txt");
		
		try {
			remoteFile.saveFile(new FileOutputStream("newfile"));
		} catch ( IOException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		try {
			assertFalse("Temp file does not exists", fileExists("newfile"));
		} catch ( MalformedURLException e ) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
		FileSystemStorage fs = FileSystemStorage.getInstance();
		Path remoteFs;
		try {
			remoteFs = fs.getPath(remoteName);
		} catch(FileSystemException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		RemoteFileStorage remoteFile2 = RemoteFileStorage.getInstance("newfile", false);
		assertNotNull(remoteFile2);
		assertEquals("newfile", remoteFile2.getName());
		assertFileExists("newfile");
		
		fs.close();
	}
	
	
	File fileExists(String path) throws FileSystemException, IOException {
		RemoteFileStorage fs = FileSystemStorage.getInstance();
		Path remoteFs = fs.getPath(path);
		
		Path remoteFile = fs.getPathFromRemote(remoteFs);
		
		assertTrue("remoteFs:" + remoteFs.toString() + " remoteFile:" + remoteFile.toString(), remoteFile.toString().contains(path));
		
		return fileExists(remoteFile);
	}
	
	public boolean fileExists(Path remotePath) {
	    if (remotePath.toUri()!= null) {
	        RemoteFileStorage.setRemoteInfo(remotePath, remotePath.toUri().toURL().toString());
	        RemoteFileStorage fs = RemoteFileStorage.getInstance();
	        remotePath = fs.getPathFromRemote(remotePath);                
	    }
	    
	    
}
}