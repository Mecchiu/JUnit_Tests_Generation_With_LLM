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
	* It tests the case when the email address is null.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsNull() {
		// Arrange
		String emailAddr = null;
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is empty.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsEmpty() {
		// Arrange
		String emailAddr = "";
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is not valid.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsNotValid() {
		// Arrange
		String emailAddr = "email";
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the password is null.
	*/
	@Test
	public void testSignInAsAdmin_PasswordIsNull() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = null;
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the password is empty.
	*/
	@Test
	public void testSignInAsAdmin_PasswordIsEmpty() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = "";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the password is not valid.
	*/
	@Test
	public void testSignInAsAdmin_PasswordIsNotValid() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = "pass";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address and the password are valid.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressAndPasswordAreValid() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is valid and the password is not valid.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsValidAndPasswordIsNotValid() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = "pass";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is not valid and the password is valid.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsNotValidAndPasswordIsValid() {
		// Arrange
		String emailAddr = "email";
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is valid and the password is empty.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsValidAndPasswordIsEmpty() {
		// Arrange
		String emailAddr = "email@email.com";
		String password = "";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
	* It tests the case when the email address is empty and the password is valid.
	*/
	@Test
	public void testSignInAsAdmin_EmailAddressIsEmptyAndPasswordIsValid() {
		// Arrange
		String emailAddr = "";
		String password = "password";
		
		// Act
		LoginBean result = ModernChatServer.signInAsAdmin(emailAddr, password);
		
		// Assert
		assertNull(result);
	}
	
}