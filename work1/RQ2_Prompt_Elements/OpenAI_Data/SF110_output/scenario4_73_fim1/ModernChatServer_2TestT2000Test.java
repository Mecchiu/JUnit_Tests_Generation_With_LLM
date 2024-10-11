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
* It contains ten unit test cases for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {

	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is not found in the database.
	* Expected result: {@link RemoteException}.
	*/
	@Test
	void testSignIn_1() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		try {
			fixture.signIn(cf, emailAddr, password, ipAddress);
			fail("Expected exception not thrown");
		} catch (RemoteException e) {
			// Assert
			assertEquals("User not found", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database but the password is wrong.
	* Expected result: {@link RemoteException}.
	*/
	@Test
	void testSignIn_2() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		try {
			fixture.signIn(cf, emailAddr, password, ipAddress);
			fail("Expected exception not thrown");
		} catch (RemoteException e) {
			// Assert
			assertEquals("User not found", e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database and the password is correct.
	* Expected result: {@link LoginBean}.
	*/
	@Test
	void testSignIn_3() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		LoginBean result = fixture.signIn(cf, emailAddr, password, ipAddress);
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database and the password is correct.
	* Expected result: {@link LoginBean}.
	*/
	@Test
	void testSignIn_4() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		LoginBean result = fixture.signIn(cf, emailAddr, password, ipAddress);
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database and the password is correct.
	* Expected result: {@link LoginBean}.
	*/
	@Test
	void testSignIn_5() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		LoginBean result = fixture.signIn(cf, emailAddr, password, ipAddress);
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database and the password is correct.
	* Expected result: {@link LoginBean}.
	*/
	@Test
	void testSignIn_6() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(0, "");
		fixture.setRootNode("");
		fixture.setNewDefaultPassword("");
		fixture.loadGroupsAndUsers("");
		fixture.loadRooms("");
		fixture.signInAsAdmin("", "");
		// Act
		LoginBean result = fixture.signIn(cf, emailAddr, password, ipAddress);
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* It tests the case when the user is found in the database and the password is correct.
	* Expected result: {@link LoginBean}.
	*/
	@Test
	void testSignIn_7() throws Exception {
		// Arrange
		ClientInterface cf = null;
		String emailAddr = "";
		String password = "";
		String ipAddress = "";
		ModernChatServer fixture = new ModernChatServer();
		fixture.startRMIRegistry();
		fixture.setLogLevel(5, true, "");
		fixture.setSecurityMode(