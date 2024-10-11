// ModernChatServer_0Test.java
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
* It contains one unit test case for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {
		
    @Test
    void testLogger() {
        assertNotNull(Logger.getLogger(MasternChatServer.class.getName()));
    }

	@Test
	void testRunServer(){
		
		ClientInterface client= null;
		try {
			 client = new ClientInterface();
			client.login(ClientInterface.MANDATORY, User.PASSWORD, ClientInterface.ROOM_NAME, User.USER);
		 	
			// Client to test: set up the client and register to the registry
			String serverName = client.resolveServerName();
			
			// Make serverName "RealServerName"
			ServerSettingBean serverSettingBeanOuter = client.createSettingBean();
			
			Hashtable envVariables = new Hashtable();
			envVariables.put(ClientInterface.SERVER_NAME, serverName);
			envVariables.put(ClientInterface.PARAM_SERVER_USERNAME, ClientInterface.USER_NAME);	
			envVariables.put(ClientInterface.PARAM_SERVER_PASSWORD, ClientInterface.PASSWORD);	
			envVariables.put(ClientInterface.SERVER_USERNAME, ClientInterface.USER_NAME);
			envVariables.put(ClientInterface.SERVER_ROOM, ClientInterface.ROOM_NAME);
			envVariables.put(ClientInterface.PARAM_SERVER_USER_ROOM, ClientInterface.ROOM);
			
			// Make the server setting object
			ServerSettingBean serverSetting = client.createServerSettings(envVariables);
			System.out.println(serverName + " - create Server Setting. Server: '" + serverSetting.getServerPath() +"', path:'" + serverSetting.getServerPath() +"' Server: '" + serverSetting.getServerName() + "' ");	

			userServer.setServerSettingsBean(serverSetting);
			// register a user bean into the registry
			userServer.registerUser(client.resolveBranchName(), ClientInterface.USERNAME, "");

			// server startup by Login server
			client.loginByServer();
			
		} catch (Exception e) {
            System.err.println("LOG:" + e.toString());
        }
		System.out.println("testRunServer: userServer.getServerSettingsBean()=\n" + userServer.getServerSettingsBean());
		system("ls -h /home/mars" + FileEncoder64.fromCharsetUTF8("utf-8"));
		
		assertNotNull(userServer.getServerSettingsBean());
		 
		//server startup by Login server
		System.out.println("testRunServer: userServer.unregisterManager()=\n" + userServer.unregisterManager());

	} 

    Main.Main main;

	@Test
	void testMessageReceived() {

        // user with message from other client
		Message messageReceived = Message.create();
		userServer.sendMessage(StringEncoder64.fromCharsetUTF8("utf-8"), messageReceived);

		// wait for user to be notified
        userServer.waitForRefreshContactFromClient();
		
		TextMessage receivedTextMessage = (TextMessage) messageReceived.getBody();
		String[] receivedTextMessageContent = receivedTextMessage.getMessage().split(" ");
		String receivedTextMessageValue = receivedTextMessageContent[1] + receivedTextMessageContent[2];
		assertEquals("message received from other client" + receivedTextMessageContent[0], receivedTextMessageValue, getLogger().getFormatter().format(new SimpleFormatter()));	
		assertEquals("message received from other client" + receivedTextMessageContent[0] + "to mars" + userServer.getServerSettingsBean().getServerName(), receivedTextMessageValue, getLogger().getFormatter().format(new SimpleFormatter()));	

		
		
		
		
		

		

       
		

	}

}