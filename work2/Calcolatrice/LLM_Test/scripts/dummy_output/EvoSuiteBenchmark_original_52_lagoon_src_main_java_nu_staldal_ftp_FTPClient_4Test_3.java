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
		
    /**
     * Test case where the FTP client will try to create an existing file,
     * and then transfer file.
	 * @throws Exception any unexpected exception
	 */
	@Test
    public void test() throws Exception {

		OutputStream o = null;
		InputStream i = null;
		try {

		    o = new ByteArrayOutputStream();
            i = new FileInputStream("C:/Users/test/Desktop/test.txt");
            // Use a local file
            File file = new File("C:/Users/test/Desktop/test.txt");
			FTPClient client = new FTPClient();
			client.connect("ftp.stardal.se", 21);
			String currentUser = "test";
			String serverName = "localhost";
			String[] currentUserParts = currentUser.split(":");
			int currentUserIndex = 0;
			int total = 1;
			while(currentUserIndex < currentUserParts.length) {
			    String user = currentUserParts[currentUserIndex]; 
			    currentUserIndex++; 
			    while(currentUserIndex < currentUserParts.length) {
			        String part = currentUserParts[currentUserIndex];
			        if(part.charAt(1) == '/' && part.charAt(2) == '/') {
			        	break;
			        } else {
			            currentUserIndex++;
			        }
			    }
			    
			    if(client.login(user, currentUser) == false) {
			    	
			    }
			    else {
			    	total++;
			    }
			}
			client.completePending();
			client.login(serverName, "test");
		    String newName = client.storeUnique(currentUser + ":" + file.getPath());
		    todoCheck(newName);
			out.flush();
			in.reset();
			int read = 1;
			if(out.checkC() == false) {
			    out.flush();
			    read = 0;
			}		
			in.reset();
			int len;
			byte buf[] = new byte[4096];
			do {
			    len = i.read(buf);
			    if(len > 0) {
				out.write(buf, 0, len);
			    }
			    if(read == 1) {
				in.flush();
				read = 0;
			    }
			}
			while(read > 0);
		    todoCheck(file.getName());
			// No need to check fileExists, because this is
			// done by FTPClientImpl.storeUnique
		    out.flush();
		    //noinspection IORequiredAware
		    i = o;
			o = new ByteArrayOutputStream();
			client.logout();
			todoCheck("Logout");
			client.parse(o);
			todoCheck(o.toString());
		    //assertFalse("File already exists, need to copy it",
		    //		  file.exists());
			out.flush();
			out.checkC();
		}
		catch(IOException e) {
		    
		}
		finally {
		    if(out!= null) {
			out.flush();
		    }
			if(o!= null) {
			    out.close();
			    
		    }
		    if(i!= null) {
			i.close();
		    }
		    
		    //close() is called implicitly, therefore we have not to check
		    //the result of this call
			
		}
		todoCheck("Exception thrown");
	}
	
	private void todoCheck(String content) throws  IOException {
		out.write(content.getBytes());
		out.flush();
	}
	
	private void todoCheck(String content, int expected) throws  IOException {
		
		byte array[] = new byte[512];
		out.flush();
		int read = in.read(array);
		assertEquals(expected, read);
		
	}
	
}