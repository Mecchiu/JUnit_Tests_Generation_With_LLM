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
* It contains ten unit test cases for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {

	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_1() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_2() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_3() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_4() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_5() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_6() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_7() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_8() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
	/**
	 * Test case for {@link ModernChatServer#getLogger()} method.
	 * @throws Exception
	 */
	@Test
	void testGetLogger_9() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		Logger logger = modernChatServer.getLogger();
		assertNotNull(logger);
	}
	
}

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
* It contains ten unit test cases for the {@link ModernChatServer#ping()} method.
*/
class ModernChatServer_1Test {
		
	/**
	 * Test case for {@link ModernChatServer#ping()} method.
	 * @throws Exception
	 */
	@Test
	void testPing() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		boolean ping = modernChatServer.ping();
		assertTrue(ping);
	}
	
	/**
	 * Test case for {@link ModernChatServer#ping()} method.
	 * @throws Exception
	 */
	@Test
	void testPing_1() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		boolean ping = modernChatServer.ping();
		assertTrue(ping);
	}
	
	/**
	 * Test case for {@link ModernChatServer#ping()} method.
	 * @throws Exception
	 */
	@Test
	void testPing_2() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		boolean ping = modernChatServer.ping();
		assertTrue(ping);
	}
	
	/**
	 * Test case for {@link ModernChatServer#ping()} method.
	 * @throws Exception
	 */
	@Test
	void testPing_3() throws Exception {
		//TODO: Test goes here...
		ModernChatServer modernChatServer = new ModernChatServer();
		boolean ping = modernChatServer.ping();
		assertTrue(ping);
	