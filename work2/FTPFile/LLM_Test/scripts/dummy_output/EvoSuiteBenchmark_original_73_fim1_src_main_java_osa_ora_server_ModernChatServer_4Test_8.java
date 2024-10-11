// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
	/**
	 * Check online users by ping
	 * @throws RemoteException
	 */
    @Test
    public void testPingUsers() throws RemoteException
    {

     // server
    	try (Registry registry=LocateRegistry.getRegistry(Constants.SERVERHOST);
			 UnicastRemoteObject remoteObject= ( UnicastRemoteObject ) registry.lookup("UserInterfaceUnicastRemote");) {
	try {
			//LoginBean login = new LoginBean("123456");
			LoginBean login = new LoginBean("1234567");
				    
			String newPassword = StringEncoder64.encode(LoginBean.PASSWORD);
			
	    // Send send ping message
    	  	ResultBean result = User.sendPong( login, newPassword);
	  		assertNotNull(result, "Fail to send ping message. It need a result in the response."); 
	    // Send test send kick off by login message
			  SendKickOffMessageThread send = new SendKickOffMessageThread(LoginBean.PASSWORD, newPassword, "1234567");
			  send.start();
	    // Send test send refresh contact message
			  SendRefreshContactMessageThread sendRefresh = new SendRefreshContactMessageThread((String) result.get("LoginResult", "RefreshContact"));
			  sendRefresh.start();
		    // Let wait for result message.
			  waitForMessage(ServerSettingBean.SERVERHOST + ":4521", ServerSettingBean.SERVERPORT + ":4521", 5000);
				  
			  send.terminate();
			  sendRefresh.terminate();
		} catch (Exception e) {
			  System.err.println("Error sending send ping message.");
			  e.printStackTrace();
		}
			}
    }
}
 // End class of {@link ModernChatServer_4Test}.java