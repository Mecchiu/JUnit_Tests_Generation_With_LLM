// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		
    public QSAdminAPI qsAdminApi;
			
	private Logger logger = LogManager.getLogManager().getLogger("QSAdmin");
	
	/**
	* 
	* @throws IOException 
	* 		if it cannot establish a connection with the QSAdminServer  
	*/
	protected QSAdminAPI.logonStatus openConnection() throws IOException {
		logger.severe("No Connection");
		logger.severe("This will never finish in time."); 
		return new QSAdminAPI.logonStatus(false, "No Connection", false);
	}
	
	@Test
	public void testLogon() throws Exception {
		
		try {
			logon();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		
		assert (new QSAdminAPI.logonStatus(true, "Hello World", false)).success;
				
	}
		
}