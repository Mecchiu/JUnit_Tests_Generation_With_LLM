// ModernChatServer_0Test.java
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
* It contains one unit test case for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {
		
    // private int timeout = 1000 * 5;
    // private int socketTimeout = 1000 * 30;
    private ClientInterface _socket = null;
    private User _user = null;
	
	// private FileHandler fileHandler = new FileHandler("etc\\chat.log");

	
	/**
	 * @throws RemoteException
	 * @throws IllegalArgumentException 
	 * @throws java.rmi.RemoteException
	 * @throws java.rmi.Naming
	 */
	@Test 
    public void test_initClient() throws RemoteException, IllegalArgumentException, Naming, java.rmi.RemoteException, URISyntaxException {
		
		String userName = "test";
		System.out.println("============================");
		System.out.println("Start test_initClient");
		assertNotNull(BinaryMessage.user, "Failed to get User.");
		ClientInterface _userClient = _socket.getUserClient();
		assertNotNull(_userClient, "Failed to return UserClient.");

		assertNotEquals(BinaryMessage.user, userName, "User has already been assigned.");
		assertTrue(BinaryMessage.user.equals(userName), "User name already exists");		
	}
	
	/**
	 * @throws RemoteException
	 * @throws URISyntaxException
	 */
	@Test
	public void test_initUser() throws RemoteException, URISyntaxException {
		
		String userName = "test";
		System.out.println("============================");
		String clientIP = String.valueOf(_socket.getClientIP());
		System.out.println("Client IP is: " + clientIP);
		System.out.println("User name is: " + userName);
		assertNotEquals(userName, "test", "User name already exists.");
		ClientInterface _userClient = 
				new UnicastRemoteObject(_socket, false);
		assertNotNull(_userClient, "Failed to return UserClient.");
		
		assertTrue(_userClient.authenticated(), "Username has not been authenticated.");
	}	
	
	/**
	 * @throws RemoteException
	 * @throws URISyntaxException
	 * @throws IllegalArgumentException 
	 */
	@Test
	public void test_join() throws RemoteException, URISyntaxException {
		
		String name = "john_000";
		String userName = "drew_000";
		
		System.out.println("============================");
		System.out.println("_socket.join(" + userName + ") success");
		assertTrue(BinaryMessage.user.equals(userName), "User name already exists.");
		ClientInterface _userClient = 
				new UnicastRemoteObject(_socket, false);
		assertNotNull(_userClient, "Failed to return UserClient2.");
		
		assertTrue(_userClient.authenticated(), "Username is not authenticated.");
		assertTrue(BinaryMessage.user.equals(userName), "User name not identical.");
		_userClient.exit();//_socket.close();
		assertFalse(BinaryMessage.user.equals(userName), "User name not equal to specified user.");
		
		String textMessage = "Hello \n";
		
		_socket.sendTextMessage("drew_000", textMessage);
		_userClient.waitForCompletion();
		System.out.println("_socket.join(" + userName + ") success");
		assertNotNull(_userClient, "Test successful.");
		
		return;
	}
	
	@Test
	public void test_getUser() throws RemoteException {
		String ret = BinaryMessage.user;
		assertTrue(ret.startsWith("User has been assigned. "), "[ User has been assigned ]");
		ret = TestLogin.user;
}
}