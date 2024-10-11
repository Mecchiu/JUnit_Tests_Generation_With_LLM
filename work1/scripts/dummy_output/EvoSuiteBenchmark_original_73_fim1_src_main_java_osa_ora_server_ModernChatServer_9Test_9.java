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
		String serverHost = "serverHost";
		String confPath = "/conf";
		String[] conf = {"/conf/chatSettings.xml", confPath};
	/**

*/
	@Test
	void testSignInAsAdminServer()
		throws Exception {
		// Initialize JUnit
		new Thread(new Runnable() {
					
			
			@Override
			public void run() {
				try {
			         // First create new chat server
			         Registry registry = LocateRegistry.getRegistry(0);
			         BinaryMessage.setChatServer(new ChatServerBean(serverHost, conf));

			         // Create new thread to ping the server
			        ClientInterface chatServer = new ClientInterface(ChatServerBean.USER_PING_INTERFACE, serverHost);
			         chatServer.start();

			    	 // Get a list of clients
			    	 Vector<Long> clientsCount = new Vector<Long>(1);

			   	 // register the new thread and it will be a client of the server
			   	 ChatServerBean.register();
			  		
			        //Create a thread to stop all server
			        ChatServerBean.thread = new SendKickOffByLoginMessageThread(ChatServerBean.USER_START_PING);
			        ChatServerBean.thread.start();

			     
			        // Create a thread to ping the server at the beginning of the tests.
			        ChatServerBean.pingCheckThread = new SendUserUpdatedStatusThread(ChatServerBean.USER_PING_INTERFACE);

			        //Create a thread to ping the server at the end of the tests.
			        ChatServerBean.pingCheckThread.start();

			        // Create a thread to pinging the server at the beginning of the tests.
			        ChatServerBean.pingerThread = new SendRefreshContactThread(ChatServerBean.USER_CHECK_PING);
			        ChatServerBean.pingerThread.start();

				} catch (RemoteException e) {
					return;
				}
			  }
			 }
		).start();
	}
}