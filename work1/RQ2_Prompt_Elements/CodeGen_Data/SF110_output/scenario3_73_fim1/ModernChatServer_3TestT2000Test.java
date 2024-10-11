// ModernChatServer_3Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
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
     * change user password
     *
     * @param email : user email
     * @param oldPass : current password
     * @param newPass : new password
     * @return ResultBean with either true or false
     * @throws RemoteException
     */
    public ResultBean changePassword(String email, String oldPass, String newPass) throws RemoteException;
}

// ModernChatServer_3Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
		/**
		* Test : test server can support Ping
		* @throws Exception
		*/
		@Test
		public void shouldBeAbleToPingUsers() throws Exception {
			Registry r = LocateRegistry.getRegistry(IConstant.HOST_URL);
			BinaryMessage msg = new BinaryMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("hello1"));
			TextMessage tms = new TextMessage();
			String encryptedMessage = StringEncrypter.getStringFromByte(StringEncrypter.decrypt(msg.getData(), msg.getKey()));
			tms.initFromString(MessageBeanConverter.encryptString(encryptedMessage));
			tms.setUserName("admin");

			User user1 = UsersBD.createUser(tms);
			MessageBean msg1 = UserConverter.inflate(user1);
			BinaryMessage.initFromString(msg1, StringEncrypter.getStringFromByte("hello1"));

			tms = new TextMessage();
			tms.initFromString(MessageBeanConverter.encryptString(StringEncrypter.decrypt(msg1.getData(), msg1.getKey())));
			tms.setUserName("admin");

			assertTrue(MessageBeanConverter.sameMsgBean(tms, msg1));
		}

		/**
		* Test : test server can support Refresh Contact
		* @throws Exception
		*/
		@Test
		public void shouldBeAbleToRefreshContact() throws Exception {
			Registry r = LocateRegistry.getRegistry(IConstant.HOST_URL);
			MessageBean msg = new BinaryMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("hello1"));
			tms = new TextMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("good1"));
			tms = new TextMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("hello2"));
			tms = new TextMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("good1"));

			tms = new TextMessage();
			tms.initFromString(MessageBeanConverter.encryptString(StringEncrypter.getStringFromByte(StringEncrypter.decrypt(msg.getData()))));
			assertNull(MessageBeanConverter.sameMsgBean(tms.getUserMessage(), tms));
			tms = new TextMessage();
			tms.initFromString(MessageBeanConverter.encryptString(StringEncrypter.getStringFromByte(StringEncrypter.getStringFromByte(msg.getData()))));
			tms.setUserName("admin");

			UserMessageBean umb = (UserMessageBean)MessageBeanConverter.inflate(tms.getUserMessageB());
			assertNotNull(umb);
			tms = new TextMessage();
			tms.initFromString(MessageBeanConverter.encryptString(StringEncrypter.getStringFromByte(StringEncrypter.decrypt(msg.getData()))));
			assertNull(MessageBeanConverter.sameMsgBean(tms.getUserMessageB(), tms));
			tms = new TextMessage();
			BinaryMessage.initFromString(msg, StringEncrypter.getStringFromByte("good1"));
			tms.initFromString(MessageBeanConverter.encryptString