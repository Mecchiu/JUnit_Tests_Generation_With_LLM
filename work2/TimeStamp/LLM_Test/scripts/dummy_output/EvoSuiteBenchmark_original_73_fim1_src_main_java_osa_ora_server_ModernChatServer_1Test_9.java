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
		
    MyServerBean serverBean = new MyServerBeanImpl();
	
	private void serverBeanBeanAdded(ServerSettingBean settingbean) {
		if(settingbean.getStatus()==1) {	
			System.out.println("bean1 added to this set");
			System.out.println("bean  name: " + settingbean.getId());
		}
	}
	
	private void serverBeanBeanRemoved(ServerSettingBean settingbean) {
		if(settingbean.getStatus()==1) {	
			System.out.println("bean1 removed from this set");
			System.out.println("bean  name: " + settingbean.getId());
		}
	}
	
	// Test
	@Test
	public void test() {
		

		// 1. set up the server
		serverBean.setName("MyBinaryServer");
		serverBean.setAddress("localhost:8080");
		// serverBean.setPort(8800);
		// serverBean.setPassword("myapppassword");
		// serverBean.setGroups(new java.util.HashSet());
		
		serverBean.setServerType(0);	
		//if(LoginBean.loginBeanName.equals("admin")){
		//	serverBean.setServerType(2);
		//}
		
		// 3. setup a client and register it as a ServerInterface if not already done
		ClientInterface client = new ClientInterface();
		try {
            serverBean.register(client);
			client.setIOManager(this);
			client.setServerInterface(this);
			ClientInterface.run();
		}
		catch (Exception e) {
			ExceptionHandler.handle(e, "Error during constructor of ");
		} // end of try block
		
		//ServerBean.setInstance(serverBean);
		
		// ServerBean.setClientInterface(client);
		

		// 1. test if the bean is in the serverBean list
		assertTrue("no beans are found in this server", null!= serverBean);
		
		// 1.test if the bean is in the correct list of beans
		assertTrue("bean1 is not in this list", serverBean.equals(ServerBean.getInstance()));	
		// test if the bean is not yet in the list of beans
		assertFalse("bean1 is found twice in the list", serverBean.equals(ServerBean.getInstance()));	
		// 2. set the host value of the server bean
		serverBean.setAddress("coyantb");
		// set the server type value to 0 to make the test more efficient
		serverBean.setServerType(0);
		
		// The following code block sends a message to the server.
		// It uses the following methods:
		// 1. Send a broadcast to the channel of the server.
		// 2. Send a broadcast to all clients in the channel.
		// 3. Send a broadcast to the channel of the server, including all clients in the channel.
		// The serverBean.getListOfClients() call ensures that the correct message is sent.
		
    /*
    String message = new String("message, "); // message to send to server
    
    try {
    SendUserUpdatedStatusThread thread = new SendUserUpdatedStatusThread();
      thread.setServer(serverBean);
        thread.setMessage(message);
        JOptionPane.showMessageDialog(null,"Send an updated status to this server and this client","Server status",JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    sendBroadcast(new String[0]);
    */
//		// 3. 1. 1) check if the message for this server is already sent by the other clients for client 1
}
}