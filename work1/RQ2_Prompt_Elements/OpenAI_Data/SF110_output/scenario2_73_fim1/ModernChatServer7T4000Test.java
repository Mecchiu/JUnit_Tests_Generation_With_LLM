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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServerTest {

	/**
	* Test case 1 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(true, result.isStatus());
		assertEquals(IConstant.SUCCESS, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 2 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 3 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 4 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage4() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 5 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage5() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 6 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage6() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 7 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage7() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 8 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage8() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 9 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage9() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
	
	/**
	* Test case 10 for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
	* This test case checks if the method returns the correct result when the message is not sent successfully.
	*/
	@Test
	public void testSendSecureBinaryMessage10() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		BinaryMessage msg = new BinaryMessage();
		msg.setAction(IConstant.REQUEST);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setData(new byte[10]);
		ResultBean result = server.sendSecureBinaryMessage(msg);
		assertEquals(false, result.isStatus());
		assertEquals(IConstant.EXCEPTION, result.getMessage());
		assertEquals(null, result.getData());
	}
}