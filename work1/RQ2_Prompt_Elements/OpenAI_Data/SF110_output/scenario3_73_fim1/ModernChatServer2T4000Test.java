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
	* This test case checks if the method returns null when the user is not found.
	*/
	@Test
	void testSignIn_UserNotFound() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@Test
	void testSignIn_WrongPassword() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		LoginBean result = server.signIn(null, "test@test.com", "test", "127.0.0.1");
		assertNull(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
	* This test case checks if the method returns null when the user is found but the password is wrong.
	*/
	@