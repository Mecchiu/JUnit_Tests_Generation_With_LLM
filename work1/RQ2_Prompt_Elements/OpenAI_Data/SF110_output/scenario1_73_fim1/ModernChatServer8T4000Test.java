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
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_4() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_5() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_6() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_7() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_8() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_9() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
	* This test case checks if the method returns false when the target type is not valid.
	*/
	@Test
	void testSendSecureTextAnnouncement_10() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextAnnouncement(msg));
	}
}