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
* It contains one unit test case for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {
		/**
		 * Test-case for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)}.
		 *
		 * @throws RemoteException
		 * @throws java.net.URISyntaxException
		 */
	@Test
	public void sendSecureBinaryMessage() throws RemoteException, URISyntaxException {
		final StringEncoder64 encoder = new StringEncoder64();
		final BinaryMessage msg = new BinaryMessage();
		int status = 0;
		int messageID = 0;
		Vector<TextMessage> vMsg = new Vector<>();

		try {
			// Create message
			messageID = encoder.createUnicastObject(new StringEncrypter().encrypt("test message")).intValue();
			msg.setHeader("messageID", Integer.toString(messageID));
			msg.getBody().equals(encoder.encrypt("test message"));

			// Send the message
			status = sendSecureBinaryMessage(msg);

			// Get the status
			status = ((Integer) V_TEST_RMI.call_method(V_TEST_NAME, Integer.TYPE, "getStatus", new Class[]{})).intValue();
			assertEquals("Server status should be success",ServerStatus.SUCCESS_OF_PINGING, status);

			// Get the result from the server
			Logger logger = (Logger) Naming.lookup("java://" + Client.SERVER_MDB);
			Vector<ClientInterface> cis = logger.getClientInterfaces();
			// Check if the message is ok
			if (((Integer) V_TEST_RMI.call_method(V_TEST_NAME, Integer.TYPE, "getResult", new Class[]{Hashtable.class})).intValue()!= 0) {
				System.out.println("Error : No client interface from the server");
				status = 1;
			}
		} catch (NamingError ne) {
			status = 1;
		} catch (RemoteException ex) {
			status = 1;
		} catch (ClassNotFoundException ex) {
			status = 1;
		} catch (UnsupportedOperationException ex) {
			status = 1;
		}

	}

}