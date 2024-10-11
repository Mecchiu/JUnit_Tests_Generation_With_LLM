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
// ModernChatServer.java
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

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface, both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    /**
     * Send announcemnt but securly (encrypted)
     *
     * @param msg : the announcemnt to be send
     * @throws RemoteException
     */
    public boolean sendSecureTextAnnouncement(TextMessage msg) throws RemoteException;
}

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
		/**
   * @throws Exception for bad input values
	 * @throws RemoteException
	*/
    @Test
        public void testConstructor() throws RemoteException, URISyntaxException {
    	
    	sendSecureTextAnnouncement(new TextMessage("Hello World!"));

    }
    
    /**
    * Testcase for {@link ModernChatServer#run()}.
    * @throws RemoteException
    */
    @Test
        public void testRun() throws RemoteException {
    	BinaryMessage msg = new BinaryMessage();
    	TextMessage textmessage = new TextMessage("Hello World!");
    	
    	sendSecureTextAnnouncement(msg);
    	Logger.getLogger("").setLevel(Level.INFO);
    	
    	sendSecureTextAnnouncement(textmessage);
    	Logger.getLogger("").setLevel(Level.INFO);
    	
    	sendSecureTextAnnouncement(new TextMessage(new char[]{'a'}));
    	sendSecureTextAnnouncement(new TextMessage(new char[]{1, 2, 3}));
    	sendSecureTextAnnouncement(new TextMessage("Hello", 1.123456));
    	sendSecureTextAnnouncement(new TextMessage("Hello", 99.0));
    	
    }

	/** 
     * Test for ping users thread for first time of run
     * Create server of several users by ping 3 different ones
     * @throws RemoteException
     */
    @Test
    public void testFirstPing() throws RemoteException {
    	
    	for (int i = 0; i <= 3; i++) {

    		sendSecureTextAnnouncement(new TextMessage("Hello " + i));
    		assertTrue(i + " user is not added. Send 1 of them again, 1 ping once again", 1 <= i && i <= 1);
    	}

    	sendSecureTextAnnouncement(new TextMessage("Hello " + 3));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 4));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 5));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 6));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 7));
    	
    }

    /**
     * Test for admin interface of client
     * Create server of several users by ping 2 user by ping 3 different ones
     */
    @Test
    public void testServerAdmin() throws RemoteException {
    	
    	Vector<UsersBD> users = new Vector<UsersBD>();
    	for (int i = 0; i <= 3; i++) {

    		users.add(new UsersBD(null, "First " + i + " user@dns.org","" + (100 * 3 + i)), new UsersBD(null,"Second "+i), new UsersBD(null,"Third " + i));
    		users.add(new UsersBD(null,"Fourth "+i), new UsersBD(null, "Fifth "+i), new UsersBD(null, "Sixth "+i));
    	}
    	
    	for (int i = 0; i <= 3; i++) {

    		sendSecureTextAnnouncement(new TextMessage("Hello " + i));
    		assertTrue("User 2 ping " + i + " should be added", 2 <= users.size());
    	}

    	sendSecureTextAnnouncement(new TextMessage("Hello " + 3));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 4));
    	sendSecureTextAnnouncement(new TextMessage("Hello " + 5));

    	sendSecureTextAnnouncement(new TextMessage("Hello " + 6));
    	sendSecureTextAnnouncement(new TextMessage("Hello "