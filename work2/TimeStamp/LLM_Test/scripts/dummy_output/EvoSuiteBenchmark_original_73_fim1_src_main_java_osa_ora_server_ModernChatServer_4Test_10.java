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
		 * Basic constructor of {@link ModernChatServer} class.
		 * @param serverName : name of server
		 * @param user : set administrator account
		 * @throws RemoteException
		*/
		public ModernChatServer_4Test(String serverName, User username) throws RemoteException{
            this.serverName = serverName;
            this.username = username;

            JOptionPane.showMessageDialog(null, "Server: " + this.serverName + " created.");
            this.password = "adminpass".toCharArray();
        }
	/**
	*  Creates all entities of all classes in {@link ModernChatServer_6Test}
	*  with the following parameters :
	*  {@literal @}Remote
	*  {@literal @}Implements(ClientInterface.class)
	*
	* */
	@Test
    public void testConnectivity() throws RemoteException {
        // Create all entities of all classes in {@link ClientInterface_4Test}
        try {
            // JOptionPane
            assertNotNull("Failed to create entity at server level", new ClientInterface((String)null, null, (int)0));
            assertNotNull("Failed to create entity at server level", new ClientInterface("", "", (int)0));
            assertNotNull("Failed to create entity at server level", new ClientInterface("", "adminpass", (int)0));
            assertNotNull("Failed to create entity at server level", new ClientInterface("adminPass", (String)null, (int)0));
            assertNotNull("Failed to create entity at server level", new ClientInterface("adminPass", "adminpass", (int)0));
            assertNotNull("Failed to create entity at server level", new ClientInterface("adminPass", "adminpass", 15));
            assertNotNull("Failed to create entity at server level", new ClientInterface("adminPass", "adminPass", 5));
            // Test client interface creation
            assertNotNull("Failed to create entity at server level", new ClientInterface(this.serverName, this.username, (int)0));
        } catch (RemoteException re) {
            fail("RemoteException not thrown : " + re.toString());
        } catch (ServerSettingBean.CreateSettingException e) {
            fail("ServerSettingBean.CreateSettingException not thrown : " + e.toString());
        } catch (ServerSettingBean.NoSuchSettingException e) {
            fail("ServerSettingBean.NoSuchSettingException not thrown : " + e.toString());
        }
    }
	/** @field protected RemoteServer r_server : remote server, that is used to start server
	 * @field String serverUrl : url of server. the url should contain : "realURL"*/
    public static void main(String args[]) throws RemoteException {
        RemoteServer r_server = null;
        for (int i=0; i<3; i++) {
            try { r_server = new RemoteServer(new StringEncoder64("dummy"),
                    "http://192.168.1.254:8086");
            } catch (ServerSettingBean.CreateSettingException e) {
                Logger.getLogger(ModernChatServer_4Test.class.getName()).log(Level.WARNING, null, e);
            }
        }
        Thread.sleep(5000);
    }

    @Override
    public ResultBean  changeAdminPassword(String emailAddr, String oldPass, String newPass) throws RemoteException {
        ResultBean resultBean = new ResultBean();
}
}