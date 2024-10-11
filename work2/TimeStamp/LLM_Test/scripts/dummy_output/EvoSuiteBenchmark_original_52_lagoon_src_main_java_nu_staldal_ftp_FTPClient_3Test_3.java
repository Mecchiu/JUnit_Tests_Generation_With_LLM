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
	 * A default FTPClient instance.
	 */
    private FTPClient client;
		/**
	 * The file name (without /)
	 */
	private String fileName="FTPClient|_3Test.txt";
		/**
	 * The output stream for {@link #append(String, boolean)}
	 */
	private FileStream os;
		/**
	 * The input stream for {@link #append(String, boolean)}
	 */
	private InputStream is;


	/**
	 * Get the new FTPClient instance.
	 */
	private void newInstance() {
	this.client=new FTPClient();
	this.client.password=null;
		/*
	    if (client.password!= null)
	      fail("Can't use the same FTPClient instance twice with the same password");
	    */
	}


	/**
		 * Test if file is created successfully.
     *
	 * @throws IOException if any other IO error occurs
	 */
	//@Test public void testCreation() throws IOException {
	//	this.newInstance();
	//	client.login(user,"pass");
	//	Path path=new Path(fileName);
	//	//client.append(path, true);
	//	client.append(path, false);
	//	//client.append(path, false); // this tests that append returns the correct value after each call.
	//}


	/**
	 * Test if file is created successfully with a user name.
     *
	 * @throws IOException if any other IO error occurs
	 */
	@Test public void testCreationWithUser() throws IOException {
		this.newInstance();
		client.login(user,"user");
		Path path=new Path(fileName);
		client.append(path, true); // the path should be created
		client.append(path, false); // the file should be created
                //client.append(path, false); // no need to check if file exists
	}

	/**
	 * Test if file is created correctly.
     *
	 * @throws IOException if any other IO error occurs
	 */
	@Test public void testCreate() throws IOException {
		this.newInstance();
		client.login(user,"user");
		Path path=new Path(fileName);
		client.append(path, true);
		client.append("/fileA", true);
		client.append("/fileB", true);
                //client.append("/fileA/fileA", true);
	}


	/**
	 * Test if a connection is established.
     *
	 * @throws IOException if any other IO error occurs
	 */
	@Test public void testConnection() throws IOException {
	this.newInstance();
	client.login(user,"user")
	Path path=new Path(fileName);

	// client.append(path, true);
	//	client.append(path, false);
	//	client.append(path, false); // this tests that append returns the correct value after each call.

	assertTrue("Error: connection failed", client.isConnected());
		/*
	        if (client.password!= null)
	          fail("Can't use the same FTPClient instance twice with the same password");
	*/
	}


	/**
	 *  Close the connection.
	 * @throws IOException if any other InputStream error occurs
	 */
	@Test public void testClose() throws IOException {
	this.newInstance();
		client.login(user,"user");
		Path path=new Path(fileName);
		client.append(path, true); // the path should be created
		if (client.isConnected()) {
			client.close();
		}
                //client.append(path,false); // no need to check if file exists
	}


	//    @Ignore("bugzilla 2318")
	//    public void testPassword() throws FileNotFoundException, UnsupportedEncodingException, IOException {

	//}

	//@Ignore("bugzilla 2318")
	public FTPClient getClient() throws IOException;

}