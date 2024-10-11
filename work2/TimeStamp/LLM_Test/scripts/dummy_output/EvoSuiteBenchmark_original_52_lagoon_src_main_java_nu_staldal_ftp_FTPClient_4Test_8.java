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
* Constructor.
*
*/
	private final FTPClient _ftpClient = new FTPClient();
	static byte[] bytes="Hello java!".getBytes();

	/**
	* Test storing an existing file.
	*/
	@Test
	void testStoreUnique() throws Exception {
		_ftpClient.makeDirectory(null, "test");

		String path=null;
		String file="file0.dat";
				if(!_ftpClient.storeUnique(file))throw new Exception("Test 1 failed");
		if(!_ftpClient.storeUnique(path))throw new Exception("Test 2 failed");
	}

		/**
* Test storing an exists file.
* Use the directory, but do not change the user/pass in FTP3
*/
	@Test
	void testStoreUniqueForNonExistentFile() throws Exception {
		_ftpClient.makeDirectory("test2", null, "test");

		String path=getPath("test2/test2.dat");
		String file="file0.dat";
				if(!_ftpClient.storeUnique(file))throw new Exception("Test 3 failed");
		if(!_ftpClient.storeUnique(path))throw new Exception("Test 4 failed");
	}

		/**
* Test copying.
* Use the user, password file, directory and filename.
*/
	@Test
	void testStoreStringForExist() throws Exception {
		_ftpClient.makeDirectory(null, "test");

		String path=null;
		String file="file.txt";
		String dest="file0.dat";
		source=new FTPClient("localhost",4567);
		dest=new FTPClient("localhost",4567);
		dest=new FTPClient("localhost",456);
		String[] file=new String[]{"file0.dat"};

				if(!_ftpClient.storeString(dest, file, "user", null))throw new Exception("Test 4 failed");
		assertTrue(FileUtils.storeString(dest, file,"password", null));
	}

		/**
* The transfer of the content must fail because path is shorter.
*
* @throws IOException for other IO exceptions
*/
	@Test
	void testWriteRead() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(baos);
		String s="This is a test.";
		//write a single character
		osw.write('\n'); s="$PL";

		osw.flush();
		OutputStream out = _ftpClient.getOutputStream();
		try {out.write(baos.toString().getBytes());}
		catch(Exception e) {
			assertTrue(false);
		}
		out.close();


		//write three files
		_ftpClient.makeDirectory(null, "test");

		long total;
		String path=null;
		String file=null;
		//write a range
		System.setProperty("test.file.min.length", "100");
		total= (long)1 << 20;
		for(int i=0;i<20;i++) {
			path=getPath("test/file.1.dat");
			total-=1;
			if(_ftpClient.storeString(path, new String[]{"file", "2.dat"}, null)) {
				assertEquals("Wrong filename 1", "2.dat", new String(baos.toByteArray()));
				assertFalse(FileUtils.storeString(path, new String[]{"file", "1.dat"}, "user", null));
				total -= 1;
			}
		}

		//write a content
		path=getPath("test/file.txt");
		total-=1;
		if(_ftpClient.storeString(path, new String[]{"-"}, null)) {
			assertEquals("Wrong filename 1", "file0.dat", new String(baos.toByteArray()));
			total -= 1;
		}
		//write zero length content
		path=getPath("test/file.txt");
		total-=1;
		if(_ftpClient.storeString(path, new String[]{"-"}, bytes)) {
			assertEquals("Wrong filename 1", "file0.dat", new String(baos.toByteArray()));
			total -= 1;
		}

		//write content and two zerolength entries
		path=getPath("test");
		total-=1;
		osw.write("$PL\r\n"); osw.close();
		osw.write("2.dat"); osw.close();

		//transfer file1...
		try {total=total+1;}
		catch(IOException e){total=0;}
		total=total+1;
		while(total!= 0) {
			total = total-1;
			try {
				path=getPath("test/file.txt");
				total-=1;
				osw.write(path); osw.close();
				total -= 1;
				if(total < 1)fail("Failed to transfer");
			}
			catch(IOException e1) {
				System.out.println(e.toString());
			}
			try {total=total+1;}
			catch(IOException e1) {total=0;}
		}

		long expected;
		for(int i=0;i<10;i++) {
			path=getPath("test");
			total=0;
			while(total < total + 1) {
				total++;
				try {
					total=total+1;
					path=getPath(path);
					total-=1;
					if(_ftpClient.storeString(path, new String[]{"1.dat"})) {
						if(_ftpClient.storeString(path, new String[]{"0.dat"})) {
							expected=10;
						} else {
							assertFalse(true);
						}
					}
				}
				catch(IOException e) {
					assertFalse(true);
				}
			}
			assertFalse(total == total);
			if(expected == total)break;
		}


	}
}