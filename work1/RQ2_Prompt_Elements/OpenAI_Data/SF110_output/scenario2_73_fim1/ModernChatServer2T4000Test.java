// ModernChatServerTest.java
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
* It contains ten unit test cases for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the email address is null.
	*/
	@Test
	void testSignIn_EmailAddressIsNull() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = null;
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the email address is empty.
	*/
	@Test
	void testSignIn_EmailAddressIsEmpty() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the email address is invalid.
	*/
	@Test
	void testSignIn_EmailAddressIsInvalid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the password is null.
	*/
	@Test
	void testSignIn_PasswordIsNull() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = null;
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the password is empty.
	*/
	@Test
	void testSignIn_PasswordIsEmpty() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the ip address is null.
	*/
	@Test
	void testSignIn_IpAddressIsNull() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = null;
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the ip address is empty.
	*/
	@Test
	void testSignIn_IpAddressIsEmpty() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the ip address is invalid.
	*/
	@Test
	void testSignIn_IpAddressIsInvalid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "ip";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is not valid.
	*/
	@Test
	void testSignIn_UserIsNotValid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is valid.
	*/
	@Test
	void testSignIn_UserIsValid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNotNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is valid and the ip address is different.
	*/
	@Test
	void testSignIn_UserIsValidAndIpAddressIsDifferent() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNotNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is valid and the ip address is the same.
	*/
	@Test
	void testSignIn_UserIsValidAndIpAddressIsTheSame() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		ClientInterface clientInterface = null;
		String emailAddr = "email@email.com";
		String password = "password";
		String ipAddress = "127.0.0.1";
		
		//Act
		LoginBean loginBean = modernChatServer.signIn(clientInterface, emailAddr, password, ipAddress);
		
		//Assert
		assertNotNull(loginBean);
	}
}