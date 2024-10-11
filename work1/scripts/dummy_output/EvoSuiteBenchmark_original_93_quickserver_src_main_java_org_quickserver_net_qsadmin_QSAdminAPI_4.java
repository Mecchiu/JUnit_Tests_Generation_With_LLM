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
		private String serverName = "serverName";		
		private int portNumber = 9090;		
		private String username = "username";		
		private String password = "password";		
		private boolean allowLogon = true;
		private QSAdminAPI qsAdminApi;
		protected QSAdminApi qsAdminApiServer;

		/**
		 * test will attempt to create a QSAdminAPITest object with the parameters set
		 * as a Test Parameter object.
		 * 
		 * @param allowLogon      is true if logon is success when attempting to login
       * @since 1.4
       */
	private QSAdminAPITest(String username, int portNumber) {		
		this.password = username;
		if (portNumber == 9090)
			this.username = username;
		this.portNumber = portNumber;
		this.logon()!= null;
		if (this.logon()) {
			
			this.serverName = "serverName";
			this.password = "password";
			
			this.qsAdminApi = new QSAdminAPI(this.serverName, this.portNumber);      

			
			this.qsAdminApi.setLogin(this.username, this.password);  

		} else {
			this.qsAdminApi = null;
		}			
	}

	/**
	* set up testing for the object.
	* 
	* - This method will do nothing if {@link QSAdminAPI#logon()} returned true
	* - This method will clear any logging object which used in testing.
	* - This method will close the server to the qsdata manager if {@link  QSAdminAPI#logon()}
	*   returns false
	* 
	* @throws IOException If connection can not be established or if the test failed because the test
	*   connection could not be closed 
	* @since 1.8
	*/
	@Test
    public void test_logon() throws IOException {		
		final QSAdminApi qsAdminApiServer = this.qsAdminApi;
		if(this.logon()) {
			this.logoff();
		} else {
			System.out.println("No connection to Server: " + this.serverName);	
			fail("Null connection to Server.");
			
		}
			

	}

	/**
	* get credentials which will be returned to the server.
	* 
	* @return a new {@link QSAdminCredentials} object which can be used to login to the qs data manager
	* @since 1.8
	*/    
	public QSAdminCredentials auth() {
		this.qsAdminApiServer.setLogin(this.username, this.password);		
		return this.qsAdminApiServer.getCredentials();	
	}	
	
	/**
	* Logon.
	*
	* @throws IOException If error occurs while logging in to the QSAdmin service.
	* @since 1.8
	* @return return true if authentication happened.
	*/
	private boolean logon() throws IOException {
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader( 
					new BufferedInputStream( new URL("qsadmin.jsp").openStream() )));
			String inputLine = null;

			StringBuilder text = new StringBuilder();
			// get username and password from the server
			this.username = reader.readLine();
			this.password = reader.readLine();
			String[] usernamePwd = reader.readLine().split(":");
			if (usernamePwd.length==2) {
				this.username = usernamePwd[0];
				this.password = usernamePwd[1];
			}

			// this will keep sending the following lines until server can connect			 
			while((inputLine = reader.readLine())!= null ) {
				text.append("\n" + inputLine);
			}
			this.logon(text.toString());	
			reader.close();
		} catch (MalformedURLException e) {
			this.logoff();
			throw new QSAdminException(e.toString());
		}	
    }
    
	/**
	 * Logoff.
	 *
	 * @throws IOException If error occurs while logging in to the QSAdmin service.
	 * @since 1.8
	 * @return always return true
	 */
	private boolean logoff() throws IOException {
		try {
			this.qsAdminApiServer.logoff();
		} catch (Exception e)	{
			this.logoff(e.toString());
			return false;
			
		}
		return true;
	}
    
	/**
	 * Gets the QSAdmin credentials and sends them over the qsdata session.
	 * 
	 * @return if authentication happened
	 * @since 1.8
	*/
	public QSAdminCredentials getCredentials() {
		QSAdminCredentials credentials = this.qsAdminApiServer.getCredentials();		
		logoff();
    	return credentials;
	}

	/**
	* Logoff in the QSAdmin A/T connection.
	* 
	* @param errorIfLoggedOn
	*/  
	private void logoff (String errorIfLoggedOn) {
		this.qsAdminApiServer.close();
		this.qsAdminApi.logoff();
		if (errorIfLoggedOn!= null) {
				throw new QSAdminException(errorIfLoggedOn);
		}

		


	}

}