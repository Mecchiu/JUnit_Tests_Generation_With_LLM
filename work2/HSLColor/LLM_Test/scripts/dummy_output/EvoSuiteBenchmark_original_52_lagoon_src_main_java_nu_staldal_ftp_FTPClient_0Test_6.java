// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		private StringBuffer pathname = new StringBuffer("/tmp/pathname");

	/**
	* Tests the constructor.
	*/
	@Test
	public void constructor() {
		FTPClient ftp = new FTPClient();
		assertEquals("FTPClient is not really initialized.", null, ftp.dir);
	}

	/**
	* tests that the constructor is reset on all paths.
	*/
	@Test
	public void checkReset() {
		FTPClient ftp = new FTPClient();
		ftp.dir = "/";
		ftp.fetchPage(); // TODO: fix
	}

	/**
	* Tests the setter for {@link #pathname}.
	*/
	@Test
	public void setPathname() {
		// TODO: create actual test case
		FTPClient ftp = new FTPClient();
		ftp.dir = "/";

		ftp.setPathname(pathname.toString());
		assertEquals("FTPClient.setPathname(s) must return the same pathname.", pathname.toString(), ftp.setPathname(pathname.toString()));
	}

	/**
	 * Tests that the setter for {@link #fetchPage()} takes
	 * either the "PASV" or "ENTR" command.
	 */
	@Test
	public void setFetchPage() {

		FTPClient ftp = new FTPClient();
		ftp.fetchPage(); // TODO: fix

		String cmd = (ftp.dir == null)? "PASV" : ftp.dir;
		assertEquals("FTPClient.setFetchPage() must return PASV command.", cmd, ftp.setFetchPage(cmd));

		cmd =!ftp.dir.equals(ftp.dir.substring(0, 1))?
			"ENTR " + ftp.dir :
			"ENTR " + ftp.setPathname();
		assertEquals("FTPClient.setFetchPage() must return the correct command depending on pathname.", cmd, ftp.setFetchPage(cmd));
	}
}