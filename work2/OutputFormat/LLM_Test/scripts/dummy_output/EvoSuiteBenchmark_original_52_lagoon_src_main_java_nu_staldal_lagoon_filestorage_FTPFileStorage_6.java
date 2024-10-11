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
* It contains one unit test case for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {
		
        public static final String PROTOCOL = "FTP";
        public static final String S_PORT = "21-5";
		
		private static final String TARGET = "localhost";
		private static final int PORT = 12;
		
        public static final File TEST_DIR = new File(System.getProperty("java.io.tmpdir"));
		    public static final String FILENAME = "FileTest.txt";
		    public static final int TEST_SIZE = 200;

        @org.junit.Test
        @TestSource(PARENT_DIR = TARGET, TARGET = TestTarget.TARGET_PROTOCOL_HAS_PORT)
        public void createFile_TargetHasPort(){
			try{
				this.remoteFile = FTPFile.getDefault().createFile(FILENAME, TEST_SIZE);
				assertTrue(this.remoteFile);
				assertNotNull(this.remoteFile.getFilename());
				assertEquals(FILENAME, this.remoteFile.getFilename());
			} catch(Exception e){	
				fail(e.getMessage());
			}			
		}
		
		
        @Test
        @TestSource(PARENT_DIR = TARGET, TARGET = TestTarget.TARGET_PROTOCOL_HAS_PORT)
        public void createFile_TargetHasSamePort(){
			try{
				this.remoteFile = FTPFile.getDefault().createFile(FILENAME, TEST_SIZE);
				assertTrue(this.remoteFile);
				assertNotNull(this.remoteFile.getFilename());
				assertEquals(FILENAME, this.remoteFile.getFilename());
				assertEquals(PORT, this.remoteFile.getPorts());
			} catch(Exception e){
				fail(e.getMessage());
			}
		}
	
        @Test
        @TestSource(PARENT_DIR = TEST_DIR, TARGET = TEST_DIR)
        public void createFile_Dir(File dir){
            assertNotNull(dir);	
            assertTrue(dir.exists());
            assertTrue(dir.canWrite());
            assertTrue(dir.getPath(), dir.canWrite());
            assertTrue(dir.equals(dir));
	    
            // We should get the name of the existing file to compare with the case it was named.
			File aFile = this.remoteFile.createFile(FILENAME, "", false);
			assertTrue(aFile.exists());		
			assertNotNull(aFile);	
			assertEquals(FILENAME, aFile.getName());
			
            assertEquals(dir, dir); 
        }
        
        @Test
        @TestSource(OUTPUT_DIR = TARGET, PORT = PORT)
        public void createFile_TargetWithoutPort(){
                try{
                    this.remoteFile = FTPFile.getDefault().createFile(FILENAME, TEST_SIZE);
                    assertTrue(this.remoteFile);
                    assertNotNull(this.remoteFile.getFilename());
                    assertEquals(FILENAME, this.remoteFile.getFilename());
                } catch(Exception e){
		    fail(e.getMessage());
                }       
        }
	
	@Test
        @TestSource(PARENT_DIR = FOLDER_DIR, TARGET = TARGET, PORT = PORT)
        public void createFolder_Target(){
            assertNotNull(FOLDER_DIR);		
        
            File folder = this.remoteFile.createFolder(FOLDER_DIR);
            assertNotNull(folder);	
            
            assertTrue(folder.exists());
            
            System.err.println("Remote path: "+this.remoteFile.getPath());
            Folder remoteFolder = this.remoteFile.getRemoteFolder();
            assertNotNull(remoteFolder);	
            assertTrue(remoteFolder instanceof folder);
            assertNotNull(remoteFolder);	
            
            assertFalse(folder.isDirectory());		
        }
        
}