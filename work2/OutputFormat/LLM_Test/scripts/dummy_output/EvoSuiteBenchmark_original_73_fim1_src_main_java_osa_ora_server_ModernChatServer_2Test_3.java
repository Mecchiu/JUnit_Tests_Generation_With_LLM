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
		
	/**
	 * Instance of {@link RemoteException} which is generated when connection failure is detected.
	 */
	Exception errorException = new Exception("No connection failed");
	
    /**
     * Instance of {@link User} class which contains all the user information in a {@link Group}.
     */
    User user1 = new User(UsersBD.ID_USER_ROOM_1, UsersBD.NAME_USER_1, UsersBD.DESCRIPTION_USER_1, UsersBD.EMAIL_USER_1);
	
    /**
     * Instance of {@link Group} class which contains all the user information in a {@link Group}.
     */
    Group group1 = new Group(UsersBD.ID_GROUP_ROOM_1, UsersBD.NAME_USER_1, UsersBD.DESCRIPTION_GROUP_1, UsersBD.EMAIL_GROUP_1);

	@Test
	void test() throws RemoteException, IllegalAccessException, InvocationTargetException {
		
		String client = "Client1";

		UnicastRemoteObject clientObj = UnicastRemoteObject.exportObject(client,
				new String[]{"ClientObj1"});

		// Server side, sign in to the client server
		String clientToServer = "ClientToServer";
		ClientInterface client2 = ClientInterface.createClient_ServerSide(clientToServer);
		
		LoginBean clientLoginBean = new LoginBean();
		clientLoginBean.setLoginPassword("password");
		clientLoginBean.toString();
		
		LoginBean client2LoginBean = new LoginBean();
		client2LoginBean.setLoginPassword("password");
		client2LoginBean.toString();
		server.signIn(clientObj, clientToServer, "oldpass", "oldip");
		
		assertNotNull("Invalid result for first sign in attempt", client2LoginBean);
		
		// Second sign in attempt
		LoginBean secondLoginBean = new LoginBean();
		secondLoginBean.setLoginPassword("oldpass");
		secondLoginBean.toString();
		
		usersConnection(client2);
		usersConnection(client2);
		usersConnection(client);
		usersConnection(client);
		
		assertNotNull("Invalid result for second sign in attempt", secondLoginBean);

		// Get the message in the message history
		try {
			Thread.sleep(500);
		}
		catch (Exception ignored) {}

		// Logout
		
		ClientInterface client3 = UnicastRemoteObject.exportObject(ClientInterface.CONNECT_DEVICE,
				new String[]{"ClientObj3"});

		// Close connection with the client 
		usersConnection(client3);
	}
	
	private void usersConnection(ClientInterface client) {
}
}