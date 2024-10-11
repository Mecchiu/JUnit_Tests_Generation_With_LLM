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
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeNotValid() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(0);
		ModernChatServer server = new ModernChatServer();
		//Act
		boolean result = server.sendSecureTextMessage(msg);
		//Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeUserChat_UserNotConnected() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		ModernChatServer server = new ModernChatServer();
		//Act
		boolean result = server.sendSecureTextMessage(msg);
		//Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeUserChat_UserConnected() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		ModernChatServer server = new ModernChatServer();
		ClientInterface client = new ClientInterface() {
			@Override
			public boolean sendTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendBinaryMessage(BinaryMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendUserUpdatedStatus(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendRefreshContact(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffMessage(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffByLoginMessage(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendUserUpdatedStatus(User user, int targetType, int targetId) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendRefreshContact(User user, int targetType, int targetId) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffMessage(User user, int targetType, int targetId) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffByLoginMessage(User user, int targetType, int targetId) throws RemoteException {
				return true;
			}
		};
		server.connectedClients.put(1, client);
		//Act
		boolean result = server.sendSecureTextMessage(msg);
		//Assert
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the group is not found.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupNotFound() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		ModernChatServer server = new ModernChatServer();
		//Act
		boolean result = server.sendSecureTextMessage(msg);
		//Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the group is found but the user is not connected.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupFound_UserNotConnected() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		ModernChatServer server = new ModernChatServer();
		Group group = new Group();
		group.setId(1);
		User user = new User();
		user.setId(1);
		group.getUsers().add(user);
		server.getGroups().add(group);
		//Act
		boolean result = server.sendSecureTextMessage(msg);
		//Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the group is found but the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupFound_UserConnected() {
		//Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		ModernChatServer server = new ModernChatServer();
		Group group = new Group();
		group.setId(1);
		User user = new User();
		user.setId(1);
		group.getUsers().add(user);
		server.getGroups().add(group);
		ClientInterface client = new ClientInterface() {
			@Override
			public boolean sendTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendBinaryMessage(BinaryMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendUserUpdatedStatus(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendRefreshContact(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffMessage(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendKickOffByLoginMessage(User user) throws RemoteException {
				return true;
			}
			@Override
			public boolean sendUserUpdatedStatus(User