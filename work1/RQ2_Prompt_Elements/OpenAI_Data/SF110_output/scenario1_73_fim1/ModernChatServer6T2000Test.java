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
	* Test case 1 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage1() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 2 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage2() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 3 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage3() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 4 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage4() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 5 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage5() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 6 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage6() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 7 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage7() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 8 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage8() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(IConstant.OFFLINE, resultBean.getMessage());
		assertEquals(null, resultBean.getData());
	}
	
	/**
	* Test case 9 for method {@link ModernChatServer#sendBinaryMessage(BinaryMessage)}.
	*/
	@Test
	void testSendBinaryMessage9() throws RemoteException {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		BinaryMessage binaryMessage = new BinaryMessage();
		binaryMessage.setAction(IConstant.REQUEST);
		binaryMessage.setData(new byte[0]);
		binaryMessage.setFromUserId(0);
		binaryMessage.setToUserId(0);
		ResultBean resultBean = modernChatServer.sendBinaryMessage(binaryMessage);
		assertEquals(false, resultBean.isSuccess());
		assertEquals(ICon