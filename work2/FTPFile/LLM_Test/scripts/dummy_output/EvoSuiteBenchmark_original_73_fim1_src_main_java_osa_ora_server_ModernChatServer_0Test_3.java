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
		
    /** Logging class. */
    protected static final Logger LOG = Logger.getLogger(NewActivityLogFactory.class.getName());
	/**
	 * Test method for {@link osa.ora.server.threads.SendRefreshContactThread#run()}
	 * Verify that the result of this function is the following:
	 * No result.
	 *  
	 */
	@Test
	public void testSendRefreshContactThreadRun(){
		
	}
	
	/**
	 * Test method for {@link osa.ora.server.threads.SendUserUpdatedStatusThread#run()}
	 * Verify that the result of this function is the following:
	 * No result.
	 *  
	 */
	@Test
	public void testSendUserUpdatedStatusThreadRun(){
		
	}
	
	
	/**
	 * Test method for {@link osa.ora.server.serverInterface#PingServer(java.lang.String,java.lang.String)}
	 * Verify that the result of this function is the following:
	 * No result.
	 *  
	 */
	@Test
	public void testPingServerFoo() {
		
	}
	
	public static void main(String[] args) {
		
		new BasicServer();
        new BasicClient();
	}
    
}

/** A server interface */
final class ServerInterface extends UnicastRemoteObject implements Runnable {
	/** The constructor. */
	public ServerInterface(){
		
	}

	/**
	 * @see osa.ora.server.client.ClientInterface#userReceivedBinaryMessage(java.lang.String,java.lang.String,int,int,java.lang.String)
	 */
	public synchronized void userReceivedBinaryMessage(String str_source_username,
			String str_destination_username,
			int i_time,
			int i_group,
			String str_message) {
		
	}
	
	/**
	 * @see osa.ora.server.client.ClientInterface#userUpdatedBinaryMessage(java.lang.String,java.lang.String,boolean,int)
	 */
	public synchronized void userUpdatedBinaryMessage(String str_source_username,
			String str_destination_username,
			boolean b_is_in,
			int i_time) {
		
	}
}

/** A client interface */
final class ClientInterface extends UnicastRemoteObject implements Runnable {
	/**
	 * @see osa.ora.server.client.ClientInterface#connect()
	 *  
	 * The server will connect to the client automatically if the ClientInterface is called by user directly
	 */
	public synchronized void connect(){
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see osa.ora.server.client.ClientInterface#messageReceived(java.lang.String,double,double)
	 */
	public synchronized void messageReceived(String str_source_address,
			double dbl_time_sent,
			double dbl_number_received_in_message) {
		
	}
}

/** Admin Interface */
final class AdminInterface extends UnicastRemoteObject implements Runnable {
	/** Admin Interface method name */
	private final static String ADMIN_METHOD_NAME = "admin";
	/** Admin Interface method description */
	private final static String ADMIN_METHOD_DES = "this method is to show the admin interface";
	
	/**
	 * @see osa.ora.server.adminInterface.AdminInterface#sendKickedMessage(java.lang.String,java.lang.String)
	 */
	public synchronized void sendKickedMessage(String str_source_address,
			String str_destination_username) {
		
	}
	
}