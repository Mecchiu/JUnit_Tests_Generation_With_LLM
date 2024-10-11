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
		public static final String USERNAME = "User_1";

		@Test
		public void testSignInAsAdmin() throws RemoteException {
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("rmi://127.0.0.1:4181/RemoteServer", new UnicastRemoteObject(new User(USERNAME)));
			LoginBean loginBean = new LoginBean(USERNAME);
			User remoteUser = (User) UnicastRemoteObject.exportObject(loginBean, 0);
			ClientInterface.setUpRegistryClient(registry);
			
			try {
				
				Thread.sleep(3000);
				registry.bind(StringEncoder64.ENCODED_USERNAME, remoteUser);                                   // bind remote user
				
				
				System.out.println("Sign In As Admin User...");
				Thread.sleep(3000);
				ResultBean result = User.signInAsAdmin(loginBean, USERNAME);  // sign in user as admin
				assertEquals(result.getResult(), ResultBean.E_PASSED);                                              // assert result == PASSED
				JOptionPane.showMessageDialog(null, "Login Success! " + User.convert(remoteUser));
				
			} finally {
				ClientInterface.clientDisconnect();
				registry.unbind(StringEncoder64.ENCODED_USERNAME);
			}
		}
}