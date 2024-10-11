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

    /**
     * Main method of {@link FTPFileStorageTest}.
	 * @param args arguments (the rest is ignored)
	 */
    @Test
    public void createFileTest() {
	    /*
	    * create a new file
	    */
	    try {
	    	String path = "/temp1.txt";
	        String temp = path + "/temp.txt";
	        byte data[] = new byte[32]; 
	        for(int i = 0; i < data.length; i++) {
	            data[i] = (byte)(i*10);
	        }
	        FileOutputStream fos = new FileOutputStream(temp);

	        OutputStreamWriter osw = new OutputStreamWriter(fos);
	        osw.write(data);
	        osw.close();
	        fos.close();
	        
	        // get the remote FTP server.
	        Server server = ServerManager.getInstance().getRemoteServer();
	        if(server == null) {
		        fail("Remote server is not present.");
	        }

	        String url = server.getURL();
	        
	        /*
	        * call the createFile method
	        */
	        FTPFileStorage ftpFileStorage = new FTPFileStorage(url);
	        String filePath = ftpFileStorage.createFile(path);
	        System.out.format("Remote URL = %s\n", url);
	        System.out.format("Remote File = %s\n", filePath);
	        System.out.println("---------------------------");
	        
	        FTPConfigFd file;
	        byte fileData[] = new byte [11];
	        BufferedInputStream bis;
	        bis = new BufferedInputStream(new FileInputStream(filePath));
	        for(int i = 0; i < 11; i++) {
	            fileData[i] = (byte) (i*3);
	        }
	        file = new FTPConfigFd(bis, 0, 0, 8192, fileData, 0);
	        System.out.format("Transfer to remote server.\n");
	        server.transferFrom(file, server.getRemoteAddress(), file);
	        System.out.format("Remote server transfer succeed!\n");
	        
	        /*
		* clean up
	 	*/
	        bis.close();
	        fos.close();
	    } catch (MalformedURLException | IOException ex) {
	        fail("createFile() failed.");
	    }
	}

}
