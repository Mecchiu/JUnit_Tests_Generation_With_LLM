// ModernChatServer_8Test.java
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
class ModernChatServer_8Test {

	/**
	* Test case 1 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 1 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_1() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = null;
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 2 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 2 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getFrom() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_2() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getFrom() is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 3 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 3 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getTo() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_3() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getTo() is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 4 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 4 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_4() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		msg.setTo(new User());
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getMessage() is null.", e.getMessage());
		}
	}
	
	/**
	* Test case 5 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 5 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is empty.
	*/
	@Test
	public void testSendSecureTextAnnouncement_5() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		msg.setTo(new User());
		msg.setMessage("");
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getMessage() is empty.", e.getMessage());
		}
	}
	
	/**
	* Test case 6 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 6 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_6() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		msg.setTo(new User());
		msg.setMessage("");
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getMessage() is empty.", e.getMessage());
		}
	}
	
	/**
	* Test case 7 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 7 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_7() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		msg.setTo(new User());
		msg.setMessage("");
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getMessage() is empty.", e.getMessage());
		}
	}
	
	/**
	* Test case 8 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 8 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_8() throws Exception {
		// arrange
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setFrom(new User());
		msg.setTo(new User());
		msg.setMessage("");
		// act
		try {
			server.sendSecureTextAnnouncement(msg);
			fail("Expected an IllegalArgumentException to be thrown.");
		} catch (IllegalArgumentException e) {
			// assert
			assertEquals("Parameter msg.getMessage() is empty.", e.getMessage());
		}
	}
	
	/**
	* Test case 9 for method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}.
	* Test case 9 checks if the method {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)}
	* throws an exception when the parameter msg.getMessage() is null.
	*/
	@Test
	public void testSendSecureTextAnnouncement_9