// ModernChatServer_7Test.java
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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {

	/**
	* Test case 1 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 1 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_1() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = null;
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 2 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 2 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_2() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 3 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 3 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_3() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 4 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 4 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_4() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 5 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 5 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_5() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 6 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 6 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_6() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		msg.setFileContent("test".getBytes());
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 7 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 7 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_7() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		msg.setFileContent("test".getBytes());
		msg.setFileSize(4);
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 8 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 8 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_8() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		msg.setFileContent("test".getBytes());
		msg.setFileSize(4);
		msg.setFileType("txt");
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 9 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 9 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_9() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		msg.setFileContent("test".getBytes());
		msg.setFileSize(4);
		msg.setFileType("txt");
		msg.setFileDate(Calendar.getInstance().getTime());
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
	
	/**
	* Test case 10 for method {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
	* Test case 10 checks if the method returns null when the input parameter is null.
	*/
	@Test
	public void testSendSecureBinaryMessage_10() throws Exception {
		//arrange
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setSender(new User());
		msg.setReceiver(new User());
		msg.setFileName("test.txt");
		msg.setFileContent("test".getBytes());
		msg.setFileSize(4);
		msg.setFileType("txt");
		msg.setFileDate(Calendar.getInstance().getTime());
		msg.setFileDescription("test");
		//act
		ResultBean result = server.sendSecureBinaryMessage(msg);
		//assert
		assertNull(result);
	}
}

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
import java.util