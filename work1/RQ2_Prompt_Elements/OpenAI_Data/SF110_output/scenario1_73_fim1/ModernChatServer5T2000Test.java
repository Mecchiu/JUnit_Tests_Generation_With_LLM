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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is USER_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		ClientInterface cf = new ClientInterface() {
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendTextMessage(TextMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendBinaryMessage(BinaryMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendUserUpdatedStatus(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendRefreshContact(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendKickOffMessage(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendKickOffByLoginMessage(User user) throws RemoteException {
				return false;
			}
		};
		server.connectedClients.put(1, cf);
		assertTrue(server.sendSecureTextMessage(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextMessage_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextMessage(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is GROUP_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		ClientInterface cf = new ClientInterface() {
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendTextMessage(TextMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendBinaryMessage(BinaryMessage msg) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendUserUpdatedStatus(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendRefreshContact(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendKickOffMessage(User user) throws RemoteException {
				return false;
			}
			@Override
			public boolean sendKickOffByLoginMessage(User user) throws RemoteException {
				return false;
			}
		};
		server.connectedClients.put(1, cf);
		server.connectedClients.put(3, cf);
		server.connectedClients.put(4, cf);
		server.connectedClients.put(5, cf);
		server.connectedClients.put(6, cf);
		server.connectedClients.put(7, cf);
		server.connectedClients.put(8, cf);
		server.connectedClients.put(9, cf);
		server.connectedClients.put(10, cf);
		server.connectedClients.put(11, cf);
		server.connectedClients.put(12, cf);
		server.connectedClients.put(13, cf);
		server.connectedClients.put(14, cf);
		server.connectedClients.put(15, cf);
		server.connectedClients.put(16, cf);
		server.connectedClients.put(17, cf);
		server.connectedClients.put(18, cf);
		server.connectedClients.put(19, cf);
		server.connectedClients.put(20, cf);
		server.connectedClients.put(21, cf);
		server.connectedClients.put(22, cf);
		server.connectedClients.put(23, cf);
		server.connectedClients.put(24, cf);
		server.connectedClients.put(25, cf);
		server.connectedClients.put(26, cf);
		server.connectedClients.put(27, cf);
		server.connectedClients.put(28, cf);
		server.connectedClients.put(29, cf);
		server.connectedClients.put(30, cf);
		server.connectedClients.put(31, cf);
		server.connectedClients.put(32, cf);
		server.connectedClients.put(33, cf);
		server.connectedClients.put(34, cf);
		server.connectedClients.put(35, cf);
		server.connectedClients.put(36, cf);
		server.connectedClients.put(37, cf);
		server.connectedClients.put(38, cf);
		server.connectedClients.put(39, cf);
		server.connectedClients.put(40, cf);
		server.connectedClients.put(41, cf);
		server.connectedClients.put(42, cf);
		server.connectedClients.put(43, cf);
		server.connectedClients.put(44, cf);
		server.connectedClients.put(45, cf);
		server.connectedClients.put(46, cf);
		server.connectedClients.put(47, cf);
		server.connectedClients.put(48, cf);
		server.connectedClients.put(49, cf);
		server.connectedClients.put(50, cf);
		server.connectedClients.put(51, cf);
		server.connectedClients.put(52, cf);
		server.connectedClients.put(53, cf);
		server.connectedClients.put(54, cf);
		server.connectedClients.put(55, cf);
		server.connectedClients.put(56, cf);
		server.connectedClients.put(57, cf);
		server.connectedClients.put(58