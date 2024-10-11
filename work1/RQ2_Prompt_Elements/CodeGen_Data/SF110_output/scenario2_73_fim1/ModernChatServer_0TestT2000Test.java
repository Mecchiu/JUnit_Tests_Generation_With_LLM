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
     * @return the logger
     */
    public static Logger getLogger() {
        return logger;
    }
}

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
		static final  Logger _logger = Logger.getLogger( "OldChat" );
		static final  Level _logLevel = Level.WARNING;
		
	/**
	 * Gets the logger object.
	 * @return a logger object
	 */
	private static Logger getLogger() {
		return _logger;
	}
	/**
	 * @return an enum object
	 */
	private static StringEncrypter getEncrypter() {
		StringEncrypter _encrypter = null;
		try {
			_encrypter = new StringEncrypter( "ASCII" );
		}
        catch ( Exception _ex ) {
            //logger.log(Level.WARNING, "Could not generate an encrypter",
            //        _ex );
        }
		
		return _encrypter;
	}
	/**
	 * Checks the correctness of the getLogger().
	 */
	@Test
	public void getLogger() {
		StringEncrypter _encrypter = getEncrypter();
		
		assertNotNull( "getLogger() failed", _logger );
		if (_encrypter == null) {
        logger.log(Level.WARNING, "You must enable security, to see log-output", null);
			throw new RuntimeException( "Fail to enable security in RemoteAdmin" );
		}
		
	}
	/**
	 * This test will ping and check if the ping success. It is very good to compare the server.
	 * @throws RemoteException
	 */
    @Test
	public void pingTest(){
                
		_logger.log(Level.WARNING, "This test was introduced", null);
		_logger.log(Level.INFO, "Pong " + new java.util.Date().toString(), null);
		_logger.log(Level.INFO, "Ping", null);
	}
	/**
	 * Test of start.
	 * @throws RemoteException
	 */
	@Test
	public void testStart() throws RemoteException{
		_logger.log(Level.WARNING, "This test was introduced", null);
		
		StringEncrypter _encrypter = getEncrypter();
		String _test = "testing";

		String _timeStamp = Calendar.getInstance().getTimeInMillis() + _test;
		_logger.log(Level.INFO, "Pong test "+_timeStamp, null);
		_logger.log(Level.INFO, "Ping test", null);
		_logger.log(Level.WARNING, "Done", null);
	}
	/**
	 * Test of getUsers.
	 */
	@Test
	public void testGetUsers() {
		StringEncrypter _encrypter = getEncrypter();
		String _test = "/Users/" + new java.util.Date().toString() + "?key=" + IConstant.KEY;
		logger.log(Level.INFO, "Requesting list of users with key=" + IConstant.KEY + "...");
		Vector<User> _users = new Vector<User>();
		int _usersSize = 0;
		while (_usersSize < 4) {
			try {
				String _userName = UsersBD.getUsers().findUserByKey( IConstant.KEY );
				logger.log(Level.INFO, "Found user - key=" + IConstant.KEY + " - UserName = " + _userName);
				Vector<User> temp = UsersBD.getUsers().findUserByName(_userName.substring(0, _userName.length()-1), "");
				if (((temp!= null) && (temp.getClass().isArray()))) {
					Vector _array = new Vector(temp);
					Enumeration _elements = _array.elements();
					while (_elements.hasMoreElements()) {
						_users.add( (User) _elements.next