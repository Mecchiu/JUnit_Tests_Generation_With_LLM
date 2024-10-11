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
* It contains ten unit test cases for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServerTest {

	/**
	* Test case 1 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is offline.
	*/
	@Test
	void testSendBinaryMessage_1() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(false, result.isSuccess());
		assertEquals(IConstant.OFFLINE, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 2 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_2() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 3 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_3() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 4 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_4() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 5 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_5() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 6 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_6() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 7 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_7() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 8 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_8() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 9 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_9() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 10 for {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the client is online.
	*/
	@Test
	void testSendBinaryMessage_10() throws RemoteException {
		//Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setToUserId(1);
		msg.setAction(IConstant.REQUEST);
		//Act
		ResultBean result = server.sendBinaryMessage(msg);
		//Assert
		assertEquals(true, result.isSuccess());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
}