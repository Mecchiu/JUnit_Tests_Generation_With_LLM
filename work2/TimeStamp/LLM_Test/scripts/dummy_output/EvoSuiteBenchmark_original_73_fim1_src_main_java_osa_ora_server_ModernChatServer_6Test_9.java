// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
		final static IConstant Constant = new IConstant();
	static Logger logger = Logger.getLogger(ServerInterface.class.getName());
	Hashtable<String, Object> hash;
	public static String serverName;

	/**
	* Constructor for the server.
	*
	* @throws URISyntaxException : Exception while creating server address
	*/
	public ModernChatServer_6Test(String serverName) throws URISyntaxException {
		hash = new Hashtable<String, Object>();
		this.serverName = serverName;
	}

	/**
	 * Test method for {@link osa.ora.server.ServerInterface#sendBinaryMessage(org.javax.comm.protocol.text.TextMessage)}.
	 * <ol>
	 * <li>Set values in the hash table for text messages (both strings)</li>
	 * </ol>
	 */
	@Test
	public void sendBinaryMessageTest() {
		//test startServer
		final int testNumber = 0;
		int result = ClientInterface.SAME_DURATION;
		if(hash.get(Constant.SERVICENAMEPATTERN) == null) {
			result = ClientInterface.ERROR_INIT_NO_REGISTER;
		}
		assertEquals(result, ClientInterface.SAME_DURATION);

		Hashtable<String, Object> hash2 = new Hashtable<String, Object>();
		hash2.put("serviceName", Constant.SERVICENAMEPATTERN);
		assertTrue(hash.size() == 1);
		assertTrue(hash == hash2);

		ClientInterface.sendTextMessage("testtextmessage".getBytes());

		hash2.put("serviceName", Constant.SERVICENAMEPATTERN);
		assertTrue(hash.size() == 2);
		assertTrue(hash == hash2);

		ClientInterface.SAME_DURATION--;

		assertTrue(hash.size() == 1);
		assertTrue(hash == hash2);
	}

	/**
	* Test method for {@link osa.ora.server.ServerInterface#sendBinaryMessage(java.lang.String)}.
	*/
	@Test
	public void sendBinaryMessageStringTest() {
		//test startServer
		final int testNumber = 0;
		int result = ClientInterface.SAME_DURATION;
		if(hash.get(Constant.LOGINNAMEPATTERN) == null) {
			result = ClientInterface.ERROR_INIT_NO_REGISTER;
		}
		assertEquals(result, ClientInterface.SAME_DURATION);

		Hashtable<String, Object> hash2 = new Hashtable<String, Object>();
		hash2.put("serviceName", Constant.LOGINNAMEPATTERN);
		assertTrue(hash.size() == 1);
		assertTrue(hash == hash2);

		ClientInterface.sendTextMessage(Constant.TOASTMSG1).send();
		hash2.put("serviceName", Constant.TOASTMSG1).send();
		assertTrue(hash == hash2);

		ClientInterface.SAME_DURATION--;

		assertTrue(hash.size() == 1);
		assertTrue(hash == hash2);
	}

	/**
	* Test method for {@link osa.ora.server.ServerInterface#ServerInterface(String, String, int)}.
	*/
	@Test
	public void ServerInterface_String_StringStart() throws RemoteException, URISyntaxException {
		hash = new Hashtable<String, Object>();
		ServerSettingBean settingBean = User.getInstance(serverName).getServerSettingBean();

}
}