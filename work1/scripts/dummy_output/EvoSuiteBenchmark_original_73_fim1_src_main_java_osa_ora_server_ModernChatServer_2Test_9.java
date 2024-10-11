// ModernChatServer_2Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
		
	private final Logger log = Logger.getLogger("org.junit");
	static final String login = "loggedUserIpAddress";

	/**
	 * @throws org.junit.jupiter.api.NestedException
	 */
	@junit.jupiter.env.BeforeAll
        java.lang.Throwable init();
	
	/**
	 * Perform clean up on the server shutdown.
	 *
	 * @throws java.lang.Exception
	 */
	@junit.jupiter.jupiter.TestAfterAll
    public void afterTest_cleanup() throws Exception;

	/**
	 * @throws org.junit.jupiter.api.NestedException
	 */
	@junit.jupiter.jupiter.Repeat(repetitions = 10)
        java.lang.Throwable init() throws Exception;

	/**
	 * Perform Test Case 1:
     * Test login to the server, which should return the valid users for the logged in User 
	 *
	 * @throws org.junit.jupiter.api.NestedException
	 */
	@Test
	void test1() throws Exception {

		String password1 = StringEncoder64.encode(
				"Hello iva", 20, "/");
		log.info("password1 = " + password1);
		String password2 = StringEncoder64.encode(
				"Hello iva", 20, "/2");
		String password3 = StringEncoder64.encode(
				"Hello iva", 20, "/3");

		String password1 = StringEncoder64.encode(emailAddr, 20);
		passwords1_match= new Hashtable<String, String>();
		passwords1_match.put(password1, password1);

		log.info("password11 = " + passwords1_match);

		log.info("password2 = " + password2);
		log.info("password3 = " + password3);

		// Test Login to the Server, which should login to the User and if the 
		// password match, return the User object of the user
		//
		log.info("Start login to the server");
		String login = null;
		try{
		login = this.signIn(ClientInterfaceB.class, login1, 
			password1, ClientInterfaceC.class.getName()).getLoginStatus();
		//login(password1, ClientInterfaceC.class.getName());
		} catch (Exception e){

			assertEquals("The password was incorrect.", 2,e.getMessage().length);
			assertEquals("The password should not match.", password1, login);
			assertEquals("The user email did not match.", emailAddr, login);
			return;
		}
		//fail("Password was not wrong?");
	}
	
	/**
	 * Test login to the server, which should login by creating new user object and if it 
	 * create the username, create it and return the created user object.
	 * In this case this test needs to be run with the following parameters:
	 * - username (String)
	 * -emailAddress (String)
	 * -room (String)
	 * -IPAddress (String)
	 * 
	 * @throws RemoteException
	 * @throws java.net.URISyntaxException 
	 */
	@junit.jupiter.jupiter.Repeat(repetitions = 10)
	@Test
	void test2() throws RemoteException, URISyntaxException {
}
}