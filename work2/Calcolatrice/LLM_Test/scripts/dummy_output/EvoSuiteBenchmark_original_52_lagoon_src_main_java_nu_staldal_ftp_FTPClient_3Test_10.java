// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
		
	/**
	 * @throws Exception This method always throws a {@link RuntimeException} for testing purposes
	 */
	@Test
	public void test() throws UnsupportedEncodingException, IOException {
    	// Create a test file on a FTP server
    	String name = ".empty";
    	File file = File.createTempFile(name, null, null);
    	OutputStream os = new FileOutputStream(file);
    	os.write(new byte[]{'x'});
    	os.flush();
    	os.close();
    	
    	// Try transferring
    	String pathname = file.getAbsolutePath().substring(1);    	
    	try {
    		FTPClient client = new FTPClient();
      	client.connect("ftp.stardal.nu");
    		// Client.connect("ftp.stardal.nu",false);

	    	// Append()
	    	OutputStream os = client.append(pathname, false);	         
	    	assertNotNull(os);
	    	String got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == pathname.length());
	    	byte result = new String(os.toByteArray()).getBytes()[pathname.length() + 1];
	    	assertEquals("File should be uploaded correctly", 'x', result);
    	    
	    	// Append("/")
	    	os = client.append("/", false);	        
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());
	    	
	    	// Append("")
	    	os = client.append("", false);	        
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());
	    	
	    	// Append("\\")
	    	os = client.append("\\", false);	        
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());
	    	
	    	// Append(pathname)
	    	os = client.append(pathname, false);	        
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());

	    	// Close()
	    	os = client.close();
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());

	    	// Close(/)
	    	os = client.close(true);
	    	assertNotNull(os);
	    	got = new String(os.toByteArray());
     	    assertNotNull(got);
	    	assertTrue(got.length() == file.getAbsolutePath().length());

	    	// Close(true)
     	    os = client.close(false);
     	    assertNotNull(os);
     	    got = new String(os.toByteArray());
     	    assertNotNull(got);
     	    assertTrue(got.length() == file.getAbsolutePath().length());
	    	
	    	// Close(false)
     	    os = client.close(true);
     	    assertNotNull(os);
     	    got = new String(os.toByteArray());
     	    assertNotNull(got);
     	    assertTrue(got.length() == file.getAbsolutePath().length());
		} finally {
			if (file!= null && file.exists())
				file.delete();
		}
    }
}