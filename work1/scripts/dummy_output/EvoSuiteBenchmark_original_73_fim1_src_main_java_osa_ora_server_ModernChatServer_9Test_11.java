// ModernChatServer_9Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
*/
class ModernChatServer_9Test {
		@Test
		public void testServerInterface(){
			ClientInterface chat_server = new ClientInterface();

			//sign in as a client by admin user
			LoginBean loginBean = signInAsAdmin("admin", "password");

			//the server should not try to send messages
			assertNotNull(loginBean.getBinarymessage());

			//get chat service by the user
			BinaryMessage chat_msg = chat_server.getBinarymessage();

			//the user is not authenticated, just get status and get the password
			ResultBean result = new ResultBean();
			result.setConnectionStatus(1000);
			result.setTextMessage((String)StringEncoder64.encode(
					"You currently have no account connected with the server!"));

			//the user is authenticated, the server should send messages back
			assertEquals(chat_msg.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_OK);
			assertEquals(chat_msg.getUserStatus(),
					ResultBean.USER_STATUS_OK);

			//otherwise the server should not send any messages
			assertEquals(chat_msg.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_FAIL_USER_NOT_CONNECTED);
			assertEquals(chat_msg.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_FAIL_USER_NOT_ARIZON_GATEWAY);
			assertEquals(chat_msg.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_FAIL_ON_INVALID_ACCOUNT);
		}

		@Test
		public void testServerInterfaceAdmin(){
			Hashtable<String, String> extraEnv = new Hashtable<>();
			extraEnv.put(IConstant.ADMIN_USER_KEY, "admin");

			ClientInterface chat_server = new ClientInterface();

			//sign in as an admin by admin user
			LoginBean loginBean = new LoginBean();
			loginBean.setExtraEnv(extraEnv);
			loginBean.setEmailAddr("admin@admin.org");

			//the server signals to the admin who is already connected to the client
			ResultBean result = new ResultBean();
			result.setConnectionStatus(1000);

			//the message that server sends to the admin
			TextMessage chat_msg = new TextMessage();
			chat_msg.setServer(new ServerSettingBean());
			chat_msg.setBinaryMessage(new BinaryMessage("Hello, world"));
			result.setBinaryMessage((String)StringEncoder64.encode("Server is sending messages, " +
					"please be patient, if you don't send anything, the server will stop sending " +
					"messages, you must wait 10 seconds before sending messages again."));

			//the client checks if he already send any messages on the server
			assertEquals(chat_msg.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_OK);

			String message = new String((byte[])chat_msg.getBinaryMessage().getBinaryBytes(),0, chat_msg.getBinaryMessage().getBinaryLength());
			assertEquals(message,
					new String(new byte[1024]));

			BinaryMessage chat_reply = chat_server.getBinarymessage();
			assertNotNull(chat_reply);

			assertEquals(chat_reply.getServer().getUserStatus(),
					ResultBean.SERVER_STATUS_OK);

			assertNull(chat_server.getUserStatus());
}
}