// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
/**
		 * Test method for {@link ftp.FTPClient#storeUnique(String, boolean)}.
		 */
		@Test
		void testStoreUnique1()  throws Exception {
			changeDir("/"); // Test empty path case
			OutputStream out = null; 
			try {
				out = storeUnique(null, false);
			} catch (java.io.IOException ioe) {
				ioe.printStackTrace();
			}
			assertNonEmpty(out);
		}
	
		/**
	     * Test method for {@link ftp.FTPClient#storeUnique(String, boolean)}.
	     */
	    @Test
	    void testStoreUnique2()  throws Exception {
	    	changeDir("/"); // Test empty path case
	    	FTPClient client = new FTPClient(); 
	    	client.changeDir("/");
	    	File tempdir = new File(System.getProperty("user.dir") + File.separatorChar + "noecho");
	 	tempdir.mkdir();
	    	OutputStream out = null;
	    	try {
	    		out = client.storeUnique("/");
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	assertNonEmpty(out);
	 	}
	 
		/**
	     * Test method for {@link ftp.FTPClient#storeUnique(String, boolean)}.
	     */
	    @Test
	    void testStoreUnique3()  throws Exception {
			changeDir("/"); // Test empty path case
			FTPClient client = new FTPClient(); 
			client.changeDir("/");
			File tempdir = new File(System.getProperty("user.dir") + File.separatorChar + "noecho");
			tempdir.mkdir();
			OutputStream out = null;
	    	try {
	    		out = client.storeUnique("/");
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	assertNonEmpty(out);
	 	}
	 
		/**
	     * Test method for {@link ftp.FTPClient#storeUnique(String, boolean)}.
	     */
	    @Test
	    void testStoreUnique4()  throws Exception {
			changeDir("/"); // Test empty path case
			FTPClient client = new FTPClient(); 
			client.changeDir("/");
			File tempdir = new File(System.getProperty("user.dir") + File.separatorChar + "noecho");
			tempdir.mkdir();
			OutputStream out = null;
			try {
	    		out = client.storeUnique("/", false);
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	assertNonEmpty(out);
	 	}
	 
		/**
	     * Test method for {@link ftp.FTPClient#storeUnique(String, boolean)}.
	     */
	    @Test
	    void testStoreUnique5()  throws Exception {
			changeDir("/"); // Test empty path case
			FTPClient client = new FTPClient(); 
			client.changeDir("/");
			File tempdir = new File(System.getProperty("user.dir") + File.separatorChar + "noecho");
			tempdir.mkdir();
			OutputStream out = null;
			try {
	    		out = client.storeUnique("/", true);
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	assertNonEmpty(out);
	 	}
		
		/**
	     * Test method for {@link ftp.FTPClient#changeDir(java.lang.String)}.
	     */
	    @Test
	    void testChangeDir()  throws Exception {
	    	File tempdirectory = new File(System.getProperty("user.dir") + "noecho");
			changeDir(tempdirectory.getAbsolutePath());
		}

		// Change directory.

		private void changeDir(String dir) throws Exception {
			String newdir = dir + System.getProperty("file.separator") + "noecho";
			File newdirFile = new File(newdir);
			if (!newdirFile.exists()) {
				newdirFile.mkdirs();
			}
			File file = newdirFile.listFiles((int)newdirFile.length()).get(0);
			String fileContent = file.read();
			file.delete();

			OutputStream out = new FileOutputStream(dir + System.getProperty("file.separator") + "noecho");
			byte[] buffer = new byte[1 << 8];
			out.write(buffer);
			out.flush();

			System.err.println("File's content : " + fileContent);
		}

		private boolean assertNonEmpty(OutputStream out) throws java.io.IOException {
			byte[] byteInput = new byte[1 << 8];
			in.read(byteInput);
			String s = new String(byteInput);
			if (!(s.endsWith(".."))) {
				throw new IOException("Stored file is not a directory!");
			}
			return true;
		}

}
