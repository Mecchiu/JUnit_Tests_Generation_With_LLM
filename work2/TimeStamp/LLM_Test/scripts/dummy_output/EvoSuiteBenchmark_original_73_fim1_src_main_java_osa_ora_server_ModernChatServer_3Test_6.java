// ModernChatServer_3Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
		
    private static final int KICKOFF_MESSAGE_THREAD_PERIOD = 5;
    private static final int KICKOFF_MESSAGE_NUMBER = 10;
    /**
     * The string that will be displayed in server settings screen.
     */
    private String PREFIX_SERVER_SETTING = IConstant.GENERAL_DESCRIPTION;
    /**
     * The string that will be displayed in server settings screen.
     */
    private String SERVER_NAME = "AUTHORIZATION";
    
    /**
     * Logger for use by tests.
     */
    private static final Logger logger = Logger.getLogger("");
    
        /* 
         * The current test data.
         * The test server is listening on port 80. The local user is created.
         * The test user is saved in the database. A new account is created.
         * The test user is saved in the database. A new account is created.
         * The test user is updated.
         * 
         * The test server has 1 member.
         * The test user is saved in the database.
         * The test user is updated.
         * The test server has 3 members.
         * The test user is updated.
         * The test user is saved in the database.
         * 
         * The test server has 20 members.
         */
//    private static final Vector SERVER_DATA_VECTOR
//        = new Vector();
//	
//	/**
//	 * Creates the server setting object.
//	 *
//	 */
//	@Test
//	public void testConnection() throws Exception {
//		Registry reg = LocateRegistry.getRegistry();
//		String server = "localhost";
//		String user = "root";
//		
//		/*
//         * Create
//         * 	ClientInterface clientInterface = new ClientInterface();
//         * 
//         * ServerSetup
//         * 	String serverSetting = "ServerSetting";
////         * Create user
////         * 	String user = UserSetupUtil.getCurrentUserName();
////         * Dummy user
////         * 	String userName = "dummy";
////         * 	String userName = null;
//         * 
//         * createRoom
//         *	roomCreate
////         * 	String roomName = "RoomCreate";
////         * 	String roomName = UserSetupUtil.getCurrentRoomName();
//         */
//		// Register user in the database
//		
//		Hashtable<String, String> properties = new Hashtable<String, String>();
//		properties.put(ClientInterface.USERNAME, user);
//		
//		reg.rebind(USERNAME, new UnicastRemoteObject(new User(user, properties)))
//		;
//		reg.rebind(roomName, new UnicastRemoteObject(new Room(user, "", properties)))
//		;
//		
//		ServerSetup serverSetup = new ServerSetup(USERNAME, user, null, user, user);
//		
//		reg.rebind(SERVER_NAME, serverSetup);
//		
//		/*
//         * Create a new user in the database with a dummy name. And save it.
//         * 
//         */
//		Hashtable<String, String> properties = new Hashtable();
//		properties.put("dummy", UserSetupUtil.getCurrentUserName());
//		reg.bind(USERNAME, new UnicastRemoteObject(new User(user, properties)));
//		
//		//Register group
//		String groupName = UserSetupUtil.getCurrentGroupName();
//		
//		Hashtable<
}