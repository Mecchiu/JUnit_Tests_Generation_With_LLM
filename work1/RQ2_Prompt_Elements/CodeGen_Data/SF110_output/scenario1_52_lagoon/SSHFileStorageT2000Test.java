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
		
	public SSHFileStorageTest()
	{
	}
	
	private final String rootPath = ".";
	
    @Test
    void testDefault() {
    }
	
    @Test
    void testSshPathToFile() throws IOException {
	    try {
    		assertTrue(SSHFileStorage.sshPathToFile.matches(rootPath + "/.SSH"));
    	}
    	catch( FileNotFoundException e ) { 
    		assertFalse(true);
    	}
    }

    @Test
    void testSshRelFileToFile() throws IOException {
	    try {
    		assertTrue(SSHFileStorage.sshRelFileToFile.matches(rootPath + "/file1"));
    	}
    	catch( FileNotFoundException e ) { 
    		assertFalse(true);
    	}
    }
	
    @Test
    void testFileToFile() throws IOException {
	    String content = "Content";
	    
	    try {
    		new File(rootPath + "/file1").createNewFile();
    		assertTrue(SSHFileStorage.fileToFile.matches(rootPath +"/file1/Contents"));
    	}
    	catch( FileNotFoundException e ) { 
    		assertFalse(true);
    	}
    	
    }
	
    @Test
    void testRelFileToRelFile() throws IOException {
	    String content = "Content";
	    
	    try {
    		File contentFile = new File(rootPath + "/file1");
    		contentFile.createNewFile();
    		assertTrue(SSHFileStorage.relFileToRelFile.matches(contentFile.getCanonicalPath()));
    	}
    	catch( FileNotFoundException e ) { 
    		assertFalse(true);
    	}
    	
    }
	
	String sshKey = null;
    
    @Test
	public void testGetSSHKeyToFile() {
        sshKey = System.getProperty("ssh.key.key");
	}
	
	@Test
	public void testSshFileToRelFile() throws IOException, FileNotFoundException {
        SSHFileStorage instance = new SSHFileStorage();
        String path = "some-path-for-testing_";
        //String path = "";

        String content = "Content";
        
        try {
            new File(rootPath + "/file1");
            File contentFile = new File(rootPath + path + "/file1");
            contentFile.createNewFile();
            assertTrue(contentFile.delete());

        } finally {
            if ((System.getenv("JAVAVMSPLASHSCRATCH_TEMP").endsWith(".txt") || System.getenv("JAVAVMSPLASHSCRATCH_TEMP").endsWith("__INPUT_SCRATCH"))) {
                new File(rootPath + "/").delete();
            }
        }

        File outFile = new File(rootPath + path + "/file1");
        OutputHandler target = new OutputHandler();
        target.write(outFile, content);
        try {
            new File(rootPath + "/").delete();
        } catch (Exception e) {
            assertEquals(e.getClass().getName(), "javarro.io.FileNotFoundException");
        }

        String contentOut = target.getContents();
        assertEquals(content, contentOut); //the output to be read was written to file
        //assertEquals(StringUtils.nullToEmpty(contentOutput), contentOutput); //there was no need to delete output file and content file
        // assertTrue(contentFile.delete());

    }	    
    
    @Test
	public void testFileToString() throws IOException {
            String content = "content";
            String out = new File(rootPath + "/file1/Contents").toString();
            String outString = "Contents of the file";

            try {
		    SSHFileStorage instance = new SSHFileStorage();
                //String path = "";
                //String content = "content";
                instance.setSSHKeyToFile(content);
                instance.fileToString.set(out);
                instance.fileContentToContent.set(content);
		} catch (Exception ioe) {
		    System.out.println("IOException " + ioe.getMessage());
		}

            assertEquals(out, outString);
            String content = "Some content\nof content (with line break)";
            File outFile = new File(rootPath + "/file1");
            FileUtils.stringToFile(content, outFile);

            assertEquals(StringUtils.nullToEmpty(content), outFile.readLine());
    }
	
}
