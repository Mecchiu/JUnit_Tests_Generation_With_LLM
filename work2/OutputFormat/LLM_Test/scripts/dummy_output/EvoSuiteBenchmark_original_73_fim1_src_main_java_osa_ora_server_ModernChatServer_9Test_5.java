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
		/**
		* @return
		*/
		static {
			System.loadLibrary("JNI-2.0.0");
			System.loadLibrary("JNI-2.0.0");
		}


	/**
	 * @param args
	 */

    @Test
    public void MainTest(String[] args) throws Exception {
		if (ClientInterface.class == ServerSettingBean.class) {
			SendRefreshContactThread refreshContactThread = new SendRefreshContactThread();
			refreshContactThread.start();
		}

		ServerSettingBean.SETTINGS_BEAN = new ServerSettingBean();
		ServerSettingsBean.setSetting(new ServerSettingBean());

		ClientInterface.setDefaultSettings(new ClientSettingBean());

		new UserInterface();

		System.out.println("\n\nTest started");
        Thread thread = SendKickOffMessageThread.newThread();
        thread.start();
        thread.join();

        UnicastRemoteObject.exportObject(new User(new TextMessage(new String("Hello World!")), UsersBD.class), new Integer(11));

		System.out.println("\n\nTest complete");
        Thread signOutThread = SendRefreshContactThread.newThread();
        signOutThread.start();
        signOutThread.join();

        ClientInterface.setDefaultSettings(UserInterface.defaultSettings);

		System.out.println("Test passed");
    }


	class UserInterface extends UnicastRemoteObject implements ClientInterface {

		private final String username = "user";
		private final String lastname = "lastname";
		private final String address = "address";
		private final String country = "country";

		private ClientInterface serverInterface;


		/**
		* @param username
		* @param lastname
		* @param address
		* @param country
		*/
		public UserInterface() {
			UnicastRemoteObject.exportObject(this, new Integer(11)).start();
		}

		public String getUserID() {
			return username;
		}

		public String getLastName() {
			return lastname;
		}

		public String getAddress() {
			return address;
		}

		public String getCountry() {
			return country;
		}

		public ResultBean login(LoginBean loginBean) throws RemoteException {
			throw new RemoteException("Not implemented");
		}

		public ResultBean sendUserStatus() throws RemoteException {
			throw new RemoteException("Not implemented");
		}

	}

	class ClientSettingsBean extends UnicastRemoteObject implements ClientInterface {


		private final ClientSettingBean clientSettingBean = new ClientSettingBean();


		public ClientSettingBean() throws RemoteException {
			super();
		}

		public ClientSettingBean clone() throws RemoteException {
			try {
				return (ClientSettingBean) super.clone();
			} catch (CloneNotSupportedException e) {
				System.out.println(e);
				return null;
			}
		}

		public UserInterface getServerInterface() throws RemoteException {
			return new UserInterface();
		}

		public ClientInterface getClientInterface() throws RemoteException {
			return new ClientInterface();
		}


		public Hashtable<IConstant, BinaryMessage> getConnectionData() throws RemoteException {
			throw new RemoteException("Not implemented");
		}

		public Hashtable<IConstant, String> getServerList() throws RemoteException {
			throw new RemoteException("Not implemented");
		}

		public Hashtable<IConstant, String> getStatus() throws RemoteException {
			throw new RemoteException("Not implemented");
		}

	}
}