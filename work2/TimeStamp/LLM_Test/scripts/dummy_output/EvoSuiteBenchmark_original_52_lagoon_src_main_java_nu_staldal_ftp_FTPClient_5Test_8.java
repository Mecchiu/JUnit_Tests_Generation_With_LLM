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
		* Test method where both FTPClient and File exist.
		* Will send a command to the remote host.
		*
		* The client will be close()ed when the test is finished.
		*/
	@Test
	public void testStoreUnique_2Hosts() throws Exception {
		
		// create a client from the default host only
		System.out.println("create a client using the default host only");
		FTPClient ftp = new FTPClient();
		String lastDir = ftp.doStatus("list");
		assertNull(lastDir);
		
		// create a client from a remote host
		System.out.println("create a client from the default host only");
		ftp = new FTPClient(new InetSocketAddress(FTPHost.LOCALHOST, 21));
		String lastDir1 = ftp.doStatus("list");
		assertNotNull(lastDir1);
		System.out.println("after successful creation, " + lastDir1);
			
		// send another command for the remote host
		System.out.println("send a command in the remote host");
		ftp.setClientEcho(true);
		ftp.setDataTimeout(2000);
		ftp.setRetr(true);
		ftp.setDataPort(21);
		String[] params = new String[]{"list"};
		ftp.sendParams(params);
		
		// receive the result
		System.out.println("wait in remote host for reply");
		String reply = ftp.waitReply();
		System.out.println("after receiving a message, " + reply);
		System.out.println("waiting for reply");
			
		// close clients
		ftp.close();	
		ftp.close();	
	}
		/**
		* Test method where both FTPClient and File exist.
		* Will send a command to the other host.
		*
		* The client will be close()ed when the test is finished.
		*/
	@Test
	public void testStoreUnique_3Hosts() throws Exception {
		
		// create two clients from the same host and send an other command
		System.out.println("create a client from the default host only");
		FTPClient conn1 = new FTPClient(new InetSocketAddress(FTPHost.LOCALHOST, 21));
		String lastDir2 = conn1.doStatus("list");
		assertNotNull(lastDir2);
		System.out.println("after successful creation, " + lastDir2);
			
		// create another client from the same host only  
		System.out.println("create a client from the default host only");
		FTPClient conn2 = new FTPClient(new InetSocketAddress(FTPHost.LOCALHOST, 21));
		String lastDir3 = conn2.doStatus("list");
		assertNotNull(lastDir3);
		System.out.println("after successful creation, " + lastDir3);
			
		// send another command for the other host
		System.out.println("send a command in the other host");
		conn1.setInactivityTime(5000l); // wait 5 seconds for connection
		conn2.setInactivityTime(500l); // wait 5 seconds for connection
		String[] params = new String[]{"list"};
		
		conn1.send(params);
		conn2.send(params);
		
		// receive the result
		System.out.println("wait in remote host for reply");
		String reply = conn1.waitReply();
		System.out.println("after receiving a message, " + reply);
		System.out.println("waiting for reply");
			
		// close connections
		conn1.close();
		conn2.close();
		conn1 = null;
		conn2 = null;
		
	}
		/**
		* Delete the file from the default host.
		*/
	@Test
	public void testDelete() throws Exception {

		// create a client from the default host
		System.out.println("create a client from the default host");
		FTPClient ftp = new FTPClient();
		ftp.setDoNotAuthenticate(true);
		String lastDir = ftp.doStatus("delete");
		assertNull(lastDir);
		
		// start a process on the remote host
		System.out.println("send a command in the remote host");
		String[] params = new String[]{"quit"};
		ftp.setDoNotAuthenticate(true);
		ftp.sendParams(params);
		
		// receive the reply
		ftp.setUser("root");
		ftp.login();
		ftp.setDataTimeout(2000);
		
		// create the remote directory 
		System.out.println("create the remote directory");
		long size = ftp.doContent(".", ".", FTPClient.MAX_BUFFER_SIZE - 3);
		assertTrue(size >= 0);
		
		// wait for the remote directory to be created
		ftp.setDataTimeout(5000);
		String lastDir1 = ftp.doStatus("list");
		String lastDir2 = ftp.doStatus("list");
		assertNotNull(lastDir1);
		assertNotNull(lastDir2);
		assertTrue(lastDir1.length() > 0);	// make sure it exists at least the '1st' time
		
		// keep trying
		ftp.delete(".");
		ftp.delete("..");
		
	}
		/**
		* Get the file from the local host
		*/
	@Test
	public void testGet() throws Exception {
		
		// start process 
		System.out.println("send a command on the local host");
		String[] params = new String[]{"quit"};
		FTPClient_5_4 client = new FTPClient_5_4(2);
		client.send(params);
		client.open();
		File f;
		boolean status;
		String lastDir = client.doStatus("get");
		assertTrue(lastDir.length() > 1);		// always at least the '1st' path
		int fcnt = 0;
		while ((fcnt = lastDir.indexOf("://"))!= -1) { // loop over remote paths
			lastDir = lastDir.substring(fcnt);
			client.setDataTimeout(200);
			status = client.doStatus("list");
			System.out.println("list after sending " + lastDir);
			f = new File("");
			f = new File(lastDir + pathSeparator);
			f.getParentFile().mkdirs();
			f.createNewFile();
			client.close();
			client = null;
		}
	}
}