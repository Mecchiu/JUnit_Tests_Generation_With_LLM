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
// ModernChatServer.java
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

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface, both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    /**
     * any clinet ping it should receive true
     *
     * @return true always
     */
    public boolean ping() {
        return true;
    }
}

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
		private static final Logger logger = Logger.getLogger(ModernChatServer_1Test.class.getName());
		private static final int PING_TESTING_TIME_MILLIS = 10 * 1000;
		Vector<User> users = new Vector<User>();
		Vector<Room> rooms = new Vector<Room>();

		/**
		 * Test pings users
		 */
		@Test
		public void testPing() {
			StringEncoder64 encoderP = new StringEncoder64();
			for (int i = 0; i < 2; i++) {
				logger.info("ping "+i);
				logger.info(StringEncoder64.encodeToString(users.size()));
				int test = users.size();
				users = new Vector<User> ();
				for (int j = 0; j < PING_TESTING_TIME_MILLIS; j++) {
					logger.info("Checking if " + j + " ping received ");
					try {
						if (j == test) {
							for (int k = 0; k < PING_TESTING_TIME_MILLIS; k++) {
								String msg = "New message:1" + StringEncoder64.encodeToString(BinaryMessage.DEFAULT_PARAM);
								logger.info("Checking " + j + " ping");
								NewMsgBean bean = new NewMsgBean();
								bean.initMessage(msg);
								logger.info(bean);
								for (User u : users) {
									logger.info("Test pinger for u " + u);
									if (u.getUserID().equals(encoderP.encodeToString(u.getID())) ) {
										if (u.getGroup().getMessage().equals("ping")) {
											assertTrue(u.getGroup().isEmpty() == true);
											assertTrue(encoderP.encodeToString(u.getUserID()).equals(encoderP.encodeToString(u.getID())) == true);
											assertTrue(encoderP.encodeToString(u.getEmail()).equals(encoderP.encodeToString(u.getPassword())) == true );
											assertTrue(encoderP.encodeToString(u.getName()).equals(encoderP.encodeToString(u.getUserName())) == true);
										}
									}
								}
								users.clear();
								users.add(users.get(k).clone());
								users.set(k, UsersBD.login(encoderP.encodeToString(users.get(k).getID()), "PING_USER"));
							}
						} else if (encoderP.encodeToString(encoderP.encodeToString(test)).equals(encoderP.encodeToString(test))) {
							if (encoderP.encodeToString(test).equals(users.get(test).getUserID())) {
								assertTrue(encoderP.encodeToString(test).equals(users.get(test).getUserID()));
								fail("Test user: " + encoderP.encodeToString(users.get(k).getPassword()));
							} else {
								assertFalse(encoderP.encodeToString(test).equals(users.get(k).getUserID()));
								users.get(test).setUserID(encoderP.encodeToString(users.get(k).getUserID()));
								users.get(test).setPassword(encoderP.encodeToString(users.get(k).getPassword()));
							}
						} else {
							assertFalse(encoderP.encodeToString(test).equals(users.get(test).getUserID()));
							users.get(test).