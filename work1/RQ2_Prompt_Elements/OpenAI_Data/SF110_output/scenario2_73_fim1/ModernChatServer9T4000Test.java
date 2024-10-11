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
* It contains ten unit test cases for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is null.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsNull() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = null;
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the password is null.
	*/
	@Test
	void testSignInAsAdmin_PasswordIsNull() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = null;
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is empty.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsEmpty() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the password is empty.
	*/
	@Test
	void testSignInAsAdmin_PasswordIsEmpty() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is invalid.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsInvalid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the password is invalid.
	*/
	@Test
	void testSignInAsAdmin_PasswordIsInvalid() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "pass";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is not equal to the admin email address.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsNotEqualToAdminEmailAddress() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the password is not equal to the admin password.
	*/
	@Test
	void testSignInAsAdmin_PasswordIsNotEqualToAdminPassword() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is not equal to the admin email address and the password is not equal to the admin password.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsNotEqualToAdminEmailAddressAndPasswordIsNotEqualToAdminPassword() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is equal to the admin email address and the password is not equal to the admin password.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsEqualToAdminEmailAddressAndPasswordIsNotEqualToAdminPassword() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is not equal to the admin email address and the password is equal to the admin password.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsNotEqualToAdminEmailAddressAndPasswordIsEqualToAdminPassword() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* This test case checks if the method returns null when the email address is equal to the admin email address and the password is equal to the admin password.
	*/
	@Test
	void testSignInAsAdmin_EmailAddressIsEqualToAdminEmailAddressAndPasswordIsEqualToAdminPassword() {
		//Arrange
		ModernChatServer modernChatServer = new ModernChatServer();
		String emailAddr = "admin@admin.com";
		String password = "password";
		
		//Act
		LoginBean loginBean = modernChatServer.signInAsAdmin(emailAddr, password);
		
		//Assert
		assertNull(loginBean);
	}
}