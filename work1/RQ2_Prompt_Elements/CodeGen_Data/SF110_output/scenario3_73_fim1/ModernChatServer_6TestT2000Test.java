// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
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
     * Send Binary message (files)
     *
     * @param msg : the message to be send
     * @return ResultBean include the status of message send or not.
     * @throws RemoteException
     */
    public ResultBean sendBinaryMessage(BinaryMessage msg) throws RemoteException;
}

// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
		
	/**
	 * The constructor.
	 * Constructs a test object for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
	 * @throws RemoteException : Test related remoteException.
	*/
	public ModernChatServer_6Test() throws RemoteException {
	}
	/**
	 * Run {@linkplain java.awt.desktop.Desktop desktop} for a single user.
	 * @param client : User of the {@literal Desktop} for which the {@linkplain ClientInterface#run()} is called.
	 * @return : ResultBean include the status of message send or not.
	* @throws RemoteException : Test related remoteException.
	*/
	public ResultBean runDesktopTest(ClientInterface client) throws RemoteException {
		
		// Get current time and set time in second
		long now = System.currentTimeMillis() / 1000;
		Calendar before = Calendar.getInstance();
		before.setTimeInMillis(now);
		Calendar after = Calendar.getInstance();
		before.add(Calendar.SECOND, -1);
		long time = before.getTimeInMillis();
		
		// Create client for {@literal "UsersBD"}
		Registry reg = LocateRegistry.getRegistry();
    	reg.rebind("UsersBD", new UsersBD(true) );

		// Send new user to {@literal "UsersBD"}
    	User newUser = new User();
    	newUser.setPassword("123456");
    	newUser.setName("ServerTest");
		newUser.setCreatedOn(now);
		newUser.setMutedOn(now);
    	newUser.setStatus("Online");
    	newUser.setProfilePic(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest.jpg")));
    	newUser.setImageHash(StringEncoder64.encode("1234"));
    	newUser.setImageUrl(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest.jpg")));
    	StringEncoder64.decode(newUser.getImageHash());
    	newUser.setEmail(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest@gmail.com")));
    	newUser.setUsername(newUser.getEmail().substring(3));
    	newUser.setSavedOn(time);
        newUser.save();
        
      	// Send new user to {@literal "UsersBD"}
    	newUser = new User();
    	newUser.setPassword("123456");
    	newUser.setName("ServerTest");
    	newUser.setCreatedOn(now);
    	newUser.setMutedOn(now);
    	newUser.setStatus("Online");
    	newUser.setProfilePic(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest.jpg")));
    	newUser.setImageHash(StringEncoder64.encode("1234"));
    	newUser.setImageUrl(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest.jpg")));
    	StringEncoder64.decode(newUser.getImageHash());
    	newUser.setEmail(new UserBean(newFile("/Users/ServerTest/Desktop/Users/ServerTest@gmail.com")));
    	newUser.setUsername(newUser.getEmail().substring(3));
    	newUser.setSavedOn(time);
    	
        
        Group newGrp = new Group();
        newGrp.setStatus("Group");