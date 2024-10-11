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
		
        public ServerInterface server;
        public UnicastRemoteObject remoteObject;
        public ClientInterface clientInterface;
        public Hashtable<TextMessageType_8, Integer> replyHash = new Hashtable<TextMessageType_8, Integer>();
	private static final Logger logger = Logger.getLogger("LocalSystem");
	private final int test_num = 1;
	

    /**
     * Runnable called for ping users thread
     */
    class PingUsersThread extends Runnable {

        private boolean threadWasNotStarted;

        public PingUsersThread(boolean threadWasNotStarted) {
            this.threadWasNotStarted = threadWasNotStarted;
        }

        public void run() {
            Thread.currentThread().setName("PingUsersThread");
            sendSecureTextAnnouncement(new TextMessage("Ping " + test_num + " user"));
            if (threadWasNotStarted) {
            }
        }
    }

	/**
	 * Test method for {@link org.junit.jupiter.api.Test#run()}.
	 * @throws Exception
	 */
	@Test
	public void testPingUsersThreads() throws Exception {
			RemoteObject.exportURIs(new Object[]{""}, new Object[0], remoteObject);
            // Create an instance of User interface
            Logger userLogger = Logger.getLogger("UserLogger");
            userLogger.setLevel(Level.INFO);
            // Set debug mode on logger for trace message, it will be printed only on DEBUG level
            Logger.getLogger(java.rmi.server.LogContext.class.getName()).setLevel(Level.FINE);
            new ClientUI(remoteObject, new TextMessage("Ping " + test_num + " user"));
            Thread pingUsersThread = new PingUsersThread(false);
            pingUsersThread.start();
            // Wait for the user ping is sent by server
            Thread.sleep(5000);
            // Make the ping is not sent yet
            assertEquals(0, localUserLoginBean.pingsReceived);
			// Assert that the ping is not sent yet
			assertEquals(0, localUserLoginBean.pingsReceived2);
			// Assert that the ping is not received soon
			assertEquals(-1, localUserLoginBean.pingsReceived3);
            // Unexport the RemoteObject instance
            remoteObject.exportURIs(new Object[0], new Object[0], null);

    }

    /**
     * Method to create a socket between the server and server interface and make its remote call
     *  @throws URISyntaxException
     */
	@Test
	public void testServerSideSocket() throws Exception {
			ClientInterface rmiClient;

			// Create an instance of ServerInterface interface via UnicastRemoteObject
			//rmiClient = UnicastRemoteObject.exportObject(this);
			//rmiClient.register();
			rmiClient = UnicastRemoteObject.exportObject(new ClientInterface(this));
        /*rmiClient = UnicastRemoteObject.exportObject(new UserInterface(this));*/

            // Create a new Server, that can be referenced or instantiated by an instance of ClientInterface or UserInterface
            // server
            //rmiClient.getClientInterface().register();

            // rmiClient reference should be not null
            assertNotNull( rmiClient );

            server = UnicastRemoteObject.exportObject(new ModernChatServer(logger));
            // Now wait
            Thread.sleep(10000);
}
}