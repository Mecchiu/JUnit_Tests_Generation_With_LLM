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
* It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to true.
	*/
	@Test
	void testChangePassword_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertTrue(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to false.
	*/
	@Test
	void testChangePassword_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertFalse(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to true.
	*/
	@Test
	void testChangePassword_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertTrue(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to false.
	*/
	@Test
	void testChangePassword_4() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertFalse(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to true.
	*/
	@Test
	void testChangePassword_5() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertTrue(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to false.
	*/
	@Test
	void testChangePassword_6() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertFalse(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to true.
	*/
	@Test
	void testChangePassword_7() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertTrue(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to false.
	*/
	@Test
	void testChangePassword_8() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertFalse(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to true.
	*/
	@Test
	void testChangePassword_9() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertTrue(result.isSuccess());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
	* Test if the method returns a {@link ResultBean} object with the success flag set to false.
	*/
	@Test
	void testChangePassword_10() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changePassword("test@test.com", "test", "test");
		assertFalse(result.isSuccess());
	}
}