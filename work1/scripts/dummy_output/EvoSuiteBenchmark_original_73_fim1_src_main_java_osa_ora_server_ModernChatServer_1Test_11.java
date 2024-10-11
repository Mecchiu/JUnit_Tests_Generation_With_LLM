// ModernChatServer_1Test.java
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
* It contains one unit test case for the {@link ModernChatServer#ping()} method.
*/
class ModernChatServer_1Test {
		ServerConnectionInterface serverConnectionInterface;

		@Test
		void sendLoginUpdateMessage_Ping_Success() throws RemoteException {
			String testStr = "test test";
			System.setProperty(IConstant.TEST_SERVER_PORT, IConstant.TEST_SERVER_PORT + "");
			try {
				User admin = new User("admin", "");
				admin.getUsersInfo();
				BinaryMessage message = new BinaryMessage(testStr, null);
				StringEncoder64 encoder = new StringEncoder64();
				ServerSettingBean setting = new ServerSettingBean(
						"tcp://" + IConstant.TEST_SERVER_ADMIN, IConstant.TEST_SERVER_PING_PORT);
				setting.setPort(IConstant.TEST_SERVER_PING_PORT);
				setting.setKey("TEST");
				String str = setting.encodeToString(encoder);
				result = "Success";
				result = sendLoginUpdateMessage(setting, message);
				assertSame(result, "Success");

				String strTest = result;
				String testStr_2 = "test test";
				String testStr1 = setting.decodeToString(strTest);
				assertEquals(testStr, testStr1);
			}
			finally {
				System.setProperty(IConstant.TEST_SERVER_PORT, IConstant.DEFAULT_PORT);
				try {
					int port = Integer.parseInt(IConstant.TEST_SERVER_PORT.substring(1));
					System.setProperty(Registry.JNDI_NAME+"rmi/destination=10.10.10.3", "127.0.0.1");
					System.setProperty(Registry.JNDI_NAME+"rmi", "java:/eureka");
					System.setProperty(Registry.LOPRI, "true");
					System.setProperty(IConstant.TEST_SERVER_ADMIN, "admin");
					tryRemove(new User("admin", "", null), port);
					tryRemove(new User("otheradmin", "", null), port);
				}
				finally {
					Registry.remove(Registry.JNDI_NAME);
					Registry.remove(Registry.LOPRI);
					LocateRegistry.getRegistry(Registry.DEFAULT_LOCATOR_PORT);
				}
			}
		}

		void runTest() throws IOException, RemoteException {
			testPing();
		}

		@Test
		void testPing()
			throws IOException, RemoteException {
			String email = "admin@example.org";
			String[] usernames = new String[1];
			usernames[0] = email;
			sendLoginUpdateMessage(new ServerSettingBean(email, "", ""), new BinaryMessage(Test.TESTSTR, usernames));
			try {
				System.out.println("Ping: "+ result);
				if(! Ping.pingMe(result.toLowerCase(), email)) {
					assertTrue("Ping FAILED!", false);	
				}
			}
			finally {
				Thread.sleep(10000); 
			}
			
			Enumeration<String> users = ServerConnectionInterface.getUsersList();
			Vector<UsersBD> usersBD = UsersBD.getUsersBD(); // UserBDImpl.fromCollection(usersBD);
			int i = 0;
}
}