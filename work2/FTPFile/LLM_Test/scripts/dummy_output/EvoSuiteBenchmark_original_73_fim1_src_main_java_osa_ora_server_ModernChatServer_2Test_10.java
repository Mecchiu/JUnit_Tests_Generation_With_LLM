// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
		
	static ClientInterface ci = null;
		
	/**
	 * Test the {@link LoginBean#login()} method of {@link LoginBean} class.
	 * @throws Exception
	 */
	@Test
	public void testLogin() throws Exception {
		
		RemoteException rxe1 = null;
		
		try {

			LoginBean lbean = new LoginBean();
			
			try {
				ci.login(lbean, Locus.getInstance().getEmailAddress(), "secret");
				
			} catch (Exception e) {
				rxe1 = e;
			}
			
			assertNotNull(rxe1);
			assertNotSame(rxe1, null);
			assertTrue(rxe1 instanceof RemoteException);
			
			ServerSettingBean bbean = new ServerSettingBean();
			
			try {
				ci.setServerSettingBean(bbean);
				
			} catch (Exception e) {
				rxe1 = e;
			}
			
			assertNotNull(rxe1);
			assertNotSame(rxe1, null);
			assertTrue(rxe1 instanceof RemoteException);

	    } catch (Exception e) {
	      assertNotNull(rxe1);
	      assertNotSame(rxe1, null);
	    }

	}
}

/**
 * Runnable for the senduserupdatedstatus thread that sends the text message to the users
 */
class SendUserUpdatedStatusThread_2Test extends ServerInterface_2Test {

	private ClientInterface ci = null;
	
	/**
	 * Test the {@link SendUserUpdatedStatusThread} class.
	 * @throws Exception
	 */
	@Test
	public void sendUsersUpdatedStatus() throws Exception {

		SendUserUpdatedStatusThread t_updateuserupdatestatusthread = null;

		try {

			SendUserUpdatedStatusThread.setUser(new User("user1"));
			SendUserUpdatedStatusThread.setPassword(StringEncrypter.randomString());
			SendUserUpdatedStatusThread.setRoom(new Room("room1"));
			t_updateuserupdatestatusthread = new SendUserUpdatedStatusThread();
			Registry.getRegistry(null, null).createEntry(((Locus)null),t_updateuserupdatestatusthread);
			
		} catch (RemoteException reme) {
			
			fail(String.format("There's no remote exception %s", reme.toString()));

		}
		
		try {
			SendUserUpdatedStatusThread.setUser(new User("user2"));
			SendUserUpdatedStatusThread.setPassword(StringEncrypter.randomString());
			SendUserUpdatedStatusThread.setRoom(new Room("room2"));
			SendUserUpdatedStatusThread.setUpdatedThread(new SendUserUpdatedStatusThread());
			SendUserUpdatedStatusThread.setUser(new User("user3"));
			t_updateuserupdatestatusthread = new SendUserUpdatedStatusThread();
		} catch (RemoteException reme) {
			
			fail(String.format("There's no remote exception %s", reme.toString()));

		}
		

		
	
		try {

			ci = new ClientInterface();
			t_updateuserupdatestatusthread.setConnectionToServerBean(ci);
			t_updateuserupdatestatusthread.setIsConnected(true);
			
		} catch (Exception e) {
			
			fail(String.format("Exception thrown %s", e.toString()));

		}
		
}
}