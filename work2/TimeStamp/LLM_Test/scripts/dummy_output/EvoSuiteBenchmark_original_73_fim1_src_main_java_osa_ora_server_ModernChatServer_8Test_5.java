// ModernChatServer_8Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServer_8Test {
		/*
		 * Logger
		 */
		static final Logger LOGGER = Logger.getLogger(ModernChatServer_8Test.class.getCanonicalName());


		/**
		  * Tests the thread that sends the plain text message.
		  */
		private boolean isRunning();
		/**
		  * Sends plain text message.
		  */
		private void setIsRunning(boolean running);
		/**
		  * Starts the thread that toggles the password.
		  */
		void setIsPassword();


		/**
		  * Creates a new instance of {@link ModernChatServer}.
		  * @throws RemoteException
		  */
		public ModernChatServer_8Test() throws RemoteException {
			this.setIsRunning(true);
		}

	/**
	 * @throws RemoteException
	 */
	@Test
	public void plainTextAnnouncement() throws RemoteException {
		int minutesToWait = ServerSettingBean.getMinutesToWait();
		int minutesToWaitPeriod = minutesToWait / 2;
		setIsPassword();
		setIsRunning(true);

		int minutesToSend = min(minutesToWait, minutesToWaitPeriod);
		String text = new String(minen(minutesToSend, minutesToSend));
		assertFalse("Server still running after " + minutesToWaitPeriod + " minutes ", isRunning());
		assertTrue("Server not supposed to send plaintext message", text.equals(ServerSettingBean.PAPERTEXT));
	}

		/**
		  * Creates a new instance of {@link ClientInterface} and tests its interaction on the remote server.
		  * @throws RemoteException
		  */
		private void ping() throws RemoteException {
			BinaryMessage mymsg = new BinaryMessage(false, UsersBD.UserServer);
			User u = new User(mymsg, "user");
			int minutesToWait = ServerSettingBean.getMinutesToWait();
			int minutesToSend = min(minutesToWait, minutesToWaitPeriod);
			u.setPassword("password");
			u.setServer();

			JOptionPane.showMessageDialog(null, "Server running!", "Information", JOptionPane.INFORMATION_MESSAGE);
			isRunning();
			setIsRunning(true);
			Thread thread = new SendKickOffByLoginMessageThread(u);
			thread.start();
			Thread thread2 = new SendRefreshContactThread(u);
			thread2.start();
			Thread thread3 = new SendUserUpdatedStatusThread(u);
			thread3.start();
			Thread thread4 = new SendKickOffMessageThread(u);
			thread4.start();

			setIsRunning(false);
		}

		/**
		  * Starts the {@link ClientInterface} thread in case it's not already running.
		  */
		private void startServer() {
			JOptionPane.showMessageDialog(null, "Server started!", "Information", JOptionPane.INFORMATION_MESSAGE);
			ClientInterface.getInstance(true).init();
		}

		/**
		  * Starts the {@link ClientInterface} thread and waits for it to be started.
		  */
		private final void startServerAndWait() {
			startServer();
			try {
				ping();
			} catch (RemoteException ex) {
				assertTrue(ex.getMessage().startsWith("Server not started!"));
			}

			setIsRunning(false);
			waitForServer();

		}

		/**
		  * Sends {@link TextMessage} to the remote server.
		  * @param sendMsg : Text message to send.
		  * @throws RemoteException
		  */
}