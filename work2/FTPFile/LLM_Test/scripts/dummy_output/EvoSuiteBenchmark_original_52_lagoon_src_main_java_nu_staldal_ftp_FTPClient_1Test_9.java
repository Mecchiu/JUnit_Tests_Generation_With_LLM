// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {
		private String pathname;

	/**
	* Constructor for the class
	*
	* @param pathname path to the file
	*
	* @throws IOException if any other IO error occurs
	* @throws FTPException if any FTP protocol error occurs
	*/
	public FTPClient_1Test(String pathname)
			throws IOException, FTPException {
	//	Path name = new File("Test-Net/");
	
	//	if ( path.lastSegment()!= "" )
	//		throw new IOException(path + ": Error creating a FTP client");	
	
		this.pathname = pathname;
	

}
}