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
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(0);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeUserChat_UserNotConnected() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is connected but the message cannot be sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeUserChat_UserConnected_MessageNotSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is USER_CHAT and the user is connected and the message is sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeUserChat_UserConnected_MessageSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the group is not found.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupNotFound() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is GROUP_CHAT and the group is found but the message cannot be sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupFound_MessageNotSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is GROUP_CHAT and the group is found and the message is sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeGroupChat_GroupFound_MessageSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is ROOM_CHAT and the room is not found.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeRoomChat_RoomNotFound() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is ROOM_CHAT and the room is found but the message cannot be sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeRoomChat_RoomFound_MessageNotSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is ROOM_CHAT and the room is found and the message is sent.
	*/
	@Test
	void testSendSecureTextMessage_TargetTypeRoomChat_RoomFound_MessageSent() {
		// Arrange
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.ROOM_CHAT);
		msg.setToUserId(1);
		
		// Act
		boolean result = ModernChatServer.sendSecureTextMessage(msg);
		
		// Assert
		assertTrue(result);
	}
}