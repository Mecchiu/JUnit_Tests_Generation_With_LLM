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
     * Test constructor and a path
     */
	@Test
	public void constructorWithDirectory() throws Exception {
		FTPClient c = new FTPClient();
		assertNotNull(c);
		String path = "/";
		c.storeUnique(path);
		assertNotNull(c.getPassport());
		assertNotNull(c.getUsername());
		assertNotNull(c.getHost());
	}

	/**
     * Test constructor and a path with a path inside folder
     */
	@Test
	public void constructorWithFolder() throws Exception {
		FTPClient c = new FTPClient();
		assertNotNull(c);
		String path = "some/folder/";
		c.storeUnique(path);
		assertNotNull(c.getPassport());
		assertNotNull(c.getUsername());
		assertNotNull(c.getHost());
	}

	/**
     * Test constructor with only a path
     */
	@Test
	public void constructorWithPath() throws Exception {
		FTPClient c = new FTPClient();
		assertNotNull(c);
		String path = "";
		c.storeUnique(path);
		assertNotNull(c.getPassport());
		assertNotNull(c.getUsername());
		assertNotNull(c.getHost());
	}

	/**
     * Test constructor with just a path and empty "some/folder/"
     */
	@Test
	public void constructorAndFolderEmptyPath() throws IOException {
		FTPClient c = new FTPClient();
		assertNotNull(c);
		String path = "";
		try {
			c.storeUnique(path);
		} catch (IllegalArgumentException ex) {
			System.err.println("It shouldn't happen");
		}
		//assertTrue(c.isConnected());
		assertTrue(false);
	}

	/**
     * Test constructor without optional parameters
     */
	@Test
	public void constructorWithoutParameters() throws IOException {
		FTPClient c = new FTPClient();
		assertNotNull(c);
		assertTrue(c.isConnected());
		String path = "";
		c.storeUnique(path);
		assertNotNull(c.getPassport());
		assertNotNull(c.getUsername());
		assertNotNull(c.getHost());
	}

    /**
        * Test constructor without URL
        */
        @Test public void constructorWithoutURL() throws IOException {
            FTPClient c = new FTPClient();
            String path = "";
            try {
            	c.storeUnique(path);
            } catch (NullPointerException ex) {
                System.err.println("This should not happen");
                assertTrue(true);
            }
        }


/*
     * Test serverName setting
     */
    @Test
    public void serverNameWithPath() throws IOException, GeneralSecurityException {

    	System.err.println("Testing serverName with " + FTPClient.class.getSimpleName() + " constructor");

	    FTPClient client = new FTPClient();

	    client.setServerName("some-user-1234");

	    assertEquals("/",client.getPassport());
	    assertEquals("some-user-12345",client.getUsername());
	    assertEquals( "127.0.0.1", client.getHost());

    }
}