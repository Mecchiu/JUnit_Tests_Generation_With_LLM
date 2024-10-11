// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
		private static final String LOGIN_RESOURCE = "";
		private static final String CONTACT_RESOURCE = "";
		private static final String CONTACT_ROOM = "";
		private static final String CREDIT_PROGRESS_RESOURCE = "";
		private final String PASSWORD = "";
		private final String ADMIN = "admin";
		private final String CLIENT = "client";
		private final int SERVER_RESTART = 0;

		@Test
		void sendSecureTextMessage() throws URISyntaxException, RemoteException{
				Logger.getAnonymousLogger().addHandler(new FileHandler("/tmp/test.log"));


			if(CLIENT == null){
				Logger.getAnonymousLogger().log(Level.WARNING, StringEncrypter.randomStringEncrypted());
				assertEquals(1, 0);
			}
			sendSecureTextMessage(new TextMessage("Hello World!", new String(CLIENT)));
			assertEquals(1, ClientInterface.getConnectionCount());
			assertFalse(ClientInterface.hasConnectionToClient(CLIENT));

			ServerSettingBean serverSettingBean = (ServerSettingBean)JOptionPane.showInputDialog(null, CLAY_RESOURCE + LITE
					+ "clay.properties", LITE, 0, null);
//			assertTrue(CLAY_RESOURCE + LITE + "clay.properties" + LITE + " is a directory", (new File(CLAY_RESOURCE + LITE
//					+ "clay.properties")).isDirectory());
			System.out.println(serverSettingBean);
			assertTrue(serverSettingBean.getBinaryMessageResource()!= null);
			Logger.getAnonymousLogger().removeHandler(new FileHandler("/tmp/test.log"));
			UnicastRemoteObject.unexportObject(new UnicastRemoteObject(serverSettingBean));

			assertTrue(BinaryMessage.isAvailable());
			assertNotEmpty(BinaryMessage.getAllMessages());
			assertEquals(LITE + "clay.properties", BinaryMessage.getBinaryResource());
			assertTrue(BinaryMessage.isValidPassword(PASSWORD));//1

			assertTrue(ClientInterface.hasConnectionToClient(ADMIN));//1


		}

    @Test
    public void sendSecureTextMessage() throws URISyntaxException, RemoteException {

    	// send text message (1)
		Logger.getAnonymousLogger().addHandler(new FileHandler("/tmp/test.log"));

		sendSecureTextMessage(new TextMessage("", CLAY_RESOURCE + LITE + "clay.properties", PASSWORD));

		assertNotEqual(-1, ServerSettingBean.getConnectionCount());

		if (ClientInterface.getConnectionCount() == 2){
			assertTrue(ClientInterface.hasConnectionToClient(CLIENT));//1//1
			assertTrue(ClientInterface.hasConnectionToClient(ADMIN));//1
		}
		Logger.getAnonymousLogger().removeHandler(new FileHandler("/tmp/test.log"));

       assertFalse(ClientInterface.hasConnectionToClient(CLIENT));

		if(CLIENT == null){//1
			assertTrue(ClayInterface.isBinaryValidPassword(PASSWORD));//5
		}
		Logger.getAnonymousLogger().log(Level.INFO, CLAY_RESOURCE + LITE + "clay.properties" + LITE + " is a directory");
		System.out.println(CLAY_RESOURCE + LITE + "clay.properties" + LITE + " is a directory");

		UnicastRemoteObject.exportObject(new UnicastRemoteObject(CONFIG), LITE+"config.properties");
}
}