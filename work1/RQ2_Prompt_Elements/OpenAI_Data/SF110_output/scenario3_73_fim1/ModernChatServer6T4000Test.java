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
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is null.
	*/
	@Test
	public void testSendBinaryMessage_NullMessage() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = null;
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NullSender() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(null);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NullReceiver() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(null);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NullFile() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(null);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NotNullFile() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(new byte[0]);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NotNullFile_NullFileName() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(new byte[0]);
		msg.setFileName(null);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NotNullFile_NotNullFileName() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(new byte[0]);
		msg.setFileName("");
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NotNullFile_NotNullFileName_NullFileType() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(new byte[0]);
		msg.setFileName("");
		msg.setFileType(null);
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	* This test case is used to test the method when the message is not null.
	*/
	@Test
	public void testSendBinaryMessage_NotNullMessage_NotNullSender_NotNullReceiver_NotNullFile_NotNullFileName_NotNullFileType() throws RemoteException {
		// Arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFile(new byte[0]);
		msg.setFileName("");
		msg.setFileType("");
		
		// Act
		ResultBean result = server.sendBinaryMessage(msg);
		
		// Assert
		assertEquals(IConstant.ERROR_CODE, result.getStatus());
		assertEquals(IConstant.ERROR_MESSAGE, result.getMessage());
	}
}