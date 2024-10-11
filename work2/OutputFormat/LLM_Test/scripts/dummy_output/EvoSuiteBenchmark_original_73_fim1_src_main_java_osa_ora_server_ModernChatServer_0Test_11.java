// ModernChatServer_0Test.java
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
* It contains one unit test case for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {
		
	/**
	 * Test method for {@link osa.ora.server.ClassicServerInterface#getLogger()}.
	 */
	@Test
	public void getLogger_Default() {
		BasicChatServer bcs = new BasicChatServer();
		Logger logger = bcs.getLogger();
		assertNotNull(logger);
	}

	//Test case for {@link osa.ora.server.ClientInterface#getLogger()}
	/**
	 * Test method for {@link osa.ora.server.ClassicServerInterface#isLogged()}.
	 * @throws RemoteException
	 */
	@Test
	public void isLogged_Default() throws RemoteException {
		BasicChatServer bcs = new BasicChatServer();
		ClientInterface client = (ClientInterface) Naming.lookup("");
		assertTrue(client.isLogged());
	}

	/**
	 * Test case for {@link osa.ora.server.ClassicServerInterface#initServer()}.
	 * @throws RemoteException
	 */
	@Test
	public void initServer() throws RemoteException {
		BasicChatServer bcs = new BasicChatServer();
		ClientInterface client = (ClientInterface) Naming.lookup("MyServer");
		assertTrue(client.isLogged());
		bcs.setClientInterface(client);
		bcs.initServer();
	}

	//TEST case for {@link osa.ora.server.CustomServerInterface#setConfigSettings(java.util.Properties)}
	/**
	 * Test case for {@link osa.ora.server.CustomServerInterface#setConfigSettings(java.util.Properties)} method.
	 * @throws RemoteException
	 */
	@Test
	public void setConfigSettings_Default() throws RemoteException {
		BasicChatServer bcs = new BasicChatServer();
		try {
			Logger logger = bcs.getLogger();
			logger.setLevel(Logger.ALL);
		} catch (SecurityException e) {
			/* ignore the SecurityException */
		}
			
		ServerSettingBean spb = new ServerSettingBean();
		ServerSettingBean sbp2 = new ServerSettingBean();
		String url = spb.getURLForCustomServer();
		String serverSetting = StringEncoder64.escapeString(url);

		sbp2.setServerSetting(serverSetting);
		sbp2.setPassword(StringEncoder64.escapeString(StringEncrypter.getENCRYPTION_METHOD));
		sbp2.setPasswordEncrypted(true);
		sbp2.setPassword(StringEncoder64.escapeString(StringEncoder64.encryptAndDigestString("bob@pk.net")));
		sbp2.setPassword(StringEncoder64.escapeString(StringEncoder64.encryptAndDigestString("fred@pk.net")));
		
		Logger logger = bcs.getLogger();
		Logger adminLogger = createAdminLogger(logger);
		logger.addHandler( new LoggingHandler(adminLogger, Level.INFO ));
		sbp2.setLogger(logger);
		
		bcs.setConfigSettings(sbp2);

		assertFalse(bcs.isLogged());

		MessageBean mb = new MessageBean();
		mb.setID(0);
		mb.setText("Hello");
		MessageBean[] messages = new MessageBean[] { mb };
}
}