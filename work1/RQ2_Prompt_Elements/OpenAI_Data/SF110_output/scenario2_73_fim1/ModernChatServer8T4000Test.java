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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns true when the target type is USER_CHAT.
	*/
	@Test
	void testSendSecureTextAnnouncement_USER_CHAT() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertTrue(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns true when the target type is GROUP_CHAT.
	*/
	@Test
	void testSendSecureTextAnnouncement_GROUP_CHAT() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertTrue(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns true when the target type is ROOM_CHAT.
	*/
	@Test
	void testSendSecureTextAnnouncement_ROOM_CHAT() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertTrue(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not USER_CHAT, GROUP_CHAT or ROOM_CHAT.
	*/
	@Test
	void testSendSecureTextAnnouncement_OTHER() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(0);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_USER_CHAT_NOT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_GROUP_CHAT_NOT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is ROOM_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_ROOM_CHAT_NOT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_USER_CHAT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_GROUP_CHAT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is ROOM_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextAnnouncement_ROOM_CHAT_CONNECTED() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
}